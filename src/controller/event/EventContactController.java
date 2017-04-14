/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package controller.event;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import service.event.EventContactService;
import model.event.Eventcontact;

/**
 * EventContactController -- Event contact Controller class
 * @author Isurunath
 */
public class EventContactController {
	
    public static List<Eventcontact> LoadcomboList(){
        return EventContactService.LoadcomboList();
    }

    public static DefaultTableModel LoadItemTable(String catagory) {
        List l = EventContactService.LoadItemTable(catagory);
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("ID");
        tableHeaders.add("Name");
        tableHeaders.add("Address"); 

        for(Object o : l) {
            model.event.Eventcontact items = (model.event.Eventcontact)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getId());
            oneRow.add(items.getName());
            oneRow.add(items.getAddress());
            tableData.add(oneRow);
        }
        return (new DefaultTableModel(tableData, tableHeaders));  
    }

    public static Boolean check(String id, DefaultTableModel table){
        return EventContactService.check(id,table);
    }
}
