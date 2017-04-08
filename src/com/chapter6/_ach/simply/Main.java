package com.chapter6._ach.simply;

public class Main {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		ReceiverBoolean receiverBool = new ReceiverBoolean();
		ReceiverInteger receiverInt = new ReceiverInteger();

		invoker.setReceiver(new ConcreteReceiverBoolCommand(receiverBool));
		invoker.buttonWasPressed();
		invoker.buttonWasPressed();

		invoker.setReceiver(new ConcreteReceiverIntegerCommand(receiverInt));
		invoker.buttonWasPressed();
		invoker.buttonWasPressed();
	}
}
