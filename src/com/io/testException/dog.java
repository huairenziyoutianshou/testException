package com.io.testException;

public class dog extends animal {

	public int age =50 ;
	public int height = 180;
	public int weight = 88;
	
	public dog() {
		super();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + height;
		result = prime * result + weight;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)//����������ڴ��ַ��ȣ�
			return true;
		if (obj == null)//����Ϊnull
			return false;
		if (getClass() != obj.getClass())//������Ƿ�һ�£�
			return false;
		dog other = (dog) obj;//����ת��
		if (age != other.age)
			return false;
		if (height != other.height)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}


//	@Override
//	public String toString() {
//		return "dog [age=" + age + ", height=" + height + ", weight=" + weight + "]";
//	}

	@Override
	public void eat() {
		System.out.println("�������Σ���");
	}
	
	public void speak() {
		System.out.println("����������");
	}
}
