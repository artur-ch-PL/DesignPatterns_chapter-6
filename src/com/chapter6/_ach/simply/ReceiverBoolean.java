package com.chapter6._ach.simply;

public class ReceiverBoolean {
	private boolean state;
	
	public ReceiverBoolean() {}
	
	public void switchCommand(){
		state = !state;
		System.out.println("Current state: " + state);
	}
	
}
