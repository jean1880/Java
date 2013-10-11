
/**
 * This is a testing class, which is able to test the various functionss of the car class
 * 
 * @author Jean-Luc Desroches
 * @version 02/20/13
 */
public class tester
{
    // instance variables - replace the example below with your own   
    private static Car newCar;
    /**
     * Constructor for objects of class tester
     */
    public static void main(String [ ] args)
    {
        // initialise instance variables
        newCar = new Car();        
    } 
    
    /**
     * Opens the driver door, and returns the results through the console
     */
    public void openDriverDoor()
    {
        newCar.openDriverDoor();
    }
    
    /**
     * Close the driver door, and returns the results through the console
     */
    public void closeDriverDoor()
    {
        newCar.closeDriverDoor();
    }
    
     /**
     * Opens the passenger door, and returns the results through the console
     */
    public void openPassengerDoor()
    {
        newCar.openPassengerDoor();
    }
    
    /**
     * close the passenger door, and returns the results through the console
     */
    public void closePassengerDoor()
    {
        newCar.closePassengerDoor();
    }
    
    /**
     * Turn the ignition, turns the engine on and off, and returns the results through the console
     */
    public void turnIgnition()
    {
        newCar.turnIgnition();
    }
    
    /**
     * Shift gears, into park, returns whether or not the action was succesful through the console
     */
    public void shiftToPark()
    {
        newCar.shiftToPark();
    }
    
    /**
     * Shift gears, into drive, returns whether or not the action was succesful through the console
     */
    public void shiftToDrive()
    {
        newCar.shiftToDrive();
    }
    
    /**
     * Shift gears, into reverse, returns whether or not the action was succesful through the console
     */
    public void shiftToReverse()
    {
        newCar.shiftToReverse();
    }
    
    /**
     * Check the drivers dashboard to check the status of various components of the vehicle, 
     * and returns the results through the console
     */
    public void checkDashBoard()
    {
        newCar.checkDashBoard();
    }
    
    /**
     * Checks the status of the doors, to see if they are open, or closed, returns results to the 
     * user through the console
     */
    public void checkDoors()
    {
        newCar.checkDoors();
    }
    
    /**
     * Apply the gas to the vehicle, and returns the results to the console
     */
    public void applyGas()
    {
        newCar.applyGas();
    }
    
    /**
     * Apply the brakes to the car, and returns the results to the console
     */
    public void applyBrake()
    {
        newCar.applyBrake();
    }
}
