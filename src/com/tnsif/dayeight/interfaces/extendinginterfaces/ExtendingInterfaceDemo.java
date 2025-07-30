package com.tnsif.dayeight.interfaces.extendinginterfaces;

public class ExtendingInterfaceDemo implements ChildInterface { 
	//multiple inheritance - 
	
		// Override ChildInterface method
		public void print() { 
			System.out.println("print method");
		}

		// Override InterfaceOne method
		public void show() {
			System.out.println("show Method");
		}
	}


