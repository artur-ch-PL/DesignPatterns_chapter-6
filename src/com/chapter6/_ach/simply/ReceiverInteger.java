package com.chapter6._ach.simply;

public class ReceiverInteger implements IReceiver {
	private int state = 0;

	public ReceiverInteger() {}

	@Override
	public void execute() {
		if(state == 0)
			turnUp();
		else if (state == 1)
			turnDown();
		else
			return; //throw exception
	}

	public void turnUp() {
		state = 1;
		System.out.println("Current state: " + state);
	}

	public void turnDown() {
		state = 0;
		System.out.println("Current state: " + state);
	}
}
