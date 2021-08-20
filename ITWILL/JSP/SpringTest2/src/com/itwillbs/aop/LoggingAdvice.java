package com.itwillbs.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// 보조 기능 : 메서드 호출전,후 메서지 출력 기능
public class LoggingAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		
			
		System.out.println("[메서드 실행  전 : LoggingAdvice]");
		System.out.println(arg0.getMethod()+" << 해당 메서드 호출 전");
		
		// 메서드 실행
		Object object = arg0.proceed();
		
		System.out.println("[메서드 실행  후 : LoggingAdvice]");
		System.out.println(arg0.getMethod()+" << 해당 메서드 호출 후");
		
		return object;
	}

}
