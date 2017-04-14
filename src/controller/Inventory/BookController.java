/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Inventory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.Inventory.Book;
import org.hibernate.HibernateException;
import services.Inventory.BookService;
/**
 *
 * @author Nipuni
 */
public class BookController {
 
    /**
     * Add a book in the database
     * @param book A Book Object
     * @return result whether execution of the query is success or not
     */
   public static boolean addBook(Book book) throws HibernateException{
        return BookService.addBook(book);
    }
  
    /**
     * Load Selected book details to the table in settings according to
     * given item code
     * @param itemCode Book 
     * @return  List of selected book
     */
    public static ArrayList<String> SearchItem(String itemCode) throws HibernateException{
        
          List<Book> bookList=BookService.searchBookByItemCode(itemCode);
          Iterator itr=bookList.iterator();
          
          ArrayList<String> searchlist=new ArrayList<String>();
          
          while(itr.hasNext()){
              Object[] obj = (Object[]) itr.next();
              
              searchlist.add(String.valueOf(obj[0]));
              searchlist.add(String.valueOf(obj[1]));
              searchlist.add(String.valueOf(obj[2]));
              searchlist.add(String.valueOf(obj[3]));
              searchlist.add(String.valueOf(obj[4]));
              searchlist.add(String.valueOf(obj[5]));
              searchlist.add(String.valueOf(obj[6]));
              searchlist.add(String.valueOf(obj[7]));
              searchlist.add(String.valueOf(obj[8]));
              searchlist.add(String.valueOf(obj[9]));
              searchlist.add(String.valueOf(obj[10]));
          }
          
          return searchlist;
      
    }


     /**
     * Update  book details in the database
     * @param book A Book Object
     * @return result whether execution of the query is success or not
     */
    public static boolean EditBookDetails(Book book) throws ClassNotFoundException,HibernateException{
        
        return BookService.updateBook(book);
        
    }

