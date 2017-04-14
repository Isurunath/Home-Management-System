/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.food;

import dao.food.FoodDAO;
import java.util.List;
import model.food.Homefood;
import utility.Validations;

/**
 *
 * @author Isurunath
 */
public class FoodService {
    
    public static void addFood(Homefood e) {
        //validate new Event details
    	if(Validations.Validate(e)){
            FoodDAO.addFood(e);
    	}
    }
    
    public static void updateFood(Homefood e) {
    	//validate updated Event details
    	if(Validations.Validate(e)){
            FoodDAO.updateFood(e);
    	}
    }
    
    public static void DeleteFood(String ID){
        FoodDAO.deleteFood(ID);
    }
    
    public static List<Homefood> loadFoodTable(String D){
        return FoodDAO.loadFoodTable(D);
    }
    
}
