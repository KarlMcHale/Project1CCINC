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

import java.util.Arrays;
import java.util.Scanner;

public class MonkeyBusinessFinal {

	public static void main(String[] args) {
			
		int [][] food = new int[4][7];
		int days = 0;
		int ape = 0;
		int total = 0;//new int [1][7];
		int maxRow =0;
		int indexofMaxRow = 0;
		int indexOfMinRow =0;
		int sum =0;
		int temp =0;
		int columnTotal = 0; 
		int averageDaily = 0;
		int totalOfThisRow = 0;;
		int [] tempArray =new int[4];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the pounds each monkey ate daily : ");
		
		for(int row = 0; row < food.length; row++) 
		{
			
			for (int column = 0; column < food[row].length; column++)  //food[row].length
			{
				food[row][column] = input.nextInt();  // enter the lbs in food per day
				
				total += food[row][column];
				
				temp += food[row][column];//sum = total;
			//	columnTotal = food[row][column]; 	//	averageDaily = columnTotal / 4; 
				
				maxRow += food[0][column]; //adddded
				
				totalOfThisRow += food[row][column];// added
				
				if (totalOfThisRow > maxRow) 
				{
					//	maxRow = totalOfThisRow;
						
						totalOfThisRow += food[0][column];
						
						indexofMaxRow = row;   //was row
				}
		
				//*********************
				if (totalOfThisRow < maxRow) 
				{
					//	maxRow = totalOfThisRow;
						
						totalOfThisRow += food[0][column];
						
						indexOfMinRow = row;   //was row
				}
				
				
				
				//**************
											
			if ( total <= 0 )   // ensure no negative numbers are ntered
				{
					System.out.println("Incorrect. enter a positive number only");
           		}
			
			//++++++++++++++++++++ Insderyton sort
			
			 Arrays.sort(food[row]);
			
			
			// put his inside the method
			//	for (column =0; column < food[0].length; column++)
			//	{
			//		maxRow += food[0][column];
		//		}
				
			//	for (row =1; row < food.length; row++) 
			// int totalOfThisRow =0;
			//		for (column = 0; column < food[row].length; column++)
			//			totalOfThisRow += food[row][column];
					
			//		if (totalOfThisRow > maxRow) 
			//		{
			//			maxRow = totalOfThisRow;
				//		indexofMaxRow= row;
			//		}
			//	}
		}
			
				System.out.println("The total food for the week is " + total + " lbs for Ape " + (row + 1));
				System.out.println("The daily average food for the week is " + (total/7)+ " lbs for Ape " + (row + 1));
				
				total =0;
								
		}
	
		System.out.println("The combined total lbs of food for all the apes is " + temp); 
		System.out.println("The average daily food eaten by all monkeys is  " + (temp/28) + " lbs" );
		System.out.println("Row " + maxRow + " has the biggest sum");
		System.out.println("  ");
		 
		 System.out.println("The smallest amount of food consumed by an ape is  = " + indexOfMinRow); //food[0]);
	     System.out.println("The largest  amount of food consumed by an ape is by ape number "+ indexofMaxRow); //food[food.length - 1]);
		
		}
}
