package com.biz.control;

public class ControlTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intSum = 0;
		for(int count = 0;count<100; count++) {
//			System.out.println("count:" + (count+1));
			System.out.println(count+1);
			intSum += (count+1);
			
			
		}

		System.out.println("intSum: " + intSum);
	
	
		intSum = 0;
		for(int count =1; count <= 100; count++) {
			System.out.println(count);
		intSum+= count;
		}
		System.out.println(intSum);
		
		
		int intEven = 0;
		int intOdd = 0;
		for(int count = 1; count <=100; count++) {
			if(count % 2 == 0) intEven ++;
			else intOdd ++;
			
		}
	
		System.out.println("Even: "+ intEven);
		System.out.println("Odd: " + intOdd);
	
		intSum = 0;
		int intSum2 = 0;
		intEven = 0;
		intOdd = 0;
		for(int count = 1; count <=100; count++) {
			if(count % 2 == 0) intEven ++;
			else intOdd ++;
			intSum += (intEven);
			intSum2 += (intOdd);
		}
	
		System.out.println("intSum+=:" + intSum);
		System.out.println(intSum2);
		System.out.println("Even " + intOdd);
		System.out.println("Odd: " + intOdd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			//1 부터 100까지 숫자중 3의 배수 개수??
		
	
		int thCount = 0;
		for(int count = 1; count <= 100; count++) {
			if(count % 3 == 0) thCount ++;
		}
		
		System.out.println("3의 배수의 개수: " + thCount);
		
		//1부터 100까지 숫자중 3의 배수의 합은?
		int thSum = 0;
		for(int count = 1; count < 100; count++) {
			if(count % 3 == 0) thSum += count;
		}
		System.out.println("3의 배수의 합"+ thSum);
		
			
	
		
			
		
	}
	
	
	}
	

