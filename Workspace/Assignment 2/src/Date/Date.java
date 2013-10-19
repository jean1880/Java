// Exercise 8.14 Solution: Date.java
// Date class definition
package Date;

/**
 * 
 * @author Jean-Luc Desroches
 *
 */
public class Date
{
	private int day; // day of the month
   	private int month; // month in the year
   	private int year; // year
   	private static final String[] monthNames = { "January", "February", 
      "March", "April", "May", "June", "July", "August", 
      "September", "October", "November", "December" };
   	private static final int[] monthDays = { 31, 28, 31, 30, 31, 30, 
      31, 31, 30, 31, 30, 31 };
   	private final int MIN_MONTH=1, MAX_MONTH=12, MIN_YEAR=1900, MAX_YEAR=2100, CURRENT_YEAR=2013;

   /**
    * Empty Constructor, initializes the date to January 1, 2013
    */
	public Date()
	{		
		setYear(CURRENT_YEAR);
		setMonth(1);
		setDay(1);
	}
	
	/**
	 * Construct date object using the month, day and year
	 * @param month 	Integer: Month of the year, ranges 1-12
	 * @param day		Integer: Day of the month, ranges 1-30/31 depending on the month
	 * @param year		Integer: Year in yyyy format, limited between 1900-2013
	 */
	public Date(int month, int day, int year)
	{		
		// check month, day, and year for valid data, if valid, set variables		
		setYear(year);		
		setMonth(month);
		setDay(day);
	}
  
	/**
	 * Construct the date using the name of the month, the day and the year
	 * @param monthName	String: Name of the month
	 * @param day		Integer: Day of the month to set
	 * @param year		Integer: Year to set
	 */
	public Date(String monthName, int day, int year) 
	{
		setYear(year);		
		convertFromMonthName(monthName);
		setDay(day);
	}
	
	/**
	 * Construct the date using the day of the year and the year
	 * @param dayOfYear		Integer: Day of the year
	 * @param year			Integer: Year to be set
	 */
	public Date(int dayOfYear, int year)
	{

		setYear(year);
		convertFromDayOfYear(dayOfYear);
	}
   
	/**
	 * Set the day; 
	 * @param dd		Integer: Day of the month to be set
	 */
	public void setDay( int dd )
	{ 
		try
		{
			if(dd >= 0 && (dd <= Date.monthDays[month-1] || chackFebruaryDays(dd)))
			{
				this.day = dd;
			}
			else
			{
				this.day = 1;
				throw new IllegalArgumentException("Day is out of bounds for the specified month");
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.print(e.getMessage());
		}
	} // end method setDay

	/**
	 * Set the the month of the year
	 * @param mm		Integer: Month of the year
	 */
	public void setMonth( int mm ) 
	{ 
		if ( mm >= MIN_MONTH && mm <= MAX_MONTH ) // validate month
		{
			month = mm;
		}
		else // month is invalid 
		{
			throw new IllegalArgumentException( "Month must be between "+MIN_MONTH +"-" +MAX_MONTH );
		}
	} // end method setMonth

	/**
	 * Set the year
	 * @param yyyy		Integer: The year to set the date to
	 */
	public void setYear( int yyyy ) 
	{ 
		if ( yyyy >= MIN_YEAR && yyyy <= MAX_YEAR ) // validate year
		{ 
			year = yyyy;
		}
		else // year is invalid 
		{
			throw new IllegalArgumentException( "Year must be between "+ MIN_YEAR+ "-" + MAX_YEAR);
		}
   } // end method setYear
	
	/**
	 * Returns the date in the format of MM/DD/YYYY
	 * @return String: Date
	 */
	public String getDateMMDDYYYY()
	{
		return String.format("%02d/%02d/%d", this.month, this.day, this.year);
	}
	
	/**
	 * Returns the date in the format of Name of the month dd, yyyy 
	 * @return 	String: Date 
	 */
	public String getDateMonthNameDDYYYY()
	{
		return String.format("%s %02d, %d", monthNames[this.month - 1], this.day, this.year);
	}

	/**
	 * Return the date as ddd/yyyy
	 * @return	String: Date
	 */
	public String getDateDayOfYearYYYY()
	{
		return String.format("%d/%d", convertToDayOfYear(), this.year);
	}
	
	/**
	 * Returns the number of the days in the month accounting for leapyears in february
	 * @return Integer: Number of days
	 */
	private int daysInMonth() 
	{ 	  
		return leapYear() && this.month == 2 ? 29 : monthDays[ month - 1 ];
	} // end method daysOfMonth
   
   /**
    *  test for a leap year, fixed logic error
    * @return Boolean: Leap year true or false
    */
   private boolean leapYear() 
   {
      if ( year % 4 == 0 && ( year % 400 == 0 || year % 100 != 0 ) )
      {
    	  return true;
      }
      else
      {
         return false;
      }
   } // end method leapYear

   /**
    *  sets the day and month to the proper values based on day of the year
    *  called from the constructor that takes in the day of the year as one of its parameter
    * @param ddd Integer: The day of the year
    */
   private void convertFromDayOfYear( int ddd ) 
   {
      int dayTotal = 0;
      
      if ( ddd < 1 || ddd > 366 ) // check for invalid day
      {
         ddd = 1;
      }
      
      setMonth( 1 );

      for (int m = 1 ;  m < 13 && ( dayTotal + daysInMonth() ) < ddd; m++ )
      {
         dayTotal += daysInMonth();
         setMonth( m + 1 );
      } // end for

      setDay( ddd - dayTotal );
   } // end convertFromDayOfYear

   /**
    *  given a month and day converts it into the day of the year
    *  called from the method that returns the date in the format DDD YYYY   
    * @return Integer: Day of the year
    */
   private int convertToDayOfYear()    
   {
	   int ddd;
	   int i = 0;
	   int sumDays = 1;
	   
	   // Add up the number of days except for the current month
	   for(;i < month - 1; i++)
	   {
		   sumDays += Date.monthDays[i];
	   }
	   
	   // if a leap year account for extended day in February
	   if(leapYear() && i > 2)
	   {
		   sumDays++;
	   }
	   
	   //passed number of days 
	   ddd = sumDays + day;
	   return ddd;
   } // end method convertToDayOfYear

   /**
    *  convert from month name to month number
    *  called from the constructor that takes in the name of the month as one of its parameter
    *  set month to 1 if monthName is invalid
    * @param monthName
    */
   private void convertFromMonthName( String monthName )   
   {
	   // initialize variables for navigating monthNames
	   int i 			= 0;
	   boolean found 	= false;
				
	   // begin to search for the requested month in the stored month array
	   while(!found && Date.monthNames[i] != null)
	   {
		   // if monthName is in monthNames set found to true
		   if(Date.monthNames[i].toLowerCase().equals(monthName.toLowerCase()))
		   {
			   found = true;
		   }
					
		   //increment the counter
		   i++;
	   }
	   // if the monthName was found and day and year is valid set variables
	   if(found)
	   {
		   	this.month 	= i;
		}
		else // variable was not found, set month to 1
		{
			this.month 	= 1;
		}
   } // end convertFromMonthName
   
   /**
    * Check Febraury specifically for number of days it contains, to see iof days being passed to it is a valid number of days
    * @param day 	Integer: Days to check
    * @return		Boolean: Days are valid true or false
    */
   private boolean chackFebruaryDays(int day)
   {
	   if(leapYear() && day <= Date.monthDays[1] + 1)
	   {
		   return true;
	   }
	   return false;
   }
} // end class Date




