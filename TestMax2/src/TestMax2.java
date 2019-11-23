/*_________________________________________
 * NAME : KARL MCHALE
 *  karl@itcomputercareers.com
 *This application calculates the greater of 2 numbers entered by the user.
 */

import java.util.Scanner;

public class TestMax2 {

	public static void main(String[] args) {
	//	int i =0;
	//	int j =0 ;
	//	int k= max(i,j);
		
		
		//user enters the first number
		System.out.println("Enter first number : ");
		Scanner keyboard =new Scanner(System.in);
		int	i = keyboard.nextInt();
		
		System.out.println("Enter Second number : ");
		keyboard =new Scanner(System.in);
		int	j = keyboard.nextInt();
		
		//max method calculates which is greater
		int k= max(i,j);
		
		System.out.println("The max is "+ k);
		
	}
	
	// the legendary max method.Pythagoras would have loved this....if he was a coder.
	public static int max(int num1, int num2) {
		int result ;
		if (num1 > num2)
			result = num1;
		else
			if (num2 > num1);
		result = num2;
					
		return result;
				
	}

}
