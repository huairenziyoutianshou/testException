package com.io.testException;

public class test01 {

	private static int bbb = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//引用的多态
		animal an1 = new animal();
		animal an2 = new dog();
		
		dog dog1 = new dog();
		animal an4 =dog1;
		
		if (an4 instanceof dog) {
			dog dog2 = (dog) an4;
		} else {
			System.out.println("无法进行类型转换");
		}
		
		if(an4 instanceof cat) {
			cat cat1 = (cat)an4;
		}else {
			System.out.println("无法进行类型转换");
		}
		
		
		
		
		
		
		
//		System.out.println(bbb);
//		int a = 1231515;
//		
//		
//		
//		//把new的对象的引用赋给dog，也就是dog指代的是对象在内存的地址，
//		dog dog = new dog();
//		System.out.println(dog);
//		System.out.println(dog.getClass().getName());
//		System.out.println(Integer.toHexString(dog.hashCode()));
//		System.out.println(dog.getClass().getName() + "@" +  Integer.toHexString(dog.hashCode()));
//		System.out.println(dog.hashCode());//直接调用object的hashcode 804564176   dog类重写的hashcode后 83509
//		//toString方法，如果子类不重写，默认是基类Object的toString方法，返回的是类所在的包名和hashcode值
//		//重写的话 source generate toString 返回类属性值
//		System.out.println(dog.toString());
//		dog2.height = 100;
		
	}

}
