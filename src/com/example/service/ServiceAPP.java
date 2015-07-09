package com.example.service;

import com.example.bean.UserBean;
import com.example.util.TxtFile;

public class ServiceAPP {
	TxtFile txt;

	public UserBean register(UserBean user) {
		txt = new TxtFile();
		txt.string2File(user.toString(), "D:\\chen.txt");
		return user;
	}

	public UserBean login(UserBean user) {
		txt = new TxtFile();
		txt.string2File(user.toString(), "D:\\chen.txt");
		System.out.println("登陆接口访问成功");
		return user;
	}

}
