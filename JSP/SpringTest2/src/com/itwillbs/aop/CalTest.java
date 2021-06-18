package com.itwillbs.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalTest {

	public static void main(String[] args) {
		
		// 계산기 객체를 강한 결합생성
		Calculator c =  new Calculator();
		c.add(100, 200);
		
		// 객체를 주입해서 사용
		ApplicationContext appCTX = new ClassPathXmlApplicationContext("AOPTest.xml");
		
		Calculator c1 = (Calculator) appCTX.getBean("calcTarget");
		c1.add(300, 500);
		
		
		Calculator c2 =  (Calculator) appCTX.getBean("proxyCal");
		c2.add(300, 100);
		
		
		

	}

}
