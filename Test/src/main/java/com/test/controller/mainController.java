package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.dto.UserDTO;


@Controller
@RequestMapping("/*")
public class mainController {
	
	@GetMapping("write")
	public String main() {
		
		System.out.println("홈 컨트롤러");
		return "write";
	}
	
	 @GetMapping("info")
	 public UserDTO getUserInfo() {
		 System.out.println("info 컨트롤러 진입");
	    UserDTO user = new UserDTO();
	    user.setId(1);
	    user.setName("John Doe");
	    user.setEmail("john.doe@example.com");
	    return user;
	 }
}
