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
    private ArrayList<Receipt> receipts;
    private CustomerList customerList;
    
    public Reports()
    {
        receipts = new ArrayList<Receipt>();
        inventory = new Inventory();
        customerList = new CustomerList();
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
        
        for(int index = 0;receipts.size() > index; index ++)  
        {
            total = total + receipts.get(index).getSubTotal();
        }
        System.out.println("Total sales is $" +total);
    }
    
    
    /**
     * This returns a list of every item in the inventory, and the quantity in stock
     */
    public void getInventoryReport()
    {
        // using the inventory getAllProducts function print out all of the products in inventory
        inventory.productList();
    }
    
    /**
     * This returns the current inventory list
     */
    public Inventory getInventory()
    {
       return inventory;
    }
    
    /**
     * Returns boolean value whether the item exists in the inventory
     * 
     * @param productID product id to search for in inventory
     */
    public boolean checkID(int productID)
    {
        return inventory.checkID(productID);
    }
    
    /**
     * returns double value of the product cost from inventory
     * 
     * @param productID Product ID to search for in inventory
     */
    public double getProductPrice(int productID)
    {
        return inventory.getProductPrice(productID);
    }
    
    /**
     * returns String value of the product cost from inventory
     * 
     * @param productID Product ID to search for in inventory
     */
    public String getProductName(int productID)
    {
        return inventory.getProductName(productID);
    }
    
    /**
     * returns String value of the product cost from inventory
     * 
     * @param productID Product ID to search for in inventory
     */
    public String getProductDesc(int productID)
    {
        return inventory.getProductDescription(productID);
    }
    
    
}
