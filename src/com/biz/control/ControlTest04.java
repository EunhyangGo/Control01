package com.biz.control;

public class ControlTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 33;
		int intMode = (intNum1 %2);
		boolean b = (intMode ==0);
		
		if((intNum1 %2) == 0) {
			System.out.println(intNum1 + "�� ¦��");

		} else {
			System.out.println(intNum1 + "�� Ȧ��");
		}
	
		
		// if, else �� ������ ��ɹ��� �� ���ٸ� ������ {}�� ������ �� �ִ�. �Ʒ��� ����...
		if ((intNum1 %2) == 0)
			System.out.println(intNum1 + "�� ¦��");
		else
			System.out.println(intNum1 + "�� Ȧ��");
		
		if ((intNum1 %2) == 0) {
			System.out.println(intNum1 + "�� ¦��"); 
		    System.out.println(intNum1 + "�� ¦��");}
		//�����̶� �߰�ȣ �ľߵ�
		else
			System.out.println(intNum1 + "�� Ȧ��");
		
		// if ���� {}�� ������ �ٷ� ������ �ѹ��常 if���� ������ �޴´�.
		
		if ((intNum1 %2) == 0)
			System.out.println(intNum1 + "�� ¦��");
		System.out.println(intNum1 + "�� ¦��");
		
		// if �� ���� ; �� ���� if���� ������ �޴� ��ɹ��� �ϳ��� ����.
		
		if ( ( intNum1 %2 ) == 0)
			System.out.println(intNum1 + "�� ¦��");
	
		// ��ɹ��� ����� ����
		// === ��ɹ� ������ ;(�����ݷ�)�� ������ : ���ٷ� ��
		// === ��ɹ� ������ {...}�� ���� : �߰�ȣ ���� ���� ��ɵ��� �� �׷�
		// === ��ɹ� �����ٿ� ��ɹ��� ; ���� : �ű����.
	
	}
	

}
