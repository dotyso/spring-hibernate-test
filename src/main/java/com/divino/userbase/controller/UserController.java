package com.divino.userbase.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.divino.userbase.entity.User;
import com.divino.userbase.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ModelAndView list() {
		
		List<User> users = userService.findAll();
		
		return new ModelAndView("user/list", "users", users);
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.GET)
	public String add() {
	

		return "user/add";
	}
	
	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public String addSave(User user, String name, String sex, String age) {
		User newUser = new User(1, name, Boolean.parseBoolean(sex), Integer.parseInt(age));
		//user.setName(map.get("name").toString());

		return "redirect:/user/";
	}
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public ModelAndView get(@PathVariable("id") int id) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "yang shuai", true, 33));
		users.add(new User(2, "aaa", true, 22));
		users.add(new User(3, "2222 22", false, 31));

		return new ModelAndView("user/show", "user", users.get(id-1));
	}
	
	@RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable("id") int id) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "yang shuai", true, 33));
		users.add(new User(2, "aaa", true, 22));
		users.add(new User(3, "2222 22", false, 31));

		return new ModelAndView("user/edit", "user", users.get(id-1));
	}
}
