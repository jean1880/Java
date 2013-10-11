package gc.cs.comp1011.employee;

/**
 * This class creates employee objects that get paid commission on the sales they make.
 * @author Anju Chawla
 * @since Sept.26, 2013
 * @version 1.0
 *
 */
public class CommissionEmployee extends Employee {
	//instance variables
	private double grossSales;             //sales made by the employee
	private double commissionRate;         //commission rate to calculate commission
	
	
	/**
	 * This constructor validates and sets the values of the attributes of the object
	 * @param name a String to set the name of the employee
	 * @param socialSecurityNumber a String to set the social security number
	 * @param grossSales a double to set the sales
	 * @param commissionRate a double to set the commission rate
	 */
	public CommissionEmployee(String name, String socialSecurityNumber,
			double grossSales, double commissionRate) {
		
		super(name,socialSecurityNumber);
		setGrossSales(grossSales);
		setCommissionRate(commissionRate);
	}


	public double getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(double grossSales) {
		if(grossSales >= 0)
			this.grossSales = grossSales;
		else
			throw new IllegalArgumentException("Gross sales MUST be >= 0");
	}


	public double getCommissionRate() {
		
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		if (commissionRate > 0 && commissionRate < 1)
			this.commissionRate = commissionRate;
		else
			throw new IllegalArgumentException("Commission Rate MUST be >0 and < 1");
	}
	
	public double getEarnings()
	{
		return getGrossSales() * getCommissionRate();
	}
	
	
	@Override
	public String toString() {
		return String.format("%s\n%-25s: %.2f \n%-25s: %.2f%%",
				super.toString(), 
				"Gross Sales", getGrossSales(),
				   "Commission Rate", getCommissionRate()*100
				  );
	}
	
	
	

}
