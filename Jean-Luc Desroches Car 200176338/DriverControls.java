
/**
 * These are the driver controls that the driver interacts with, and then access the various components within the car
 * 
 * @author Jean-Luc Desroches
 * @version 02/18/13
 */
public class DriverControls
{
    // instance variables - replace the example below with your own
    private Engine carEngine;
    
    /**
     * creates required object engine, and sets engine state as 1, which is the setting for 'off'
     */
    public DriverControls()
    {
        // create new engine object then set engine state to 'off'
        carEngine = new Engine();
    }
    
    /**
     * Flips the engine state through the engine object then returns the current engine state
     */
    public String turnIgnition()
    {
        return(carEngine.ignitionTurned());
    }
    
    /**
     * Sends the requested gear number down to the engine and returns the result
     */
    public String shiftGear(boolean doors, int gear)
    {
        return(carEngine.shiftGear(doors,gear));
    }
    
    /**
     * Checks various aspects of the cars state, and returns the results in a concatenated string
     */
    public String checkDashboard()
    {
        return(carEngine.checkGas()+"\n"+carEngine.checkOil()+"\n"+carEngine.checkCar()+"\n"+carEngine.checkEngine());
    }
    
    /**
     * Sends request to apply gas within the engine, and returns the result
     */
    public String applyGas(boolean doors)
    {
        return(carEngine.applyGas(doors));  
    }
    
    /**
     * Sends request to apply the brake within the engine, and returns the result
     */
    public String applyBrake()
    {
        return(carEngine.applyBrake());
    }
}
