package com.itwillbs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

//사용자
public class PersonTest {

	public static void main(String[] args) {
		
		// 강한결합을 통한 객체 생성 후 사용
		// => 해당 객체를 의존하고 있다.
		System.out.println("[강한 결합]");
		PersonImpl pi = new PersonImpl();
		pi.sayHello();
		
		System.out.println("-------------------------------");
		System.out.println("[약한 결합 - 스프링 DI ]");
		
		// 외부(xml)에서 객체를 가져와서 사용
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		// 의존주입을 받아서 사용
		Person ps = (Person) factory.getBean("person");
		
		ps.sayHello();
		
		// 약한결합을 통한 객체 생성 후 사용
		Person p = new PersonImpl();
		p.sayHello();
		
		System.out.println("-------------------------------");
		System.out.println("[약한 결합 - 스프링 DI ]");	
		System.out.println("생성자를 사용한 주입");
		
		Person pc1 = (Person) factory.getBean("personC1");
		pc1.sayHello();
		
		System.out.println("-------------------------------");
		System.out.println("[약한 결합 - 스프링 DI ]");	
		System.out.println("생성자를 사용한 주입");
		
		//객체 주입
		Person pc2 = (Person) factory.getBean("personC2");
		pc2.sayHello();
		

	}

}
