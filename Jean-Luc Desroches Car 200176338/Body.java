
/**
 * This class creates the 'body' of the 'car'.
 * 
 * @author Jean-Luc Desroches 
 * @version 02/19/13
 */
public class Body
{
    // instance variables - replace the example below with your own
    private Door driverDoor;
    private Door passengerDoor;

    /**
     * Main constructor, creates two door objects
     */
    public Body()
    {
        // initialise objects
        driverDoor = new Door();
        passengerDoor = new Door();
    }
    
    /**
     * Attempt to open the specified door and returns a response stating whther the door is open or closed
     */
    public String openDoor(int door)
    {
        /*
         * check the door value, if it is not door 1 then attempt to open the driver
         * door, else attempt to open the passenger door
         */ 
        if(door!=1){
            return("The driver "+driverDoor.changeDoorState(true)+"open.");
        }
        else{
            return("the passenger "+passengerDoor.changeDoorState(true)+"open.");
        }
    }
    
    /**
     * Attempt to close the specified door
     */
    public String closeDoor(int door)
    {
        /*
         * check the door value, if it is not door 1 then attempt to close the driver
         * door, else attempt to close the passenger door
         */ 
        if(door!=1){
            return("The driver "+driverDoor.changeDoorState(false)+"closed.");
        }
        else{
            return("the passenger "+passengerDoor.changeDoorState(false)+"closed.");
        }
    }
    
    /**
     * checks both doors and ensure that they are not open, return the state of the doors
     */
    public String checkDoors()
    {
        /*
         * if statement checks the door state to see if they are not open, doorstates ae measured with 
         * boolean type false = open, true = closed
         */
        if(!driverDoor.checkDoor() && !passengerDoor.checkDoor())
        {
            return("The doors are closed");
        }
        else
        {
            if(!driverDoor.checkDoor())
            {
                return("The driver door is open");
            }
            else
            {
                return("The passenger door is open");
            }
        }
    }
    
    /**
     * Special checkdoor method which returns a true or false statement for engine checks
     */
    public boolean checkDoors(int x)
    {
        /*
         * Check the door objects, if both objects return false, then both doors are closed and 
         * return doors shut as true, else return false
         */
        if(!driverDoor.checkDoor() && !passengerDoor.checkDoor())
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
    
}
