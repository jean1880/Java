import java.util.ArrayList;

/**
 * Write a description of class Reciept here.
 * 
 * @author Jean-Luc Desroches 
 * @version (a version number or a date)
 */
public class Receipt
{
    private double subtotal;
    private double total;
    private ArrayList<Double> productCosts;
    private ArrayList<String> productNames;
    private ArrayList<Integer> productIDs;
    private ArrayList<Integer> quantity;
    private boolean saleFinished;
    
    
    
    //Creates a constant integer for the current tax rate as a decimal
    private final double HST_TAX = 0.13;

    /**
     * Main constructor of receipt class, initiases requirements for functionality
     */
    public Receipt()
    {
        /*
         * Creates a collection of array lists to store various data
         */
        productCosts = new ArrayList<Double>();
        productNames = new ArrayList<String>();
        productIDs = new ArrayList<Integer>();
        quantity = new ArrayList<Integer>();
        
        // Set sale finished to false
        saleFinished = true;
        
    }

    /**
     * Adds an item to the reciept
     * 
     * @param  productCost      cost of the product in the form of a double
     * @param  productName      name of the product in the form of a String
     * @param  productID        ID of the product in the form of an integer
     * 
     */
    public void addToReceipt(double productCost, String productName, int productID)
    {
       
        
        productCosts.add(productCost);
        productNames.add(productName);
        productIDs.add(productID);
    }
    
    /**
     * remove an item from the receipt
     */
    public boolean removeFromReceipt(int productID)
    {
        boolean itemFound = false;
        int location = findProduct(productID);
        
        if(location != 2147483647)
        {
            // remove the found item from all ArrayLists            
            quantity.set(location, quantity.get(location) - 1);
            if(quantity.get(location) == 0)
            {
                quantity.remove(location);
                productIDs.remove(location);
                productNames.remove(location);
                productCosts.remove(location);
            }
            itemFound = true;
        }
        
        // return the value of item found to confirm success or faliure
        return itemFound;
    }
    
    /*
     * adds the sum of all items on the receipt so far
     */
    private void addSumOfCosts()
    {
        int count = 0;
        
        // Run a loop to add all items in the list to total
        if(!productCosts.isEmpty())
        {
            subtotal = getSubTotal();
            total = subtotal + (subtotal * HST_TAX);
        }
    }
    
    /**
     * Returns all items on the receipt
     */
    public void printReceiptList()
    {
        int itemCount = 1;
        if(!productCosts.isEmpty())
        {
            for(int productID : productIDs)
            {
                System.out.println(itemCount + ": " + productID + " | " + productNames.get(itemCount - 1) + " | " + quantity.get(itemCount - 1) + " | @ $" + productCosts.get(itemCount - 1) + " | " + (productCosts.get(itemCount - 1) * quantity.get(itemCount - 1)) +"\n");
                itemCount++;
            }
            System.out.println("Total: $" + returnTotal());
        }       
    }
    
    public double getSubTotal()
    {
        // Reset the subtotal to recalculate off of the current list
        subtotal = 0;
        int count = 0;
        
        for(double cost : productCosts)
        {
            count++;
            
            subtotal += quantity.get(count) * cost;
        }
        return subtotal;
    }
    
    /**
     * Return the total of the receipt
     */
    public double returnTotal()
    {
        addSumOfCosts();
        return total;
    }
    
    private int findProduct(int productID)
    {
        int count = 0;
        
        // loop through the ArrayList
        for(int productIDx : productIDs)
        {
            if(productIDs.get(count) == productID)
            {
                // remove the found item from all ArrayLists
                return count;
            }
            // Item not found so iterate count by one
            else
            {
                count++;
            }
            
        }
        // return max value of int as flag of faliure
        return 2147483647;
    }
    
    public ArrayList getProductIDs()
    {
        return productIDs;
    }
    
    public ArrayList getQuantities()
    {
        return quantity;
    }
    
    public void finishSale()
    {
        addSumOfCosts();
        saleFinished = true;
    }
    
    public void startSale()
    {
        saleFinished = false;
    }
    
    public boolean getSaleState()
    {
        return saleFinished;
    }
}
