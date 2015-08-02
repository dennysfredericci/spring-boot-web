package br.com.fredericci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fredericci.CustomerLoader;

@Controller
public class HomeController {

	@Autowired
	private CustomerLoader customerLoader;
	
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		
		customerLoader.run();
		
		return "Done!";
	}

}
