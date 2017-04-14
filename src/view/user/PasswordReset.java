/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package view.user;

import controllers.user.RegisterController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import model.user.Userregister;

/**
 *
 * PasswordReset -- Interface for resetting the password of a user
 * @author Nimanthika
 * 
 */
public class PasswordReset extends javax.swing.JFrame {

    /**
     * Creates new form PasswordReset
     */
    public PasswordReset() {
        initComponents();
        
        this.getContentPane().setBackground( Color.white );
        
        //set form in the middle of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    
    /**
     * Method to get security question for a given username & set it in the SecQue label
     * @param username
     */
    public void SetSecQuestion(String username){
   
        String SecQuestion = RegisterController.GetSecQuestion(username);
        
        SecurityQLabel.setText(SecQuestion);
    }
    
    
    /**
     * Method to get security question for a given username & set in the SecQue label
     * @param username
     * @return 
     */
    public String getAnswer(String username){
   
        String answer = RegisterController.GetAnswer(username);
        
        return answer;
    }
    
    
    /**
     * Method to reset password
     */
    public void ResetPassword(){
        
        //Save the user inserted values, inside variables.
        String username = UsernameTextField.getText();
        String answer = AnswerTextField.getText();
        
        char[] psw= NewPasswordTextField.getPassword();
        String newPassword= new String (psw);
        
        char[] cnpsw= ConfirmPasswordTextField.getPassword();
        String confirmPassword= new String (cnpsw);

        Long count = RegisterController.countUsername(username);
        
        String answerFromDB = getAnswer(username);
        
        if(count==0){
        
            JOptionPane.showMessageDialog(null, "Invalid username! Please enter your valid username");
            UsernameTextField.setText(null);
        }

        else if(!answer.equals(answerFromDB)){
        
            JOptionPane.showMessageDialog(null, "Incorrect answer! Please try again");
            AnswerTextField.setText(null);
        }
        
        else if(!newPassword.equals(confirmPassword)){
            
            JOptionPane.showMessageDialog(null, "Confirm Password not matching with New Password! "
                    + "Please confirm your password again"); 
            
            ConfirmPasswordTextField.setText(null);
        }

        else{
        
            String status;
            
            String seqQue = SecurityQLabel.getText();
            
            Userregister updateUser = new Userregister();
            updateUser.setUsername(username);
            updateUser.setSeqQue(seqQue);
            updateUser.setAnswer(answer);
            updateUser.setPassword(newPassword);

            status = RegisterController.updatePassword(updateUser);     
            
            if(status.equals("true")){
                ClearForm();
                this.dispose();
            }
            
        }
    }
    
    
    /**
     * Method to clear the form
     */
    public void ClearForm(){
        
        UsernameTextField.setText(null);
        SecurityQLabel.setText(null);
        AnswerTextField.setText(null);      
        NewPasswordTextField.setText(null);
        ConfirmPasswordTextField.setText(null);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AnswerTextField = new javax.swing.JTextField();
        SecurityQLabel = new javax.swing.JLabel();
        NewPasswordTextField = new javax.swing.JPasswordField();
        ConfirmPasswordTextField = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        UsernameTextField = new javax.swing.JTextField();
        ClearAllButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 570, -1, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 110, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 30));

        AnswerTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AnswerTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(AnswerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 360, 30));

        SecurityQLabel.setBackground(new java.awt.Color(255, 255, 255));
        SecurityQLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SecurityQLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SecurityQLabel.setOpaque(true);
        jPanel2.add(SecurityQLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 360, 30));

        NewPasswordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NewPasswordTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NewPasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewPasswordTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(NewPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 360, 30));

        ConfirmPasswordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConfirmPasswordTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(ConfirmPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 360, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/remove-button.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Reset Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 200, 35));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 30));

        UsernameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UsernameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(UsernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 360, 30));

        ClearAllButton.setBackground(new java.awt.Color(204, 153, 255));
        ClearAllButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        ClearAllButton.setText("Clear All");
        ClearAllButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ClearAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearAllButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ClearAllButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 140, 60));

        SubmitButton.setBackground(new java.awt.Color(204, 153, 255));
        SubmitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SubmitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/SubmitAll.png"))); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 140, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewPasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewPasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NewPasswordTextFieldActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed

        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void ClearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearAllButtonActionPerformed

        //Calling the method to clear the form
        ClearForm();
    }//GEN-LAST:event_ClearAllButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        //Calling the method to reset the password
        ResetPassword();
    }//GEN-LAST:event_SubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordReset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerTextField;
    private javax.swing.JButton ClearAllButton;
    private javax.swing.JPasswordField ConfirmPasswordTextField;
    private javax.swing.JPasswordField NewPasswordTextField;
    private javax.swing.JLabel SecurityQLabel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}