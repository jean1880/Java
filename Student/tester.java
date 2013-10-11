
/**
 * Write a description of class tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String[] args)
    {
        Student testStudent = new Student("Jean-Luc","Desroches",200176338);
        
        System.out.println("Student Name: " + testStudent.getFirstName() + " " + testStudent.getLastName());
        System.out.println("Student #: " + testStudent.getID());
        System.out.println(testStudent.getStatus());
    }
}
