/**
 * 
 */
package Date;

/**
 * @author Jean-Luc
 *
 */
public class tester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String DATE_LABEL = "Date blank constructor: ";
		// obstantiate for each type of object creation
		Date date			= new Date();
		Date dateDay 		= new Date(263,2008);
		Date dateStandard   = new Date(02,29,2008);
		Date dateMonth		= new Date("September",21,2013);
		
		// Output dates to demonstrate main functionality
		System.out.print("---------Output dates to demonstrate main functionality---------- \n\n");
		System.out.print(DATE_LABEL + date.getDateMMDDYYYY() + "\n");
		System.out.print(DATE_LABEL + date.getDateMonthNameDDYYYY() + "\n");
		System.out.print(DATE_LABEL + date.getDateDayOfYearYYYY() + "\n");
		System.out.print("Date from day of year " + dateDay.getDateMMDDYYYY() + "\n");
		System.out.print("Date from day of year " + dateDay.getDateMonthNameDDYYYY() + "\n");
		System.out.print("Date from day of year " + dateDay.getDateDayOfYearYYYY() + "\n");
		System.out.print("Date from standard date format " + dateStandard.getDateMMDDYYYY() + "\n");
		System.out.print("Date from standard date format " + dateStandard.getDateMonthNameDDYYYY() + "\n");
		System.out.print("Date from standard date format " + dateStandard.getDateDayOfYearYYYY() + "\n");
		System.out.print("Date from named month " + dateMonth.getDateMMDDYYYY() + "\n");
		System.out.print("Date from named month " + dateMonth.getDateMonthNameDDYYYY() + "\n");
		System.out.print("Date from named month " + dateMonth.getDateDayOfYearYYYY() + "\n\n");
		System.out.print("----------------------------------------------------------------- \n");
		
		// Change date and redisplay to show results of changes
		date.setDay(10);
		date.setMonth(5);
		date.setYear(2007);
		System.out.print("\n-----Change date and redisplay to show results of changes------ \n\n");
		System.out.print(DATE_LABEL + date.getDateMMDDYYYY() + "\n\n");
		System.out.print("--------------------------------------------------------------- \n");
	}
}
