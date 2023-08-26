package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@Autowired
	EmpService i;
	
	@RequestMapping("/")
	public String landingReg() {
		System.out.println("Welcome to landingPage");
		return "register";
	}
	
	@RequestMapping("/reg")
	public String registerPage(@ModelAttribute Employee e) {
//		System.out.println("id"+e.getId()+"  "+e.getName()+ " "+e.getSuggestion_Category()+" "+ e.getSuggestion_Description() );
		i.saveEmp(e);
		return "registerPage";
	}
	
//	@RequestMapping(value = "/reg", method = RequestMethod.GET)
//	public String registerPage(@ModelAttribute Employee e) {
//		System.out.println("id"+e.getId()+"  "+e.getName()+ " "+e.getSuggestion_Category()+" "+ e.getSuggestion_Description() );
//		i.saveEmp(e);
//		return "registerPage";
//	}
	
//	@RequestMapping(value = "/reg", method = RequestMethod.POST)
//	public String welcomePage() {
//		return "welcome";
//	}
}
