/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package view.event;

import controller.event.EventFoodController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.event.Eventbeverages;
import model.event.Eventfood;

/**
 * EditEventFood -- Interface for Edit Event Food and beverage 
 * @author Isurunath
 */
public class EditEventFood extends javax.swing.JFrame {
    
    public EditEventFood() {
        initComponents();
        
        //load food and beverage combo box
        loadcombo();
        
        //load food table in settings
        LoadFoodTable();
        
        //load beverage table in settings
        LoadBevTable();
    }
    
    /**
     * load the food and beverage combo box
     */
    public static void loadcombo(){
    	List l = EventFoodController.LoadFoodcombo();
        List s = EventFoodController.LoadBevcombo();
        
        foodCombo.removeAllItems();
        foodCombo.addItem("All catagories");
        for(Object o : l) {
            foodCombo.addItem(o);
        }
        
        BevCombo2.removeAllItems();
        BevCombo2.addItem("All catagories");
        for(Object o : s) {
            BevCombo2.addItem(o);
        }
    }
    
    /**
     * load food table in settings
     */
    public static void LoadFoodTable(){
        String select = foodCombo.getSelectedItem().toString();
        foodtable.setModel(EventFoodController.LoadFoodTable(select));
        
        jLabel9.setText(select); //get the selected catagory to label
        
        //hide food id in table
        foodtable.getColumnModel().getColumn(0).setWidth(0);
        foodtable.getColumnModel().getColumn(0).setMinWidth(0);
        foodtable.getColumnModel().getColumn(0).setMaxWidth(0);
        
        //hide menu name in table
        foodtable.getColumnModel().getColumn(1).setWidth(0);
        foodtable.getColumnModel().getColumn(1).setMinWidth(0);
        foodtable.getColumnModel().getColumn(1).setMaxWidth(0);
    }
    
