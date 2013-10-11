package gc.cs.comp1011.employee;

public abstract class Employee //extends Object
{
	
	//instance variables
	private String name;                   //name of the employee
	private String socialSecurityNumber;   // SIN of the employee
	
	
	public Employee(String name, String socialSecurityNumber)
	{
		//super();
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * This method returns the name of the employee
	 * @return the name of the employee
	 */
	public String getName() {
		return name;
	}


	/**
	 * This methods sets the name of the employee
	 * @param name a String to set the name of the employee
	 */
	public void setName(String name) {
		this.name = name;
	}


	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}


	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public abstract double getEarnings();
	
	@Override
	public String toString()
	{
		return String.format("%-25s: %s\n%-25s: %s",
		"Employee Name", getName(),
		"Social Security Number", getSocialSecurityNumber());
		   
	}
	

}
