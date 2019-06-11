package com.xue.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xue.entity.model.User;
import com.xue.service.LoginService;

@Controller
public class LoginController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LoginService loginService;
	
//	登陆页面
	@RequestMapping("/loginHtml")
	public String loginHtml(){
		
		return "loginHtml";
		
	}
//	注册页面
	@RequestMapping("/registerHtml")
	public String registerHtml(){

		return "registerHtml";
	}
	
//	登陆验证
	@RequestMapping("/login")
	@ResponseBody //不返回页面，返回json对象需加@ResponseBody
	public String login(User user,HttpServletRequest request){
		
		User result = null;
		
		result = loginService.login(user);
		
		if(null != result){
			
			return "登陆成功    "+"name:"+user.getName()+"   password:"+user.getPassword();
		}else{
			return "登陆失败";
		}

		}
	//注册验证
			@RequestMapping("/register")
			@ResponseBody //不返回页面，返回json对象需加@ResponseBody
			public String register(User user){

				int result =0;
				
				
				result = loginService.register(user);
				
				if(0 != result){
					return "注册成功";
				}else{
					return "注册失败";
				}

			}	
				
		
	}
	
	


