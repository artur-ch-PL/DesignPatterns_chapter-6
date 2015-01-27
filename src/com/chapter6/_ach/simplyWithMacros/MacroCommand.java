package com.chapter6._ach.simplyWithMacros;

public class MacroCommand implements ICommand {
	Receiver r = new Receiver();
	SecondReceiver sr = new SecondReceiver();

	@Override
	public void execute() {
		r.execute();
		sr.execute();
	}

	@Override
	public void undo() {
		r.undo();
		sr.undo();
	}

}
