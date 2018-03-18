import java.text.DecimalFormat;

public class PreferredCustomerMain 
{
	
	public static void main(String [] args)
	{
		
		PreferredCustomer customerObject2 = new PreferredCustomer("Julia James", "123 Main Street", "555-1212", "147-A049", true, 15);
		boolean valid;
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		
		customerObject2.setName("Julia James");
		customerObject2.setAddress("123 Main Street");
		customerObject2.setPhone("555-1212");
		
		customerObject2.setCustomerNumber("147-A049");
		customerObject2.setMailingList(true);
		
		customerObject2.setPurchases(1750);
		
		System.out.println("Name: " + customerObject2.getName()
					  + "\nAddress: " + customerObject2.getAddress()
					  + "\nPhone: "   + customerObject2.getPhone()
					  + "\nCustomer Number: " + customerObject2.getCustomerNumber());
					  
		valid = customerObject2.getMailingList();
		if(valid == true)
		{
			System.out.println("Mailing List: YES");
		}
		else
		{
			System.out.println("Mailing List: NO");
		}
		
		
		System.out.println("Purchases: $" + formatter.format(customerObject2.getPurchases())
				   + "\nDiscount level : " + formatter.format(customerObject2.getDiscountLevel()));											
	}
	
}