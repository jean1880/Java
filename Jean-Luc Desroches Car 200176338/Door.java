
/**
 * Stores informaion on the state of the door
 * 
 * @author Jean-Luc Desroches 
 * @version 02/20/13
 */
public class Door
{
    // instance variables - replace the example below with your own
    private boolean doorState;

    /**
     * Creates the main door object and sets door open status to false
     */
    public Door()
    {
        doorState=false;
    }

    /**
     * Inverse the door state if it is not in the queried type
     */
    public String changeDoorState(boolean open)
    {
        /* changes the door to the queried type to open or close the door,
        if it is already in the queried state, return that it is already in that state*/
        if(doorState!=open){
            doorState = open;
            return("door is now ");
        }
        else{
            return("door is already ");
        }
    }
    
    /**
     * Returns the state of the door
     */
    public boolean checkDoor()
    {
       return doorState;
    }
}
