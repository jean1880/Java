import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Books
{
    // instance variables - replace the example below with your own
    private ArrayList<Book> bookList;
    
    public Books()
    {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("title", "author", "genre", "isbn", 15, 15));
        bookList.add(new Book("title2", "author2", "genre2", "isbn2", 152, 152));
        bookList.add(new Book("title3", "author3", "genre3", "isbn3", 153, 153));
    }
    
    public void addBook(String title, String author, String genre, String isbn, int pageNum, double cost)
    {
        bookList.add(new Book(title, author, genre, isbn, pageNum, cost));        
    }
    
    public void showBookCount()
    {
        System.out.println("Number of books: "+bookList.size());
    }
    
    public void findBookByTitle(String title)
    {
        Iterator<Book> it=bookList.iterator();
        Book tempBook;
        boolean found = false;
        while(!found && it.hasNext())
        {
            tempBook = it.next();
            if(tempBook.getTitle() == title)
            {
                System.out.println(title + " was found");
                found = true;
            }
        }
        tempBook = null;
        if(!found)
        {
            System.out.println(title + " was not found");
        }
    }
    
    public void removeBook(String title)
    {
        Iterator<Book> it=bookList.iterator();
        Book tempBook;
        boolean found = false;
        while(!found && it.hasNext())
        {
            tempBook = it.next();
            if(tempBook.getTitle() == title)
            {
                it.remove();
                System.out.println(title + " was removed");
                found = true;
            }
        }
        if(!found)
        {
            System.out.println(title + " was not found");
        }
    }
}
