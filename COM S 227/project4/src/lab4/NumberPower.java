/**
 * 
 */
package lab4;
import java.util.Scanner;

/**
 * @author luitelram
 *
 */
public class NumberPower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		// Create one scanner to read from System.in
	    Scanner scanner = new Scanner(System.in);
		
	    // Use the helper method to prompt and return the inputs
	    int first = getNumber(scanner);
	    int second = getNumber(scanner);
		
	    int result = (int) Math.pow(first, second);
	    System.out.println(first + " ^ " + second + " is " + result);
	  }
	  
	  /**
	   *  Helper method
	   * @param scanner
	   * @return
	   */
	  private static int getNumber(Scanner scanner)
	  {
		  int next;
	      System.out.print("Enter a number: ");
	    
	      if(scanner.hasNextInt())
	      {
	    	  next = scanner.nextInt();
	      }
	      else  
	      {
	    	  String s = scanner.next();
	    	   next = 1;
	       }
	      return next;
	  }
	

	}


