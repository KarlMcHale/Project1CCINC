/*
 * KARL McHALE
 * karl@itcomputercareers.com
 * this is a simple java program to check if a 
 * word is a palindrome.
* 
 * */

package net.codejava;

import java.util.Arrays;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// this code checks a sentence to see if it is a palindrome

	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter a word to chcek : ");
	String word = keyboard.nextLine();  // asks the user for input
	
	
	 if (isPalindrome(word))
		 System.out.println(word + " is a palindrome");
	 else
		 System.out.println(word + " is a not a palindrome");
	
	// now we create the isPalindromemethd 
	 
	}

	private static boolean isPalindrome(String word) {
		// TODO Auto-generated method stub
	 	int lowCharacter = 0;
	 	int highCharacter = word.length() -1; //sets index of character being examined
	 	
	 	while (lowCharacter<highCharacter)
	 	{
	 		if (word.charAt(lowCharacter) != (word.charAt(highCharacter)))
	 		//	return false;
	 	 	
		return false;  //metod returns false .if not false increments tyhe undex being searched by 1
	 	
		lowCharacter++;
 		highCharacter--;
	 	
	}
      return true;
}}
