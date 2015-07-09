package com.example.bean;

import java.io.Serializable;

/**
 * 用户类
 */
public class UserBean implements Serializable {
	private String id;// 用户id
	private boolean is_boss;// 是否为家庭管理者
	private String account;// 账号
	private String password;// 密码
	private String nickName;// 昵称
	private String age;// 年龄
	private String gender;// 性别
	private String cellPhone;// 电话
	private String email;// 邮箱
	private String date;// 注册日期
	private String is_valid;

	public UserBean() {
		super();
	}

	public UserBean(String id, boolean is_boss, String account,
			String password, String nickName, String age, String gender,
			String cellPhone, String email, String date, String is_valid) {
		super();
		this.id = id;
		this.is_boss = is_boss;
		this.account = account;
		this.password = password;
		this.nickName = nickName;
		this.age = age;
		this.gender = gender;
		this.cellPhone = cellPhone;
		this.email = email;
		this.date = date;
		this.is_valid = is_valid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isIs_boss() {
		return is_boss;
	}

	public void setIs_boss(boolean is_boss) {
		this.is_boss = is_boss;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIs_valid() {
		return is_valid;
	}

	public void setIs_valid(String is_valid) {
		this.is_valid = is_valid;
	}

	public String toString() {
		return "UserBean [id=" + id + ", is_boss=" + is_boss + ", account="
				+ account + ", password=" + password + ", nickName=" + nickName
				+ ", age=" + age + ", gender=" + gender + ", cellPhone="
				+ cellPhone + ", email=" + email + ", date=" + date
				+ ", is_valid=" + is_valid + "]";
	}

}
