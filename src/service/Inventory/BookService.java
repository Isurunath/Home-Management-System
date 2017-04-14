/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services.Inventory;

import dao.Inventory.BookDAO;
import java.util.List;
import model.Inventory.Book;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class BookService {
   
    /**
     * Add a book in the database
     * @param book A Book Object
     * @return result whether execution of the query is success or not
     */
    public static boolean addBook(Book book) throws HibernateException{
        boolean result=false;
        
        if(Validations.Validate(book)){
           BookDAO.addBook(book);
                    result=true;
        }else{
            result=false;
        }
        
        return result;

    }

     /**
     * Update  book details in the database
     * @param book A Book Object
     * @return result whether execution of the query is success or not
     */
    public static boolean updateBook(Book book) throws HibernateException{
        
        boolean result=false;
        
       if(Validations.Validate(book)){
           BookDAO.updateBook(book);
            result=true;
        }else{
            result=false;
        }
        
        return result;
     }

     /**
     * Delete a book in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
    public static int deleteBook(String itemCode) throws HibernateException{

             return BookDAO.deleteBook(itemCode);
     }
    
    /**
     * Load Selected book details to the table in settings according to
     * given item code
     * @param itemCode Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByItemCode(String itemCode) throws HibernateException{

            return BookDAO.searchBookByItemCode(itemCode);

    }

    /**
     * Load Selected book details to the table in settings according to
     * given name
     * @param name Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByName(String name) throws HibernateException{

            return BookDAO.searchEBookByName(name);
    }
    
    /**
     * Load Selected book details to the table in settings according to given seller
     * @param nameOfSeller Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        return BookDAO.searchBookByNameOfSeller(nameOfSeller);
        
    }

     /**
     * Load Selected book details to the table in settings according to
     * given name and location
     * @param name Book 
     * @param location Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByNameAndLocation(String name,String location) throws HibernateException{

            return BookDAO.searchBookByNameAndLocation(name, location);

    }

    /**
     * Load Selected book details to the table in settings according to given name and seller
     * @param name Book 
     * @param nameOfTheSeller Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByNameAndNameOfTheSeller(String name,String nameOfTheSeller) throws HibernateException{
        
        return BookDAO.searchBookByNameAndNameOfTheSeller(name, nameOfTheSeller);    
    }
    
    /**
     * Load Selected book details to the table in settings according to given category
     * @param category Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByCategory(String category) throws HibernateException{
        
        return BookDAO.searchBookByCategory(category);
    }
    
    /**
     * Load Book details to the table in settings according to requirement
     * @return  book list
     */
    public static List<Book>  getBookDetails_1() throws HibernateException{

            return BookDAO.getBookDetails_1();

        }

    /**
     * Load Book details to the table in settings according to requirement
     * @return  book list
     */
    public static List<Book>  getBookDetails_2() throws HibernateException{

            return BookDAO.getBookDetails_2();
    }
 
/**
* Load all Book names in the database 
* @return  book name list
*/
  public static List<Book>  getBookName() throws HibernateException{

            return BookDAO.getBookName();
    }
  
/**
* Load all Location in the database
* @return  location list
*/
  public static List<Book>  getBookLocation() throws HibernateException{

            return BookDAO.getBookLocation();
  }
  
/**
* Load all sellers in the database
* @return  sellers list
*/
public static List<Book>  getBookSellers() throws HibernateException{
    return BookDAO.getBookSellers();
}
 
/**
* Load all categories in the database
* @return  category list
*/
public static List<Book>  getBookCategory() throws HibernateException{
    return BookDAO.getBookCategory();
}

}
