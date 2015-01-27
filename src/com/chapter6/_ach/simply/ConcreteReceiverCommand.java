package com.chapter6._ach.simply;

public class ConcreteReceiverCommand implements ICommand {
	Receiver receiver;

	public ConcreteReceiverCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.switchCommand();
	}

	
}
