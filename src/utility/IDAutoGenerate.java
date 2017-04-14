/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import java.text.NumberFormat;
import java.util.Iterator;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Nipuni
 */
public class IDAutoGenerate {
    
    static SessionFactory sessionFactory=SetSessionFactory.getSessionFactory();
    static Session session;
    
    private static String currentItemCode;
    
    private static void formatItemCode(String current,NumberFormat nf,JLabel txt){
        
            int index = current.length();
            for (int i = current.length() - 1; i >= 0; i--) {
                String part = current.substring(i, current.length());
                try {
                    Integer.parseInt(part);
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String s = current.substring(index);
            int i = Integer.parseInt(s);
            i++;
            txt.setText(current.substring(0, index) + nf.format(i+1));
            
    }
    
    private static void formatItemCode_1(String current,NumberFormat nf,JTextField txt){
        
            int index = current.length();
            for (int i = current.length() - 1; i >= 0; i--) {
                String part = current.substring(i, current.length());
                try {
                    Integer.parseInt(part);
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String s = current.substring(index);
            int i = Integer.parseInt(s);
            i++;
            txt.setText(current.substring(0, index) + nf.format(i+1));
            
    }
    
    public static void getNextItemCode(JLabel  txtID, String prefix, String table) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(3);
           currentItemCode= prefix + "0000";
        
        if("Electrical Goods".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeElectricGoods");
                List<String> elecricItemList=query.list();
                Iterator itr=elecricItemList.iterator();

                currentItemCode=elecricItemList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);
        }else if("Furniture".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeFurniture");
                List<String> furnitureList=query.list();
                Iterator itr=furnitureList.iterator();

                currentItemCode=furnitureList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);  
                
        }else if("Book".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeBook");
                List<String> bookList=query.list();
                Iterator itr=bookList.iterator();

                currentItemCode=bookList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);     
                
        }else if("Other Item".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeOtherItem");
                List<String> otheritemList=query.list();
                Iterator itr=otheritemList.iterator();

                currentItemCode=otheritemList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);     
                               
        }else if("Tool".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeTool");
                List<String> toolList=query.list();
                Iterator itr=toolList.iterator();

                currentItemCode=toolList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);     
                               
        }else if("Medicine".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeMedicine");
                List<String> medicineList=query.list();
                Iterator itr=medicineList.iterator();

                currentItemCode=medicineList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);     
                               
        }else if("Garment And Accessory".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeGarmentAndAccessory");
                List<String> otheritemList=query.list();
                Iterator itr=otheritemList.iterator();

                currentItemCode=otheritemList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);     
                               
        }else if("Repair".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeRepair");
                List<String> otheritemList=query.list();
                Iterator itr=otheritemList.iterator();

                currentItemCode=otheritemList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);     
                               
        }else if("Technician".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeTechnician");
                List<String> otheritemList=query.list();
                Iterator itr=otheritemList.iterator();

                currentItemCode=otheritemList.get(1);
                
                formatItemCode(currentItemCode, nf, txtID);     
                               
        }

          session.getTransaction().commit();
          session.close();
    }
    
    public static void getNextItemCode_1(JTextField  txtID, String prefix, String table) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(3);
           currentItemCode= prefix + "0000";
        
        if("Electrical Goods".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeElectricGoods");
                List<String> elecricItemList=query.list();
                Iterator itr=elecricItemList.iterator();

                currentItemCode=elecricItemList.get(1);
                
                formatItemCode_1(currentItemCode, nf, txtID);
        }else if("Furniture".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeFurniture");
                List<String> furnitureList=query.list();
                Iterator itr=furnitureList.iterator();

                currentItemCode=furnitureList.get(1);
                
                formatItemCode_1(currentItemCode, nf, txtID);  
                
        }else if("Book".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeBook");
                List<String> bookList=query.list();
                Iterator itr=bookList.iterator();

                currentItemCode=bookList.get(1);
                
                formatItemCode_1(currentItemCode, nf, txtID);     
                
        }else if("Other Item".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeOtherItem");
                List<String> otheritemList=query.list();
                Iterator itr=otheritemList.iterator();

                currentItemCode=otheritemList.get(1);
                
                formatItemCode_1(currentItemCode, nf, txtID);     
                               
        }else if("Tool".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeTool");
                List<String> toolList=query.list();
                Iterator itr=toolList.iterator();

                currentItemCode=toolList.get(1);
                
                formatItemCode_1(currentItemCode, nf, txtID);     
                               
        }else if("Medicine".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeMedicine");
                List<String> medicineList=query.list();
                Iterator itr=medicineList.iterator();

                currentItemCode=medicineList.get(1);
                
                formatItemCode_1(currentItemCode, nf, txtID);     
                               
        }else if("Garment And Accessory".equals(table)){
                Query query=session.getNamedQuery("INVENTORY_getCurrentItemCodeGarmentAndAccessory");
                List<String> otheritemList=query.list();
                Iterator itr=otheritemList.iterator();

                currentItemCode=otheritemList.get(1);
                
                formatItemCode_1(currentItemCode, nf, txtID);     
                               
        }

          session.getTransaction().commit();
          session.close();
    }
    
}
