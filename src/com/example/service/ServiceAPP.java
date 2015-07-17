package com.example.service;

import com.example.bean.UserBean;
import com.example.util.TextFile;

public class ServiceAPP {
	TextFile text;

	public UserBean register(UserBean user) {
		text = new TextFile();
		text.string2File(user.toString(), "D:\\Spread.txt");
		return user;
	}

	public String login(String userName, String password) {
		text = new TextFile();
		// text.string2File(userBean.toString(), "D:\\Spread.txt");
		text.string2File(userName + ":" + password, "D:\\Spread.txt");
		System.out.println("登陆接口访问成功");
		
		return "ok";
	}

}
