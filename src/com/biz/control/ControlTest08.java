package com.biz.control;

public class ControlTest08 {
	public static void main(String[] args) {
		int intNum = 0;
		for(;intNum < 10;) {
			System.out.println(intNum++);
			
		}
		for(;intNum <20;) {
			System.out.println(intNum++);
		}
		
		System.out.println("==================");
		intNum = 0;
		for(;intNum < 10; intNum++) {
			System.out.println(intNum);

		}
		
		System.out.println("==================");
		intNum = 0;
		for(;intNum <10; intNum += 2) {
			System.out.println(intNum);
		
		intNum = 0;
		for(;intNum <=10; intNum += 2)
			System.out.println(intNum);

	}
		for(intNum= 0; intNum < 10; intNum++) {
			System.out.println(intNum);
		}
		
		//i는 index의 약자
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
	}
}
