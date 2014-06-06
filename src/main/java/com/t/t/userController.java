package com.t.t;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class userController {

	@RequestMapping("/users")
	public String users(Model model){
		ArrayList<String> s = new ArrayList<String>();
		s.add("hany");
		s.add("mhajna");
		model.addAttribute("users",s);
		
		return "users";
		
	}
	
	@RequestMapping("/register")
	public String showRegisrer(Model model){
		model.addAttribute("users-register","hh");
		return "user-register";
	}
}
