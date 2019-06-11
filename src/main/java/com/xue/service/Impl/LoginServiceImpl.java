package com.xue.service.Impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xue.entity.model.User;
import com.xue.repository.dao.UserMapper;
import com.xue.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserMapper dao;
	
	//注册
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		System.out.println("Impl");
		int result = 0;
		System.out.println(user);
		try {
			result = dao.insertUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	//登陆
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		
		
		try {
			user = dao.selectUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}


	
	

}
