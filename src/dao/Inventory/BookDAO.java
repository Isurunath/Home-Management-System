/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Inventory;

import java.util.List;
import model.Inventory.Book;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

/**
 *
 * @author Nipuni
 */
public class BookDAO {
    
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    /**
     * Add a book in the database
     * @param book A Book Object
     */
     public static void addBook(Book book) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Insert detail of the book to the database
          session.save(book);
          
          session.getTransaction().commit();
          session.close();
        
    }

     /**
     * Update  book details in the database
     * @param book A Book Object
     */
          public static void updateBook(Book book) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
           
            //Update detail of the book to the database
            session.update(book);
            
          session.getTransaction().commit();
          session.close();
        
    }
          
      /**
     * Delete a book in the database
     * @param itemCode
     * @return result whether execution of the query is success or not
     */
     public static int deleteBook(String itemCode) throws HibernateException{
            session=sessionFactory.openSession();
            session.beginTransaction();
            
            Query query=session.getNamedQuery("INVENTORY_deleteBook").setString("itemCode", itemCode);
            
            //Execute the query which delete the detail of the book from the database
            int res=query.executeUpdate();
            
            //check whether transaction is correctly done
          session.getTransaction().commit();
          session.close();
                
                return res;
        
    }
     
    /**
     * Load Selected book details to the table in settings according to
     * given item code
     * @param itemCode Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByItemCode(String itemCode) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchBookByItemCode").setString("itemCode", itemCode);

       List<Book> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected book details to the table in settings according to
     * given name
     * @param name Book 
     * @return  List of selected book
     */
    public static List<Book> searchEBookByName(String name) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchBookByName").setString("name", name);

       List<Book> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected book details to the table in settings according to given seller
     * @param nameOfSeller Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByNameOfSeller(String nameOfSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchBookByNameOfTheSeller").setString("nameOfTheSeller", nameOfSeller);

       List<Book> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }

     /**
     * Load Selected book details to the table in settings according to
     * given name and location
     * @param name Book 
     * @param location Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByNameAndLocation(String name,String location) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchBookByNameAndLocation").setString("name", name).setString("location", location);

       List<Book> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected book details to the table in settings according to given name and seller
     * @param name Book 
     * @param nameOfTheSeller Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByNameAndNameOfTheSeller(String name,String nameOfTheSeller) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchBookByNameAndNameOfTheSeller").setString("name", name).setString("nameOfTheSeller", nameOfTheSeller);

       List<Book> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Selected book details to the table in settings according to given category
     * @param category Book 
     * @return  List of selected book
     */
    public static List<Book> searchBookByCategory(String category) throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();

        Query query = session.getNamedQuery("INVENTORY_searchBookByCategory").setString("category", category);

       List<Book> resultList = query.list();
       
          session.getTransaction().commit();
          session.close();
        
        return resultList;
        
    }
    
    /**
     * Load Book details to the table in settings according to requirement
     * @return  book list
     */
        public static List<Book>  getBookDetails_1() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllBookList_1");
        List<Book> bookList=query.list();
        
          session.getTransaction().commit();
          session.close();
        
        return bookList;
        
    }

/**
* Load Book details to the table in settings according to requirement
* @return  book list
*/
public static List<Book>  getBookDetails_2() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getAllBookList_2");
        List<Book> bookList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookList;
}

/**
* Load all Book names in the database 
* @return  book name list
*/
public static List<Book>  getBookName() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getBookName");
        List<Book> bookNameList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookNameList;
          }

/**
* Load all Location in the database
* @return  location list
*/
public static List<Book>  getBookLocation() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getBookLocation");
        List<Book> bookLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookLocationList;
}

/**
* Load all sellers in the database
* @return  seller list
*/
public static List<Book>  getBookSellers() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getBookSellers");
        List<Book> bookLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookLocationList;
}

/**
* Load all categories in the database
* @return  category list
*/
public static List<Book>  getBookCategory() throws HibernateException{
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        
        Query query=session.getNamedQuery("INVENTORY_getBookCategory");
        List<Book> bookLocationList=query.list();
        
          session.getTransaction().commit();
          session.close();
          
          return bookLocationList;
}

}
