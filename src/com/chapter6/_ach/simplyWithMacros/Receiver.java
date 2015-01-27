package com.chapter6._ach.simplyWithMacros;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.LinkedList;

public class Receiver {
	LinkedList<String> statesHistory = new LinkedList<String>();
	String state;
	
	public Receiver() {}

	public void execute() {
		state = nextSessionId();
		statesHistory.add(state);
		System.out.println("Current state: " + state);
	}

	public void undo() {
		statesHistory.removeFirst();
		System.out.println("Previouse state restore: " + statesHistory.getFirst());
	}

	private String nextSessionId() {
		SecureRandom random = new SecureRandom();
		return new BigInteger(130, random).toString(32);
	}

}
