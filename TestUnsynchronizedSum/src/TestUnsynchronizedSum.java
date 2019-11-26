/*--------------------------------------------------------------------

Name:  Karl McHale

Student ID:1001678059

COP 2805C - Java Programming 2 

Fall / 2019

Assignment # 5

Plagiarism Statement

 I certify that this assignment is my own work and that I
 have not copied in part or whole or otherwise plagiarized 
 the work of other students and/or persons.

--------------------------------------------------------------------*/

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
 
//private static Integer sum = new Integer(0);


		public  class TEstSynchronisedSum {
			//sets sum to 0; wrapepr class on the integer
			//public static Integer sum =new Integer(0);
			  int sum =0;
			
			  public static void main(String[] args) 
			  {
				TEstSynchronisedSum testSync = new TEstSynchronisedSum();
			    System.out.println("The total is " + testSync.sum);
			  }
			  //here we start the thread pool
			  public TEstSynchronisedSum() 
			  {
			    ExecutorService executor = Executors.newFixedThreadPool(1000);

			    for (int i = 0; i <=1000; i++) 
			  {
			      executor.execute(new sumTest()); // start of the 1000 threads
			  }

			    executor.shutdown();

			    while(!executor.isTerminated()) 
			    {
			    }
			  }

			  class sumTest implements Runnable {
			    public synchronized void run() {
			      int value = sum + 1;
			      sum = value;
			    }
			  }
			}