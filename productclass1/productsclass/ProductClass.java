
/**
 * This class will allow the user to add and update the products in the inventory list.
 * 
 * @author (Brandon Balsdon) 
 * @version (18/04/2013)
 */
public class ProductClass
{
    private int productCode;
    private String productName;
    private String productDesc;
    private double productPrice; // Using double for decimals.
    private int productStock;

    /**
     * Constructor that will allow the user to add a product.
     */
    public ProductClass(int productCode, String productName, String productDesc, double productPrice, int productStock)
    {
       this.productCode = productCode;
       this.productName = productName;
       this.productDesc = productDesc;
       this.productPrice = productPrice;
       this.productStock = productStock;
    }

    /**
     * Return Method
     * 
     * 
     * @return     The method returns productCode which is an int. 
     */
    public int prodCode()
    {
        return productCode;
    }
    
    /**
     * Update Method (mutator)
     * 
     * 
     * @parm - Pass a int in to update the product Code
     */
    public void updateCode(int productCode)
    {
       this.productCode = productCode;
    } 
    
     /**
     * Return Method
     * 
     * 
     * @return     The method returns productName which is a String. 
     */
    public String prodName()
    {
        return productName;
    }
    
      /**
     * Update Method (Mutator)
     * 
     * 
     * @parm - Pass a String into the paramater productName to update the class variable productName.
     */
    public void updateName(String productName)
    {
       this.productName= productName;
    }
    
     /**
     * Return Method
     * 
     * 
     * @return     The method returns productDesc which is a String. 
     */
    public String prodDesc()
    {
        return productDesc;
    }
       /**
     * Update Method (Mutator)
     * 
     * 
     * @parm - Pass a String into the paramater productDesc to update the class variable productDesc.
     */
    public void updateDesc(String productDesc)
    { 
       this.productDesc = productDesc;
    }
      /**
     * Return Method
     * 
     * 
     * @return     The method returns productPrice which is a double. 
     */
    public double prodPrice()
    {
        return productPrice;
    }
    
       /**
     * Update Method (Mutator)
     * 
     * 
     * @parm - Pass a String into the paramater productPrice to update the class variable productPrice.
     */
    public void updateDesc(double productDesc)
    { 
       this.productPrice = productPrice;
    }
    
     /**
     * Return Method
     * 
     * 
     * @return     The method returns productStock which is an int. 
     */
    public int prodStock()
    {
        return productStock;
    }
    
    /**
     * Update Method (mutator)
     * 
     * 
     * @parm - Pass a int in to update the product Stock
     */
    public void updateStock(int productStock)
    {
       this.productStock= productStock;
    } 
}
