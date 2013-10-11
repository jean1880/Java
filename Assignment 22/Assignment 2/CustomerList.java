import java.util.ArrayList;

/**
 * Write a description of class CustomerList here.
 * 
 * @author  Jean-Luc Desroches 
 * @version 04/17/13
 */
public class CustomerList
{
    // instance variables - replace the example below with your own
    private ArrayList<Customer> customers;

    /**
     * Constructor for objects of class CustomerList
     */
    public CustomerList()
    {
        customers = new ArrayList<Customer>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addCustomer(String name, String birthDate, int customerID)
    {
        Customer tempCustomer = new Customer(name, birthDate, customerID);
        customers.add(tempCustomer);
    }
    
    public Customer findCustomer(int customerID)
    {
        int index = 0;
        
        
        while((customers.get(index).getCustomerID()) != customerID && index < customers.size())
        {
            index++;
            if(customers.get(index).getCustomerID() == customerID)
            {
                return Customer;
            }
        }
        
        return null;
    }
}
