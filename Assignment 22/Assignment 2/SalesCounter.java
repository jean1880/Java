
/**
 * Write a description of class SalesCounter here.
 * 
 * @author Jean-Luc Desroches 
 * @version 04/14/13
 */
public class SalesCounter
{
    // instance variables - replace the example below with your own
    private Receipt currentSale; 
    private double tempCost;
    private String tempName;
    private Reports reports;
    

    /**
     * Constructor for objects of class SalesCounter
     */
    public SalesCounter()
    {
        currentSale = new Receipt();
        reports = new Reports();
    }

    /**
     * Start a sale at the cash, only if another sale is not active
     */
    public void startSale()
    {
        if(!currentSale.getSaleState())
        {
            currentSale = null;
            currentSale.startSale();
        }
    }
    
    /**
     * Scan an item to get product info and add it to the current sale
     */     
    public void addToSale(int productID)
    {
        getProductInfo(productID);
        if(tempCost != null)
        {
            currentSale.addToReceipt(tempCost,tempName, productID);            
        }        
    }
    
    
    public void addToReturn(int productID)
    {
        
    }
    
    /**
     * print the receipt out
     */
    private void updateReceipt()
    {
        System.out.println("\f");
        System.out.println(returnReceiptList());
    }
    
    /**
     * retrieve product info of productID from the inventory
     */
    private void getProductInfo(int productID)
    {
        // Retrieve a copy of the inventory from reports
        Inventory inventory = Reports.getInventory();
        if(inventory.checkID(productID))
        {
            tempCost = inventory.getProductCost(productID);
            tempName = inventory.getProductName(productID);            
        }
        else
        {
            itemError();
        }
    }
    
    /**
     * print out an error as the item was not found
     */
    private void itemError()
    {
        System.out.println("Item Does Not Exist");
        Thread.sleep(1000);
        System.out.println("\f");
    }
    
    /**
     * wipe out all temp variables
     */
    private void nullTemps()
    {
        tempCost = null;
        tempName = null;
    }
}
