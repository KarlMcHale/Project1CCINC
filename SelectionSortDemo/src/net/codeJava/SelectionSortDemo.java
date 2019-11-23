package net.codeJava;
import java.util.Scanner;


public class SelectionSortDemo {

	public static void main(String[] args) {
		
		
		int[] list = new int[6] ;//{1,4,513,23,6,7,9,12,34};
		
		System.out.println("Enter an array of 6 numbers : ");
		Scanner keyboard = new Scanner(System.in);
		 for (int i = 0;  i<list.length; i++) {
			 list[i]= keyboard.nextInt();
		 }
		
		
			for(int i = 0; i < list.length ; i++) {
				
				int currentMin = list[i];  //position rank of number
				int currentminIndex = i;
				
			for(int j = i+ 1; j < list.length; j++) {
				if (currentMin >list[j]) {
					
					currentMin = list[j] ;
					currentminIndex = j;
												
					}
				}
			if (currentminIndex != i) {
				
				list[currentminIndex] =list[i];
				list[i] = currentMin;
				
				
			}	System.out.println("the number  is " + currentMin + " and position in list is " + (currentminIndex));
		}
	}
}
