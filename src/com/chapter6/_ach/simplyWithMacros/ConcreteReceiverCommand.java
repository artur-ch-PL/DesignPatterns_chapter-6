package com.chapter6._ach.simplyWithMacros;

public class ConcreteReceiverCommand implements ICommand {
	Receiver receiver;

	public ConcreteReceiverCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.execute();
	}

	@Override
	public void undo() {
		receiver.undo();
	}

}
