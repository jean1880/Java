
/**
 * Write a description of class Ticket_Machine_Custom here.
 * 
 * @Jean-Luc Desroches
 * @version 1.0)
 */
public class Ticket_Machine_Custom{
    /* Declare field variables for selling a ticket */    
    private int cost;
    private int balance;
    private int totalSold;
    
        /**
         * Empty ticket machine object used in the event that price is unknown
         * 
         */
    public Ticket_Machine_Custom(){
    
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
   
         /**
         * Retrieves the current balance
         */
    public int getBalanceOwed(){
   
        return balanceOwed;
    }

         /**
         * Retrieves the current balance
         */
    public int getBalancePaid(){

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
            System.out.println("#PAID:" + balance);
            System.out.println("###############################");
            totalSold =+ balance;
            balanceOwed = cost;
            balancePaid = 0;
        }
    }
    
    public void insertMoney(int payment){
        if(payment<0){
        balance += payment;
    }
       else{
        }
    }
}
