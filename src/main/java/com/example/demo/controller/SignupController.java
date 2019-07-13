/**
 * 
 */
package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.UserDto;
import com.example.demo.service.UserService;

/**
 * @author LENOVO
 *
 */
@Controller
@RequestMapping("/signup")
public class SignupController {

	@Autowired
	UserService userService;

	@GetMapping("/getsaveuser")
	public String getSaveUserPage(){
		return "saveuser";
	}

	@PostMapping("/register")
	public ModelAndView register(UserDto user,Model model)
	{
		Map<String, Object> params = new HashMap<String, Object>();
		try {
			userService.saveUser(user);
		}catch(Exception ex) {
			params.put("error", "Email ID already Registered!");
			return new ModelAndView("saveuser", params);
		}
		params.put("error","User registered succesfully!!");

		return new ModelAndView("form", params); 
	}
}
