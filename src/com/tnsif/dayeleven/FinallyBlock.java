package com.tnsif.dayeleven;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FinallyBlock {
	//Program to demonstrate Finally block

	

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			try {
				System.out.print("Enter the number : ");
				int number = scanner.nextInt();
				System.out.println(number % 2 == 0 ? number + " is Even" : number + " is Odd");
				return;
			} catch (InputMismatchException e) {
				System.err.println("Invalid input...");

			} finally {
				System.out.println("In Finally....");
				scanner.close();
			}

		}
	
}
