package com.cts;

public class MotorRunner {
	//int speed;
	public static void main(String[] args) {
		Motor ducati=new Motor();
		Motor heroHonda=new Motor();
		
		ducati.Dstart();
		heroHonda.Hstart();
		ducati.speed=20;
		heroHonda.speed=30;
		
	}

}
