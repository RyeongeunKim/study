package com.itwillbs.test;

public class Calc {

	// 총점 SUM
	public int SUM(int kor,int eng,int math){
		return kor+eng+math;		
	}
	public int SUM(ItwillBean ib){
		return ib.getKor()+ib.getEng()+ib.getMath();		
	}
	// 평균 AVG
	public void AVG(int kor,int eng,int math){
		System.out.println("평균 : "+((kor+eng+math)/3.0));
	}
	public void AVG(ItwillBean ib){
		System.out.println("평균 : "+(SUM(ib)/3.0));
	}
	
	
	
	
	
	
	
	
	
	
	
}
