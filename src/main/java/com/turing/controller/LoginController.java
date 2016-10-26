package com.turing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/query")
	public String query(Model model){
		System.out.println("index");
		model.addAttribute("infor", "你好啊");
		return "index";
	}
}
