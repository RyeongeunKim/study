package com.itwillbs.aop;

// 계산기 객체 (타겟)
public class Calculator {
	
	public void add(int x,int y){
		System.out.println("결과 : "+(x+y));
	}
	public void sub(int x,int y){
		System.out.println("결과 : "+(x-y));
	}
	public void mul(int x,int y){
		System.out.println("결과 : "+(x*y));
	}
	public void div(int x,int y){
		System.out.println("결과 : "+(x/y));
	}

}
