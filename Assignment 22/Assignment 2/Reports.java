import java.util.ArrayList;

/**
 * Write a description of class Reports here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reports
{
    // instance variables - replace the example below with your own
    private Inventory inventory;
    private ArrayList receipts;
    
    public Reports()
    {
        receipts = new ArrayList<Receipt>();
        inventory = new Inventory();
    }
    
    /**
     * This function takes in a receipt, and adds it to an ArrayList of receipts, and manage the invenotry, removing all items from the receipt
     * 
     * @param receipt   a new receipt to be saved to the arraylist of receipts
     */
    public void addReceipt(Receipt receipt)
    {
        int productID;
        int quantity;
        
        // Adds the receipt to the receipts
        receipts.add(receipt);
        //subtract the quantity of product stock from inventory, system will also subtract negative numbers to return items to inventory in event of return
        ArrayList<Integer> productIDs = receipt.getProductIDs();
        ArrayList<Integer> quantities = receipt.getQuantities();
        for(int index =0;productIDs.size() > index; index ++)
        {
            inventory.removeStock(productIDs.get(index), quantities.get(index));
        }
        
    }
    

    /**
     * This function returns the total number of transactions as well as the total sales from the array of receipts
     */
    public void getSalesReport()
    {
        // for each receipt get the total sales, then returns the sizeof the arraylist for a count of the number of receipts stor 
        double total = 0.00;
        
        
       
        for(int index =0;receipts.size() > index; index ++)  
        {
            total = total + receipts.get(index).getSubTotal();
        }
        system.out.println("Total sales is $" +total);
    }
    
    
    /**
     * This returns a list of every item in the inventory, and the quantity in stock
     */
    public void getInventoryReport()
    {
        // using the inventory getAllProducts function print out all of the products in inventory
        system.out.println(inventory.getAllProducts);
    }
    
    /**
     * This returns the current inventory list
     */
    public Inventory getInventory()
    {
       return inventory;
    }
    
    
}
