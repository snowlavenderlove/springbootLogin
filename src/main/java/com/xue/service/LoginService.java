package com.xue.service;

import java.util.List;

import com.xue.entity.model.User;

public interface LoginService {
	//注册
	public int register(User user);
	//登陆
	public User login(User user);


}
