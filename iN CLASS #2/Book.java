
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book
{
    private String title, author, genre, isbn;
    private int pageNum;
    private double cost;
    
    public Book()
    {
        
    }
    
    public Book(String title, String author, String genre, String isbn, int pageNum, double cost)
    {
        this.title      =   title;
        this.author     =   author;
        this.genre      =   genre;
        this.isbn       =   isbn;
        this.pageNum    =   pageNum;
        this.cost       =   cost;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public String getISBN()
    {
        return isbn;
    }
    
    public int getPageNum()
    {
        return pageNum;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setTitle(String title)
    {
        this.title      =   title;
    }
    
    public void setAuthor(String author)
    {
        this.author     =   author;
    }
    
    public void setGenre(String genre)
    {
        this.genre      =   genre;
    }
    
    public void setisbn(String isbn)
    {
        this.isbn       =   isbn;
    }
    
    public void setPageNum(int pageNum)
    {
        this.pageNum    =   pageNum;
    }
    
    public void setCost(double cost)
    {
        this.cost       =   cost;
    }
    
    public String bookInfo()
    {
        return("Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre + "\nISBN: " + isbn + "\nNumber of Pages: " + pageNum + "\nCost: " + cost);
    }
}
