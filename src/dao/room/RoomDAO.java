/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package dao.room;

import java.util.List;
import javax.swing.JOptionPane;
import model.room.Homerooms;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import utility.SetSessionFactory;

public class RoomDAO {
    static SessionFactory sessionFactory = SetSessionFactory.getSessionFactory();
    static Session session;
    
    public static void addRoom(Homerooms rooms) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.save(rooms);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Room Added succesfully !");
    }
    
    /**
     * Update specific event details in database
     * and display success message
     * @param e
     * @param event A EventPlan Object
     */
    public static void updateRoom(Homerooms rooms) {
	session = sessionFactory.openSession();
    	session.beginTransaction();
     	session.update(rooms);
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Room Updated succesfully !");
    }
    
    public static void deleteRoom(String ID){
        Query query;
        
        session = sessionFactory.openSession();
        session.beginTransaction();
        query= session.getNamedQuery("ROOM_delete").setString("ID",ID);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        JOptionPane.showMessageDialog(null, "Room Deleted succesfully !");
    }
    
    /**
     * Load Event Table in search Tab
     * @param type Event catagory according 
     * to date
     * @return Event List
     */
    public static List<Homerooms> loadRoomTable(){
        session = sessionFactory.openSession();
        session.beginTransaction();
        Query query;
        query = session.getNamedQuery("Room_LoadSearchTable_ALL");
        
        List<Homerooms> resultList = query.list();
        session.getTransaction().commit();
        session.close();
        return resultList;
    }
   
    
}
