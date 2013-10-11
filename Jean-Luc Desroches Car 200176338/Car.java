
/**
 * This creates a car, which has two doors, and contains an engine, with gas and oil stored information. This is interactable, and can be put into park, driver, or reverse.
 * 
 * @author Jean-Luc Desroches
 * @version 02/17/13
 */
public class Car
{
    // instance variables - replace the example below with your own
    private DriverControls driverControls;
    private Body carBody;
    private boolean doorsopen;

    /**
     * Creates required objects for the car, and clears the console of previous actions
     */
    public Car()
    {
       driverControls = new DriverControls();
       carBody = new Body();
       // Clear the cosole to clear previous actions with any previous car objects
       System.out.print('\f');
    }
    
    /**
     * Opens the driver door, and returns the results through the console
     */
    public void openDriverDoor()
    {
        System.out.println(carBody.openDoor(0));
    }
    
    /**
     * Close the driver door, and returns the results through the console
     */
    public void closeDriverDoor()
    {
        System.out.println(carBody.closeDoor(0));
    }
    
     /**
     * Opens the passenger door, and returns the results through the console
     */
    public void openPassengerDoor()
    {
        System.out.println(carBody.openDoor(1));
    }
    
    /**
     * close the passenger door, and returns the results through the console
     */
    public void closePassengerDoor()
    {
        System.out.println(carBody.closeDoor(1));
    }
    
    /**
     * Turn the ignition, turns the engine on and off, and returns the results through the console
     */
    public void turnIgnition()
    {
        System.out.println(driverControls.turnIgnition());
    }
    
    /**
     * Shift gears, into park, returns whether or not the action was succesful through the console
     */
    public void shiftToPark()
    {
        System.out.println(driverControls.shiftGear(carBody.checkDoors(1),0));
    }
    
    /**
     * Shift gears, into drive, returns whether or not the action was succesful through the console
     */
    public void shiftToDrive()
    {
        System.out.println(driverControls.shiftGear(carBody.checkDoors(1),1));
    }
    
    /**
     * Shift gears, into reverse, returns whether or not the action was succesful through the console
     */
    public void shiftToReverse()
    {
        System.out.println(driverControls.shiftGear(carBody.checkDoors(1),2));
    }
    
    /**
     * Check the drivers dashboard to check the status of various components of the vehicle, 
     * and returns the results through the console
     */
    public void checkDashBoard()
    {
        System.out.println(driverControls.checkDashboard());
    }
    
    /**
     * Checks the status of the doors, to see if they are open, or closed, returns results to the 
     * user through the console
     */
    public void checkDoors()
    {
        System.out.println(carBody.checkDoors());
    }
    
    /**
     * Apply the gas to the vehicle, and returns the results to the console
     */
    public void applyGas()
    {
        System.out.println(driverControls.applyGas(carBody.checkDoors(1)));
    }
    
    /**
     * Apply the brakes to the car, and returns the results to the console
     */
    public void applyBrake()
    {
        System.out.println(driverControls.applyBrake());
    }
}
