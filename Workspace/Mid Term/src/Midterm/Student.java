/**
 * 
 */
package Midterm;


/**
 * This class is a sub class of college member of the type student, which is used to create and store information 
 * relevant to a student of the college
 * @author Jean-Luc Desroches 
 *
 */
public class Student extends CollegeMember{
	private final static double MIN_FEES = 400; 
	private final static double MAX_FEES = 800; 
	private final static String INVALID_STATUS 	= "The specified status is not valid, valid inputs are 'full time' or 'part time', alternatively you can shorten it with 'f/t' or 'p/t'"; 
	private final static String INVALID_FEES 	= "The specified fees is not valid, fees must be between 400 and 800";
	
	private String status;
	private double fees = 0;
	
	
	/**
	 * Full student constructor with college member basic variables
	 * @param fullName
	 * @param email
	 */
	public Student(String fullName, String email, String status, double fees) {
		super(fullName, email);
		try
		{
			if(checkStatus(status) )
			{
				this.status = status;
			}
			else
			{
				throw new IllegalArgumentException(INVALID_STATUS);
			}
			if(checkFees(fees))
			{
				this.fees	= fees;
			}
			else
			{
				throw new IllegalArgumentException(INVALID_FEES);
			}			
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e.getMessage());
		}
	}
	
	/**
	 * This function returns a greeting for the student class
	 * @return greeting String: A greeting to be displayed to the user
	 */
	@Override
	public String greeting()
	{
		return String.format("Hello, I am a student and my name is %s", getFullName());
	}	

	/**
	 * Returns whether the student is part time, or full time
	 * @return status String: Returns users status
	 */
	public String getStatus() {
		if(this.status != null)
		{
			return status;
		}
		else
		{
			return "Status has not yet been set for this student";
		}
	}

	/**
	 * Sets the students current status
	 * @param status String: The students current status
	 */
	public void setStatus(String status) {
		if(checkStatus(status))
		{
			this.status = status;
		}
		else
		{
			throw new IllegalArgumentException(INVALID_STATUS);
		}
	}

	/**
	 * Returns the fees for the student
	 * @return fees Double: The current fees for the student
	 */
	public double getFees() {
		return this.fees;		
	}

	/**
	 * Sets the fees for the student
	 * @param fees Double: Fees for the student
	 */
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	/**
	 * Validates the students status
	 * 
	 * @param status String:Specified status to check
	 * @return boolean Boolean: True if valid, false if not valid
	 */
	private boolean checkStatus(String status)
	{
		String[] validStatus = {
				"full time",
				"part time",
				"full-time",
				"part-time",
				"p/t",
				"f/t"
		};
		boolean found = false;
		int i = 0;
		
		while(!found)
		{
			if(status.toLowerCase().equals(validStatus[i]))
			{
				// match found return true
				return true;
			}
			i++;
		}
		
		// no match was found return false
		return false;
	}
	
	/**
	 * Validates the fees to ensure that they are with the appropriate range of 400-800
	 * @param fees
	 * @return
	 */
	private boolean checkFees(double fees)
	{
		if(fees <= MAX_FEES && fees >= MIN_FEES)
		{
			// Fee is with a valid range
			return true;
		}
		// Fee is not within a valid range
		return false;
	}	
	

	/**
	 * Creates a string of what is stored in the student class, as well as it's parent college member class
	 */
	@Override
	public String toString() {
		return "Student [status=" + status + ", fees=" + fees + ", toString()="
				+ super.toString() + "]";
	}
}
