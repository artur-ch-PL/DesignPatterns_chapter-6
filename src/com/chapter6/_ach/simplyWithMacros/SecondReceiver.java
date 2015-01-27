package com.chapter6._ach.simplyWithMacros;

public class SecondReceiver implements ICommand {
	private int state = 0;
	private int prevState = 0;
	
	public SecondReceiver() {}

	@Override
	public void execute() {
		increaseState();
	}

	@Override
	public void undo() {
		decreaseState();
	}

	public void increaseState() {
		state = state+1;
		prevState = state-1; 
		System.out.println("Current state: " + state);
	}

	public void decreaseState() {
		state = prevState;
		System.out.println("Previouse state restore: " + state);
	}
}
