package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.ApplianceDto;
import com.example.demo.model.LoginDto;
import com.example.demo.model.UserDto;
import com.example.demo.model.VehicleDto;
import com.example.demo.service.ApplianceService;
import com.example.demo.service.UserService;
import com.example.demo.service.VehicleService;

@Controller
@RequestMapping("/home")
public class ApplicationController {

	@Autowired
	UserService userService;

	@Autowired
	ApplianceService applianceService;

	@Autowired
	VehicleService vehicleService;

	@GetMapping("/")
	public String index() {
		return "redirect:/form";
	}

	@GetMapping("/form")
	public String formGet() {
		return "form";
	}

	@PostMapping("/form")
	public String formPost(UserDto user, Model model) {
		model.addAttribute("user", user);

		userService.saveUser(user);
		return "form";
	}

	@PostMapping("/login")
	public ModelAndView welcome(LoginDto loginUser, Model model) {

		Map<String, Object> params = new HashMap<String, Object>();
		UserDto userDto = userService.validate(loginUser);
		if (userDto != null) {
			params.put("user", userDto);
			return new ModelAndView("welcome", params);
		} else {
			params.put("error", "Invalid username or password!");
			model.addAttribute("user", userDto);
			return new ModelAndView("form", params);
		}

	}

	@RequestMapping("/option")
	public ModelAndView option() {
		List<ApplianceDto> list = applianceService.findAllApplianceForUser(1L);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("appliances", list);
		return new ModelAndView("option", params);
	}

	@RequestMapping("/vehicleoption")
	public ModelAndView vehicleoption() {
		List<VehicleDto> list = vehicleService.findAllVehicleForUser(1L);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("vehicles", list);
		return new ModelAndView("vehicleoption", params);
	}

	@GetMapping("/editAppliance/{applainceId}")
	public ModelAndView editAppliance(@PathVariable("applainceId") Long applainceId) {
		ApplianceDto appliance = applianceService.findById(applainceId);
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("appliance", appliance);
		return new ModelAndView("edit", params);
	}

	@RequestMapping(path = "/edit", method = RequestMethod.POST, consumes = { "application/x-www-form-urlencoded" })
	public String edit(ApplianceDto appliance) {
		applianceService.saveAppliance(appliance);
		return "redirect:/home/option";
	}

	@GetMapping("/deleteAppliance/{applianceId}")
	public String deleteAppliance(@PathVariable("applianceId") Long applianceId) {
		applianceService.deleteAppliance(applianceId);
		return "redirect:/home/option";
	}

	@GetMapping("/add")
	public String add() {

		return "add";
	}

	@GetMapping("/addvehicle")
	public String addvehicle() {

		return "addvehicle";
	}


	@RequestMapping("/thankyou")
	public String thankyou() {

		return "thankyou";
	}

}
