package com.itwillbs.test;

// Person 인터페이스 객체를 약한결합으로 생성
public class PersonImpl implements Person {
	
	private String name;
	private int age;
	
	public PersonImpl() {}
	public PersonImpl(String name) {
		this.name = name;
	}
	public PersonImpl(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public void sayHello() {
		
		System.out.println("안녕하세요");
		System.out.println("이름 : "+name+", 나이 : "+age);
		
	}
}
