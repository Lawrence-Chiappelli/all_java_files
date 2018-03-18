import java.util.Scanner;

public class PasswordDemo
{
	
	public static void main(String [] args)
	{
		
	  String input = "";
	  boolean firstAttempt = true;
	  int charCount = 0;
      Scanner keyboard = new Scanner(System.in);
      
      while(!PasswordVerifier.isValid(input, charCount))
      {
	      System.out.print("Enter a password: ");
	      input = keyboard.nextLine();
	      charCount = input.length();
		
	      if (!PasswordVerifier.isValid(input, charCount))
	      {
	         System.out.print("Invalid password.");
	         if(firstAttempt) 
        	 {
	        	 System.out.println(" Mandatory conditions:\n-More than 5 characters\n-1 upper case\n-1 lower case\n-1 digit\n");
	        	 firstAttempt = false;
        	 }
	         else System.out.print("\n\n");
	      }       	  
      }
      
      System.out.println("Valid password.");
      keyboard.close();	
	}
}