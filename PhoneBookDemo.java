import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookDemo
{
	public static void main(String [] args)
	{
	
		final int NUM_ENTRIES = 5;
		
		ArrayList<PhoneBookEntry> arraylist 
  = new ArrayList<PhoneBookEntry>();
		
		System.out.println("You are about to enter " 
						  + NUM_ENTRIES
					      + " names and phone numbers.");
						
		//Store PhoneBookEntry objects in the ArrayList
		for(int i = 0; i < NUM_ENTRIES; i++)
		{
			arraylist.add(getEntry());	
		}
		
		System.out.println("Here's the data you entered: ");
		for(int i = 0; i < arraylist.size(); i++) //Displaying data stored in array list...
		{
			displayEntry(arraylist.get(i));
		}	
	}
	

						   //The getEntry method creates a PhoneBookEntry object populated with data entered by the user and returns a reference to the object.
	public static PhoneBookEntry getEntry()
	{
		Scanner keyboard  = new Scanner(System.in);
		String name;
		String phoneNumber;
		
		System.out.print("Enter a person's name: ");
		name = keyboard.nextLine();
		System.out.print("Enter that person's phone number: ");
		phoneNumber = keyboard.nextLine();
		
		PhoneBookEntry entry = new PhoneBookEntry(name, phoneNumber);
		
		return entry;
	}
	
				 //the displayEntry method displays the data stored in a PhoneBookEntry object.
	public static void displayEntry(PhoneBookEntry entry2)
	{
		System.out.println("--------------------");
		System.out.println("Name: " + entry2.getName());
		System.out.println("Phone number: " + entry2.getPhoneNumber());
	}
}