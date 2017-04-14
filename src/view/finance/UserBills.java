/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.finance;

import model.finance.Bills;
import controller.finance.BillController;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author user
 */
public class UserBills extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserBills
     */
    public UserBills() {
        initComponents();
             
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);  
        
        loadcombo();
        displaytable();
        
    }
    
    /**
     * Load combo box
     */
    public static void loadcombo(){
    	List l = BillController.LoadcomboList();
               
        for(Object o : l) {
           jComboBoxNewBillSearch.addItem(o);
        }        
    }   
    
    /**
     * Load table data
     */
    public static void displaytable(){
  
    	jTableNewBillDetails.setModel(BillController.LoadBillsTable());
        HideColumns();
    }
    
    /**
     * Load search results
     */
    public static void displaySearch(){
          
          String dsearch = jComboBoxNewBillSearch.getSelectedItem().toString();
        
          //If user didn't select a group from the group combo box.
          if(dsearch.equals("Select Bill No")){    
              
              displaytable();      
          }
             
          //If user selects a group from the group combo box.
          else{
              
              jTableNewBillDetails.setModel(BillController.displaySearchedBillsTable(dsearch)); 
              HideColumns();
          }
      }
    
    public static void HideColumns(){
        
        //hide ID column in table 
            int i = 0;
            jTableNewBillDetails.getColumnModel().getColumn(i).setWidth(0);
            jTableNewBillDetails.getColumnModel().getColumn(i).setMinWidth(0);
            jTableNewBillDetails.getColumnModel().getColumn(i).setMaxWidth(0);
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNewBillDetails = new javax.swing.JTable();
        jButtonNewIncomeDelete = new javax.swing.JButton();
        jButtonNewIncomeUpdate = new javax.swing.JButton();
        jButtonNewIncomeRefresh = new javax.swing.JButton();
        jButtonNewIncomeSearch = new javax.swing.JButton();
        jComboBoxNewBillSearch = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxNewBillType = new javax.swing.JComboBox();
        jTextFieldNewBillAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNewBillDescription = new javax.swing.JTextArea();
        jButtonNewIncomeClear = new javax.swing.JButton();
        jButtonNewIncomeAdd = new javax.swing.JButton();
        jDateChooseNewBillDate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNewBillNo = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1245, 640));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(156, 190, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableNewBillDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableNewBillDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewBillDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableNewBillDetails);

        jButtonNewIncomeDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewIncomeDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewIncomeDelete.setForeground(new java.awt.Color(255, 0, 0));
        jButtonNewIncomeDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/deleteRed.png"))); // NOI18N
        jButtonNewIncomeDelete.setText("REMOVE");
        jButtonNewIncomeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewIncomeDeleteActionPerformed(evt);
            }
        });

        jButtonNewIncomeUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewIncomeUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewIncomeUpdate.setForeground(new java.awt.Color(255, 204, 0));
        jButtonNewIncomeUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/updateYelllow.png"))); // NOI18N
        jButtonNewIncomeUpdate.setText("UPDATE");
        jButtonNewIncomeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewIncomeUpdateActionPerformed(evt);
            }
        });

        jButtonNewIncomeRefresh.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewIncomeRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewIncomeRefresh.setForeground(new java.awt.Color(0, 153, 0));
        jButtonNewIncomeRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Refresh-48 (1).png"))); // NOI18N
        jButtonNewIncomeRefresh.setText("REFRESH");
        jButtonNewIncomeRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewIncomeRefreshActionPerformed(evt);
            }
        });

        jButtonNewIncomeSearch.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewIncomeSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewIncomeSearch.setForeground(new java.awt.Color(255, 153, 0));
        jButtonNewIncomeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Search-48 (1).png"))); // NOI18N
        jButtonNewIncomeSearch.setText("SEARCH");
        jButtonNewIncomeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewIncomeSearchActionPerformed(evt);
            }
        });

        jComboBoxNewBillSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bill No" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Bill No   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNewBillSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNewIncomeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonNewIncomeRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNewIncomeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonNewIncomeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewIncomeRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewIncomeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNewBillSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewIncomeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewIncomeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Bill Type");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Description / Note");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Amount");

        jComboBoxNewBillType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Bill Type", "Water Bill", "Electricity Bill", "Phone Bill", "Mobile Phone Bill", "Television Bill" }));
        jComboBoxNewBillType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jComboBoxNewBillType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNewBillTypeActionPerformed(evt);
            }
        });

        jTextFieldNewBillAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextAreaNewBillDescription.setColumns(20);
        jTextAreaNewBillDescription.setRows(5);
        jTextAreaNewBillDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextAreaNewBillDescription);

        jButtonNewIncomeClear.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewIncomeClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewIncomeClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Broom-48.png"))); // NOI18N
        jButtonNewIncomeClear.setText("CLEAR");
        jButtonNewIncomeClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewIncomeClearActionPerformed(evt);
            }
        });

        jButtonNewIncomeAdd.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewIncomeAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewIncomeAdd.setForeground(new java.awt.Color(0, 0, 204));
        jButtonNewIncomeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/addBlue.png"))); // NOI18N
        jButtonNewIncomeAdd.setText("ADD");
        jButtonNewIncomeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewIncomeAddActionPerformed(evt);
            }
        });

        jDateChooseNewBillDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooseNewBillDate.setDateFormatString("yyyy-MM-dd");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Bill No");

        jTextFieldNewBillNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNewIncomeClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonNewIncomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooseNewBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNewBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNewBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxNewBillType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNewBillNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNewBillType, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNewBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooseNewBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewIncomeClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewIncomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel58.setBackground(new java.awt.Color(204, 204, 204));
        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 0, 102));
        jLabel58.setText("                              Add Billing Details");
        jLabel58.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("                                                                         Billing Detail List");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewIncomeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeUpdateActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Do you really want to update?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
          
            int i = jTableNewBillDetails.getSelectedRow();
            String ID = jTableNewBillDetails.getValueAt(i, 0).toString();
             
            String billNo;
            String billType;
            String description;
            Date date;
            String amount;

            billNo = jTextFieldNewBillNo.getText();
            billType = jComboBoxNewBillType.getSelectedItem().toString();
            description = jTextAreaNewBillDescription.getText();
            date = jDateChooseNewBillDate.getDate();
            amount = jTextFieldNewBillAmount.getText();

            if(billNo.equals(jTableNewBillDetails.getValueAt(i, 1).toString()))
            {   
                Bills newBill = new Bills();
            
                newBill.setBillId(Integer.parseInt(ID));
                newBill.setBillNo(billNo);
                newBill.setBillType(billType);
                newBill.setDescription(description);
                newBill.setDate(date);
                newBill.setAmount(amount);

                BillController.updateBill(newBill);
               
                displaytable();
        
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null, "Bill Number cannot be edited!! Please try to edit other details without bill number!");
            }
        }
    }//GEN-LAST:event_jButtonNewIncomeUpdateActionPerformed

    private void jButtonNewIncomeRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeRefreshActionPerformed
        displaytable();
    }//GEN-LAST:event_jButtonNewIncomeRefreshActionPerformed

    private void jButtonNewIncomeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeSearchActionPerformed
        displaySearch();
    }//GEN-LAST:event_jButtonNewIncomeSearchActionPerformed

    private void jButtonNewIncomeClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeClearActionPerformed

        jTextFieldNewBillNo.setText("");
        jComboBoxNewBillType.setSelectedItem("Select Bill Type");
        jTextAreaNewBillDescription.setText("");
        ((JTextField)jDateChooseNewBillDate.getDateEditor().getUiComponent()).setText("");
        jTextFieldNewBillAmount.setText("");
    }//GEN-LAST:event_jButtonNewIncomeClearActionPerformed

    private void jButtonNewIncomeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeAddActionPerformed

        try{
            String billNo;      //bill number
            String billType;    //bill type
            String description; //description
            Date date;          //date issued
            String amount;      //bill amount

            billNo = jTextFieldNewBillNo.getText();
            billType = jComboBoxNewBillType.getSelectedItem().toString();
            description = jTextAreaNewBillDescription.getText();
            date = jDateChooseNewBillDate.getDate();
            amount = jTextFieldNewBillAmount.getText();

            Bills newBill = new Bills();
            
            newBill.setBillNo(billNo);
            newBill.setBillType(billType);
            newBill.setDescription(description);
            newBill.setDate(date);
            newBill.setAmount(amount);
            
            long count = BillController.CountBillNo(billNo);
            
            if(count > 0)
            {
                 JOptionPane.showMessageDialog(null, "This Bill number all ready inserted!!");
            }
            
            if(count == 0)
            {
                BillController.addBill(newBill);
            }
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }

        displaytable();
        loadcombo();
        
        jTextFieldNewBillNo.setText("");
        jComboBoxNewBillType.setSelectedItem("Select Bill Type");
        jTextAreaNewBillDescription.setText("");
        ((JTextField)jDateChooseNewBillDate.getDateEditor().getUiComponent()).setText("");
        jTextFieldNewBillAmount.setText("");
    }//GEN-LAST:event_jButtonNewIncomeAddActionPerformed

    private void jButtonNewIncomeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeDeleteActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {

            int i = jTableNewBillDetails.getSelectedRow();
            BillController.DeleteBill(jTableNewBillDetails.getValueAt(i, 1).toString());
            displaytable();

        }
    }//GEN-LAST:event_jButtonNewIncomeDeleteActionPerformed

    private void jComboBoxNewBillTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNewBillTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNewBillTypeActionPerformed

    private void jTableNewBillDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewBillDetailsMouseClicked
         int i = jTableNewBillDetails.getSelectedRow();

        jTextFieldNewBillNo.setText(jTableNewBillDetails.getValueAt(i, 1).toString());
        jComboBoxNewBillType.setSelectedItem(jTableNewBillDetails.getValueAt(i,2).toString());
        jTextAreaNewBillDescription.setText(jTableNewBillDetails.getValueAt(i, 3).toString());
        jTextFieldNewBillAmount.setText(jTableNewBillDetails.getValueAt(i, 4).toString());
        ((JTextField)jDateChooseNewBillDate.getDateEditor().getUiComponent()).setText(jTableNewBillDetails.getValueAt(i,5).toString());
    }//GEN-LAST:event_jTableNewBillDetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNewIncomeAdd;
    private javax.swing.JButton jButtonNewIncomeClear;
    private javax.swing.JButton jButtonNewIncomeDelete;
    private javax.swing.JButton jButtonNewIncomeRefresh;
    private javax.swing.JButton jButtonNewIncomeSearch;
    private javax.swing.JButton jButtonNewIncomeUpdate;
    private static javax.swing.JComboBox jComboBoxNewBillSearch;
    private javax.swing.JComboBox jComboBoxNewBillType;
    private com.toedter.calendar.JDateChooser jDateChooseNewBillDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTableNewBillDetails;
    private javax.swing.JTextArea jTextAreaNewBillDescription;
    private javax.swing.JTextField jTextFieldNewBillAmount;
    private javax.swing.JTextField jTextFieldNewBillNo;
    // End of variables declaration//GEN-END:variables
}
