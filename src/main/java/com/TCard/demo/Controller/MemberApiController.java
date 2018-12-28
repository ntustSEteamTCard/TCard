package com.TCard.demo.Controller;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TCard.demo.Dao.MemberApiRepository;
import com.TCard.demo.Model.MemberAccount;



@RestController//springmvc4中的注解 表示这是支持resful的控制器
@RequestMapping("/memberApi")
public class MemberApiController {

	
	@Autowired
	MemberApiRepository memberapiRepository;
	
	@RequestMapping(value="/{id}")
	 public Optional<MemberAccount> read(@PathVariable long id) {
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
}