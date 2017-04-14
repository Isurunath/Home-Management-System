
package view.finance;


import controller.finance.AccountController;
import controller.finance.WithdrawController;
import model.finance.Withdrawal;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.finance.Account;


public class UserWithdrawals extends javax.swing.JInternalFrame {

    public UserWithdrawals() {
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
    	List l = WithdrawController.LoadcomboList();
               
        for(Object o : l) {
            jComboBoxNewWithdrawSearch.addItem(o);
        }        
    }  
    
    /**
     * Load withdrawal account number combo box
     */
    public static void loadcomboaccNo(){
    	List l = WithdrawController.LoadcomboList();
               
        for(Object o : l) {
            jComboBoxNewWithdrawAccountNo.addItem(o);
        }        
    }  
    
     /**
     * Load table data
     */   
     public static void displaytable(){
       	
        jTableNewWithdrawals.setModel(WithdrawController.LoadWithdrawTable());
        HideColumns();      
    }
    
     /**
     * Load search results
     */
    public static void displaySearch(){
          
          String dsearch = jComboBoxNewWithdrawSearch.getSelectedItem().toString();
        
          //If user didn't select a group from the group combo box.
          if(dsearch.equals("Select Acc No")){    
              
              displaytable();      
          }
             
          //If user selects a group from the group combo box.
          else{
              
              jTableNewWithdrawals.setModel(WithdrawController.displaySearchedWithdrawTable(dsearch)); 
              HideColumns();
          }
      }
    
