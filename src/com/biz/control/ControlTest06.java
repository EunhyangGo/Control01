package com.biz.control;

public class ControlTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 0;
		
		if ( (intNum++ %2) == 0)
			System.out.println(intNum-1 + ": 礎熱");
		else
			System.out.println(intNum-1 + ": �汝�");
		
		if ( (intNum %2) == 0)
			System.out.println(intNum++ + ": 礎熱");
		else
			System.out.println(intNum++ + ": �汝�");

		
		if ( (intNum %2) == 0)
			System.out.println(intNum++ + ": 礎熱");
		else
			System.out.println(intNum++ + ": �汝�");


	}

}
