package com.chapter6._ach.simplyWithUndo;

/**
 * TODO rebuild invoker class to make slots as Array of Command objects
 */
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