     /**
     * Delete a book in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteBook(String itemCode) throws HibernateException{
        
        return BookService.deleteBook(itemCode);
        
    }
  
    /**
     * Load Selected book details to the table in settings according to
     * given name
     * @param name Book 
     * @return  List of selected book
     */
  public static DefaultTableModel searchBookByName(String name)throws HibernateException{
      
      List<Book> bookList=BookService.searchBookByName(name);
      Iterator itr=bookList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Author");
      tableHeaders.add("Publisher");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Return Date");
      tableHeaders.add("Category");
      tableHeaders.add("Stream");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
            row.add(String.valueOf(obj[10]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
      
  }
 
    /**
     * Load Selected book details to the table in settings according to given seller
     * @param nameOfSeller Book 
     * @return  List of selected book
     */
    public static DefaultTableModel searchEBookByNameOfSeller(String nameOfSeller) throws HibernateException{

      List<Book> bookList=BookService.searchBookByNameOfSeller(nameOfSeller);
      Iterator itr=bookList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Author");
      tableHeaders.add("Publisher");
      tableHeaders.add("Return Date");
      tableHeaders.add("Category");
      tableHeaders.add("Stream");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
            row.add(String.valueOf(obj[10]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
        
    }
 
     /**
     * Load Selected book details to the table in settings according to
     * given name and location
     * @param name Book 
     * @param location Book 
     * @return  List of selected book
     */
  public static DefaultTableModel searchBookByNameAndLocation(String name,String location)throws ClassNotFoundException,HibernateException{
      
      List<Book> bookList=BookService.searchBookByNameAndLocation(name, location);
      Iterator itr=bookList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Author");
      tableHeaders.add("Publisher");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Return Date");
      tableHeaders.add("Category");
      tableHeaders.add("Stream");
      
    while (itr.hasNext()) {
        Object[] obj = (Object[]) itr.next();

        Vector<Object> row = new Vector<Object>();

        row.add(String.valueOf(obj[0]));
        row.add(String.valueOf(obj[1]));
        row.add(String.valueOf(obj[2]));
        row.add(String.valueOf(obj[3]));
        row.add(String.valueOf(obj[4]));
        row.add(String.valueOf(obj[5]));
        row.add(String.valueOf(obj[6]));
        row.add(String.valueOf(obj[7]));
        row.add(String.valueOf(obj[8]));
        row.add(String.valueOf(obj[9]));

      dataTable.add(row);    
    }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
      
  }
  
    /**
     * Load Selected book details to the table in settings according to given name and seller
     * @param name Book 
     * @param nameOfTheSeller Book 
     * @return  List of selected book
     */
    public static DefaultTableModel searchBookByNameAndNameOfTheSeller(String name,String nameOfTheSeller) throws HibernateException{
         
      List<Book> bookList=BookService.searchBookByNameAndNameOfTheSeller(name, nameOfTheSeller);
      Iterator itr=bookList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Author");
      tableHeaders.add("Publisher");
      tableHeaders.add("Return Date");
      tableHeaders.add("Category");
      tableHeaders.add("Stream");
      
    while (itr.hasNext()) {
        Object[] obj = (Object[]) itr.next();

        Vector<Object> row = new Vector<Object>();

        row.add(String.valueOf(obj[0]));
        row.add(String.valueOf(obj[1]));
        row.add(String.valueOf(obj[2]));
        row.add(String.valueOf(obj[3]));
        row.add(String.valueOf(obj[4]));
        row.add(String.valueOf(obj[5]));
        row.add(String.valueOf(obj[6]));
        row.add(String.valueOf(obj[7]));
        row.add(String.valueOf(obj[8]));
        row.add(String.valueOf(obj[9]));

      dataTable.add(row);    
    }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
    }
    
    /**
     * Load Selected book details to the table in settings according to given category
     * @param category Book 
     * @return  List of selected book
     */
    public static DefaultTableModel searchBookByCategory(String category) throws HibernateException{
        
      List<Book> bookList=BookService.searchBookByCategory(category);
      Iterator itr=bookList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Author");
      tableHeaders.add("Publisher");
      tableHeaders.add("Return Date");
      tableHeaders.add("Category");
      tableHeaders.add("Stream");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
            row.add(String.valueOf(obj[10]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
    }
 
    /**
     * Load Book details to the table in settings according to requirement
     * @return  book list
     */
    public static DefaultTableModel getAllBookList_1()throws ClassNotFoundException,HibernateException{
      
      List<Book> bookList=BookService.getBookDetails_1(); 
      Iterator itr=bookList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();

      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Author");
      tableHeaders.add("Publisher");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Return Date");
      tableHeaders.add("Category");
      tableHeaders.add("Stream");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
            row.add(String.valueOf(obj[10]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
     
  }
 
    /**
     * Load Book details to the table in settings according to requirement
     * @return  book list
     */
  public static DefaultTableModel getAllBookList_2()throws ClassNotFoundException,HibernateException{
      
      List<Book> bookList=BookService.getBookDetails_2();
      Iterator itr=bookList.iterator();
      
      Vector<String> tableHeaders=new Vector<String>();
      Vector dataTable=new Vector();
      
      tableHeaders.add("Item Code");
      tableHeaders.add("Name");
      tableHeaders.add("Location");
      tableHeaders.add("Qty");
      tableHeaders.add("Price");
      tableHeaders.add("User");
      tableHeaders.add("Author");
      tableHeaders.add("Publisher");
      tableHeaders.add("Name Of The Seller");
      tableHeaders.add("Return Date");
      tableHeaders.add("Category");
      tableHeaders.add("Stream");
      
      while (itr.hasNext()) {
            Object[] obj = (Object[]) itr.next();
            
            Vector<Object> row = new Vector<Object>();
          
            row.add(String.valueOf(obj[0]));
            row.add(String.valueOf(obj[1]));
            row.add(String.valueOf(obj[2]));
            row.add(String.valueOf(obj[3]));
            row.add(String.valueOf(obj[4]));
            row.add(String.valueOf(obj[5]));
            row.add(String.valueOf(obj[6]));
            row.add(String.valueOf(obj[7]));
            row.add(String.valueOf(obj[8]));
            row.add(String.valueOf(obj[9]));
            row.add(String.valueOf(obj[10]));
            row.add(String.valueOf(obj[11]));
          
          dataTable.add(row);    
      }
      
      return (new DefaultTableModel(dataTable, tableHeaders));
     
  }
  
/**
* Load all Book names in the database 
* @return  book name list
*/
    public static List<Book> getBookName(){
        return BookService.getBookName();
    }
   
/**
* Load all Location in the database
* @return  location list
*/
    public static List<Book> getBookLocation(){
        return BookService.getBookLocation();
    }
    
/**
* Load all sellers in the database
* @return  sellers list
*/
public static List<Book>  getBookSellers() throws HibernateException{
    return BookService.getBookSellers();
}
    
/**
* Load all categories in the database
* @return  category list
*/
public static List<Book>  getBookCategory() throws HibernateException{
    return BookService.getBookCategory();
}
    
}
