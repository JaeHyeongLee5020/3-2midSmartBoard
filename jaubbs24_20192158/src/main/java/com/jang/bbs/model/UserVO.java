package com.jang.bbs.model;

public class UserVO {

	private int mno;
	private String name;
	private String passwd;
	private String userId;
	private String jumin;
	private String email;
	private String regDate;
	private char del_yn = 'n';

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public char getDel_yn() {
		return del_yn;
	}

	public void setDel_yn(char del_yn) {
		this.del_yn = del_yn;
	}

}
