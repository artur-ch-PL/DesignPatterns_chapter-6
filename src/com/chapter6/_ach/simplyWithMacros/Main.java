package com.chapter6._ach.simplyWithMacros;

public class Main {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		MacroCommand macroCommand = new MacroCommand();

		invoker.setCommand(macroCommand);
		invoker.buttonWasPressed();
		invoker.buttonWasPressed();
		invoker.buttonWasPressed();
		invoker.undoButtonWasPressed();

	}
}
