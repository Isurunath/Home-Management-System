/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.event;

import java.util.List;
import dao.event.EventContactDAO;
import javax.swing.table.DefaultTableModel;
import model.event.Eventcontact;
import utility.Validations;

/**
 * EventContactService -- Event contact Service layer
 * @author Isurunath
 */
public class EventContactService {
	
    public static List<Eventcontact> LoadcomboList() {
            return EventContactDAO.LoadcomboList();
    }

    public static List<Eventcontact> LoadItemTable(String catagory) {
        return EventContactDAO.LoadItemTable(catagory);
    }

    /**
     * check weather contact already added to list
     * @param id Contact ID
     * @param table Contact Table
     * @return 
     */
    public static Boolean check(String id, DefaultTableModel table){
        return Validations.checkExist(id,table);
    }
}
