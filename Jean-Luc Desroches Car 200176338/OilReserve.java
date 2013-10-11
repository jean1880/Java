
/**
 * Stores the amount of oil left in the engine
 * 
 * @author Jean-Luc Desroches
 * @version 02/20/13
 */
public class OilReserve
{
    // instance variables - replace the example below with your own
    private int oilRemaining;
    private String oil;

    /**
     * Creates the oil reserve object
     */
    public OilReserve()
    {
        // initialise instance variables
        oilRemaining = 100;
        
    }

    /**
     * Decreses the amount of oil left in the reserve and returns the amount
     */
    public String useOil()
    {
        // put your code here
        oilRemaining-=1;
        return(oil);
    }
    
    /**
     * Returns the amount of oil left in the reserve
     */
    public String checkOil()
    {
        oil = "You have " + oilRemaining + "% oil remaining";
        return(oil);
    }
}
