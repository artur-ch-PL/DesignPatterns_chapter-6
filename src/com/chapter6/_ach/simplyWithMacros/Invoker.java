package com.chapter6._ach.simplyWithMacros;

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
	
	public void undoButtonWasPressed(){
		slot.undo();
	}
}
