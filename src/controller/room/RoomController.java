/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.room;

import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import model.room.Homerooms;
import service.room.RoomService;

/**
 *
 * @author Isurunath
 */
public class RoomController {
    
    public static void AddRoom(Homerooms e){
    	RoomService.addRoom(e);
    }
    
    public static void updateRoom(Homerooms e){
    	RoomService.updateRoom(e);
    }
    
    public static void DeleteRoom(String ID){
        RoomService.DeleteRoom(ID);
    }
    
    public static DefaultTableModel displayRoomTable(){
        List l = RoomService.loadRoomTable();
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("RoomID");
        tableHeaders.add("Room type");
        tableHeaders.add("Name"); 
        tableHeaders.add("Owner");
        tableHeaders.add("Floor");
        tableHeaders.add("Contact");
        tableHeaders.add("Location");

        for(Object o : l) {
            Homerooms items = (Homerooms)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(items.getId());
            oneRow.add(items.getType());
            oneRow.add(items.getName());
            oneRow.add(items.getOwner());
            oneRow.add(items.getFloor());
            oneRow.add(items.getContact());
            oneRow.add(items.getLocation());
            tableData.add(oneRow);
        }
        
        return (new DefaultTableModel(tableData, tableHeaders));
    }
    
    
}
