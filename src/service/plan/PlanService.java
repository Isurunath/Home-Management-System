/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.plan;

import model.plan.Homeplan;
import dao.plan.PlanDAO;
import java.util.List;
import utility.Validations;

/**
 * EventService -- Home Plan Service layer
 * @author Isurunath
 */
public class PlanService {
    
    public static void addPlan(Homeplan e) {
        //validate new Event details
    	if(Validations.Validate(e)){
            PlanDAO.addPlan(e);
    	}
    }
    
    public static void updatePlan(Homeplan e) {
    	//validate updated Event details
    	if(Validations.Validate(e)){
            PlanDAO.updatePlan(e);
    	}
    }
    
    public static List<Homeplan> loadPlan(){
        
        return PlanDAO.loadPlan();
        
    }    
}
