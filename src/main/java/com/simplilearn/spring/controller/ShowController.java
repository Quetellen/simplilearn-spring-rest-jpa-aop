package com.simplilearn.spring.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.spring.jpa.User;
import com.simplilearn.spring.service.UserService;

@Controller
public class ShowController {

	final Logger logger = LoggerFactory.getLogger(this.getClass());

	@GetMapping("/")
	String showIndex() {

		logger.debug("Showing Index...");

		return "index";
	}

	@GetMapping("/list")
	String list() {

		logger.debug("Showing List...");

		return "list";
	}

	@GetMapping("/create")
	String showCreate(User user) {

		logger.debug("Showing Create...");

		return "create";
	}

	@GetMapping("/update/{id}")
	ModelAndView showUpdate(@PathVariable int id) {

		logger.debug("Showing Update... UserID: {}", id);

		return new ModelAndView("update", "id", id);
	}

	@GetMapping("/search")
	String showSearch() {

		logger.debug("Showing Search...");

		return "search";
	}
}