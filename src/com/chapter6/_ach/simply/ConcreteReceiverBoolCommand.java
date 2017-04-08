package com.chapter6._ach.simply;

public class ConcreteReceiverBoolCommand implements IReceiver {
	ReceiverBoolean receiver;

	public ConcreteReceiverBoolCommand(ReceiverBoolean receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.switchCommand();
	}

	
}
