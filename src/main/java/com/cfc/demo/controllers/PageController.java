package com.cfc.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
	
	@GetMapping("/")
	public String home(@RequestParam(required=false, defaultValue="World") String name, ModelMap modelMap) {
		modelMap.put("name", name);
		return "pages/home";
	}

}
