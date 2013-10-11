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
     * @param  productID: the item ID
     * @return     the product ID  
     */
    public int getProductIndex (int productID)
    {
        int i = 0;
        for(ProductClass productIDx : productList)
         {
             if(productID == productIDx.prodCode())
             {
                 return i;
             }
             i++;
         }
        
        return 2147483647;
        
    }
    
      
        /**
     * Method getProductDescription - Get the product description
     * 
     * @param  productID: the item id  
     * @return     the product description.
     */
    
    public String getProductDescription(int productID)
    {
        int index = getProductIndex(productID);
        if(index == 2147483647)
        {
            return productList.get(index - 1).prodDesc();
        }
        else 
        {
            return "Error";
        }
    }
    
        /**
     * Method getProductStock - Get the product Stock
     * 
     * @param  productID: the item id
     * @return     the product stock
     */
    
    
    public int getProductStock (int productID)
    {
        int index = getProductIndex(productID);
        if(index == 2147483647)
        {
            return productList.get(index - 1).prodStock();
        }
        else 
        {
            return 2147483647;
        }                    
    } 
    
        /**
     * Method getProductPrice - Get the product Price
     * 
     * @param  productID: item id
     * @return     the product price 
     */
    
    
    public double getProductPrice (int productID)
    {
        int index = getProductIndex(productID);
        if(index == 2147483647)
        {
            return productList.get(index - 1).prodPrice();
        }
        else 
        {
            return 2147483647;
        }                
    } 
    
         /**
     * Method getProductPrice - Get the product Price
     * 
     * @param  productID: item id
     * @return     the product price 
     */
    
    
    public String getProductName (int productID)
    {
        int index = getProductIndex(productID);
        if(index == 2147483647)
        {
            return productList.get(index - 1).prodName();
        }
        else 
        {
            return "Error";
        }                
    } 
        
     /**
     * Method getItemID - Get list of items (product names)
     * 
     * @param  description: name of product to be found
     * @return  item ID of products
     */
    
    
    public boolean checkID(int productID)
    {
        ArrayList<String> items_array = new ArrayList<String>();
        Iterator<ProductClass> it = productList.iterator();
        ProductClass tempProduct;
        while(it.hasNext())
        {
            tempProduct = it.next();
            if(tempProduct.prodCode()== productID)
            {
                return true;
            }
        }
        System.out.println("Item not found");
        
        return false;
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
