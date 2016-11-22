package com.example.Controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Beans.UserDetailBean;
import com.example.Service.UserDetailService;



@RestController
@RequestMapping("/User")
public class UserDetailsController
{
	@Autowired
	private UserDetailService uservice;

	@RequestMapping(value="/get",method=RequestMethod.GET)
	public HashMap<Integer, UserDetailBean> getUserDetails()
	{			
		return this.uservice.getUserDetails();
	}
}
