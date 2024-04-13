package com.Webapp1.Webapp1;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		System.out.print("Hello");
		return "home.jsp";
//		return "D:\\Webapp1\\src\\main\\java\\com\\Webapp1\\Webapp1\\home.jsp";
	}
}
