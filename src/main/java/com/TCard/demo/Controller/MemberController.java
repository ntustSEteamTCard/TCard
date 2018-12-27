package com.TCard.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.TCard.demo.Model.MemberAccount;
import com.TCard.demo.Service.MemberService;

@Controller  //不是@RestController
public class MemberController {
//	//透過 @RequestMapping 指定從/會被對應到此hello()方法
//	@Autowired
//	MemberAccount memberAccount;
//	
//	@Autowired
//	MemberService memberService;
//    @RequestMapping("/")
//    public String hello(){
//    	memberAccount = new MemberAccount();
//    	memberAccount.setPassword("12345678");
//    	memberAccount.setEmail("test@gmail.com");
//    	memberAccount.setCellphone("0912345789");
//    	memberAccount.setAddress("台北市");
//    	memberService.addMember(memberAccount);
//        return "新增會員成功";
//    }
	//透過 @RequestMapping 指定從/會被對應到此addMemberPage()方法
	@Autowired
	MemberAccount memberAccount;
	
	@Autowired
	MemberService memberService;
	@GetMapping("/addMemberPage")
    public String addMemberPage(){
//    	memberAccount = new MemberAccount();
//    	memberService.addMember(memberAccount);

        return "addMemberPage";
    }
}