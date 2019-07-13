package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.ApplianceDto;
import com.example.demo.service.ApplianceService;

@Controller
public class ApplianceController {

	@Autowired
	ApplianceService applianceService;

	@PostMapping("/appliance/add")
	public String Post(ApplianceDto appliance, Model model) {
		model.addAttribute("appliance", appliance);
		applianceService.saveAppliance(appliance);
		return "thankyou";
	}
	
		
}
