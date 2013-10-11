
/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private String birthDate;
    private int customerID;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String name, String birthDate, int customerID)
    {
       this.name = name;
       this.birthDate = birthDate;
       this.customerID = customerID;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getBirthDate()
    {
        return birthDate;
    }
    
    public int getCustomerID()
    {
        return customerID;
    }
}
