
package view.finance;

import controller.finance.AccountController;
import controller.finance.DepositController;
import model.finance.Deposit;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.finance.Account;


public class UserDeposits extends javax.swing.JInternalFrame {

   
    public UserDeposits() {
        initComponents();
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
       
        loadcomboaccNo();
        loadcombo();
        displaytable();
    }
    
    /**
     * Load search combo box
     */
     public static void loadcombo(){
    	List l = DepositController.LoadcomboList();
               
        for(Object o : l) {
            jComboBoxNewdEpositSearch.addItem(o);
        }        
    }  
     
     
    /**
     * Load deposit account number combo box
     */
     public static void loadcomboaccNo(){
    	List l = DepositController.LoadcomboList();
               
        for(Object o : l) {
            jComboBoxNewDepositAccountNo.addItem(o);
        }        
    }   
    
     /**
     * Load table
     */
    public static void displaytable(){
       	
        jTableNewDeposits.setModel(DepositController.LoadDepositTable());
        HideColumns();     
    }
    
    /**
     * Load search results
     */
    public static void displaySearch(){
          
          String dsearch = jComboBoxNewdEpositSearch.getSelectedItem().toString();
        
          //If user didn't select a group from the group combo box.
          if(dsearch.equals("Select Acc No")){    
              
              displaytable();      
          }
             
          //If user selects a group from the group combo box.
          else{
              
              jTableNewDeposits.setModel(DepositController.displaySearchedDepositTable(dsearch)); 
              HideColumns();
          }
      }
    
