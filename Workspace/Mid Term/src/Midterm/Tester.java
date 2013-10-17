/**
 * 
 */
package Midterm;

/**
 * @author Jean-Luc
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create a CollegeMember object
		 * CollegeMember collegeMember = new CollegeMember("Tester McGee","test@test.com");
		 * Creation of the CollegeMember is not possible by itself due to the fact 
		 * that it is an abstract class, and requires that it be created through a 
		 * sub class which inherits it's functions and variables. 
		 */
		
		// Create a Student Object
		Student student 	= new Student("Joe McGee","joe@gee.com","Full Time",450);
		// Create a Faculty Object
		Faculty faculty	= new Faculty("Tom Too", "too@yahoo.com", 45000.00);
		
		// Show all the information about the 'student'
		System.out.print(student.toString() + "\n");
		// Show all the information about the 'faculty'
		System.out.print(faculty.toString() + "\n");
		
		/* 
		 * Show the polymorphic behavious of the subclass object using a suitable
		 * example and comments explaining polymorphism
		 * 
		 * Polymorphism is the ability of subclasses to reuse it's parents classes 
		 * and modify them so that they are best suited to the subclasses needs,
		 * the greeting abstract method is an excellent example of this as the  
		 * method in the parent class CollegeMember contains no inherit code, but 
		 * instead receives the code from it subclass, and is thereby accessible 
		 * through any class that extends it
		 */		
		System.out.print(student.greeting() + "\n");
		System.out.print(faculty.greeting() + "\n");
	}

}
