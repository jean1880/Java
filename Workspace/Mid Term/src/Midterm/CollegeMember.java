/**
 * 
 */
package Midterm;

/**
 * This class is a super class containing requirements to create a basic College Member
 * 
 * @author Jean-Luc Desroches
 * @version 1.0
 * @since 10/15/2013
 */
public abstract class CollegeMember {
	private String fullName;
	private String email;
	
	/**
	 * Empty Constructor
	 */
	public CollegeMember()
	{
		
	}

	/**
	 * Main  constructor of College Member class, creates a basic college member
	 * 
	 * @param fullName	String: The full name of the college member
	 * @param email		String: email address of the college member
	 */
	public CollegeMember(String fullName, String email) {
		this.fullName 	= fullName;
		this.email 		= email;
	}

	/**
	 * Creates a string of what is in the college member class
	 */
	public String toString() {
		return "CollegeMember [fullName=" + fullName + ", email=" + email + "]";
	}

	/**
	 * 
	 * @return fullName String: Returns the full name of the college member
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName String: Allows user to set the full name of the college member
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * 
	 * @return email String: Returns the email address of the college member 
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email String: Returns the email address of the college member
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String greeting();
	
}
