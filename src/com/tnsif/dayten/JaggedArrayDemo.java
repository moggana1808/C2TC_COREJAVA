package com.tnsif.dayten;

public class JaggedArrayDemo {
	//Program to demonstrate Jagged array 
	

		public static void main(String[] args) {

			int d[][] = { { 10, 20, 30 }, { 40 }, { 12, 21 }, { 11 } };

			System.out.println("Total Rows in Array d : " + d.length);

			MLArray.printArray(d);
		}

	}

