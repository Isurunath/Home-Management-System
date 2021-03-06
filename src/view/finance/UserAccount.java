/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package view.finance;

import controller.finance.AccountController;
import controller.finance.DepositController;
import controller.finance.WithdrawController;
import model.finance.Account;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.finance.Deposit;
import model.finance.Withdrawal;

/**
 *
 * @author saumya
 */
public class UserAccount extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserAccount
     */
    public UserAccount() {
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
    	List l = AccountController.LoadcomboList();
               
        for(Object o : l) {
            jComboBoxNewAccountSearch.addItem(o);
        }        
    }   
    
    /**
     * Load table data
     */
    public static void displaytable(){
  
    	jTableNewAccounts.setModel(AccountController.LoadAccountTable());
        HideColumns();
    }
    
    /**
     * Load search result
     */
    public static void displaySearch(){
          
          String searchAccount = jComboBoxNewAccountSearch.getSelectedItem().toString();
        
          //If user didn't select a group from the group combo box.
          if(searchAccount.equals("Select Acc No")){    
              
              displaytable();      
          }
             
          //If user selects a group from the group combo box.
          else{
              
              jTableNewAccounts.setModel(AccountController.displaySearchedAccountTable(searchAccount)); 
              HideColumns();
          }
      }
    
    public static void HideColumns(){
        
        //hide ID column in table 
            int i = 0;
            jTableNewAccounts.getColumnModel().getColumn(i).setWidth(0);
            jTableNewAccounts.getColumnModel().getColumn(i).setMinWidth(0);
            jTableNewAccounts.getColumnModel().getColumn(i).setMaxWidth(0);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jButtonNewAccountAdd = new javax.swing.JButton();
        jButtonNewAccountClear = new javax.swing.JButton();
        JTextBoxNewAccountNo = new javax.swing.JTextField();
        JTextBoxNewAccountHolderName = new javax.swing.JTextField();
        jComboBoxNewAccountType = new javax.swing.JComboBox();
        jTextBoxNewAccountBalance = new javax.swing.JTextField();
        jTextBoxNewAccountHoldingBank = new javax.swing.JTextField();
        jTextBoxNewAccountHoldingBranch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNewAccounts = new javax.swing.JTable();
        jButtonNewAccountDelete = new javax.swing.JButton();
        jButtonNewAccountUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxNewAccountSearch = new javax.swing.JComboBox();
        jButtonNewAccountSearch = new javax.swing.JButton();
        jButtonNewAccountRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1245, 590));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1245, 590));

        jLabel57.setBackground(new java.awt.Color(204, 204, 204));
        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 0, 102));
        jLabel57.setText("                                Add New Accounts");
        jLabel57.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        jPanel13.setBackground(new java.awt.Color(156, 190, 234));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setMinimumSize(new java.awt.Dimension(486, 374));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setText("Account No");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setText("Account Holder's Name");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setText("Account Type");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setText("Account Balance");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText("Account Holding Bank");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setText("Account Holding Branch");

        jButtonNewAccountAdd.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewAccountAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewAccountAdd.setForeground(new java.awt.Color(0, 0, 204));
        jButtonNewAccountAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/addBlue.png"))); // NOI18N
        jButtonNewAccountAdd.setText("ADD");
        jButtonNewAccountAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAccountAddActionPerformed(evt);
            }
        });

        jButtonNewAccountClear.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewAccountClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewAccountClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Broom-48.png"))); // NOI18N
        jButtonNewAccountClear.setText("CLEAR");
        jButtonNewAccountClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAccountClearActionPerformed(evt);
            }
        });

        JTextBoxNewAccountNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        JTextBoxNewAccountHolderName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jComboBoxNewAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Account Type", "Current Account", "Savings Account", "Fixed Deposit" }));
        jComboBoxNewAccountType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jTextBoxNewAccountBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jTextBoxNewAccountHoldingBank.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jTextBoxNewAccountHoldingBranch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel69)
                            .addComponent(jLabel68))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jButtonNewAccountClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jButtonNewAccountAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel64)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextBoxNewAccountHoldingBranch, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextBoxNewAccountHoldingBank, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextBoxNewAccountBalance, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxNewAccountType, javax.swing.GroupLayout.Alignment.LEADING, 0, 224, Short.MAX_VALUE)
                                .addComponent(JTextBoxNewAccountHolderName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTextBoxNewAccountNo, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextBoxNewAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextBoxNewAccountHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxNewAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBoxNewAccountBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBoxNewAccountHoldingBank, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBoxNewAccountHoldingBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewAccountClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewAccountAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(619, 374));

        jTableNewAccounts.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableNewAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewAccountsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableNewAccounts);

        jButtonNewAccountDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewAccountDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewAccountDelete.setForeground(new java.awt.Color(255, 0, 0));
        jButtonNewAccountDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/deleteRed.png"))); // NOI18N
        jButtonNewAccountDelete.setText("REMOVE");
        jButtonNewAccountDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAccountDeleteActionPerformed(evt);
            }
        });

        jButtonNewAccountUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewAccountUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewAccountUpdate.setForeground(new java.awt.Color(255, 204, 0));
        jButtonNewAccountUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/updateYelllow.png"))); // NOI18N
        jButtonNewAccountUpdate.setText("UPDATE");
        jButtonNewAccountUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAccountUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Account No");

        jComboBoxNewAccountSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Acc No" }));
        jComboBoxNewAccountSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jComboBoxNewAccountSearchMouseReleased(evt);
            }
        });

        jButtonNewAccountSearch.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewAccountSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewAccountSearch.setForeground(new java.awt.Color(255, 153, 0));
        jButtonNewAccountSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Search-48 (1).png"))); // NOI18N
        jButtonNewAccountSearch.setText("SEARCH");
        jButtonNewAccountSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAccountSearchActionPerformed(evt);
            }
        });

        jButtonNewAccountRefresh.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewAccountRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewAccountRefresh.setForeground(new java.awt.Color(0, 204, 0));
        jButtonNewAccountRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Refresh-48 (1).png"))); // NOI18N
        jButtonNewAccountRefresh.setText("REFRESH");
        jButtonNewAccountRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewAccountRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxNewAccountSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNewAccountSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNewAccountRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNewAccountUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNewAccountDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewAccountRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewAccountSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNewAccountSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewAccountUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewAccountDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("                                                                      Account list");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewAccountAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAccountAddActionPerformed
        //add values to database
        try{
            String accNo;             //account number
            String accHolderName;     //account holder's name
            String accType;           //account type
            String accBalance;        //account balance
            String accHoldingBank;    //account holding bank name
            String accHoldingBranch;  //account holding bank's branch name

            accNo = JTextBoxNewAccountNo.getText();
            accHolderName = JTextBoxNewAccountHolderName.getText();
            accType = jComboBoxNewAccountType.getSelectedItem().toString();
            accBalance = jTextBoxNewAccountBalance.getText();
            accHoldingBank = jTextBoxNewAccountHoldingBank.getText();
            accHoldingBranch = jTextBoxNewAccountHoldingBranch.getText();

            Account newAccount = new Account();
            newAccount.setAccNo(accNo);
            newAccount.setAccHolderName(accHolderName);
            newAccount.setAccType(accType);
            newAccount.setAccBalance(accBalance);
            newAccount.setAccHoldingBank(accHoldingBank);
            newAccount.setAccHoldingBranch(accHoldingBranch);
            
            long count = AccountController.CountAccountNo(accNo);
            
            if(count > 0)
            {
                 JOptionPane.showMessageDialog(null, "This Account number all ready inserted!!");
            }
            
            if(count == 0)
            {
                AccountController.addAccount(newAccount);
                 
                Withdrawal wit = new Withdrawal();
                wit.setAccNo(accNo);
                wit.setWithdrawAmount("0");
                
                WithdrawController.addWithdraw(wit);
                
                Deposit dep = new Deposit();
                dep.setAccNo(accNo);
                dep.setDepositAmount("0");
                
                DepositController.addDeposit(dep);
                                 
            }

           
        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
             
        displaytable();
        
        JTextBoxNewAccountNo.setText("");
        JTextBoxNewAccountHolderName.setText("");
        jComboBoxNewAccountType.setSelectedItem("Select Account Type");
        jTextBoxNewAccountBalance.setText("");
        jTextBoxNewAccountHoldingBank.setText("");
        jTextBoxNewAccountHoldingBranch.setText("");
        
    }//GEN-LAST:event_jButtonNewAccountAddActionPerformed

    private void jButtonNewAccountClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAccountClearActionPerformed
        //clear textboxes
        JTextBoxNewAccountNo.setText("");
        JTextBoxNewAccountHolderName.setText("");
        jComboBoxNewAccountType.setSelectedItem("Select Account Type");
        jTextBoxNewAccountBalance.setText("");
        jTextBoxNewAccountHoldingBank.setText("");
        jTextBoxNewAccountHoldingBranch.setText("");
    }//GEN-LAST:event_jButtonNewAccountClearActionPerformed

    private void jButtonNewAccountDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAccountDeleteActionPerformed
       //delete accounts
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {

            int i = jTableNewAccounts.getSelectedRow();
            AccountController.DeleteAccount(jTableNewAccounts.getValueAt(i, 1).toString());
            WithdrawController.DeleteWithdraw(jTableNewAccounts.getValueAt(i, 1).toString());
            DepositController.DeleteDeposit(jTableNewAccounts.getValueAt(i, 1).toString());
            displaytable();

        }
    }//GEN-LAST:event_jButtonNewAccountDeleteActionPerformed

    private void jButtonNewAccountUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAccountUpdateActionPerformed

     //update account data        
       int response = JOptionPane.showConfirmDialog(null, "Do you really want to update?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

      if (response == JOptionPane.YES_OPTION) {
            
       
        int i = jTableNewAccounts.getSelectedRow();
        String ID = jTableNewAccounts.getValueAt(i, 0).toString();

        String accNo;             //account number
        String accHolderName;     //account holder's name
        String accType;           //account type
        String accBalance;        //account balance
        String accHoldingBank;    //account holding bank name
        String accHoldingBranch;  //account holding bank's branch name

        accNo = JTextBoxNewAccountNo.getText();
        accHolderName = JTextBoxNewAccountHolderName.getText();
        accType = jComboBoxNewAccountType.getSelectedItem().toString();
        accBalance = jTextBoxNewAccountBalance.getText();
        accHoldingBank = jTextBoxNewAccountHoldingBank.getText();
        accHoldingBranch = jTextBoxNewAccountHoldingBranch.getText();
        
        
        if(accNo.equals(jTableNewAccounts.getValueAt(i, 1).toString()))
        {       
            Account account = new Account();
            account.setAccId(Integer.parseInt(ID));
            account.setAccNo(accNo);
            account.setAccHolderName(accHolderName);
            account.setAccType(accType);
            account.setAccBalance(accBalance);
            account.setAccHoldingBank(accHoldingBank);
            account.setAccHoldingBranch(accHoldingBranch);

            AccountController.updateAccount(account);
        
            displaytable();
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Account Number cannot be edited!! Please try to edit other details without account number!");
        }
        
      } 
      
    }//GEN-LAST:event_jButtonNewAccountUpdateActionPerformed

    private void jButtonNewAccountSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAccountSearchActionPerformed
      displaySearch();
    }//GEN-LAST:event_jButtonNewAccountSearchActionPerformed

    private void jButtonNewAccountRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewAccountRefreshActionPerformed
        displaytable();
    }//GEN-LAST:event_jButtonNewAccountRefreshActionPerformed

    private void jComboBoxNewAccountSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxNewAccountSearchMouseReleased
       
    }//GEN-LAST:event_jComboBoxNewAccountSearchMouseReleased

    private void jTableNewAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewAccountsMouseClicked
        
        int i = jTableNewAccounts.getSelectedRow();

        JTextBoxNewAccountNo.setText(jTableNewAccounts.getValueAt(i, 1).toString());
        JTextBoxNewAccountHolderName.setText(jTableNewAccounts.getValueAt(i, 2).toString());
        jComboBoxNewAccountType.setSelectedItem(jTableNewAccounts.getValueAt(i, 3).toString());
        jTextBoxNewAccountBalance.setText(jTableNewAccounts.getValueAt(i, 4).toString());
        jTextBoxNewAccountHoldingBank.setText(jTableNewAccounts.getValueAt(i, 5).toString());
        jTextBoxNewAccountHoldingBranch.setText(jTableNewAccounts.getValueAt(i, 6).toString());
    }//GEN-LAST:event_jTableNewAccountsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextBoxNewAccountHolderName;
    private javax.swing.JTextField JTextBoxNewAccountNo;
    private javax.swing.JButton jButtonNewAccountAdd;
    private javax.swing.JButton jButtonNewAccountClear;
    private javax.swing.JButton jButtonNewAccountDelete;
    private javax.swing.JButton jButtonNewAccountRefresh;
    private javax.swing.JButton jButtonNewAccountSearch;
    private javax.swing.JButton jButtonNewAccountUpdate;
    private static javax.swing.JComboBox jComboBoxNewAccountSearch;
    private javax.swing.JComboBox jComboBoxNewAccountType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTableNewAccounts;
    private javax.swing.JTextField jTextBoxNewAccountBalance;
    private javax.swing.JTextField jTextBoxNewAccountHoldingBank;
    private javax.swing.JTextField jTextBoxNewAccountHoldingBranch;
    // End of variables declaration//GEN-END:variables
}
