
package view.finance;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class FinanceDetail extends javax.swing.JInternalFrame {

    
    public FinanceDetail() {
        initComponents();
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CreditCardsPanel = new javax.swing.JPanel();
        CreditCards = new javax.swing.JButton();
        AccountsPanel = new javax.swing.JPanel();
        Accounts = new javax.swing.JButton();
        BillsPanel = new javax.swing.JPanel();
        Bills = new javax.swing.JButton();
        IncomePanel = new javax.swing.JPanel();
        Incomes = new javax.swing.JButton();
        ExpensePanel = new javax.swing.JPanel();
        Expenses = new javax.swing.JButton();
        SalaryPanel = new javax.swing.JPanel();
        Salary = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1370, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1175, 70));

        CreditCardsPanel.setBackground(new java.awt.Color(102, 0, 102));
        CreditCardsPanel.setPreferredSize(new java.awt.Dimension(113, 82));

        CreditCards.setBackground(new java.awt.Color(204, 204, 204));
        CreditCards.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Bank Cards-48.png"))); // NOI18N
        CreditCards.setText("CREDIT CARD");
        CreditCards.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CreditCards.setPreferredSize(new java.awt.Dimension(101, 64));
        CreditCards.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CreditCards.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreditCardsPanelLayout = new javax.swing.GroupLayout(CreditCardsPanel);
        CreditCardsPanel.setLayout(CreditCardsPanelLayout);
        CreditCardsPanelLayout.setHorizontalGroup(
            CreditCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreditCardsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CreditCards, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        CreditCardsPanelLayout.setVerticalGroup(
            CreditCardsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreditCardsPanelLayout.createSequentialGroup()
                .addComponent(CreditCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        AccountsPanel.setBackground(new java.awt.Color(102, 0, 102));
        AccountsPanel.setPreferredSize(new java.awt.Dimension(113, 82));

        Accounts.setBackground(new java.awt.Color(204, 204, 204));
        Accounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Coins-48.png"))); // NOI18N
        Accounts.setText("ACCOUNTS");
        Accounts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Accounts.setPreferredSize(new java.awt.Dimension(101, 57));
        Accounts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AccountsPanelLayout = new javax.swing.GroupLayout(AccountsPanel);
        AccountsPanel.setLayout(AccountsPanelLayout);
        AccountsPanelLayout.setHorizontalGroup(
            AccountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Accounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AccountsPanelLayout.setVerticalGroup(
            AccountsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountsPanelLayout.createSequentialGroup()
                .addComponent(Accounts, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addContainerGap())
        );

        BillsPanel.setBackground(new java.awt.Color(102, 0, 102));
        BillsPanel.setPreferredSize(new java.awt.Dimension(113, 68));

        Bills.setBackground(new java.awt.Color(204, 204, 204));
        Bills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Bill-48.png"))); // NOI18N
        Bills.setText("BILLS");
        Bills.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Bills.setPreferredSize(new java.awt.Dimension(101, 64));
        Bills.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Bills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BillsPanelLayout = new javax.swing.GroupLayout(BillsPanel);
        BillsPanel.setLayout(BillsPanelLayout);
        BillsPanelLayout.setHorizontalGroup(
            BillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BillsPanelLayout.setVerticalGroup(
            BillsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillsPanelLayout.createSequentialGroup()
                .addComponent(Bills, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        IncomePanel.setBackground(new java.awt.Color(102, 0, 102));
        IncomePanel.setPreferredSize(new java.awt.Dimension(113, 68));

        Incomes.setBackground(new java.awt.Color(204, 204, 204));
        Incomes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Money Bag-48.png"))); // NOI18N
        Incomes.setText("INCOMES");
        Incomes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Incomes.setPreferredSize(new java.awt.Dimension(101, 57));
        Incomes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Incomes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncomesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IncomePanelLayout = new javax.swing.GroupLayout(IncomePanel);
        IncomePanel.setLayout(IncomePanelLayout);
        IncomePanelLayout.setHorizontalGroup(
            IncomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Incomes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IncomePanelLayout.setVerticalGroup(
            IncomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomePanelLayout.createSequentialGroup()
                .addComponent(Incomes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ExpensePanel.setBackground(new java.awt.Color(102, 0, 102));
        ExpensePanel.setPreferredSize(new java.awt.Dimension(113, 68));

        Expenses.setBackground(new java.awt.Color(204, 204, 204));
        Expenses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Banknotes-48.png"))); // NOI18N
        Expenses.setText("EXPENSES");
        Expenses.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Expenses.setPreferredSize(new java.awt.Dimension(101, 57));
        Expenses.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpensesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExpensePanelLayout = new javax.swing.GroupLayout(ExpensePanel);
        ExpensePanel.setLayout(ExpensePanelLayout);
        ExpensePanelLayout.setHorizontalGroup(
            ExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ExpensePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Expenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ExpensePanelLayout.setVerticalGroup(
            ExpensePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpensePanelLayout.createSequentialGroup()
                .addComponent(Expenses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        SalaryPanel.setBackground(new java.awt.Color(102, 0, 102));
        SalaryPanel.setPreferredSize(new java.awt.Dimension(113, 68));

        Salary.setBackground(new java.awt.Color(204, 204, 204));
        Salary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Wallet-48.png"))); // NOI18N
        Salary.setText("SALARY");
        Salary.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Salary.setPreferredSize(new java.awt.Dimension(101, 64));
        Salary.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SalaryPanelLayout = new javax.swing.GroupLayout(SalaryPanel);
        SalaryPanel.setLayout(SalaryPanelLayout);
        SalaryPanelLayout.setHorizontalGroup(
            SalaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Salary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SalaryPanelLayout.setVerticalGroup(
            SalaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalaryPanelLayout.createSequentialGroup()
                .addComponent(Salary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalaryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(CreditCardsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(BillsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(ExpensePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(IncomePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(AccountsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AccountsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CreditCardsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BillsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IncomePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExpensePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SalaryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 127, 613));

        jDesktopPane2.setPreferredSize(new java.awt.Dimension(1185, 700));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1250, 613));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreditCardsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardsActionPerformed
        CreditCardsPanel.setBackground(new Color (255,255,255));

        AccountsPanel.setBackground(new Color (102,0,102));
        BillsPanel.setBackground(new Color (102,0,102));
        IncomePanel.setBackground(new Color (102,0,102));
        ExpensePanel.setBackground(new Color (102,0,102));
        SalaryPanel.setBackground(new Color (102,0,102));
        
        
        jDesktopPane2.removeAll();
        UserCreditCards uc1 = new UserCreditCards();
        jDesktopPane2.add(uc1).setVisible(true);
    }//GEN-LAST:event_CreditCardsActionPerformed

    private void AccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountsActionPerformed
       
        AccountsPanel.setBackground(new Color (255,255,255));

        CreditCardsPanel.setBackground(new Color (102,0,102));
        BillsPanel.setBackground(new Color (102,0,102));
        IncomePanel.setBackground(new Color (102,0,102));
        ExpensePanel.setBackground(new Color (102,0,102));
        SalaryPanel.setBackground(new Color (102,0,102));
        
        jDesktopPane2.removeAll();
        AccountHandle a1 = new AccountHandle();
        jDesktopPane2.add(a1).setVisible(true);
    }//GEN-LAST:event_AccountsActionPerformed

    private void IncomesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncomesActionPerformed
        IncomePanel.setBackground(new Color (255,255,255));

        AccountsPanel.setBackground(new Color (102,0,102));
        CreditCardsPanel.setBackground(new Color (102,0,102));
        BillsPanel.setBackground(new Color (102,0,102));
        ExpensePanel.setBackground(new Color (102,0,102));
        SalaryPanel.setBackground(new Color (102,0,102));
        
        jDesktopPane2.removeAll();
        UserIncomes in = new UserIncomes();
        jDesktopPane2.add(in).setVisible(true);
    }//GEN-LAST:event_IncomesActionPerformed

    private void BillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillsActionPerformed
        BillsPanel.setBackground(new Color (255,255,255));

        AccountsPanel.setBackground(new Color (102,0,102));
        CreditCardsPanel.setBackground(new Color (102,0,102));
        IncomePanel.setBackground(new Color (102,0,102));
        ExpensePanel.setBackground(new Color (102,0,102));
        SalaryPanel.setBackground(new Color (102,0,102));
        
        jDesktopPane2.removeAll();
        UserBills ub = new UserBills();
        jDesktopPane2.add(ub).setVisible(true);
       
    }//GEN-LAST:event_BillsActionPerformed

    private void ExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpensesActionPerformed
        ExpensePanel.setBackground(new Color (255,255,255));

        AccountsPanel.setBackground(new Color (102,0,102));
        CreditCardsPanel.setBackground(new Color (102,0,102));
        BillsPanel.setBackground(new Color (102,0,102));
        IncomePanel.setBackground(new Color (102,0,102));        
        SalaryPanel.setBackground(new Color (102,0,102));
        
        jDesktopPane2.removeAll();
        UserExpenses ue = new UserExpenses();
        jDesktopPane2.add(ue).setVisible(true);
    }//GEN-LAST:event_ExpensesActionPerformed

    private void SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryActionPerformed
        SalaryPanel.setBackground(new Color (255,255,255));

        AccountsPanel.setBackground(new Color (102,0,102));
        CreditCardsPanel.setBackground(new Color (102,0,102));
        BillsPanel.setBackground(new Color (102,0,102));
        IncomePanel.setBackground(new Color (102,0,102));        
        ExpensePanel.setBackground(new Color (102,0,102));
        
        jDesktopPane2.removeAll();
        UserSalary us = new UserSalary();
        jDesktopPane2.add(us).setVisible(true);
    }//GEN-LAST:event_SalaryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Accounts;
    private javax.swing.JPanel AccountsPanel;
    private javax.swing.JButton Bills;
    private javax.swing.JPanel BillsPanel;
    private javax.swing.JButton CreditCards;
    private javax.swing.JPanel CreditCardsPanel;
    private javax.swing.JPanel ExpensePanel;
    private javax.swing.JButton Expenses;
    private javax.swing.JPanel IncomePanel;
    private javax.swing.JButton Incomes;
    private javax.swing.JButton Salary;
    private javax.swing.JPanel SalaryPanel;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
