/*_________________________________________
 * NAME : KARL MCHALE
 * STUDENT ID: 1001678059
 * COP 2805C - JAVA Programming 2
 * SEMESTER / YEAR FALL 2019
 * ASSIGNMENT 0
 * Plagiarism statement
 * I certify that this assignment is my own work and that i have not copied in part or whole or otherwise 
 * the work of other students and /or persons----------------------
 */


package net.codejava;

import java.util.Scanner;


public class ArrayCopyDemo {

	public static void main(String[] args) {
		
		int[] sourceArray = new int [5];//{1,3, 5, 6, 9};
		int[] targetArray = new int [sourceArray.length];
		
		System.out.println("enter 5 numbers"); //user enters numbers in sourcearray
		
		Scanner keyboard = new Scanner(System.in);
		
		for (int i =0;i <sourceArray.length; i++)
		{
			sourceArray[i]= keyboard.nextInt();  //numbers assigned to sourceArraty loop
		}
		
		for (int i = 0; i < sourceArray.length; i++)
		{					
			targetArray[i] = sourceArray[i];
			System.out.println(targetArray[i]);
		}
	}

}
