package com.io.testException;

public class phone {

	private float sccren = 10;
	private float cpu ;
	float weight;
	
	public phone() {
		
	}
	
	public phone(float sccren,float cpu,float weight) {
		sccren = sccren;
		cpu = cpu;
		weight = weight;
		System.out.println("有参构造函数 ok了");
	}

	public float getCpu() {
		return cpu;
	}

	public void setCpu(float cpu) {
		this.cpu = cpu;
	}

	public float getSccren() {
		return sccren;
	}

	public void setSccren(float sccren) {
		this.sccren = sccren;
	}
}
