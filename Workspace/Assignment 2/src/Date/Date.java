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
		this.day 	= 1;
		this.month 	= 1;
		this.year 	= 2013;
	}
	
	/**
	 * Construct date object using the month, day and year
	 * @param month 	Integer: Month of the year, ranges 1-12
	 * @param day		Integer: Day of the month, ranges 1-30/31 depending on the month
	 * @param year		Integer: Year in yyyy format, limited between 1900-2013
	 */
	public Date(int month, int day, int year)
	{
		try
		{
			// check month, day, and year for valid data, if valid, set variables
			if((month >= MIN_MONTH && month <= MAX_MONTH)&&(day > 0 && day <= Date.monthDays[month])&&(year >= MIN_YEAR && year <= CURRENT_YEAR))
			{
				this.day 	= day;
				this.month 	= month;
				this.year 	= year;
			}
			else // variable was found invalid, throw exception
			{
				error("Invalid Data provided");
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Invalid data type provided");
		}
	}
  
	/**
	 * 
	 * @param monthName	String: Name of the month
	 * @param day
	 * @param year
	 */
	public Date(String monthName, int day, int year) 
	{
		try
		{
			convertFromMonthName(monthName);
			if((day > 0 && day <= Date.monthDays[month])&&(year >= MIN_YEAR && year <= CURRENT_YEAR))
			{
				this.day	= day;
				this.year	= year;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 
	 * @param dayOfYear
	 * @param year
	 */
	public Date(int dayOfYear, int year)
	{
		try
		{
			
		}
		catch()
		{
			
		}
	}
   
	// Set the day; the value should be valid depending on the month; remember to check if it is a leap year   
	public void setDay( int dd )
	{ 
		try
		{
			if(dd >= 0 && (dd <= Date.monthDays[month]))
			{
				
			}
		}
		catch(IllegalArgumentException e)
		{
			
		}
	} // end method setDay

	// Set the month
	public void setMonth( int mm ) 
	{ 
		if ( mm >= MIN_MONTH && mm <= MAX_MONTH ) // validate month
		{
			month = mm;
		}
		else // month is invalid 
		{
			error( "Month must be "+MIN_MONTH +"-" +MAX_MONTH );
		}
	} // end method setMonth

	// Set the year
	public void setYear( int yyyy ) 
	{ 
		if ( yyyy >= MIN_YEAR && yyyy <= MAX_YEAR ) // validate year
		{ 
			year = yyyy;
		}
		else // year is invalid 
		{
			error( "Year must be "+ MIN_YEAR+ "-" + MAX_YEAR);
		}
   } // end method setYear

  
	private void error(String errorMessage)
	{
		throw new IllegalArgumentException(errorMessage);
	}
  
   // Return the number of days in the month
   private int daysInMonth() 
   { 
      return leapYear() && month == 2 ? 29 : monthDays[ month - 1 ];
   } // end method daysOfMonth

   // test for a leap year
   private boolean leapYear() 
   {
      if ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) )
         return true;
      else
         return false;
   } // end method leapYear

   // sets the day and month to the proper values based on day of the year
   //called from the constructor that takes in the day of the year as one of its parameter
   private void convertFromDayOfYear( int ddd ) 
   {
      int dayTotal = 0;

      if ( ddd < 1 || ddd > 366 ) // check for invalid day
         ddd = 1;

      setMonth( 1 );

      for ( int m = 1; 
         m < 13 && ( dayTotal + daysInMonth() ) < ddd; ++m )
      {
         dayTotal += daysInMonth();
         setMonth( m + 1 );
      } // end for

      setDay( ddd - dayTotal );
   } // end convertFromDayOfYear

   // given a month and day converts it into the day of the year
   // called from the method that returns the date in the format DDD YYYY
   
   private boolean convertToDayOfYear()    
   {
	 return false;
   } // end method convertToDayOfYear

   // convert from month name to month number
   // called from the constructor that takes in the name of the month as one of its parameter
   //set month to 1 if monthName is invalid
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
		   	this.month 	= i+1;
		}
		else // variable was not found, set month to 1
		{
			this.month 	= 1;
		}
   } // end convertFromMonthName
   
   private boolean verifymonthDay(int day)
   {
	   if(day >= 0 && (day <= Date.monthDays[month-1] || chackFebruaryDays(day)))
		{
			return true;
		}
	   return false;
   }
   
   private boolean chackFebruaryDays(int day)
   {
	   if(leapYear() && day <= Date.monthDays[1])
	   {
		   return true;
	   }
	   return false;
   }
} // end class Date




