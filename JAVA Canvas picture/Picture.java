
/**
 * Write a description of class Picture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picture
{
    // instance variables - replace the example below with your own
    private Square bus1;
    private Square bus2;
    private Square bus3;
    private Circle wheel1;
    private Circle wheel2;
    private Person adult;
    private Person child1;
    private Person child2;
    private Person child3;
    private Person child4;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
           
        bus1 = new Square();
        bus2 = new Square();
        bus3 = new Square();
        wheel1 = new Circle();
        wheel2 = new Circle();
        adult = new Person();
        child1 = new Person();
        child2 = new Person();
        child3 = new Person();
        child4 = new Person();
       
        //initialize and place the front hood of the bus
        bus1.changeColor("yellow");
        bus1.moveHorizontal(-160);
        bus1.makeVisible();
        
        //initialize and place the centre of the bus
        bus2.changeColor("yellow");
        bus2.moveHorizontal(-100);
        bus2.changeSize(100);
        bus2.moveVertical(-40);
        bus2.makeVisible();
        
        //initialize and place the back of the bus
        bus3.changeColor("yellow");
        bus3.changeSize(100);
        bus3.moveVertical(-40);
        bus3.makeVisible();
        
        //initialize and place first wheel
        wheel1.changeSize(40);
        wheel1.moveVertical(70);
        wheel1.makeVisible();
        
        //initialize and place second wheel
        wheel2.changeSize(40);
        wheel2.moveVertical(70);
        wheel2.moveHorizontal(100);
        wheel2.makeVisible();
        
        //Initialise and place adult
        adult.moveHorizontal(-60);
        adult.moveUp();
        adult.makeVisible();
        
        //initialise and place first child
        child1.moveLeft();
        child1.changeSize(40,20);
        child1.makeVisible();
        
        //initialise and place second child
        child2.changeSize(40,20);
        child2.makeVisible();
        
        //initialise and place third child
        child3.moveRight();
        child3.changeSize(40,20);
        child3.makeVisible();
        
        //initialise and place fourth child
        child4.moveHorizontal(40);
        child4.changeSize(40,20);
        child4.makeVisible();
    }

}
