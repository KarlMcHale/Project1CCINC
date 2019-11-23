

/*_________________________________________
 * NAME : KARL MCHALE
 * STUDENT ID: 1001678059
 * COP 2805C - JAVA Programming 2
 * SEMESTER / YEAR FALL 2019
 * ASSIGNMENT 2
 * Plagiarism statement
 * I certify that this assignment is my own work and that i have not copied in part or whole or otherwise 
 * the work of other students and /or persons----------------------
 */

package net.codejava;

import java.util.ArrayList;
//import java.util.IO.*:

public class GenericStack<E> extends ArrayList<E> {


public E peek() {    //gets the element in first place on teh stack
    return get(size() - 1);
}


//places a new element on the top of the stack . FIFO
		public void push(E o) 
		{
				add(o);
		}

		public E pop() {
	
				E o = get(size() - 1);
					remove(size() - 1);
					return o;
		}

			public boolean isEmpty() 
			{
				return super.isEmpty();
			}

}