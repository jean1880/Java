package enumerations;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


/**
 * @author Jean-Luc Desroches
 * @since October 1, 2013
 * @version 1.0
 * 
 */
public class Enumerations {
	private int redTime;
	private int yellowTime;
	private int greenTime;
	private int lightState;
	JFrame myFrame = new JFrame("Traffic Light"); // set JFrame object, set title
	
	/**
	 * Create Enumerator for the street light
	 */
	private enum streetLight {
		RED (1000), 
		YELLOW (500), 
		GREEN (1000);
		
		private final int time;
		
		/**
		 * @param time Integer - Sets the amount of the time for the light
		 * 
		 */
		streetLight(int time)
		{
			this.time = time;
		}

		/**
		 * @return time Integer - Amount of time the set light lasts
		 */
		public int getTime() {
			return time;
		}		
	};
	
	/**
	 * @param timeFactor 	Integer - Amount of time that the base light time should be multiplied by
	 */
	public Enumerations(int timeFactor)
	{
		this.redTime 	= timeFactor * streetLight.RED.getTime();
		this.yellowTime	= timeFactor * streetLight.YELLOW.getTime();
		this.greenTime 	= timeFactor * streetLight.GREEN.getTime();
	}

	/**
	 * @return  redTime		Integer - Amount of time the red light should stay on
	 */
	public int getRedTime() {
		return redTime;
	}

	/**
	 * @return  yellowTime	 Integer - Amount of time the yellow light should stay on
	 */
	public int getYellowTime() {
		return yellowTime;
	}

	/**
	 * @return greenTime	Integer - Amount of time the green light should stay on
	 */
	public int getGreenTime() {
		return greenTime;
	}
	
	/**
	 * @param width 	Integer - Width of the frame
	 * @param height	Integer -Height of the frame
	 */
	public void buildFrame(int width, int height)
	{
		// Set frame parameters, height and width based on input
		this.myFrame.setSize(width,height);
		this.myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.myFrame.setVisible(true);	
	}
	
	/**
	 * Sets the light to the next colour state
	 */
	public void changeLight()
	{
		setFrameColor(this.lightState);
		this.lightState++;
		// if the lightState is set to 3, revert 0 as overflow value, returns light from green State to red state
		if(this.lightState==3)
		{
			this.lightState = 0;
		}
	}
	
	/**
	 * @param lightState Integer - Value between 0 and 2, to set which colour the light should be
	 */
	private void setFrameColor(int lightState)
	{
		switch(lightState)
		{
			case 0:
				this.myFrame.getContentPane().setBackground(Color.red);
				break;
			case 1:
				this.myFrame.getContentPane().setBackground(Color.yellow);
				break;
			case 2:
				this.myFrame.getContentPane().setBackground(Color.green);
				break;
		}
	}
}
