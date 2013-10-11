
/**
 * Stores the amount of gas left in the engine
 * 
 * @author Jean-Luc Desroches 
 * @version 02/20/13
 */
public class GasTank
{
    // instance variables - replace the example below with your own
    private int gas;
    private boolean haveGas;

    /**
     * Creates the gas tank object and sets default gas tank value
     */
    public GasTank()
    {
        // initialise instance variables
        gas=100;
        haveGas = true;
    }

    /**
     * Checks the gas tank to see whether there is any gas left
     */
    public boolean haveGas()
    {
       /*
        *  if statement checks the remaining gas, and decreases the engine by 5% for the taken action before returning that 
        *  the tank does have gas, otherwise returns that there is no gas left
        */
       if(gas>0){
           gas-=5;
           return(haveGas);
       }
       else{
           haveGas = false;
           return(haveGas);
       }
    }
    
    /**
     * Returns the amount of gas reamining in the tank
     */
    public String level()
    {
       return("Your tank is "+gas+"% full");
    }
}
