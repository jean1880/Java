
/**
 * This is the engine of the car, it contains the oil, gas, and transmission objects and interacts with these 
 * as required by the driver of the car
 * 
 * @author Jean-Luc Dseroches
 * @version 02/12/13
 */
public class Engine
{
    // Declare variables for class
    private boolean engineOn;
    private boolean gasApplied;
    // String array to hold various engine error that can occur
    private String  engineError[] = {
            "You cannot change gears when the engine is off",
            "Nothing happens, the engine is not on",
            "Nothing happens, the car is in park",
            "Notihng happens, the car is out of gas",
            "You cannot turn off the engine while driving",
            "You cannot shift gears while pressing on the gas",
            "You cannot perform task, a door is open",
            "You are already in "
    };
    private String currentGear;
    private GasTank tank;
    private Transmission transmission;
    private OilReserve oil;
    private boolean moving;
    private boolean transissionValid;
    
    /**
     * Constructor for objects of class Engine, initialises defaults for Engine class
     */
    public Engine()
    {
        // initialise class variables for the engine, and create objects
        engineOn = false;
        currentGear = "park";
        gasApplied = false;
        moving=false;

        tank = new GasTank();
        transmission = new Transmission();
        oil = new OilReserve();
    }

    /**
     * If parked reverses the state of the engine and returns a string stating the engine state
     */
    public String ignitionTurned()
    {
        // check gear
        if(currentGear=="park")
        {
            // flip engine state
            engineOn = !engineOn;
            //return result
            if(engineOn==false)
            {
                return("The engine is now off");
            }
            else
            {
                return("The engine is now on");
            }
        }
        else
        {
            return(engineError[4]);
        }
    }
    
    /**
     * method changes gears within the engine, only when engine is off and gas is not applied, otherwise, returns an error
     */
    public String shiftGear(boolean doors, int gear)
    {
        if(engineOn==true)
        {
            /*
             *  check the state of doors, if the doors are shut then statement is
             *  true
             */
            if(doors)
            {
                /*
                 * check whether the gas is currently applied
                 */
                if(gasApplied!=true)
                {
                    if(currentGear == (transmission.shiftGear(gear)))
                    {
                        return(engineError[7]+currentGear);
                    }
                    else
                    {
                        currentGear = transmission.shiftGear(gear);                    
                        return("Your are now in " + currentGear);
                    }
                }
                else
                {
                    return(engineError[5]);
                }
            }
            else
            {
                return(engineError[6]);
            }
        }
    
        else
        {
            return(engineError[0]);
        }
    }
    
    /**
     * Method applies gas into the engine, and outputs a result depending on the state
     */
    public String applyGas(boolean doors)
    {
        
        String moveMessage = "The car begins to move ";
        
        /* If statement checks to make sure that engine is not off, if it is off, return engineError 2*/
        if(engineOn!=true)
        {
            return(engineError[1]);
        }

        /*If statement uses gastank method to check and make sure that theree is gas in the tank, 
        and if so, the method then uses up some gas, and will execute the action*/
        else if(!(tank.haveGas()))
        {
            if(doors)
            {
                gasApplied = true;
                oil.useOil();
                /*If statement checks to see if car is in park, if it is not, it then returns a 
                String stating whether the car is moving forwards, or backwards*/
                if(currentGear!="park")
                {
                    moving=true;
                    if(currentGear == "drive"){
                        return(moveMessage+"forward");
                    }
                    else{
                        return(moveMessage+"backward");
                    }
                }
                else
                {
                    return(engineError[2]);
                }
            }
            else
            {
                return(engineError[6]);
            }
        }

        // If others fail, then car is out of gas
        else
        {
            return(engineError[3]);
        }
    }
    
    /**
     * Applies brake by stopping gas applied to the engine, and returns string back to confirm completion
     */    
    public String applyBrake()
    {
        gasApplied = false;
        return("The car is no longer moving");
    }
    
    /**
     * changes the current gear through the transmission object and returns current gear through a string
     */
    public String getGear()
    {
        currentGear = transmission.getGear();
        return("You are currently in " + currentGear);
    }
    
    /**
     * uses the tank object to return the current level of gas
     */
    public String checkGas()
    {
        return(tank.level());
    }
    
    /**
     * uses the oil object to chech the current oil level remaining
     */
    public String checkOil()
    {
        return(oil.checkOil());
    }
    
    /**
     * returns a string stating whether the care is moving, and in which direction it is moving
     */
    public String checkCar()
    {
        if(gasApplied==true)
        {
            if(currentGear == "drive")
            {
                return("The car is moving forward");
            }
            else
            {
                return("The car is moving in reverse");
            }
        }
        else
        {
            return("The car is not moving");
        }
    }
    
    /**
     * returns a string indicating whether the engine is currently on or off
     */
    public String checkEngine()
    {
        if(engineOn==true)
        {
            return("The engine is running");
        }
        else
        {
            return("The engine is off");
        }
    }
}
