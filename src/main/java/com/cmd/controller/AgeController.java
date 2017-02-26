package com.cmd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/age")
public class AgeController {

//	@Autowired
//	AgeRepository ageRepository;
	
	@RequestMapping("/test")
	public String LoadAll() {
		//model.addAttribute("carList", ageRepository.findAll());
		return "hello world";
	}
	
	@RequestMapping("/save")
	public void SaveAge(){
		
	}
}
