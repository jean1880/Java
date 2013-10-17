/**
 * 
 */
package Midterm;

/**
 * @author Jean-Luc
 *
 */
public class Faculty extends CollegeMember{
	private final static double  MIN_SALARY = 5000;
	private final static String INVALID_SALARY = "Invalid salary, the salary must be greater than 5000";
	
	private double salary = 0;

	
	/**
	 * @param fullName
	 * @param email
	 */
	public Faculty(String fullName, String email, double salary) {
		super(fullName, email);
		try
		{
			if(checkSalary(salary))
			{
				this.salary = salary;
			}
			else
			{
				throw new IllegalArgumentException(INVALID_SALARY);
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e.getMessage());
		}
	}
	
	private boolean checkSalary(double salary)
	{
		if(salary > MIN_SALARY)
		{
			return true;
		}
		return false;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		try
		{
			if(checkSalary(salary))
			{
				this.salary = salary;
			}
			else
			{
				throw new IllegalArgumentException(INVALID_SALARY);
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e.getMessage());
		}
	}

	@Override
	public String greeting() {
		return String.format("Hello, I am an instructor and my email is %s", getEmail());
	}

	/**
	 * Creates a string of what is stored in the faculty class, as well as it's parent college member clas
	 */
	@Override
	public String toString() {
		return "Faculty [salary=" + salary + ", toString()=" + super.toString()
				+ "]";
	}
	
}
