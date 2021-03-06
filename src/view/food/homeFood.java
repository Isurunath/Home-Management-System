/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.food;

import controller.food.FoodController;
import java.util.Date;
import model.food.Homefood;

/**
 *
 * @author Isurunath
 */
public class homeFood extends javax.swing.JInternalFrame {

    /**
     * Creates new form homeFood
     */
    public homeFood() {
        initComponents();
        displaytable("ALL");
    }
    
    public static void displaytable(String type){
    	
    	jTable1.setModel(FoodController.displayFoodTable(type));
        
        //hide ID column in table
        jTable1.getColumnModel().getColumn(0).setWidth(0);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        drinks = new javax.swing.JRadioButton();
        vegi = new javax.swing.JRadioButton();
        fruits = new javax.swing.JRadioButton();
        can = new javax.swing.JRadioButton();
        meat = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        other = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        fresh = new javax.swing.JRadioButton();
        all = new javax.swing.JRadioButton();
        exps = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        foodmes = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        foodDes = new javax.swing.JTextField();
        foodPrice = new javax.swing.JTextField();
        foodQty = new com.toedter.components.JSpinField();
        foodExp = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        foodCon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        foodAdd = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        foodCat = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1185, 592));
        setPreferredSize(new java.awt.Dimension(1280, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Catagory", "Description", "Quantity", "Expire Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 127, 570, 330));

        drinks.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        drinks.setText("Drinks");
        drinks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drinksMouseClicked(evt);
            }
        });
        jPanel1.add(drinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        vegi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        vegi.setText("Vegetables");
        vegi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vegiMouseClicked(evt);
            }
        });
        jPanel1.add(vegi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        fruits.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fruits.setText("Fruits");
        fruits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fruitsMouseClicked(evt);
            }
        });
        jPanel1.add(fruits, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        can.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        can.setText("Canned");
        can.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canMouseClicked(evt);
            }
        });
        jPanel1.add(can, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        meat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        meat.setText("Meats");
        meat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meatMouseClicked(evt);
            }
        });
        jPanel1.add(meat, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        other.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        other.setText("Other");
        other.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otherMouseClicked(evt);
            }
        });
        jPanel5.add(other, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 570, 40));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        fresh.setText("Fresh");
        fresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                freshMouseClicked(evt);
            }
        });

        all.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        all.setText("All");
        all.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allMouseClicked(evt);
            }
        });
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });

        exps.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exps.setText("Expire Soon");
        exps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expsMouseClicked(evt);
            }
        });
        exps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(exps)
                .addGap(18, 18, 18)
                .addComponent(all)
                .addGap(32, 32, 32)
                .addComponent(fresh)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exps)
                    .addComponent(all)
                    .addComponent(fresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, 40));

        jPanel2.setBackground(new java.awt.Color(156, 190, 234));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\deleteRed.png")); // NOI18N
        jButton3.setText("delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 150, 35));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 550));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(92, 126, 150));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Add To List"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 80, 20));

        foodmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Each", "KG", "g", "Packets", "Bags", "Case", "LTR", " " }));
        foodmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodmesActionPerformed(evt);
            }
        });
        jPanel3.add(foodmes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 80, 30));

        jLabel4.setText("of");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 20, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Price");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 90, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Expire date");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 70, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Catagory");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 60, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Description");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, 20));
        jPanel3.add(foodDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 210, 30));
        jPanel3.add(foodPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 210, 30));
        jPanel3.add(foodQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 100, 30));
        jPanel3.add(foodExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 210, 30));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier Details"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(foodCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 210, 30));

        foodAdd.setColumns(20);
        foodAdd.setRows(5);
        jScrollPane2.setViewportView(foodAdd);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 210, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Contact");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 440, 200));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\addBlue.png")); // NOI18N
        jButton1.setText("ADD TO INVENTORY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 200, 35));

        foodCat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Drinks", "Vegetables", "Fruits", "Canned", "Meats", "Other" }));
        jPanel3.add(foodCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 210, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Isurunath\\Documents\\NetBeansProjects\\Home\\Lib\\images\\updateYelllow.png")); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, 210, 35));

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 590, 530));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 660, 540));

        jTabbedPane1.addTab("Food Inventory", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foodmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodmesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodmesActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String catagory;
        String description;
        int qty;
        String mesurement;
        String price;
        Date date;
        String address;
        String contact;
        
        catagory = foodCat.getSelectedItem().toString();
        description = foodDes.getText();
        qty = foodQty.getValue();
        mesurement = foodmes.getSelectedItem().toString();
        price = foodPrice.getText();
        date = foodExp.getDate();
        address = foodAdd.getText();
        contact = foodCon.getText();
        
        Homefood item = new Homefood();
        item.setCatagory(catagory);
        item.setDescription(description);
        item.setQuantity(qty);
        item.setMeasurment(mesurement);
        item.setPrice(price);
        item.setDate(date);
        item.setAddress(address);
        item.setContact(contact);
        
        FoodController.AddFood(item);
        displaytable("ALL");


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       //set selected row values to the textBoxes
        int i = jTable1.getSelectedRow();
        foodCat.setSelectedItem(jTable1.getValueAt(i, 1).toString());
        foodDes.setText(jTable1.getValueAt(i, 2).toString());
        foodQty.setValue(Integer.parseInt(jTable1.getValueAt(i, 3).toString()));
        foodmes.setSelectedItem(jTable1.getValueAt(i, 4).toString());
        foodPrice.setText(jTable1.getValueAt(i, 5).toString());
        foodExp.setDate((Date) jTable1.getValueAt(i, 6));
        foodAdd.setText(jTable1.getValueAt(i, 7).toString());
        foodCon.setText(jTable1.getValueAt(i, 8).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
        int i = jTable1.getSelectedRow();
        int id = Integer.parseInt(jTable1.getValueAt(i, 0).toString());
        
        String catagory;
        String description;
        int qty;
        String mesurement;
        String price;
        Date date;
        String address;
        String contact;
        
        catagory = foodCat.getSelectedItem().toString();
        description = foodDes.getText();
        qty = foodQty.getValue();
        mesurement = foodmes.getSelectedItem().toString();
        price = foodPrice.getText();
        date = foodExp.getDate();
        address = foodAdd.getText();
        contact = foodCon.getText();
        
        Homefood item = new Homefood();
        item.setFoodId(id);
        item.setCatagory(catagory);
        item.setDescription(description);
        item.setQuantity(qty);
        item.setMeasurment(mesurement);
        item.setPrice(price);
        item.setDate(date);
        item.setAddress(address);
        item.setContact(contact);
        
        FoodController.updateFood(item);
        displaytable("ALL");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int i = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(i, 0).toString();
        FoodController.DeleteFood(id);
        displaytable("ALL");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void drinksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksMouseClicked
        
        displaytable("Drinks");
        vegi.setSelected(false);
        fruits.setSelected(false);
        can.setSelected(false);
        meat.setSelected(false);
        other.setSelected(false);
        exps.setSelected(false);
        fresh.setSelected(false);
        all.setSelected(false);
        
    }//GEN-LAST:event_drinksMouseClicked

    private void expsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expsActionPerformed

    private void vegiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vegiMouseClicked
        displaytable("Vegetables");
        drinks.setSelected(false);
        fruits.setSelected(false);
        can.setSelected(false);
        meat.setSelected(false);
        other.setSelected(false);
        exps.setSelected(false);
        fresh.setSelected(false);
        all.setSelected(false);
    }//GEN-LAST:event_vegiMouseClicked

    private void fruitsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fruitsMouseClicked
        displaytable("Fruits");
        vegi.setSelected(false);
        drinks.setSelected(false);
        can.setSelected(false);
        meat.setSelected(false);
        other.setSelected(false);
        exps.setSelected(false);
        fresh.setSelected(false);
        all.setSelected(false);
    }//GEN-LAST:event_fruitsMouseClicked

    private void canMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canMouseClicked
        displaytable("Canned");
        vegi.setSelected(false);
        fruits.setSelected(false);
        drinks.setSelected(false);
        meat.setSelected(false);
        other.setSelected(false);
        exps.setSelected(false);
        fresh.setSelected(false);
        all.setSelected(false);
    }//GEN-LAST:event_canMouseClicked

    private void meatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meatMouseClicked
        displaytable("Meats");
        vegi.setSelected(false);
        fruits.setSelected(false);
        can.setSelected(false);
        drinks.setSelected(false);
        other.setSelected(false);
        exps.setSelected(false);
        fresh.setSelected(false);
        all.setSelected(false);
    }//GEN-LAST:event_meatMouseClicked

    private void otherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otherMouseClicked
        displaytable("Other");
        vegi.setSelected(false);
        fruits.setSelected(false);
        can.setSelected(false);
        meat.setSelected(false);
        drinks.setSelected(false);
        exps.setSelected(false);
        fresh.setSelected(false);
        all.setSelected(false);
    }//GEN-LAST:event_otherMouseClicked

    private void expsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expsMouseClicked
        
        displaytable("Expire");
        vegi.setSelected(false);
        fruits.setSelected(false);
        can.setSelected(false);
        meat.setSelected(false);
        other.setSelected(false);
        drinks.setSelected(false);
        fresh.setSelected(false);
        all.setSelected(false);
    }//GEN-LAST:event_expsMouseClicked

    private void allMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allMouseClicked
        displaytable("ALL");
        vegi.setSelected(false);
        fruits.setSelected(false);
        can.setSelected(false);
        meat.setSelected(false);
        other.setSelected(false);
        exps.setSelected(false);
        fresh.setSelected(false);
        drinks.setSelected(false);
    }//GEN-LAST:event_allMouseClicked

    private void freshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_freshMouseClicked
       displaytable("Freash");
        vegi.setSelected(false);
        fruits.setSelected(false);
        can.setSelected(false);
        meat.setSelected(false);
        other.setSelected(false);
        exps.setSelected(false);
        drinks.setSelected(false);
        all.setSelected(false);
    }//GEN-LAST:event_freshMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton all;
    private javax.swing.JRadioButton can;
    private javax.swing.JRadioButton drinks;
    private javax.swing.JRadioButton exps;
    private javax.swing.JTextArea foodAdd;
    private javax.swing.JComboBox foodCat;
    private javax.swing.JTextField foodCon;
    private javax.swing.JTextField foodDes;
    private com.toedter.calendar.JDateChooser foodExp;
    private javax.swing.JTextField foodPrice;
    private com.toedter.components.JSpinField foodQty;
    private javax.swing.JComboBox foodmes;
    private javax.swing.JRadioButton fresh;
    private javax.swing.JRadioButton fruits;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JRadioButton meat;
    private javax.swing.JRadioButton other;
    private javax.swing.JRadioButton vegi;
    // End of variables declaration//GEN-END:variables
}
