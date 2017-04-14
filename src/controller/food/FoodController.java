/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.food;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.food.Homefood;
import service.food.FoodService;

/**
 *
 * @author Isurunath
 */
public class FoodController {
    
    public static void AddFood(Homefood e){
    	FoodService.addFood(e);
    }
    
    public static void updateFood(Homefood e){
    	FoodService.updateFood(e);
    }
    
    public static void DeleteFood(String ID){
        FoodService.DeleteFood(ID);
    }
    
    public static DefaultTableModel displayFoodTable(String D){
        List l = FoodService.loadFoodTable(D);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("FoodID");
        tableHeaders.add("Catagory");
        tableHeaders.add("Description"); 
        tableHeaders.add("Quantity");
        tableHeaders.add("Measurment");
        tableHeaders.add("Price");
        tableHeaders.add("Exp.Date");
        tableHeaders.add("Address");
        tableHeaders.add("Contact");

        for(Object o : l) {
            Homefood items = (Homefood)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getFoodId());
            oneRow.add(items.getCatagory());
            oneRow.add(items.getDescription());
            oneRow.add(items.getQuantity());
            oneRow.add(items.getMeasurment());
            oneRow.add(items.getPrice());
            oneRow.add(items.getDate());
            oneRow.add(items.getAddress());
            oneRow.add(items.getContact());
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
}
