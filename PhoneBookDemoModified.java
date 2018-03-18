import java.util.Scanner;
import java.util.ArrayList;

public class PhoneBookDemoModified
{
	public static void main(String [] args)
	{
	
		//final int NUM_ENTRIES = 5;
		int user_num_entries = 0;
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<PhoneBookEntryModified> arraylist 
  = new ArrayList<PhoneBookEntryModified>();
		
		System.out.print("How many entries would you like to create for the StudentRecord objects?: ");
		user_num_entries = keyboard.nextInt();
	//	keyboard.close();
		
		
		System.out.println("You are about to enter " 
						  + user_num_entries
					      + " names, IDs, and majors.");
						
		//Store PhoneBookEntry objects in the ArrayList
		for(int i = 0; i < user_num_entries; i++)
		{
			arraylist.add(getEntry(i));	
		}
		
		System.out.println("Here's the data you entered: ");
		for(int i = 0; i < arraylist.size(); i++)
		{
			displayEntry(arraylist.get(i));
		}
	}
	

						   //The getEntry method creates a PhoneBookEntry object populated with data entered by the user and returns a reference to the object.
	public static PhoneBookEntryModified getEntry(int counter)
	{
		Scanner keyboard2  = new Scanner(System.in);
		String name;
		String ID;
		String major;
		
		counter++;
		System.out.print("Enter person " + counter + "'s name: ");
		name = keyboard2.nextLine();
		System.out.print("Enter that person's ID: ");
		ID = keyboard2.nextLine();
		System.out.print("Enter that person's major: ");
		major = keyboard2.nextLine();	
		
		PhoneBookEntryModified entry = new PhoneBookEntryModified(name, ID, major);
		
//		keyboard2.close();
		return entry;
	}
	
				 //the displayEntry method displays the data stored in a PhoneBookEntry object.
	public static void displayEntry(PhoneBookEntryModified entry2)
	{
		System.out.println("--------------------"       );
		System.out.println("Name: "  + entry2.getName() );
		System.out.println("ID: "    + entry2.getID()   );
		System.out.println("Major: " + entry2.getMajor());
	}
}