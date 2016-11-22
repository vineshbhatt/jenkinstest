package com.example.DAO;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.Beans.UserDetailBean;


@Repository
public class UserDetailsDAO {

	static HashMap<Integer, UserDetailBean> userDetails = new HashMap<Integer, UserDetailBean>() {
		{
			put(1, new UserDetailBean(1, "A", "Kochi"));
			put(2, new UserDetailBean(2, "B", "Kochi"));
			put(3, new UserDetailBean(3, "C", "Kochi"));
		}
	};
	
	public HashMap<Integer, UserDetailBean> getUserDetails()
	{		
		return this.userDetails;
	}
}
