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

	public UserBean login(UserBean user) {
		text = new TextFile();
		text.string2File(user.toString(), "D:\\Spread.txt");
		System.out.println("��½�ӿڷ��ʳɹ�");
		return user;
	}

}
