import java.util.*;

/**
 * Write a description of class Inventory here.
 * 
 * @author (Nick Kuznecov) 
 * @version (4-18-2013)
 */
public class Inventory
{
    
    private ArrayList<Product> productList; //Product ArrayList

    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        
        productList = new ArrayList<Product>();
        
    }
    
    public void productList()
    {
        Iterator<Product> it = productList.iterator();
        Product tempProduct;
        System.out.println("-----------------------------------INVENTORY-----------------------------------");
        System.out.format("%3s %-30s %10s %6s \n", "productID", "productDescription", "productStock", "productPrice");
        while(it.hasNext())
        {
            tempProduct = it.next();
            System.out.format("%3d %-30s %10d %6.2f \n", tempProduct.getProductID(), tempProduct.getProductDescription(), tempProduct.getProductStock(), tempProduct.getProductPrice());
        
        }
    }
    
    /**
     * Method getProductID, get the product ID
     * 
     * @param  index: the item #
     * @return     the product ID  
     */
        public int getProductID (int index)
    {
         return productList.get(index - 1).getProductID();
                       
    }
    
      
        /**
     * Method getProductDescription - Get the product description
     * 
     * @param  index: the item #  
     * @return     the product description.
     */
    
        public String getProductDescription(int index)
    {
         return productList.get(index - 1).getProductDescription();
                       
    }
    
        /**
     * Method getProductStock - Get the product Stock
     * 
     * @param  stock: the number of items to be checked
     * @return     the product stock
     */
    
    
        public int getProductStock (int stock)
    {
         return productList.get(stock - 1).getProductStock();
                       
    } 
    
        /**
     * Method getProductPrice - Get the product Price
     * 
     * @param  index: item #
     * @return     the product price 
     */
    
    
       public double getProductPrice (int index)
    {
         return productList.get(index - 1).getProductPrice();
                       
    } 
    
    
    /**
     * Method getReceipt - Get receipt information(product price)
     * 
     * @param  price: price of the product to be found
     * @return     the product price
     */
    
    
    public double getReceipt()
    {
        Iterator<Product> it = productList.iterator();
        double price = 0;
        Product tempProduct;
        while(it.hasNext())
        {
            tempProduct = it.next();
            price += tempProduct.getProductPrice();
        
        }
        return price;
    }
    
    
        /**
     * Method getItemID - Get list of items (product names)
     * 
     * @param  description: name of product to be found
     * @return  item ID of products
     */
    
    
        public int getItemID(String description)
    {
        ArrayList<String> items_array = new ArrayList<String>();
        Iterator<Product> it = productList.iterator();
        Product tempProduct;
        while(it.hasNext())
        {
            tempProduct = it.next();
            if(tempProduct.getProductDescription().equals(description))
            {
                return tempProduct.getProductID();
            }
        }
        System.out.println("Item not found");
        
        return 0;
    }
    
   
}
