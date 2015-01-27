package com.chapter6._ach.simply;

public class Invoker {
	ICommand slot;

	public Invoker() {
	}

	public void setCommand(ICommand command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
	
}
