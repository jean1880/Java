
/**
 * Write a description of class numDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class numDisplay
{
    // instance variables - replace the example below with your own
    private int number;
    private int maxNumber;

    /**
     * Constructor for objects of class numDisplay
     */
    public numDisplay(int maxValue)
    {
       /* Assign maximum value to clock */
       maxNumber = maxValue;
       number = 0;       
    }
    
    /**
     * Returns the current value of number
     */
    public int getNumber()
    {
        return number;
    }
    
    /**
     * Changes the value of number to a new specified value
     */
    public void changeNumber(int newNumber)
    {
        number = newNumber;
    }
    
    /**
     * Returns the current value as a string to be displayed
     */
    public String displayValue()
    {        
        if(number<10){
            return "0" + number;
        }
        
        else
        {
            return ""+number;
        }
    }
    public void increment()
    {
        number = (number+1)%maxNumber;
    }
}

