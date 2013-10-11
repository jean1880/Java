
/**
 * This is the cars transmission it is responsible for shifting gears within the engine
 * 
 * @author Jean-Luc Desroches
 * @version 02/18/13
 */
public class Transmission
{
    // instance variables - replace the example below with your own
    private String[] gear = {
        "park",
        "drive",
        "reverse"
    }; 
    private String currentGear;
    
    /**
     * Creates the transmission and sets the current gear to park
     */
    public Transmission()
    {
        // initialise instance variables
        currentGear = "park";
    }
    
    /**
     * Takes an inputed gear number to shift gears, returns an error if the transmission
     * is already in the requested gear
     */
    public String shiftGear(int gear)
    {
         //check whether requested gear is current gear, if not, alter gear and return new gear, else, return error 
        currentGear = this.gear[gear];
        return(currentGear);
    }
    
    /**
     * Return the current gear
     */
    public String getGear()
    {
        return(currentGear);
    }
}
