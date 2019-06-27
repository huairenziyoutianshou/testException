package com.io.testException;

public class SmartPhone extends Telephone implements IPlayGame {

	@Override
	public void cell() {
		// TODO Auto-generated method stub
		System.out.println("通过语音打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("通过手写");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("用智能手机玩游戏");
	}
	

}
