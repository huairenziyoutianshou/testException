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
		if (this == obj)//两个对象的内存地址相等？
			return true;
		if (obj == null)//不能为null
			return false;
		if (getClass() != obj.getClass())//类对象是否一致，
			return false;
		dog other = (dog) obj;//类型转换
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
		System.out.println("狗吃粑粑！！");
	}
	
	public void speak() {
		System.out.println("汪汪汪！！");
	}
}
