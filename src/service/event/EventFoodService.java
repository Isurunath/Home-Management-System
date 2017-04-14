/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.event;

import dao.event.EventFoodDAO;
import view.event.EventFood;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.event.Eventbeverages;
import model.event.Eventfood;
import utility.Validations;

/**
 * EventFoodService -- Event food Service layer
 * @author Isurunath
 */
public class EventFoodService {
    
    public static List<EventFood> LoadFoodcombo(){
        return EventFoodDAO.LoadFoodcombo();
    }
    
    public static List<Eventbeverages> LoadBevcombo(){
        return EventFoodDAO.LoadBevcombo();
    }
    
    public static List<Eventbeverages> LoadBevList(String catagory){
        return EventFoodDAO.loadBevList(catagory);
    }
    
    public static List<EventFood> LoadFoodList(String catagory){
        return EventFoodDAO.loadFoodList(catagory);
    }
    
    public static List<EventFood> LoadFoodTable(String catagory){
        return EventFoodDAO.LoadFoodTable(catagory);
     }
     
    public static List<Eventbeverages> LoadBevTable(String catagory){
        return EventFoodDAO.LoadBevTable(catagory);
    }
      
    public static void addFood(Eventfood e){
	//validate new food item
        if(Validations.Validate(e)){
            EventFoodDAO.addFood(e);
        }    
    }

    public static void updateFood(Eventfood i){
        //validate when updating food item
        if(Validations.Validate(i)){
            EventFoodDAO.updateFood(i);
        }    
    }
    
    public static void DeleteFood(String ID){
        EventFoodDAO.DeleteFood(ID);
    }

    public static void addBev(DefaultTableModel table,Eventbeverages e) {
        //validate new beverage item
        //check wheather beverage already exist in table
        if((Validations.Validate(e))&& (Validations.checkExist(e.getName(),table))){
            EventFoodDAO.addBev(e);
        }
    }

    public static void updateBev(Eventbeverages i){
        EventFoodDAO.updateBev(i);
    }
    
    public static void DeleteBev(String ID){
            EventFoodDAO.DeleteBev(ID);
    } 
}
