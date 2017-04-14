/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.plan;

import java.util.List;
import model.plan.Homeplan;
import service.plan.PlanService;

/**
 * PlanController -- Home plan Details Controller class
 * @author Isurunath
 */
public class PlanController {
    
    public static void AddPlan(Homeplan e){
    	PlanService.addPlan(e);
    }
    
    public static void updateEvent(Homeplan e){
    	PlanService.updatePlan(e);
    }
    
    public static List<Homeplan> loadPlan(){
        
        return PlanService.loadPlan();
        
    } 
}
