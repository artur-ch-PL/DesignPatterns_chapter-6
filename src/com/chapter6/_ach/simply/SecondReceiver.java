package com.chapter6._ach.simply;

public class SecondReceiver implements ICommand {
	private int state = 0;

	public SecondReceiver() {}

	@Override
	public void execute() {
		turnUp();
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
