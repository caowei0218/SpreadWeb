package com.example.bean;

import java.io.Serializable;

/**
 * �û���
 */
public class UserBean implements Serializable {
	private String id;// �û�id
	private boolean is_boss;// �Ƿ�Ϊ��ͥ������
	private String account;// �˺�
	private String password;// ����
	private String nickName;// �ǳ�
	private String age;// ����
	private String gender;// �Ա�
	private String cellPhone;// �绰
	private String email;// ����
	private String date;// ע������
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
