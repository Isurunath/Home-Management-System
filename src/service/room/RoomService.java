/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package service.room;

import dao.room.RoomDAO;
import java.util.List;
import model.room.Homerooms;
import utility.Validations;

/**
 *
 * @author Isurunath
 */
public class RoomService {
    
    public static void addRoom(Homerooms e) {
        //validate new Event details
    	if(Validations.Validate(e)){
            RoomDAO.addRoom(e);
    	}
    }
    
    public static void updateRoom(Homerooms e) {
    	//validate updated Event details
    	if(Validations.Validate(e)){
            RoomDAO.updateRoom(e);
    	}
    }
    
    public static void DeleteRoom(String ID){
        RoomDAO.deleteRoom(ID);
    }
    
    public static List<Homerooms> loadRoomTable(){
        return RoomDAO.loadRoomTable();
    }
    
}
