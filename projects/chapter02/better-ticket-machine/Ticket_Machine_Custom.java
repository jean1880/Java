
/**
 * Write a description of class Ticket_Machine_Custom here.
 * 
 * @Jean-Luc Desroches
 * @version 1.0)
 */
public class Ticket_Machine_Custom{
    /* Declare field variables for selling a ticket */    
    private int cost;
    private int balanceOwed;
    private int balancePaid;
    private int totalSold;
    
    
    public Ticket_Machine_Custom(){
        /**
         * Empty ticket machine object used in the event that price is unknown
         * 
         */
    }
    
        /**
         * Ticket machine with set price at creation
         */
    public Ticket_Machine_Custom(int price){
    
        cost = price;
        balanceOwed = cost;
        balancePaid = 0;
        totalSold = 0;
        
        
    }
    
    public int getBalanceOwed(){
        /**
         * Retrieves the current balance
         */
        return balanceOwed;
    }
    
    public int getBalancePaid(){
        /**
         * Retrieves the current balance
         */
        return balanceOwed;
    }
    
    public void updatePrice(int newPrice){
        cost = newPrice;
    }
    
    public int getTotal(){
        return totalSold;
    }
    
    public void printTicket(){

        if(balancePaid<cost){
            System.out.println("You have not paid enough");
        }
        else{
            System.out.println("###############################");
            System.out.println("# Ticket Master - Cheap Tickets");
            System.out.println("#PAID:" + balancePaid);
            System.out.println("###############################");
            totalSold =+ balancePaid;
            balanceOwed = cost;
            balancePaid = 0;
        }
    }
    
    public void insertMoney(int payment){
        balancePaid += payment;
        balanceOwed = cost - balancePaid;
        if(balanceOwed>=cost){
            this.printTicket();            
        }
    }
}
