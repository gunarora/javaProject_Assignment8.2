/*1. Implement a class that checks whether a given number is a prime using
both the Thread class and Runnable interface*/
package javaProject_Assignment8; // declaration is mandatory

//importing scanner class
import java.util.Scanner;

public class PrimeUsingThread extends Thread
{
//declare variables
	int number;
	//parameterized constructor for taking input from user
	PrimeUsingThread(int s) { number = s; }
	//run method - thread 
	public void run()	
	    {	  
	    //logic to check prime no or not
		 for(int i=2; i<=number/2; i++){
	            if(number % i == 0){
	            	System.out.println("It's Not Prime Number");	
	            	break;
	            }
	            else
	            {
	            	 System.out.println("It's Prime Number");
	            	 break;
	            }
	        }
		// System.out.println("Prime");      
	    }
	//main method started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //declare variables
		 int no;
			
			Scanner sc = new Scanner(System.in); // Scanner to take input from user.
			//Print the value
			System.out.println("Enter number to check prime : ");
			
			no=sc.nextInt(); // Initialize  variable	
			//Close Scanner
			sc.close();
			//call method		
			  Thread t = new Thread(new PrimeUsingThread(no));
			   //thread start
			   t.start();
	}

}
