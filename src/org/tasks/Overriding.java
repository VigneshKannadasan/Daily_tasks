package org.tasks;

public class Overriding extends Overloading {
	public void fun() {
		super.fun();
		System.out.println("Function 2");
	}

	public static void main(String[] args) {
		Overriding or = new Overriding();
		or.fun();

	}

}
