/**
 * 
 */

/**
 * @author Xabier
 *
 */
import java.util.Scanner;
public class ScanTypes {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("What option do you want [1,2,3,4]:\n"
				+ "[1] Type something to know if it is an int type variable or not\n"
				+ "[2] Type two numbers to see them in the console\n"
				+ "[3] Type a sentence to see it on the screen\n "
				+ "if you are going to choose [3], type the number and the sentence before pushing enter\n"
				+ "[4] Type something to know if it is a boolean type variable or not\n");
		
		int Option = scan.nextInt();
		
		if(Option == 1) {
		
		/* hasNext
		 * In this case hasNextInt() command would return true if the next scanned token is an int type.
		 * And if this happens the if loop will execute
		 */
		System.out.println("Type something\n");
		
		
	      if (scan.hasNextInt()) {
	    	  scan.close();
	    	  System.out.println("You have typed an int variable\n");
	    	   
	      }
	      
	      else { 
	    	  
	    	  System.out.println("You have NOT typed an int variable\n");
	    	  scan.close();
	      }
		}
	      /*Next
	       * When scanning next will take the next token
	       * In this case nextInt() is used to scan two different int variables
	       */
	      if (Option == 2) {
	     
	      
	      System.out.println("Type two numbers\n");
	      
	    	   int Number1  = scan.nextInt();
	    	   int Number2  = scan.nextInt();
	
	    	   scan.close();
	    	   
	    	  System.out.println("You typed "+Number1+" and "+Number2);
	      						
	      }
	      /*nextLine
	       * this command takes the whole line
	       */
	  
	      if(Option == 3) {
	    	 
	    	  System.out.println("Type a sentence\n\n");
	    	  String Sentence = scan.nextLine();
	    	  System.out.println("This is what you have typed-->"+Sentence);
	    	  
	      }
	      
	      /*nextBoolean
	       * nextBoolean command determines if the entered token is boolean type or not
	       * In this case if it is boolean the loop will be executed
	       */
	      if(Option == 4) {
	    	  
	    	  System.out.println("Type a boolean\n [true] or [false]\n");
	    	  
	    	  if(scan.hasNextBoolean()) {
	    		  
	    	  boolean Bool = scan.nextBoolean();
	    	  
	    	  if(Bool == true) {
	    		  
	    		  System.out.println("You have typed true (boolean)");
	    		    
	    	  					}
	    	  
	    	  else {
	    		  
	    		  System.out.println("You have typed false (boolean)");
	    		  
	    	  		}
	    	  							}
	    	  
	    	  else {
	    		  
	    		  System.out.println("This is not a boolean variable");
	    	  		}
	    		  
	      }
	    	  
	  }
	      
}

