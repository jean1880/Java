package gc.cs.comp1011.employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	
	//instance variables
	private double baseSalary;  // the base salary of the employee
	
	public BasePlusCommissionEmployee(String name, String socialSecurityNumber,
			double grossSales, double commissionRate, double baseSalary )
			{
				super( name,  socialSecurityNumber,	grossSales,  commissionRate);
				setBaseSalary(baseSalary);
			}
	
		/**
	 * @return the base salary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}



	/**
	 * @param baseSalary a double to set the base salary
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary > 0)
			this.baseSalary = baseSalary;
		else
			throw new IllegalArgumentException("Base Salary MUST be > 0");
			
	}
	
	@Override
	public double getEarnings()
	{
	    //return getBaseSalary() + (getCommissionRate()* getGrossSales());
	    return super.getEarnings()+ getBaseSalary();
	}
	
	@Override
	public String toString()
	{
	   return String.format("%s\n%-25s: $%.2f",
			   super.toString(),"Base Salary", getBaseSalary());
	}
}