package com.itwillbs.beantest;

public class Javabean2 {

	private String id;
	private String pw;
	private int age;
	
	// alt shift s + r
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	// alt shift s + s
	@Override
	public String toString() {
		return "Javabean2 [id=" + id + ", pw=" + pw + ", age=" + age + "]";
	}
	
	
	
	
	
}
