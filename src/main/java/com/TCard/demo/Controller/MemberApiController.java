package com.TCard.demo.Controller;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.TCard.demo.Dao.MemberApiRepository;
import com.TCard.demo.Model.MemberAccount;



@RestController//springmvc4中的注解 表示这是支持resful的控制器
@RequestMapping("/memberApi")
public class MemberApiController {

	
	@Autowired(required=true)
	MemberApiRepository memberapiRepository;
	
//	@RequestMapping(value="/{id}")
//	 public Optional<MemberAccount> read(@PathVariable long id) {
//		return memberapiRepository.findById(id);
//	 }
	
	@RequestMapping(value="/{id}")
	 public Optional<MemberAccount> read(@ModelAttribute("message") String msg,Model model,@PathVariable long id) {

		Map map = new HashMap();
		String email = map.get("EMAIL").toString();
		if(email == null) throw new NullPointerException(email);
//		當 email字串為null我就會拋出 NullPointerException的例外,如果你要測試的話可以這樣做,這是唯一的重點
		System.out.println(email);
		return memberapiRepository.findById(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	 public void create(@RequestBody MemberAccount memberaccount) {
		memberapiRepository.save(memberaccount);
	 }
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	 public void update(@RequestBody MemberAccount memberaccount) {
		memberapiRepository.save(memberaccount);
	 }	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	 public void delete(@PathVariable long id) {
		memberapiRepository.deleteById(id); 
		 
	 }	
	
	

		
		@ResponseStatus(value=HttpStatus.NOT_FOUND,reason="没有这个页面")
		 @ExceptionHandler(NullPointerException.class)
			  public ResponseEntity<Object> Not_Found() {
			 	System.out.println("進入NullPointerException例外處理");
			 	return new ResponseEntity<Object>("NOT FOUND THE DATA ", new HttpHeaders(), HttpStatus.NOT_FOUND);
			 }

	
}