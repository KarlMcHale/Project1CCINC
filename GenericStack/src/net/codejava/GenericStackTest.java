/*_________________________________________
 * NAME : KARL MCHALE
 *
 *This app takes an array of strings which the user enters and tehn reverses their order
 *
 *
 */




package net.codejava;

import java.util.Scanner;

public class GenericStackTest {
	
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Create a Stack
		GenericStack<String> stack = new GenericStack<>(); 

		// Prompt the user to enter five strings
		System.out.print("Please enter five strings and presse enter: ");
		for (int i = 0; i < 5; i++) 
			stack.push(input.next());

		// Display the strings in reverse order
		System.out.println("The reverse order strings are :");
		
		while (!stack.isEmpty())
			System.out.println(stack.pop() + " ");
		System.out.println();
	}
}