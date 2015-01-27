package com.chapter6._ach.simplyWithUndo;

public class ConcreteSecondReceiverCommand implements ICommand {
	SecondReceiver secondReceiver;

	public ConcreteSecondReceiverCommand(SecondReceiver sr) {
		this.secondReceiver = sr;
	}

	@Override
	public void execute() {
		secondReceiver.execute();
	}

	@Override
	public void undo() {
		secondReceiver.undo();
	}

}
