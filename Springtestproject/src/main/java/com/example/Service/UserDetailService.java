package com.example.Service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Beans.UserDetailBean;
import com.example.DAO.UserDetailsDAO;



@Service
public class UserDetailService {
	
	@Autowired
	private UserDetailsDAO dao;

	public HashMap<Integer, UserDetailBean> getUserDetails() {
		return this.dao.getUserDetails();
	}
}
