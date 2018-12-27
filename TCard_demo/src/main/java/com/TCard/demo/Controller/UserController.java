package com.TCard.demo.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.TCard.demo.Service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	 @GetMapping("/")
		public String index(Map<String, Object> model) {
		 	model.put("ID", userService.getUserId());
			return "index";
		}

}
