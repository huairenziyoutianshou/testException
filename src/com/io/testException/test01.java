package com.io.testException;

public class test01 {

	private static int bbb = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���õĶ�̬
		animal an1 = new animal();
		animal an2 = new dog();
		
		dog dog1 = new dog();
		animal an4 =dog1;
		
		if (an4 instanceof dog) {
			dog dog2 = (dog) an4;
		} else {
			System.out.println("�޷���������ת��");
		}
		
		if(an4 instanceof cat) {
			cat cat1 = (cat)an4;
		}else {
			System.out.println("�޷���������ת��");
		}
		
		
		
		
		
		
		
//		System.out.println(bbb);
//		int a = 1231515;
//		
//		
//		
//		//��new�Ķ�������ø���dog��Ҳ����dogָ�����Ƕ������ڴ�ĵ�ַ��
//		dog dog = new dog();
//		System.out.println(dog);
//		System.out.println(dog.getClass().getName());
//		System.out.println(Integer.toHexString(dog.hashCode()));
//		System.out.println(dog.getClass().getName() + "@" +  Integer.toHexString(dog.hashCode()));
//		System.out.println(dog.hashCode());//ֱ�ӵ���object��hashcode 804564176   dog����д��hashcode�� 83509
//		//toString������������಻��д��Ĭ���ǻ���Object��toString���������ص��������ڵİ�����hashcodeֵ
//		//��д�Ļ� source generate toString ����������ֵ
//		System.out.println(dog.toString());
//		dog2.height = 100;
		
	}

}
