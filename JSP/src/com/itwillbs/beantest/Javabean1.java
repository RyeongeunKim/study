package com.itwillbs.beantest;

public class Javabean1 {
	
	private String id;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// alt shift s + s
	@Override
	public String toString() {
		return "Javabean1 [id=" + id + "]";
	}
	
	

}
