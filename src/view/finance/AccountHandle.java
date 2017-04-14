
package view.finance;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;


public class AccountHandle extends javax.swing.JInternalFrame {

    
    public AccountHandle() {
        initComponents();
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        NewAccountPanel = new javax.swing.JPanel();
        jButtonAccounts = new javax.swing.JButton();
        NewWithdrawPanel = new javax.swing.JPanel();
        jButtonWithdrawals = new javax.swing.JButton();
        NewDepositPanel = new javax.swing.JPanel();
        jButtonDeposits = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1245, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1245, 640));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1250, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1250, 610));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1245, 64));

        NewAccountPanel.setBackground(new java.awt.Color(102, 0, 102));

        jButtonAccounts.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Money Transfer-48.png"))); // NOI18N
        jButtonAccounts.setText("Accounts");
        jButtonAccounts.setToolTipText("");
        jButtonAccounts.setActionCommand("Account ");
        jButtonAccounts.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonAccounts.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonAccounts.setPreferredSize(new java.awt.Dimension(199, 44));
        jButtonAccounts.setVerifyInputWhenFocusTarget(false);
        jButtonAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccountsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewAccountPanelLayout = new javax.swing.GroupLayout(NewAccountPanel);
        NewAccountPanel.setLayout(NewAccountPanelLayout);
        NewAccountPanelLayout.setHorizontalGroup(
            NewAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewAccountPanelLayout.setVerticalGroup(
            NewAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewAccountPanelLayout.createSequentialGroup()
                .addComponent(jButtonAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        NewWithdrawPanel.setBackground(new java.awt.Color(102, 0, 102));

        jButtonWithdrawals.setBackground(new java.awt.Color(204, 204, 204));
        jButtonWithdrawals.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/ATM-48.png"))); // NOI18N
        jButtonWithdrawals.setText("Withdrawals");
        jButtonWithdrawals.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonWithdrawals.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonWithdrawals.setPreferredSize(new java.awt.Dimension(199, 44));
        jButtonWithdrawals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWithdrawalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewWithdrawPanelLayout = new javax.swing.GroupLayout(NewWithdrawPanel);
        NewWithdrawPanel.setLayout(NewWithdrawPanelLayout);
        NewWithdrawPanelLayout.setHorizontalGroup(
            NewWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewWithdrawPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewWithdrawPanelLayout.setVerticalGroup(
            NewWithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewWithdrawPanelLayout.createSequentialGroup()
                .addComponent(jButtonWithdrawals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        NewDepositPanel.setBackground(new java.awt.Color(102, 0, 102));

        jButtonDeposits.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDeposits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Money Box-48.png"))); // NOI18N
        jButtonDeposits.setText("Deposits");
        jButtonDeposits.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButtonDeposits.setPreferredSize(new java.awt.Dimension(199, 44));
        jButtonDeposits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDepositsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NewDepositPanelLayout = new javax.swing.GroupLayout(NewDepositPanel);
        NewDepositPanel.setLayout(NewDepositPanelLayout);
        NewDepositPanelLayout.setHorizontalGroup(
            NewDepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewDepositPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonDeposits, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NewDepositPanelLayout.setVerticalGroup(
            NewDepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewDepositPanelLayout.createSequentialGroup()
                .addComponent(jButtonDeposits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(NewAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(NewWithdrawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(NewDepositPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(832, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NewDepositPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewWithdrawPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NewAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1510, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccountsActionPerformed
   
        NewAccountPanel.setBackground(new Color (255,255,255));

        NewWithdrawPanel.setBackground(new Color (102,0,102));
        NewDepositPanel.setBackground(new Color (102,0,102));
        
        jDesktopPane1.removeAll();
        UserAccount ua = new UserAccount();
        jDesktopPane1.add(ua).setVisible(true);
    }//GEN-LAST:event_jButtonAccountsActionPerformed

    private void jButtonWithdrawalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWithdrawalsActionPerformed
        NewWithdrawPanel.setBackground(new Color (255,255,255));

        NewAccountPanel.setBackground(new Color (102,0,102));
        NewDepositPanel.setBackground(new Color (102,0,102));
        
        jDesktopPane1.removeAll();
        UserWithdrawals w1 = new UserWithdrawals();
        jDesktopPane1.add(w1).setVisible(true);
    }//GEN-LAST:event_jButtonWithdrawalsActionPerformed

    private void jButtonDepositsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDepositsActionPerformed
        NewDepositPanel.setBackground(new Color (255,255,255));

        NewAccountPanel.setBackground(new Color (102,0,102));
        NewWithdrawPanel.setBackground(new Color (102,0,102));
        
        jDesktopPane1.removeAll();
        UserDeposits d1 = new UserDeposits();
        jDesktopPane1.add(d1).setVisible(true);
    }//GEN-LAST:event_jButtonDepositsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NewAccountPanel;
    private javax.swing.JPanel NewDepositPanel;
    private javax.swing.JPanel NewWithdrawPanel;
    private javax.swing.JButton jButtonAccounts;
    private javax.swing.JButton jButtonDeposits;
    private javax.swing.JButton jButtonWithdrawals;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