    public static void HideColumns(){
        
        //hide ID column in table 
            int i = 0;
            jTableNewWithdrawals.getColumnModel().getColumn(i).setWidth(0);
            jTableNewWithdrawals.getColumnModel().getColumn(i).setMinWidth(0);
            jTableNewWithdrawals.getColumnModel().getColumn(i).setMaxWidth(0);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        JTextBoxNewWithdrawAmount = new javax.swing.JTextField();
        jComboBoxNewWithdrawAccountNo = new javax.swing.JComboBox();
        jButtonNewWithdrawAdd = new javax.swing.JButton();
        jButtonNewWthdrawClear = new javax.swing.JButton();
        jDateChooserNewWithdrawDate = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableNewWithdrawals = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxNewWithdrawSearch = new javax.swing.JComboBox();
        jButtonNewWithdrawSearch = new javax.swing.JButton();
        jButtonNewWithdrawRefresh = new javax.swing.JButton();
        jButtonNewWithdrawUpdate = new javax.swing.JButton();
        jButtonNewWithdrawDelete = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1245, 640));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(156, 190, 234));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setMinimumSize(new java.awt.Dimension(486, 374));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Account No");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Withdrawal Amount");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Withdrawal Date");

        JTextBoxNewWithdrawAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jComboBoxNewWithdrawAccountNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Account No" }));
        jComboBoxNewWithdrawAccountNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButtonNewWithdrawAdd.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewWithdrawAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewWithdrawAdd.setForeground(new java.awt.Color(0, 0, 204));
        jButtonNewWithdrawAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/addBlue.png"))); // NOI18N
        jButtonNewWithdrawAdd.setText("ADD");
        jButtonNewWithdrawAdd.setPreferredSize(new java.awt.Dimension(140, 35));
        jButtonNewWithdrawAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewWithdrawAddActionPerformed(evt);
            }
        });

        jButtonNewWthdrawClear.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewWthdrawClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewWthdrawClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Broom-48.png"))); // NOI18N
        jButtonNewWthdrawClear.setText("CLEAR");
        jButtonNewWthdrawClear.setPreferredSize(new java.awt.Dimension(140, 35));
        jButtonNewWthdrawClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewWthdrawClearActionPerformed(evt);
            }
        });

        jDateChooserNewWithdrawDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooserNewWithdrawDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addComponent(jComboBoxNewWithdrawAccountNo, 0, 190, Short.MAX_VALUE)
                            .addComponent(JTextBoxNewWithdrawAmount)
                            .addComponent(jDateChooserNewWithdrawDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonNewWthdrawClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButtonNewWithdrawAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNewWithdrawAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextBoxNewWithdrawAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserNewWithdrawDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewWithdrawAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewWthdrawClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(619, 374));

        jTableNewWithdrawals.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableNewWithdrawals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewWithdrawalsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableNewWithdrawals);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Account No");

        jComboBoxNewWithdrawSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Acc No" }));

        jButtonNewWithdrawSearch.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewWithdrawSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewWithdrawSearch.setForeground(new java.awt.Color(255, 102, 0));
        jButtonNewWithdrawSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Search-48 (1).png"))); // NOI18N
        jButtonNewWithdrawSearch.setText("SEARCH");
        jButtonNewWithdrawSearch.setPreferredSize(new java.awt.Dimension(140, 35));
        jButtonNewWithdrawSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewWithdrawSearchActionPerformed(evt);
            }
        });

        jButtonNewWithdrawRefresh.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewWithdrawRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewWithdrawRefresh.setForeground(new java.awt.Color(0, 153, 51));
        jButtonNewWithdrawRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Refresh-48 (1).png"))); // NOI18N
        jButtonNewWithdrawRefresh.setText("REFRESH");
        jButtonNewWithdrawRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewWithdrawRefreshActionPerformed(evt);
            }
        });

        jButtonNewWithdrawUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewWithdrawUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewWithdrawUpdate.setForeground(new java.awt.Color(255, 204, 0));
        jButtonNewWithdrawUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/updateYelllow.png"))); // NOI18N
        jButtonNewWithdrawUpdate.setText("UPDATE");
        jButtonNewWithdrawUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewWithdrawUpdateActionPerformed(evt);
            }
        });

        jButtonNewWithdrawDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewWithdrawDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewWithdrawDelete.setForeground(new java.awt.Color(255, 0, 0));
        jButtonNewWithdrawDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/deleteRed.png"))); // NOI18N
        jButtonNewWithdrawDelete.setText("REMOVE");
        jButtonNewWithdrawDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewWithdrawDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxNewWithdrawSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonNewWithdrawSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonNewWithdrawRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNewWithdrawUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonNewWithdrawDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewWithdrawRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewWithdrawSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNewWithdrawSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewWithdrawDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewWithdrawUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel58.setBackground(new java.awt.Color(204, 204, 204));
        jLabel58.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 0, 102));
        jLabel58.setText("                   Add New Withdraw Details");
        jLabel58.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("                                                                 Withdrawal Detail List");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableNewWithdrawalsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewWithdrawalsMouseClicked

        int i = jTableNewWithdrawals.getSelectedRow();

        jComboBoxNewWithdrawAccountNo.setSelectedItem(jTableNewWithdrawals.getValueAt(i, 1).toString());
        JTextBoxNewWithdrawAmount.setText(jTableNewWithdrawals.getValueAt(i, 2).toString());
        ((JTextField)jDateChooserNewWithdrawDate.getDateEditor().getUiComponent()).setText(jTableNewWithdrawals.getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTableNewWithdrawalsMouseClicked

    private void jButtonNewWithdrawSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewWithdrawSearchActionPerformed
        displaySearch();
    }//GEN-LAST:event_jButtonNewWithdrawSearchActionPerformed

    private void jButtonNewWithdrawRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewWithdrawRefreshActionPerformed
        displaytable();
    }//GEN-LAST:event_jButtonNewWithdrawRefreshActionPerformed

    private void jButtonNewWithdrawUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewWithdrawUpdateActionPerformed

        int response = JOptionPane.showConfirmDialog(null, "Do you really want to update?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
        
        int i = jTableNewWithdrawals.getSelectedRow();
        String ID = jTableNewWithdrawals.getValueAt(i, 0).toString();
          
        String accNo;             
        String withdrawAmount;    
        Date withdrawDate;        
        
        accNo = jComboBoxNewWithdrawAccountNo.getSelectedItem().toString();
        withdrawAmount = JTextBoxNewWithdrawAmount.getText();
        withdrawDate = jDateChooserNewWithdrawDate.getDate();
                  
        if(accNo.equals(jTableNewWithdrawals.getValueAt(i, 1).toString()))
        {
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
                    int witAmt = Integer.parseInt(withdrawAmount);
                    
                    if(witAmt > accBalance)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry!! Withdraw amount is larger that account balance!");
                    }  
                    
                    if(witAmt < accBalance)
                    {
                    
                        Withdrawal newWit = new Withdrawal();
                        newWit.setWitId(Integer.parseInt(ID));
                        newWit.setAccNo(accNo);
                        newWit.setWithdrawAmount(withdrawAmount);
                        newWit.setWithdrawDate(withdrawDate);
       
                        WithdrawController.updateWithdraw(newWit);
            
                          
                        int tot = accBalance - witAmt;
                        String totS = String.valueOf(tot);
                         
                        String totalBal = (totS);
                    
                        ac.setAccId(Integer.parseInt(accId));
                        ac.setAccNo(accno);
                        ac.setAccHolderName(accHoldrName);
                        ac.setAccType(accType);
                        ac.setAccBalance(totalBal);
                        ac.setAccHoldingBank(accHoldBank);
                        ac.setAccHoldingBranch(accHoldBranch);
                        
                        AccountController.updateAccount(ac);
                    
                    }         
                }
                
                
            }
       
            displaytable();
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Account Number cannot be edited!! Please try to edit other details without account number!");
        }
        
      }
    }//GEN-LAST:event_jButtonNewWithdrawUpdateActionPerformed

    private void jButtonNewWithdrawAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewWithdrawAddActionPerformed

        try{
            String accNo;             //account no
            String withdrawAmount;    //withdraw amount
            Date withdrawDate;         //withdrwa date  

            accNo = jComboBoxNewWithdrawAccountNo.getSelectedItem().toString();
            withdrawAmount = JTextBoxNewWithdrawAmount.getText();
            withdrawDate = jDateChooserNewWithdrawDate.getDate();
          
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
                    int witAmt = Integer.parseInt(withdrawAmount);
                    
                    if(witAmt > accBalance)
                    {
                        JOptionPane.showMessageDialog(null, "Sorry!! Withdraw amount is larger that account balance!");
                    }  
                    
                    if(witAmt < accBalance)
                    {
                    
                        Withdrawal newWit = new Withdrawal();
                        newWit.setAccNo(accNo);
                        newWit.setWithdrawAmount(withdrawAmount);
                        newWit.setWithdrawDate(withdrawDate);
       
                        WithdrawController.addWithdraw(newWit);
            
                          
                        int tot = accBalance - witAmt;
                        String totS = String.valueOf(tot);
                         
                        String totalBal = (totS);
                    
                        ac.setAccId(Integer.parseInt(accId));
                        ac.setAccNo(accno);
                        ac.setAccHolderName(accHoldrName);
                        ac.setAccType(accType);
                        ac.setAccBalance(totalBal);
                        ac.setAccHoldingBank(accHoldBank);
                        ac.setAccHoldingBranch(accHoldBranch);
                        
                        AccountController.updateAccount(ac);
                    
                    }         
                }
            }
                
            
        
        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }

        displaytable();
        
         jComboBoxNewWithdrawAccountNo.setSelectedItem("Select Account No");
        JTextBoxNewWithdrawAmount.setText("");
        ((JTextField)jDateChooserNewWithdrawDate.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_jButtonNewWithdrawAddActionPerformed

    private void jButtonNewWthdrawClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewWthdrawClearActionPerformed

        jComboBoxNewWithdrawAccountNo.setSelectedItem("Select Account No");
        JTextBoxNewWithdrawAmount.setText("");
        ((JTextField)jDateChooserNewWithdrawDate.getDateEditor().getUiComponent()).setText("");
    }//GEN-LAST:event_jButtonNewWthdrawClearActionPerformed

    private void jButtonNewWithdrawDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewWithdrawDeleteActionPerformed
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {

            int i = jTableNewWithdrawals.getSelectedRow();
            WithdrawController.DeleteWithdraw(jTableNewWithdrawals.getValueAt(i, 1).toString());
            displaytable();

        }
    }//GEN-LAST:event_jButtonNewWithdrawDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextBoxNewWithdrawAmount;
    private javax.swing.JButton jButtonNewWithdrawAdd;
    private javax.swing.JButton jButtonNewWithdrawDelete;
    private javax.swing.JButton jButtonNewWithdrawRefresh;
    private javax.swing.JButton jButtonNewWithdrawSearch;
    private javax.swing.JButton jButtonNewWithdrawUpdate;
    private javax.swing.JButton jButtonNewWthdrawClear;
    private static javax.swing.JComboBox jComboBoxNewWithdrawAccountNo;
    private static javax.swing.JComboBox jComboBoxNewWithdrawSearch;
    private com.toedter.calendar.JDateChooser jDateChooserNewWithdrawDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTableNewWithdrawals;
    // End of variables declaration//GEN-END:variables
}
