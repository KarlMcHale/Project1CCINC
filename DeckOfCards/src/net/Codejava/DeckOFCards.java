
/*_________________________________________
 * 	NAME : KARL MCHALE
 * 	karl@itcomputercareers.com
 *  This app generates random cards from a deck of cards.
 */

package net.Codejava;

import java.util.*;

public class DeckOFCards {

	public static void main(String[] args) {
		
		int deck[] = new int[52];   //cretaes array of cards 52
		
		String[] suits = {"spades", "hearts", "diamonds", "clubs"}; //array of the 4 Suits
		String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","jack","queen","king"};// cards that each suit has
				
				for (int i =0; i < deck.length; i++) 
					
					deck[i] =i; //sets the index
				// now we shuffle the cards
				
				
				for (int i =0; i < deck.length; i ++) {
					int index = (int)(Math.random()*deck.length);  //randomises numbers 1-52
					int temp =deck[i];
					deck[i]= deck[index];
					deck[index] =temp;
									
				}
				
				// display the first 4 cards 
				
				for(int i = 0; i < 4; i++) 
				{
					
					String suit = suits[deck[i]/13];
					String rank = ranks[deck[i]%13];
					
					System.out.println("The Card number is " + deck[i] + ": " + rank +" of " + suit);
					
				}
			
			}
				
	}


