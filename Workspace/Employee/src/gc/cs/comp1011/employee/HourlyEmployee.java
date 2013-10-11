package gc.cs.comp1011.employee;

public class HourlyEmployee extends Employee {
	
	//instance variables
	private double wage;   //wage per hour
	private double hours;  //hours worked in the week
	
	//constants
	private final int MIN_HOUR=0, MAX_HOUR=168;
	
	public HourlyEmployee(String name, String socialSecurityNumber,
			double wage, double hours) {
		super(name, socialSecurityNumber);
		setWage(wage);
		setHours(hours);
	}



	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}



	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		if(wage >0)
			this.wage = wage;
		else
			throw new IllegalArgumentException("Wage per hour MUST be > 0");
	}



	/**
	 * @return the hours
	 */
	public double getHours() {
		return hours;
	}



	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		if(hours >= MIN_HOUR && hours <=MAX_HOUR)
			this.hours = hours;
		else
			throw new IllegalArgumentException("Hours worked MUST be between "+
		                       MIN_HOUR +" and " + MAX_HOUR);
	}
	
	@Override
	public double getEarnings()
	{
		return getWage() * getHours();
	}
	
	@Override
	public String toString()
	
	{
		return String.format("%s\n%-25s: $%.2f\n%-25s: %.2f hours",
				 super.toString(),
				 "Wages per hour",getWage(),
				 "Hours worked",getHours());
	}
}
