
/**
 * Write a description of class tester here.
 * 
 * @author (Brandon Balsdon) 
 * @version (19/04/2013)
 */
public class tester
{
    
    public static void main(String[] args)
    {
        SalesCounter salesCounter = new SalesCounter();
        salesCounter.addNewProduct(3003, "Chocolate Bar", "Yummy and GUI", 1.99, 22); 
        salesCounter.addNewProduct(3002, "Gummy Bear", "Chewy Candy", 3.95, 14);
        salesCounter.addNewProduct(3014, "Pop", "Fizzy Deliciousness", 2.25, 8);
        salesCounter.addNewProduct(3015, "Pop Rochets", "Hard Candy", 1.50, 30);
        salesCounter.addNewProduct(3001, "Mints", "Fresh Breath", 0.99, 5);
        salesCounter.addNewProduct(3000, "Gum", "Chewy and GUI", 1.25, 40);
        salesCounter.startSale();
        salesCounter.addToSale(3000);
        salesCounter.addToSale(3002);
        salesCounter.addToSale(3014);
        salesCouter.updateReceipt();
                
}
}
