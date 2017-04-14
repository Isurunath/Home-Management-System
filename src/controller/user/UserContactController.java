/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controllers.user;

import model.user.Usercontact;
import service.user.ContactService;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * UserContactController -- User contact controller class
 * @author Nimanthika
 * 
 */
public class UserContactController {
     
    /**
     * Add new contact in UserContact interface
     * @param contact
     * @return 
     */
     public static String addContact(Usercontact contact){    

        String status;
         
        status = ContactService.addContact(contact);  
        
        return status;
    }

     /**
     * Update contact in UserContact interface
     * @param contact
     * @return 
     */
    public static String updateContact(Usercontact contact){
        
        String status;
        
        status = ContactService.updateContact(contact);
        
        return status;
    }
    
    /**
     * Delete contact in UserContact interface
     * @param ID
     * 
     */
    public static void deleteContact(String ID){
        
        ContactService.deleteContact(ID);
    }
        
    /**
     * Display Contact Table in UserContact interface
     * @return Contact Table
     */
     public static DefaultTableModel displayContactTable(){
        
        List l = ContactService.LoadContactTable();
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("ContactID");
        tableHeaders.add("Group");    
        tableHeaders.add("Name");           
        tableHeaders.add("Company");
        tableHeaders.add("DOB");
        tableHeaders.add("Telephone1");
        tableHeaders.add("Telephone2");
        tableHeaders.add("Mobile1");
        tableHeaders.add("Mobile2");
        tableHeaders.add("Email1");
        tableHeaders.add("Email2");
        tableHeaders.add("Address");

        for(Object o : l){
            
            model.user.Usercontact contact = (model.user.Usercontact)o;
                
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(contact.getContactId());
            oneRow.add(contact.getGroupName());
            oneRow.add(contact.getName());
            oneRow.add(contact.getCompanyName());
            oneRow.add(contact.getDob());      
            oneRow.add(contact.getTelephone1());
            oneRow.add(contact.getTelephone2());    
            oneRow.add(contact.getMobile1());
            oneRow.add(contact.getMobile2());
            oneRow.add(contact.getEmail1());
            oneRow.add(contact.getEmail2());
            oneRow.add(contact.getAddress());
                    
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));            
    }
      
     /**
     * Display Contact Table in UserContact interface
     * when user search for a specific name
     * @param name Contact name
     * @return Contact Table
     */
     public static DefaultTableModel displaySearchedContactTable(String name){
        
        List l = ContactService.LoadSearchedContactTable(name);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("ContactID");
        tableHeaders.add("Group");
        tableHeaders.add("Name");     
        tableHeaders.add("Company");
        tableHeaders.add("DOB");
        tableHeaders.add("Telephone1");
        tableHeaders.add("Telephone2");
        tableHeaders.add("Mobile1");
        tableHeaders.add("Mobile2");
        tableHeaders.add("Email1");
        tableHeaders.add("Email2");
        tableHeaders.add("Address");

        for(Object o : l){
            
            model.user.Usercontact contact = (model.user.Usercontact)o;
                
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(contact.getContactId());
            oneRow.add(contact.getGroupName());
            oneRow.add(contact.getName());
            oneRow.add(contact.getCompanyName());
            oneRow.add(contact.getDob());
            oneRow.add(contact.getTelephone1());
            oneRow.add(contact.getTelephone2());        
            oneRow.add(contact.getMobile1());
            oneRow.add(contact.getMobile2());
            oneRow.add(contact.getEmail1());
            oneRow.add(contact.getEmail2());
            oneRow.add(contact.getAddress());
                    
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));            
    }
     
     /**
     * Display SearchContact Table in SearchContacts interface
     * when user search for a specific name
     * @param name Contact name
     * @return Contact Table
     */
     public static DefaultTableModel displaySearchedContactTableWithoutGroup(String name){
        
        List l = ContactService.SearchContactTable(name);
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();

        tableHeaders.add("Name");
        tableHeaders.add("Mobile1");
        tableHeaders.add("Telephone1");
        tableHeaders.add("ContactID");
        tableHeaders.add("Group");            
        tableHeaders.add("Company");
        tableHeaders.add("DOB");
        tableHeaders.add("Telephone2");
        tableHeaders.add("Mobile2");
        tableHeaders.add("Email1");
        tableHeaders.add("Email2");
        tableHeaders.add("Address");

        for(Object o : l){

            model.user.Usercontact contact = (model.user.Usercontact)o;

            Vector<Object> oneRow = new Vector<Object>();

            oneRow.add(contact.getName());
            oneRow.add(contact.getMobile1());
            oneRow.add(contact.getTelephone1());
            oneRow.add(contact.getContactId());
            oneRow.add(contact.getGroupName());
            oneRow.add(contact.getCompanyName());
            oneRow.add(contact.getDob());      
            oneRow.add(contact.getTelephone2());                  
            oneRow.add(contact.getMobile2());
            oneRow.add(contact.getEmail1());
            oneRow.add(contact.getEmail2());
            oneRow.add(contact.getAddress());

            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));            
    }
     
     /**
     * Display SearchContact Table in SearchContacts interface
     * when user search for a specific name in a specific group
     * @param name Contact name
     * @param group Contact group
     * @return Contact Table
     */
     public static DefaultTableModel displaySearchedContactTableWithGroup(String name, String group){
        
         List l = ContactService.SearchInGroup(name, group);

         Vector<String> tableHeaders = new Vector<String>();
         Vector tableData = new Vector();
     
         tableHeaders.add("Name");
         tableHeaders.add("Mobile1");
         tableHeaders.add("Telephone1");
         tableHeaders.add("ContactID");
         tableHeaders.add("Group");            
         tableHeaders.add("Company");
         tableHeaders.add("DOB");
         tableHeaders.add("Telephone2");
         tableHeaders.add("Mobile2");
         tableHeaders.add("Email1");
         tableHeaders.add("Email2");
         tableHeaders.add("Address");
 
         for(Object o : l){

             model.user.Usercontact contact = (model.user.Usercontact)o;

             Vector<Object> oneRow = new Vector<Object>();

             oneRow.add(contact.getName());
             oneRow.add(contact.getMobile1());
             oneRow.add(contact.getTelephone1());
             oneRow.add(contact.getContactId());
             oneRow.add(contact.getGroupName());
             oneRow.add(contact.getCompanyName());
             oneRow.add(contact.getDob());      
             oneRow.add(contact.getTelephone2());                  
             oneRow.add(contact.getMobile2());
             oneRow.add(contact.getEmail1());
             oneRow.add(contact.getEmail2());
             oneRow.add(contact.getAddress());

             tableData.add(oneRow);
        }

        return (new DefaultTableModel(tableData, tableHeaders));            
    }
     
     /**
     * Display SearchContact Table in SearchContacts interface
     * when user selects a specific group in group ComboBox
     * @param group Contact group
     * @return Contact Table
     */
     public static DefaultTableModel displaySearchedContactTableByGroup(String group){        

         List l = ContactService.SearchContactTableByGroup(group);
        
         Vector<String> tableHeaders = new Vector<String>();
         Vector tableData = new Vector();

         tableHeaders.add("Name");
         tableHeaders.add("Mobile1");
         tableHeaders.add("Telephone1");
         tableHeaders.add("ContactID");
         tableHeaders.add("Group");            
         tableHeaders.add("Company");
         tableHeaders.add("DOB");
         tableHeaders.add("Telephone2");
         tableHeaders.add("Mobile2");
         tableHeaders.add("Email1");
         tableHeaders.add("Email2");
         tableHeaders.add("Address");

         for(Object o : l){

             model.user.Usercontact contact = (model.user.Usercontact)o;

             Vector<Object> oneRow = new Vector<Object>();

             oneRow.add(contact.getName());
             oneRow.add(contact.getMobile1());
             oneRow.add(contact.getTelephone1());
             oneRow.add(contact.getContactId());
             oneRow.add(contact.getGroupName());
             oneRow.add(contact.getCompanyName());
             oneRow.add(contact.getDob());      
             oneRow.add(contact.getTelephone2());                  
             oneRow.add(contact.getMobile2());
             oneRow.add(contact.getEmail1());
             oneRow.add(contact.getEmail2());
             oneRow.add(contact.getAddress());

             tableData.add(oneRow);
         }

         return (new DefaultTableModel(tableData, tableHeaders));            
    }  
     
}
