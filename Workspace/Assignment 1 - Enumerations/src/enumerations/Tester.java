/**
 * 
 */
package enumerations;



/**
 * @author Jean-Luc Desroches
 * @version 1.0
 */
public class Tester {

	
	/**
	 * Main tester method
	 * @param args
	 */
	public static void main(String[] args) {
		// create enumeration and build the frame
		Enumerations test = new Enumerations(1);		
		test.buildFrame(300, 400); // set frame size
		
		try{
			// Output light colours to jframe background, loop 3 times
			for (int i = 0; i < 4; i++) 
			{
				test.changeLight();
				Thread.sleep(test.getRedTime());
				test.changeLight();
				Thread.sleep(test.getYellowTime());
				test.changeLight();
				Thread.sleep(test.getGreenTime());				
			}
			// close and remove the frames
			test.myFrame.setVisible(false);
			test.myFrame.dispose();
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
	}
}
