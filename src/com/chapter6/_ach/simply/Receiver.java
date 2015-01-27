package com.chapter6._ach.simply;

public class Receiver {
	private boolean state;
	
	public Receiver() {}
	
	public void switchCommand(){
		state = !state;
		System.out.println("Current state: " + state);
	}
	
}
