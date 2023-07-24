package LabProgram308;

import java.util.Scanner;

public class ExceptionsWithArrays {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String[] names = { "Ryley", "Edan", "Reagan", "Henry", "Caius", 
							"Jane", "Guto", "Sonya", "Tyrese", "Johnny" };
		int index;

		index = scnr.nextInt();
		/* Type your code here. */
		try {
		System.out.println("Name: " + names[index]);
		}
		catch (ArrayIndexOutOfBoundsException  e) {
			System.out.println("Exception! Index " + index + " out of bounds for length " + names.length);
		if (index > names.length-1)
			System.out.println("The closest name is: " + names[names.length-1]);
		else 
			System.out.println("The closest name is: " + names[0]);
		}
	}
}