    public static void HideColumns(){
        
        //hide ID column in table 
            int i = 0;
            jTableNewDeposits.getColumnModel().getColumn(i).setWidth(0);
            jTableNewDeposits.getColumnModel().getColumn(i).setMinWidth(0);
            jTableNewDeposits.getColumnModel().getColumn(i).setMaxWidth(0);
    }
       
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextBoxNewDepositAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxNewDepositAccountNo = new javax.swing.JComboBox();
        jButtonNewDepositClear = new javax.swing.JButton();
        jButtonNewDepositAdd = new javax.swing.JButton();
        jDateChooserNewDepositDate = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNewDeposits = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxNewdEpositSearch = new javax.swing.JComboBox();
        jButtonNewDepsitSearch = new javax.swing.JButton();
        jButtonNewDepsitRefresh = new javax.swing.JButton();
        jButtonNewDepositUpdate = new javax.swing.JButton();
        jButtonNewDepositDelete = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1245, 640));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(156, 190, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setMinimumSize(new java.awt.Dimension(486, 374));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Account No");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Deposited Amount");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Deposited Date");

        JTextBoxNewDepositAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboBoxNewDepositAccountNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Account No" }));
        jComboBoxNewDepositAccountNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButtonNewDepositClear.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewDepositClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewDepositClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Broom-48.png"))); // NOI18N
        jButtonNewDepositClear.setText("CLEAR");
        jButtonNewDepositClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewDepositClearActionPerformed(evt);
            }
        });

        jButtonNewDepositAdd.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewDepositAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewDepositAdd.setForeground(new java.awt.Color(0, 0, 204));
        jButtonNewDepositAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/addBlue.png"))); // NOI18N
        jButtonNewDepositAdd.setText("ADD");
        jButtonNewDepositAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewDepositAddActionPerformed(evt);
            }
        });

        jDateChooserNewDepositDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooserNewDepositDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxNewDepositAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTextBoxNewDepositAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jDateChooserNewDepositDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonNewDepositClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNewDepositAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNewDepositAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextBoxNewDepositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserNewDepositDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewDepositAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewDepositClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(619, 374));

        jTableNewDeposits.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableNewDeposits.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewDepositsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNewDeposits);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Account No");

        jComboBoxNewdEpositSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Acc No" }));

        jButtonNewDepsitSearch.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewDepsitSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewDepsitSearch.setForeground(new java.awt.Color(255, 102, 0));
        jButtonNewDepsitSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Search-48 (1).png"))); // NOI18N
        jButtonNewDepsitSearch.setText("SEARCH");
        jButtonNewDepsitSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewDepsitSearchActionPerformed(evt);
            }
        });

        jButtonNewDepsitRefresh.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewDepsitRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewDepsitRefresh.setForeground(new java.awt.Color(0, 153, 0));
        jButtonNewDepsitRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Refresh-48 (1).png"))); // NOI18N
        jButtonNewDepsitRefresh.setText("REFRESH");
        jButtonNewDepsitRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewDepsitRefreshActionPerformed(evt);
            }
        });

        jButtonNewDepositUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewDepositUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewDepositUpdate.setForeground(new java.awt.Color(255, 204, 0));
        jButtonNewDepositUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/updateYelllow.png"))); // NOI18N
        jButtonNewDepositUpdate.setText("UPDATE");
        jButtonNewDepositUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewDepositUpdateActionPerformed(evt);
            }
        });

        jButtonNewDepositDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewDepositDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewDepositDelete.setForeground(new java.awt.Color(255, 0, 0));
        jButtonNewDepositDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/deleteRed.png"))); // NOI18N
        jButtonNewDepositDelete.setText("REMOVE");
        jButtonNewDepositDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewDepositDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxNewdEpositSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNewDepsitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNewDepsitRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonNewDepositUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(35, 35, 35)
                            .addComponent(jButtonNewDepositDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(23, 23, 23))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewDepsitRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewDepsitSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNewdEpositSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewDepositDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewDepositUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel58.setBackground(new java.awt.Color(204, 204, 204));
        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 0, 102));
        jLabel58.setText("                            Add New Deposits");
        jLabel58.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("                                                                      Deposit Detail List");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, Short.MAX_VALUE))
                .addContainerGap(183, Short.MAX_VALUE))
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

    private void jTableNewDepositsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewDepositsMouseClicked
        int i = jTableNewDeposits.getSelectedRow();

        jComboBoxNewDepositAccountNo.setSelectedItem(jTableNewDeposits.getValueAt(i, 1).toString());        
        JTextBoxNewDepositAmount.setText(jTableNewDeposits.getValueAt(i, 2).toString());
        ((JTextField)jDateChooserNewDepositDate.getDateEditor().getUiComponent()).setText(jTableNewDeposits.getValueAt(i, 3).toString());

    }//GEN-LAST:event_jTableNewDepositsMouseClicked

    private void jButtonNewDepsitSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDepsitSearchActionPerformed
        displaySearch();
    }//GEN-LAST:event_jButtonNewDepsitSearchActionPerformed

    private void jButtonNewDepsitRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDepsitRefreshActionPerformed
        displaytable();
    }//GEN-LAST:event_jButtonNewDepsitRefreshActionPerformed

    private void jButtonNewDepositUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDepositUpdateActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Do you really want to update?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
          
        int i = jTableNewDeposits.getSelectedRow();
        String ID = jTableNewDeposits.getValueAt(i, 0).toString();
       

        String accNo;              //account number
        String depositAmount;     //deposited amount
        Date depositDate;         //deposited date
        
        accNo = jComboBoxNewDepositAccountNo.getSelectedItem().toString();
        depositAmount = JTextBoxNewDepositAmount.getText();
        depositDate = jDateChooserNewDepositDate.getDate();
         
        if(accNo.equals(jTableNewDeposits.getValueAt(i, 1).toString()))
        {  
            model.finance.Deposit newDeposit = new model.finance.Deposit();
            newDeposit.setDepId(Integer.parseInt(ID));
            newDeposit.setAccNo(accNo);
            newDeposit.setDepositAmount(depositAmount);
            newDeposit.setDepositDate(depositDate);
       
            DepositController.updateDeposit(newDeposit);
            
            Account ac = new Account();
            
            long count = AccountController.CountAccountNo(accNo);
            
            if(count > 0){
                
                List l = AccountController.LoadAccountNo(accNo);
                                       
                for(Object o : l) {
                
                    model.finance.Account account = (model.finance.Account)o;
                    
                    String accId = account.getAccId().toString();
                    String accno = account.getAccNo();
                    String accHoldrName = account.getAccHolderName();
                    String accType = account.getAccType();
                    String accBal = account.getAccBalance();
                    String accHoldBank = account.getAccHoldingBank();
                    String accHoldBranch= account.getAccHoldingBranch();
                                                               
                    int accBalance = Integer.parseInt(accBal);
                    int depAmt = Integer.parseInt(depositAmount);
                        
                    int tot = accBalance + depAmt;
                    String totS = String.valueOf(tot);
                         
                    String totalBal = (totS);
                    
                    ac.setAccId(Integer.parseInt(accId));
                    ac.setAccNo(accno);
                    ac.setAccHolderName(accHoldrName);
                    ac.setAccType(accType);
                    ac.setAccBalance(totalBal);
                    ac.setAccHoldingBank(accHoldBank);
                    ac.setAccHoldingBranch(accHoldBranch);
                    
                              
                }
                
                AccountController.updateAccount(ac);
            }
        
            displaytable();
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Account Number cannot be edited!! Please try to edit other details without account number!");
        }
      }
    }//GEN-LAST:event_jButtonNewDepositUpdateActionPerformed

    private void jButtonNewDepositClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDepositClearActionPerformed

        JTextBoxNewDepositAmount.setText("");
        ((JTextField)jDateChooserNewDepositDate.getDateEditor().getUiComponent()).setText("");
        jComboBoxNewDepositAccountNo.setSelectedItem("Select Acc No");
       
    }//GEN-LAST:event_jButtonNewDepositClearActionPerformed

    private void jButtonNewDepositAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDepositAddActionPerformed

        try{
            String accNo;             
            Date depositDate;     
            String depositAmount;           
           

            accNo = jComboBoxNewDepositAccountNo.getSelectedItem().toString();
            depositAmount = JTextBoxNewDepositAmount.getText();
            depositDate = jDateChooserNewDepositDate.getDate();
            

            Deposit newDeposit = new Deposit();
            newDeposit.setAccNo(accNo);
            newDeposit.setDepositAmount(depositAmount);
            newDeposit.setDepositDate(depositDate);
          
            DepositController.addDeposit(newDeposit);
            
            Account ac = new Account();
            
            long count = AccountController.CountAccountNo(accNo);
            
            if(count > 0){
                
                List l = AccountController.LoadAccountNo(accNo);
                
                            
                for(Object o : l) {
                
                    model.finance.Account account = (model.finance.Account)o;
                    
                    String accId = account.getAccId().toString();
                    String accno = account.getAccNo();
                    String accHoldrName = account.getAccHolderName();
                    String accType = account.getAccType();
                    String accBal = account.getAccBalance();
                    String accHoldBank = account.getAccHoldingBank();
                    String accHoldBranch= account.getAccHoldingBranch();
                    
                    int accBalance = Integer.parseInt(accBal);
                    int depAmt = Integer.parseInt(depositAmount);
                        
                    int tot = accBalance + depAmt;
                    String totS = String.valueOf(tot);
                         
                    String totalBal = (totS);
                    
                    ac.setAccId(Integer.parseInt(accId));
                    ac.setAccNo(accno);
                    ac.setAccHolderName(accHoldrName);
                    ac.setAccType(accType);
                    ac.setAccBalance(totalBal);
                    ac.setAccHoldingBank(accHoldBank);
                    ac.setAccHoldingBranch(accHoldBranch);
                    
                              
                }
                
                AccountController.updateAccount(ac);
            }
            
             
            
        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }

        displaytable();
        
        JTextBoxNewDepositAmount.setText("");
        ((JTextField)jDateChooserNewDepositDate.getDateEditor().getUiComponent()).setText("");
        jComboBoxNewDepositAccountNo.setSelectedItem("Select Acc No");
    }//GEN-LAST:event_jButtonNewDepositAddActionPerformed

    private void jButtonNewDepositDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewDepositDeleteActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {

            int i = jTableNewDeposits.getSelectedRow();
            DepositController.DeleteDeposit(jTableNewDeposits.getValueAt(i, 1).toString());
            displaytable();

        }
    }//GEN-LAST:event_jButtonNewDepositDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextBoxNewDepositAmount;
    private javax.swing.JButton jButtonNewDepositAdd;
    private javax.swing.JButton jButtonNewDepositClear;
    private javax.swing.JButton jButtonNewDepositDelete;
    private javax.swing.JButton jButtonNewDepositUpdate;
    private javax.swing.JButton jButtonNewDepsitRefresh;
    private javax.swing.JButton jButtonNewDepsitSearch;
    private static javax.swing.JComboBox jComboBoxNewDepositAccountNo;
    private static javax.swing.JComboBox jComboBoxNewdEpositSearch;
    private com.toedter.calendar.JDateChooser jDateChooserNewDepositDate;
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
    private static javax.swing.JTable jTableNewDeposits;
    // End of variables declaration//GEN-END:variables
}
