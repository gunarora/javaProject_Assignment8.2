package javaProject_Assignment8;
import java.util.Scanner; // import scanner class

public class PrimeNumber implements Runnable {
	 int number;
	 PrimeNumber(int s) { number = s; }
	public void run()	
	    {	  
        
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

	  public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			 int no;
				
				Scanner sc = new Scanner(System.in); // Scanner to take input from user.
				//Print the value
				System.out.println("Enter number to check prime : ");
				
				no=sc.nextInt(); // Initialize age variable	
				//Close Scanner
				sc.close();
						
				  Thread t = new Thread(new PrimeNumber(no));
				   t.start();
				
	}
			
	    }
	



