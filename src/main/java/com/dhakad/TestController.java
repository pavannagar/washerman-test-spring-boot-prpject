package com.dhakad;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.Customer;

@Controller
public class TestController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "testtt";
	}
	
	
	
	
}
