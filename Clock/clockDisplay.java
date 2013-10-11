
/**
 * Write a description of class clockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clockDisplay
{
    // instance variables - replace the example below with your own
    private numDisplay minutes;
    private numDisplay hours;
    private String display;
    /**
     * Constructor for objects of class clockDisplay
     */
    public clockDisplay()
    {
        // initialise instance variables
        minutes = new numDisplay(60);
        hours = new numDisplay(24);
    }
    
    public void tick()
    {
        minutes.increment();
        if(minutes.getNumber()==0){
            hours.increment();
        }
        updateDisplay();
    }
    
    private void updateDisplay()
    {        
        display = minutes.displayValue() + " : " + hours.displayValue();
    }
    
    public String currentTime()
    {
        return display;
    }
}
