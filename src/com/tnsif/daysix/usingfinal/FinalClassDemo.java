//Program to demonstrate final class
package com.tnsif.daysix.usingfinal;

final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

//can't create child classes from Final class, Ex: String, Wrapper Classes, System, Scanner, Number are Final classes
class FinalChildClass extends FinalClassDemo {
}

public class FinalClassDemo {
	public static void main(String[] args) {
		// Create the object of final class
		FinalClassDemo f1 = new FinalClassDemo(); // Call show() method using object reference variable ab.
		f1.show();
	}

	private void show() {
		// TODO Auto-generated method stub
		
	}
}