package com.hello.me;

import java.sql.Timestamp;

public class MeBean {
	
	// 아이디, 비밀번호, 이름 등을 담을 멤버변수
	// 멤버변수에 직접 전근할 수 없게 private를 사용
	
	private String id;
	private String pw;
	private String name;
	private int age;
	private String gender;
	private String email;
	private Timestamp regdate;
	
	// 데이터를 가져오고 세팅하는 기능의 메소드 만들기
	// - get메서드 : 데이터를 가져오는 경우
	// - set메서드 : 데이터를 세팅하는 경우
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getRegdate() {
		return regdate;
	}
	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	// alt shift s + s
	@Override
	public String toString() {
		return "MeBean [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email="
				+ email + ", regdate=" + regdate + "]";
	}
	

	
	
	
	
	
	

}
