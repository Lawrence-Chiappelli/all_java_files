public class PreferredCustomer extends Customer
{
	
	private double purchases;
	private double discountLevel;
	
	public PreferredCustomer()
	{
		super();
		purchases = 0;
		discountLevel = 0;
	}
	
	public PreferredCustomer(String n,
							 String a,
							 String p,
							 String c,
							boolean m,
						   double pur)
    {
		super(n, a, p, c, m);
		purchases = pur;
    }
	
	public void setPurchases(double p)
	{
		purchases = p;
	}
	
	public double getPurchases()
	{
		return purchases;
	}
	
	public double getDiscountLevel()
	{	
		
		if(purchases > 500 && purchases < 1000)
		{
			discountLevel = 0.05;
		}
		else if(purchases >= 1000 && purchases < 1500)
		{
			discountLevel = 0.06;
		}
		else if(purchases >= 1500 && purchases < 2000)
		{
			discountLevel = 0.07;
		}
		else
		{
			discountLevel = 0.10;	
		}
		
		return discountLevel;
	}
}