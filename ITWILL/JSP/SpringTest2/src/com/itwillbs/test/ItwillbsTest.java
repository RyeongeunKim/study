package com.itwillbs.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class ItwillbsTest {

	public static void main(String[] args) {
		
		//강한 결합
		ItwillbsImpl will1 = new ItwillbsImpl();
		will1.setStudent(new PersonImpl("홍길동", 20));
		will1.study();
		
		//약한 결합을 통한 의존 주입
		//의존 관계의 파일을 xml 파일(spring)에서 가져오기
		
		BeanFactory fac = new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		//객체 주입 후 사용
		Itwillbs will2 = (Itwillbs) fac.getBean("itwillP1");
		
		will2.study();
		
	}

}
