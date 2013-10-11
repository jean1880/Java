
/**
 * In class assignment
 * 
 * @author Jean-Luc Desroches
 * @version 1
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int ID;
    private boolean status=false;
    private String cStatus;
    
   
    /**
     * Blank Constructor
     */
    public Student()
    {
        cStatus=getStatus();
    }
    
    /**
     * Main Constructor takes input on student's first, and lastname as well as their ID
     */
    public Student(String fName, String lName, int ident)
    {
        firstName = fName;
        lastName = lName;
        ID = ident;
        
        cStatus=getStatus();
    }
    
    public void changeName(String fName, String lName)
    {
        firstName = fName;
        lastName = lName;
    }
    
    public String getFirstName()
    {
        return(firstName);
    }
    
    public String getLastName()
    {
        return(lastName);
    }
    
    public int getID()
    {
        return(ID);
    }
    
    public String getStatus()
    {
        if(status == false)
         {
             cStatus = "Inactive";
         }
         else
         {
             cStatus = "Active";
         }
        return(cStatus);
    }
    
    public void changeStatus()
    {
        status = !status;
        cStatus=getStatus();
    }
}
