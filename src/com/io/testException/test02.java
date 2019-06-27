package com.io.testException;

import java.util.HashMap;
import java.util.Map;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Student> students = new HashMap<String, Student>();
		Telephone tel1 = new cellphone();
		tel1.cell();
		tel1.message();
		Telephone tel2 = new SmartPhone();
		tel2.cell();
		tel2.message();
		
		IPlayGame ip1 = new SmartPhone();
		ip1.playGame();
		IPlayGame ip2 = new Psp();
		ip2.playGame();
		
		IPlayGame ip3 = new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类来实现方法1");
			}
		};
		ip3.playGame();
		
		new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("使用匿名内部类来实现方法2");
			}
		}.playGame();
		
	}

}
