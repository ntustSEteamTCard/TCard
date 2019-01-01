package com.TCard.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
//import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.TCard.demo.Dao.MemberApiRepository;
import com.TCard.demo.Model.MemberAccount;


@Controller  //不是@RestController
public class MemberController {


	@Autowired(required=true)
	MemberApiRepository memberApiRepository;
	
	@GetMapping("/addMemberPage")
    public String addMemberPage(@ModelAttribute MemberAccount memberAccount){
		
        return "addMemberPage";
    }
	

	@PostMapping("/doAddMemberPage")
    public String doAddMemberPage(@ModelAttribute MemberAccount memberAccount){

//		List<MemberAccountJPA> memberAccountJPA= new ArrayList<MemberAccountJPA>();
//		memberAccountJPA = memberRepository.findAll();
//
//		for(int i=0;i<memberAccountJPA.size();i++){
//			System.out.println(memberAccountJPA.get(i).getId());
//		}
		memberApiRepository.save(memberAccount);
//		memberRepository.save(memberAccountJPA);
		System.out.println(memberAccount.getEmail());
//		System.out.println(memberAccountJPA.getEmail());
        return "login";
    }
	
	
	
	
	
	@GetMapping("/login")
    public String login(@ModelAttribute MemberAccount memberAccount){

        return "login";
    }
	
	@PostMapping("/doLogin")
    public String doLogin(@ModelAttribute MemberAccount memberAccount,HttpSession session){
		String email = memberAccount.getEmail();
		String password = memberAccount.getPassword();
		List<MemberAccount> MemberAccountList = new ArrayList<MemberAccount>();
		MemberAccountList = memberApiRepository.findCheckMemberAccount(email, password);
//		MemberAccount memberAccount = new  MemberAccount();
//		memberAccount.setPassword(password);
//		memberAccount.setEmail(email);;

		if(MemberAccountList.size()==0){
			return "login";
		}
		else{
//			session.setAttribute("uid", memberAccount);
	        return "welcome";
		}

    }
	
	@GetMapping("/memberList")
    public String memberListPage(Model model){
		List<MemberAccount> memberAccountList = new ArrayList<MemberAccount>();
		memberAccountList = memberApiRepository.findAll();
		model.addAttribute("memberAccountList", memberAccountList);
        return "member/memberListPage";
    }
	
	@GetMapping("/chat")
	public String chat(){
		return "chat";
	}
	
	@GetMapping("/home")
	public String home(){
		return "home";
	}
	
}