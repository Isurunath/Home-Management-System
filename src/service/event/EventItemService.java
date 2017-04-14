/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.event;

import java.util.List;
import dao.event.EventItemsDAO;
import javax.swing.table.DefaultTableModel;
import model.event.EventItems;
import utility.Validations;

/**
 * EventItemService -- Event Item Service layer
 * @author Isurunath
 */
public class EventItemService {
	
    public static List<EventItems> LoadcomboList(){
        return EventItemsDAO.LoadcomboList();
    }

    public static List<EventItems> LoadItemTable(String catagory){
        return EventItemsDAO.LoadItemTable(catagory);
    }

    public static List<EventItems> loadItemList(String catagory){
        return EventItemsDAO.loadItemList(catagory);	
    }

    public static void addItem(DefaultTableModel table,EventItems e) {
        //validate new Event items
        //check wheather item already exist in table
        if((Validations.Validate(e))&& (Validations.checkExist(e.getItemName(),table))){
            EventItemsDAO.addItem(e);
        } 
    }

    public static void updateItem(EventItems i){
        EventItemsDAO.updateItem(i);
    }

    public static void DeleteItems(String ID){
        EventItemsDAO.DeleteItems(ID);
    }
}
