package com.chapter6._ach.simply;

public class Main {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Receiver receiver = new Receiver();
		SecondReceiver secondReceiver = new SecondReceiver();

		invoker.setCommand(new ConcreteReceiverCommand(receiver));
		invoker.buttonWasPressed();
		invoker.buttonWasPressed();

		invoker.setCommand(new ConcreteSecondReceiverCommand(secondReceiver));
		invoker.buttonWasPressed();
		invoker.buttonWasPressed();
	}
}
