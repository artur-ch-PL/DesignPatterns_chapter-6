package com.chapter6._ach.simply;

public class Invoker {
	IReceiver receiver;

	public Invoker() {
	}

	public void setReceiver(IReceiver receiver) {
		this.receiver = receiver;
	}

	public void buttonWasPressed() {
		receiver.execute();
	}
	
}
