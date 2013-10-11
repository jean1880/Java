import java.util.*;

/**
 * Write a description of class Inventory here.
 * 
 * @author (Nick Kuznecov) 
 * @version (4-18-2013)
 */
public class Inventory
{
    
    private ArrayList<ProductClass> productList; //Product ArrayList

    /**
     * Constructor for objects of class Inventory
     */
    public Inventory()
    {
        
        productList = new ArrayList<ProductClass>();
        
    }
    /**
     * Adds a new product to the productList
     */
    public void addNewProduct(int ID, String name, String desc, double price, int stock)
    {
        ProductClass tempProduct = new ProductClass(ID, name, desc, price, stock);
        productList.add(tempProduct);    
    }
    
    public void productList()
    {
        Iterator<ProductClass> it = productList.iterator();
        ProductClass tempProduct;
        System.out.println("-----------------------------------INVENTORY-----------------------------------");
        System.out.format("%3s %-30s %10s %6s \n", "productID", "productDescription", "productStock", "productPrice");
        while(it.hasNext())
        {
            tempProduct = it.next();
            System.out.format("%3d %-30s %10d %6.2f \n", tempProduct.prodCode(), tempProduct.prodDesc(), tempProduct.prodStock(), tempProduct.prodPrice());
        
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
         return productList.get(index - 1).prodCode();
                       
    }
    
      
        /**
     * Method getProductDescription - Get the product description
     * 
     * @param  index: the item #  
     * @return     the product description.
     */
    
    public String getProductDescription(int index)
    {
         return productList.get(index - 1).prodDesc();
                       
    }
    
        /**
     * Method getProductStock - Get the product Stock
     * 
     * @param  stock: the number of items to be checked
     * @return     the product stock
     */
    
    
    public int getProductStock (int stock)
    {
         return productList.get(stock - 1).prodStock();                       
    } 
    
        /**
     * Method getProductPrice - Get the product Price
     * 
     * @param  index: item #
     * @return     the product price 
     */
    
    
    public double getProductPrice (int index)
    {
         return productList.get(index - 1).prodPrice();
                       
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
        Iterator<ProductClass> it = productList.iterator();
        ProductClass tempProduct;
        while(it.hasNext())
        {
            tempProduct = it.next();
            if(tempProduct.prodDesc().equals(description))
            {
                return tempProduct.prodCode();
            }
        }
        System.out.println("Item not found");
        
        return 0;
    }
    
     /**
     * Method removeStock - remove item from stock
     */
    
    
   public void removeStock(int productID, int quantity)
   {
        Iterator<ProductClass> it = productList.iterator();
        ProductClass tempProduct;
        int count = 0;
        while(it.hasNext())
        {
            tempProduct = it.next();
            if(tempProduct.prodCode() == productID)
            {
                productList.get(count).updateStock(-1);
            }        
            count++;
        }
        
   }
   
    /**
     * Method addStock - add item to stock
     */
    
    
   public void addStock(int productID, int quantity)
   {
       Iterator<ProductClass> it = productList.iterator();
        ProductClass tempProduct;
        int count = 0;
        while(it.hasNext())
        {
            tempProduct = it.next();
            if(tempProduct.prodCode() == productID)
            {
                productList.get(count).updateStock(1);
            }        
            count++;
        }
   }
}
