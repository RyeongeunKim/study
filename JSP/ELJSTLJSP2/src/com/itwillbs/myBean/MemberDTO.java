package com.itwillbs.myBean;

public class MemberDTO {
	// MemberBean 동일한 동작
	
	private String userName;
	private String userGender;
	private String userEmail;

	// alt + shift + s + r
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

}
