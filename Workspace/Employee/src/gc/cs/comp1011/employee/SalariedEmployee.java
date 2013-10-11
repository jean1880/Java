package gc.cs.comp1011.employee;

/**
 * 
 * @author Jean-Luc Desroches
 * @since 10/08/13
 */

public class SalariedEmployee extends Employee
{
	//instance variables
	private double weeklySalary;   //weekly salary of the employee

	/**
	 * 
	 * @param name					String: Name of the employee
	 * @param socialSecurityNumber	String: Social Security Number of the employee
	 * @param weeklySalary			Double: the weekly salary for the employee
	 */
	public SalariedEmployee(String name, String socialSecurityNumber, double weeklySalary) 
	{
		
		super(name, socialSecurityNumber);
		setWeeklySalary( weeklySalary);
	}


	/**
	 * @return Returns the weeklySalary
	 */
	public double getWeeklySalary() 
	{
		return weeklySalary;
	}


	/**
	 * @param weeklySalary Double: The weeklySalary to set
	 */
	public void setWeeklySalary(double weeklySalary) 
	{
		if (weeklySalary > 0)
		{
			this.weeklySalary = weeklySalary;
		}
		else
		{
			throw new IllegalArgumentException("Weekly Salary must be greater than 0");
		}
	}

    public double getEarnings()
    {
    	return weeklySalary;
    }
}