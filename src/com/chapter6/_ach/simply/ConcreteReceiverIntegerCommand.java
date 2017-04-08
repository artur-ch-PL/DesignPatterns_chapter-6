package com.chapter6._ach.simply;

public class ConcreteReceiverIntegerCommand implements IReceiver {
	ReceiverInteger receiverInt;

	public ConcreteReceiverIntegerCommand(ReceiverInteger reciver) {
		this.receiverInt = reciver;
	}

	@Override
	public void execute() {
		receiverInt.execute();
	}

}
