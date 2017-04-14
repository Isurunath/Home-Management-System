/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.event;

import dao.event.EventDAO;
import java.util.List;
import model.event.EventPlan;
import service.event.EventService;

/**
 *
 * @author Isurunath
 */
public class MainWindowController {
    
    public static List<EventPlan> loadEventNotification(){
        
        return EventService.loadEventNotification();
        
        
    }
    
}
