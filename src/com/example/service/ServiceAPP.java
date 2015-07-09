package com.example.service;

import com.example.bean.Teacher;
import com.example.bean.UserBean;
import com.example.util.TxtFile;

public class ServiceAPP {
	TxtFile txt;

	public Teacher addTeacherOne(Teacher teacher) {
		String getString = "";

		getString = getString + teacher.getRoom() + "," + teacher.getLesson()
				+ "," + teacher.getTeacher() + "," + teacher.getQuestionCount()
				+ "," + teacher.getStudentCount();

		// txt=new TxtFile();
		// txt.string2File(getString, "D:\\chen.txt");
		Teacher t = new Teacher(teacher.getRoom() + "haha", teacher.getLesson()
				+ "hah", teacher.getTeacher() + "hah", 521, 152);
		return t;
	}

	public Teacher[] addTeachers(String str, Teacher teacher) {
		Teacher tt = new Teacher(str, str, str, 1, 1);
		Teacher[] tts = { teacher, tt };
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return tts;
	}

	public String getTeacher() {
		String aaa = "";
		txt = new TxtFile();
		aaa = txt.file2String("D:\\chen.txt", "UTF-8");
		return aaa;
	}

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

	public short addArticle(UserBean user) {
		short s = 22;
		txt = new TxtFile();
		txt.string2File(user.toString(), "D:\\chen.txt");
		System.out.println("添加物品访问成功");
		return s;
	}
}
