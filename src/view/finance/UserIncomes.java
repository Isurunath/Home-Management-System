
package view.finance;

import controller.finance.IncomeController;
import model.finance.Incomedetails;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;


public class UserIncomes extends javax.swing.JInternalFrame {

  
    public UserIncomes() {
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
    	List l = IncomeController.LoadcomboList();
               
        for(Object o : l) {
            jComboBoxNewIncomeSearch.addItem(o);
        }        
    }   
    
    /**
     * Load table data
     */
    public static void displaytable(){
       	
        jTableNewIncomeDetails.setModel(IncomeController.LoadIncomeTable());
        HideColumns();      
    }
    
    /**
     * Load search results
     */
    public static void displaySearch(){
          
          String dsearch = jComboBoxNewIncomeSearch.getSelectedItem().toString();
        
          //If user didn't select a group from the group combo box.
          if(dsearch.equals("Select Acc No")){    
              
              displaytable();      
          }
             
          //If user selects a group from the group combo box.
          else{
              
              jTableNewIncomeDetails.setModel(IncomeController.displaySearchedIncomeTable(dsearch)); 
              HideColumns();
          }
      }
    
    public static void HideColumns(){
        
        //hide ID column in table 
            int i = 0;
            jTableNewIncomeDetails.getColumnModel().getColumn(i).setWidth(0);
            jTableNewIncomeDetails.getColumnModel().getColumn(i).setMinWidth(0);
            jTableNewIncomeDetails.getColumnModel().getColumn(i).setMaxWidth(0);
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNewIncomeDetails = new javax.swing.JTable();
        jButtonNewIncomeDelete = new javax.swing.JButton();
        jButtonNewIncomeUpdate = new javax.swing.JButton();
        jButtonNewIncomeRefresh = new javax.swing.JButton();
        jButtonNewIncomeSearch = new javax.swing.JButton();
        jComboBoxNewIncomeSearch = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxNewIncomeSource = new javax.swing.JComboBox();
        jTextFieldNewIncomeAmount = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNewIncomeSourceDescription = new javax.swing.JTextArea();
        jButtonNewIncomeClear = new javax.swing.JButton();
        jButtonNewIncomeAdd = new javax.swing.JButton();
        jDateChooseNewrIncomeDate = new com.toedter.calendar.JDateChooser();
        jLabel58 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1245, 640));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1245, 640));

        jPanel2.setBackground(new java.awt.Color(156, 190, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableNewIncomeDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableNewIncomeDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewIncomeDetailsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableNewIncomeDetails);

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
        jButtonNewIncomeSearch.setForeground(new java.awt.Color(255, 102, 0));
        jButtonNewIncomeSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Search-48 (1).png"))); // NOI18N
        jButtonNewIncomeSearch.setText("SEARCH");
        jButtonNewIncomeSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewIncomeSearchActionPerformed(evt);
            }
        });

        jComboBoxNewIncomeSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Acc No" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Account No");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxNewIncomeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNewIncomeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNewIncomeRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonNewIncomeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNewIncomeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewIncomeRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewIncomeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNewIncomeSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewIncomeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewIncomeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Income Source");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Source Description");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Amount");

        jComboBoxNewIncomeSource.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Source", "Salary", "Business", "Other" }));
        jComboBoxNewIncomeSource.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextFieldNewIncomeAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTextAreaNewIncomeSourceDescription.setColumns(20);
        jTextAreaNewIncomeSourceDescription.setRows(5);
        jTextAreaNewIncomeSourceDescription.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(jTextAreaNewIncomeSourceDescription);

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

        jDateChooseNewrIncomeDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooseNewrIncomeDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jComboBoxNewIncomeSource, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldNewIncomeAmount)
                        .addComponent(jDateChooseNewrIncomeDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNewIncomeClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNewIncomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNewIncomeSource, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooseNewrIncomeDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldNewIncomeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewIncomeClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewIncomeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        jLabel58.setBackground(new java.awt.Color(204, 204, 204));
        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 0, 102));
        jLabel58.setText("                       Add New Income Details");
        jLabel58.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("                                                                   Income Detail List");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewIncomeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeUpdateActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Do you really want to update?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
          
      
        int i = jTableNewIncomeDetails.getSelectedRow();
        String ID = jTableNewIncomeDetails.getValueAt(i, 0).toString();
            
        String incomeSource;     
        String description;     
        Date date;           
        String amount;  
        
        incomeSource = jComboBoxNewIncomeSource.getSelectedItem().toString();
        description = jTextAreaNewIncomeSourceDescription.getText();
        date = jDateChooseNewrIncomeDate.getDate();
        amount = jTextFieldNewIncomeAmount.getText();
         
       
            model.finance.Incomedetails newIncome = new model.finance.Incomedetails();
            newIncome.setIncomeId(Integer.parseInt(ID));
            newIncome.setIncomeSource(incomeSource);
            newIncome.setDescription(description);
            newIncome.setDate(date);
            newIncome.setAmount(amount);
           
            
            IncomeController.updateIncome(newIncome);
       
             displaytable();
        }
        
        
      
    }//GEN-LAST:event_jButtonNewIncomeUpdateActionPerformed

    private void jButtonNewIncomeRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeRefreshActionPerformed
        displaytable();
    }//GEN-LAST:event_jButtonNewIncomeRefreshActionPerformed

    private void jButtonNewIncomeSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeSearchActionPerformed
        displaySearch();
    }//GEN-LAST:event_jButtonNewIncomeSearchActionPerformed

    private void jButtonNewIncomeClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeClearActionPerformed

        jComboBoxNewIncomeSource.setSelectedItem("Select Source");
        jTextAreaNewIncomeSourceDescription.setText("");
        ((JTextField)jDateChooseNewrIncomeDate.getDateEditor().getUiComponent()).setText("");
        jTextFieldNewIncomeAmount.setText("");
    }//GEN-LAST:event_jButtonNewIncomeClearActionPerformed

    private void jButtonNewIncomeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeAddActionPerformed

        try{
            String incomeSource;     //source of income
            String description;     //description
            Date date;              //date
            String amount;          //amount of income
           

            incomeSource = jComboBoxNewIncomeSource.getSelectedItem().toString();
            description = jTextAreaNewIncomeSourceDescription.getText();
            date = jDateChooseNewrIncomeDate.getDate();
            amount = jTextFieldNewIncomeAmount.getText();
         
            Incomedetails newIncome = new Incomedetails();
            newIncome.setIncomeSource(incomeSource);
            newIncome.setDescription(description);
            newIncome.setDate(date);
            newIncome.setAmount(amount);
          
            IncomeController.addIncome(newIncome);
        }
        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }

        displaytable();
        loadcombo();
        
        
        jComboBoxNewIncomeSource.setSelectedItem("Select Source");
        jTextAreaNewIncomeSourceDescription.setText("");
        ((JTextField)jDateChooseNewrIncomeDate.getDateEditor().getUiComponent()).setText("");
        jTextFieldNewIncomeAmount.setText("");
    }//GEN-LAST:event_jButtonNewIncomeAddActionPerformed

    private void jButtonNewIncomeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewIncomeDeleteActionPerformed
         int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {

            int i = jTableNewIncomeDetails.getSelectedRow();
            IncomeController.DeleteIncome(jTableNewIncomeDetails.getValueAt(i, 0).toString());
            displaytable();

        }
    }//GEN-LAST:event_jButtonNewIncomeDeleteActionPerformed

    private void jTableNewIncomeDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewIncomeDetailsMouseClicked
       
        int i = jTableNewIncomeDetails.getSelectedRow();

       jComboBoxNewIncomeSource.setSelectedItem(jTableNewIncomeDetails.getValueAt(i, 1).toString());
        jTextAreaNewIncomeSourceDescription.setText(jTableNewIncomeDetails.getValueAt(i, 2).toString());
       ((JTextField)jDateChooseNewrIncomeDate.getDateEditor().getUiComponent()).setText(jTableNewIncomeDetails.getValueAt(i, 3).toString());
       jTextFieldNewIncomeAmount.setText(jTableNewIncomeDetails.getValueAt(i, 4).toString());
    }//GEN-LAST:event_jTableNewIncomeDetailsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNewIncomeAdd;
    private javax.swing.JButton jButtonNewIncomeClear;
    private javax.swing.JButton jButtonNewIncomeDelete;
    private javax.swing.JButton jButtonNewIncomeRefresh;
    private javax.swing.JButton jButtonNewIncomeSearch;
    private javax.swing.JButton jButtonNewIncomeUpdate;
    private static javax.swing.JComboBox jComboBoxNewIncomeSearch;
    private javax.swing.JComboBox jComboBoxNewIncomeSource;
    private com.toedter.calendar.JDateChooser jDateChooseNewrIncomeDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTableNewIncomeDetails;
    private javax.swing.JTextArea jTextAreaNewIncomeSourceDescription;
    private javax.swing.JTextField jTextFieldNewIncomeAmount;
    // End of variables declaration//GEN-END:variables
}