    /**
     * load Beverage table in settings
     */
    public static void LoadBevTable(){
        String select = BevCombo2.getSelectedItem().toString();
        bevtable.setModel(EventFoodController.LoadBevTable(select));
        
        //hide ID column in table
        bevtable.getColumnModel().getColumn(5).setWidth(0);
        bevtable.getColumnModel().getColumn(5).setMinWidth(0);
        bevtable.getColumnModel().getColumn(5).setMaxWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Foodname = new javax.swing.JTextField();
        FoodPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        newMenu = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        foodtable = new javax.swing.JTable();
        foodCombo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bevname = new javax.swing.JTextField();
        bevcat = new javax.swing.JTextField();
        bevprice = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        icontact = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        iaddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        BevCombo2 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bevtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\backWhite.png")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 40, 20));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(92, 126, 150));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Foodname.setForeground(new java.awt.Color(1, 1, 1));
        Foodname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Foodname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        Foodname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodnameActionPerformed(evt);
            }
        });
        jPanel4.add(Foodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 160, 30));

        FoodPrice.setForeground(new java.awt.Color(1, 1, 1));
        FoodPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FoodPrice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        jPanel4.add(FoodPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 160, 30));

        jLabel3.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Price");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Item Name");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel2.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Menu Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\addBlue.png")); // NOI18N
        jButton4.setText("ADD");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 150, 35));

        jPanel3.setBackground(new java.awt.Color(190, 212, 228));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("New Menu");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        newMenu.setForeground(new java.awt.Color(1, 1, 1));
        newMenu.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        newMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        jPanel3.add(newMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 160, 30));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 160, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 310, 100));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\updateYelllow.png")); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 140, 35));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 150, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\deleteRed.png")); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 130, 35));

        foodtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        foodtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Menu Items"
            }
        ));
        foodtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                foodtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(foodtable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 390, 280));

        foodCombo.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        foodCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All catagories" }));
        foodCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                foodComboMouseReleased(evt);
            }
        });
        foodCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodComboActionPerformed(evt);
            }
        });
        jPanel5.add(foodCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 390, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Select Menu");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 450, 450));

        jTabbedPane1.addTab("FOOD", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bevname.setForeground(new java.awt.Color(1, 1, 1));
        bevname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bevname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        bevname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bevnameActionPerformed(evt);
            }
        });
        jPanel2.add(bevname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 140, 30));

        bevcat.setForeground(new java.awt.Color(1, 1, 1));
        bevcat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bevcat.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        jPanel2.add(bevcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 140, 30));

        bevprice.setForeground(new java.awt.Color(1, 1, 1));
        bevprice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bevprice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        jPanel2.add(bevprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 140, 30));

        jPanel6.setBackground(new java.awt.Color(92, 126, 150));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\addBlue.png")); // NOI18N
        jButton5.setText("ADD");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 150, 35));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 204, 0));
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\updateYelllow.png")); // NOI18N
        jButton6.setText("UPDATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 150, 35));

        jPanel8.setBackground(new java.awt.Color(190, 212, 228));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier Details"));
        jPanel8.setForeground(new java.awt.Color(130, 147, 203));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(70, 105, 151));
        jLabel10.setText("Address");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(70, 105, 151));
        jLabel11.setText("Contact");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        icontact.setForeground(new java.awt.Color(1, 1, 1));
        icontact.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        icontact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        icontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icontactActionPerformed(evt);
            }
        });
        jPanel8.add(icontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 160, 30));

        iaddress.setColumns(20);
        iaddress.setForeground(new java.awt.Color(1, 1, 1));
        iaddress.setRows(5);
        iaddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(70, 105, 151), 2, true));
        jScrollPane3.setViewportView(iaddress);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 160, 100));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 310, 220));

        jLabel7.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Price(Rs.)");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Beverage Catagory");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText(" Name");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 450));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Droid Sans", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 1, 1));
        jLabel8.setText("Beverage Catagory");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        BevCombo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BevCombo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All catagories" }));
        BevCombo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BevCombo2MouseReleased(evt);
            }
        });
        jPanel7.add(BevCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 160, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\deleteRed.png")); // NOI18N
        jButton7.setText("DELETE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 130, 35));

        bevtable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bevtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        bevtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bevtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bevtable);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 460, 300));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 490, 450));

        jTabbedPane1.addTab("BEVERAGES", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 860, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bevnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bevnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bevnameActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        //back to event food interface
        EventFood ef = new EventFood();
        ef.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void foodComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodComboActionPerformed

    private void foodComboMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodComboMouseReleased
        LoadFoodTable();
    }//GEN-LAST:event_foodComboMouseReleased

    private void BevCombo2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BevCombo2MouseReleased
        LoadBevTable();
    }//GEN-LAST:event_BevCombo2MouseReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String Menuname;       //Item name
        String FoodName;       //Item catagory
        String price;          //Item price
        
        Menuname = jLabel9.getText();
        FoodName = Foodname.getText();
        price = FoodPrice.getText();
        
        Eventfood item = new Eventfood();
        item.setMenuName(Menuname);
        item.setItemName(FoodName);
        item.setPrice(price);
        
        //Add new food item
        EventFoodController.addFood(item);
        
        
        LoadFoodTable(); //refreash table
    }//GEN-LAST:event_jButton4ActionPerformed

    private void FoodnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int i = foodtable.getSelectedRow();
        String ID = foodtable.getValueAt(i, 0).toString();
        
        String Menuname;       //Item name
        String FoodName;       //Item catagory
        String price;          //Item price
        
        Menuname = jLabel9.getText();
        FoodName = Foodname.getText();
        price = FoodPrice.getText();
        
        Eventfood item = new Eventfood();
        item.setId(Integer.parseInt(ID));
        item.setMenuName(Menuname);
        item.setItemName(FoodName);
        item.setPrice(price);
        
        //update food items
        EventFoodController.updateFood(item);
        
        LoadFoodTable(); //refreash table
    }//GEN-LAST:event_jButton2ActionPerformed

    private void foodtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_foodtableMouseClicked
        
        //set selected row table value to textboxes
        int i = foodtable.getSelectedRow();
        Foodname.setText(foodtable.getValueAt(i, 2).toString());
        FoodPrice.setText(foodtable.getValueAt(i, 3).toString());
    }//GEN-LAST:event_foodtableMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
                                                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.YES_OPTION) {
            //Delete food item
            int i = foodtable.getSelectedRow();
            EventFoodController.DeleteFood(foodtable.getValueAt(i, 0).toString());

            LoadFoodTable(); //refreash table

            //clear text box values
            Foodname.setText("");
            FoodPrice.setText("");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String Bevname;       //Item name
        String Bevcat;        //Item catagory
        String Bevprice;      //Item price
        String BevAddress;      //Item address
        String BevContact;      //Item address
        
        Bevname = bevname.getText();
        Bevcat = bevcat.getText();
        Bevprice = bevprice.getText();
        BevAddress = iaddress.getText();
        BevContact = icontact.getText();
        
        Eventbeverages item = new Eventbeverages();
        item.setName(Bevname);
        item.setCatagory(Bevcat);
        item.setPrice(Bevprice);
        item.setAddress(BevAddress);
        item.setContact(BevContact);
        
        DefaultTableModel d = new DefaultTableModel();
        d = (DefaultTableModel) bevtable.getModel();
        
        //Add beverage 
        EventFoodController.addBev(d,item);
        
        loadcombo(); //refreash combo box
        LoadBevTable(); //refreash table
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int i = bevtable.getSelectedRow();
        String ID = bevtable.getValueAt(i, 5).toString();
        
        String Bevname;       //Item name
        String Bevcat;        //Item catagory
        String Bevprice;      //Item price
        String BevAddress;      //Item address
        String BevContact;      //Item address
        
        Bevname = bevname.getText();
        Bevcat = bevcat.getText();
        Bevprice = bevprice.getText();
        BevAddress = iaddress.getText();
        BevContact = icontact.getText();
        
        Eventbeverages item = new Eventbeverages();
        item.setId(Integer.parseInt(ID));
        item.setName(Bevname);
        item.setCatagory(Bevcat);
        item.setPrice(Bevprice);
        item.setAddress(BevAddress);
        item.setContact(BevContact);
        
        //update beverage
        EventFoodController.updateBev(item);
        
        loadcombo();  //refreash combo box
        LoadBevTable();  //refreash table
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
                                                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (response == JOptionPane.YES_OPTION) {
            //Delete beverage
            int i = bevtable.getSelectedRow();
            EventFoodController.DeleteBev(bevtable.getValueAt(i, 5).toString());

            loadcombo();  //refreash combo box
            LoadBevTable();  //refreash table

            //clear textboxes
            bevname.setText("");
            bevcat.setText("");
            bevprice.setText("");
            iaddress.setText("");
            icontact.setText("");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void bevtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bevtableMouseClicked
        //set selected row table value to textboxes
        int i = bevtable.getSelectedRow();
        
        bevname.setText(bevtable.getValueAt(i, 0).toString());
        bevcat.setText(bevtable.getValueAt(i, 1).toString());
        bevprice.setText(bevtable.getValueAt(i, 2).toString());
        iaddress.setText(bevtable.getValueAt(i, 3).toString());
        icontact.setText(bevtable.getValueAt(i, 4).toString());
    }//GEN-LAST:event_bevtableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nMenu;
        nMenu = newMenu.getText();
        
        Eventfood item = new Eventfood();
        item.setMenuName(nMenu);
        item.setItemName("new");
        
        //add newMenu
        EventFoodController.addFood(item);
        
        loadcombo(); //refreash combo box
        LoadFoodTable(); //refreash table
    }//GEN-LAST:event_jButton1ActionPerformed

    private void icontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_icontactActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditEventFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditEventFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditEventFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditEventFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditEventFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox BevCombo2;
    private javax.swing.JTextField FoodPrice;
    private javax.swing.JTextField Foodname;
    private javax.swing.JTextField bevcat;
    private javax.swing.JTextField bevname;
    private javax.swing.JTextField bevprice;
    public static javax.swing.JTable bevtable;
    public static javax.swing.JComboBox foodCombo;
    public static javax.swing.JTable foodtable;
    private javax.swing.JTextArea iaddress;
    private javax.swing.JTextField icontact;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private static javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField newMenu;
    // End of variables declaration//GEN-END:variables
}
