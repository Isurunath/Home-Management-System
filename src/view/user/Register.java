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
 * Register -- Interface for register a user in the system
 * @author Nimanthika
 * 
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        
        this.getContentPane().setBackground( Color.white );
        
         //set form in the middle of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

    }
    
    /**
     * Method to register in the system
     */
    public void RegisterUser(){
        
        //Save the user inserted values, inside variables.
        String username = UsernameTextField.getText();
        
        char[] psw= PasswordTextField.getPassword();
        String password= new String (psw);
        
        char[] cnpsw= ConfirmPasswordTextField.getPassword();
        String confirmPassword= new String (cnpsw);
        
        String secQue = SecQueComboBox.getSelectedItem().toString();
        String answer = AnswerTextField.getText();

        Long count = RegisterController.countUsername(username);

        if(count>0){
        
            JOptionPane.showMessageDialog(null, "Entered username already taken, try another!");
            UsernameTextField.setText(null);
        }
 
        else if(!password.equals(confirmPassword)){
            
            JOptionPane.showMessageDialog(null, "Confirm Password not matching with Password! "
                    + "Please confirm your password again"); 
            
            ConfirmPasswordTextField.setText(null);
        }
        
        else{
        
            String status;
            
            Userregister user = new Userregister();
            user.setUsername(username);
            user.setPassword(password);
            user.setSeqQue(secQue);
            user.setAnswer(answer);

            status = RegisterController.addUser(user);
            
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
        PasswordTextField.setText(null);
        ConfirmPasswordTextField.setText(null);
        SecQueComboBox.setSelectedIndex(0);
        AnswerTextField.setText(null);       
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AnswerTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SecQueComboBox = new javax.swing.JComboBox();
        UsernameTextField = new javax.swing.JTextField();
        ClearAllButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        PasswordTextField = new javax.swing.JPasswordField();
        ConfirmPasswordTextField = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        CloseButton = new javax.swing.JToggleButton();
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
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 120, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New User Registration");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 280, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, 30));

        AnswerTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AnswerTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(AnswerTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 360, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, 30));

        SecQueComboBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SecQueComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select a security question", "What was the last name of your childhood best friend?", "What was the last name of your third grade teacher?", "Who was your childhood hero?", "What was the name of your imaginary friend as a child?", "What was your first pet's name?" }));
        SecQueComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(SecQueComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 360, 30));

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

        PasswordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PasswordTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 360, 30));

        ConfirmPasswordTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ConfirmPasswordTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(ConfirmPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 360, 30));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CloseButton.setBackground(new java.awt.Color(0, 0, 0));
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/remove-button.png"))); // NOI18N
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        jPanel5.add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 40, 30));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 30));

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

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        //Calling the method to register a new user
        RegisterUser();   
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void ClearAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearAllButtonActionPerformed
       
        //Calling the method to clear the form
        ClearForm();
    }//GEN-LAST:event_ClearAllButtonActionPerformed

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        
        //Close the form
        this.dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnswerTextField;
    private javax.swing.JButton ClearAllButton;
    private javax.swing.JToggleButton CloseButton;
    private javax.swing.JPasswordField ConfirmPasswordTextField;
    private javax.swing.JPasswordField PasswordTextField;
    private javax.swing.JComboBox SecQueComboBox;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
