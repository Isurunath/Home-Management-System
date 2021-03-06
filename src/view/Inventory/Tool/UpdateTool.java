/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Inventory.Tool;


import controller.Inventory.ToolController;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Inventory.Tool;
import org.hibernate.HibernateException;
import utility.Validations;

/**
 *
 * @author Nipuni
 */
public class UpdateTool extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateTool
     */
    DefaultTableModel dtm1;
    private JDesktopPane jdp;
    
    public UpdateTool(JDesktopPane jdp) {
        try {
            initComponents();
            
            SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
            
            DateCombo.setDateFormat(date);
            dtm1=(DefaultTableModel) infoTable3.getModel();
            
            infoTable3.setModel(ToolController.getAllToolList_2());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateTool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HibernateException ex) {
            Logger.getLogger(UpdateTool.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        AddPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        QtyText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SellerText = new javax.swing.JTextField();
        ItemCodeText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PriceText = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        CategoryText = new javax.swing.JTextField();
        NameText = new javax.swing.JTextField();
        LocationText = new javax.swing.JTextField();
        UserText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        WarrantyPeriodText = new javax.swing.JTextField();
        DateCombo = new org.freixas.jcalendar.JCalendarCombo();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTable3 = new javax.swing.JTable();

        setTitle("Update Tool Item");

        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 580));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tool Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel2.setText("Category :-");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel3.setText(" Name :-");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel4.setText("Quantity :-");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel5.setText("Location :-");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel6.setText("User :-");

        QtyText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        QtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyTextActionPerformed(evt);
            }
        });
        QtyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                QtyTextKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel8.setText("Item Code :-");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel9.setText("Name Of The Seller: -");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel10.setText("Date :-");

        SellerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerTextActionPerformed(evt);
            }
        });
        SellerText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SellerTextKeyTyped(evt);
            }
        });

        ItemCodeText.setEditable(false);
        ItemCodeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemCodeTextActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel11.setText("Price :-");

        PriceText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 11)); // NOI18N
        PriceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTextActionPerformed(evt);
            }
        });
        PriceText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PriceTextKeyTyped(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 51, 153));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Refresh_24x24.png"))); // NOI18N
        deleteButton.setText("Update");
        deleteButton.setIconTextGap(8);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(204, 0, 0));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel_24x24.png"))); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.setIconTextGap(8);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        CategoryText.setEditable(false);
        CategoryText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        CategoryText.setText("Tool");
        CategoryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryTextActionPerformed(evt);
            }
        });

        NameText.setEditable(false);
        NameText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });
        NameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameTextKeyTyped(evt);
            }
        });

        LocationText.setEditable(false);
        LocationText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        LocationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationTextActionPerformed(evt);
            }
        });
        LocationText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LocationTextKeyTyped(evt);
            }
        });

        UserText.setEditable(false);
        UserText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        UserText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Warranty Period: -");

        WarrantyPeriodText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                WarrantyPeriodTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ItemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CategoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NameText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(AddPanelLayout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(70, 70, 70)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addComponent(WarrantyPeriodText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(DateCombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                        .addComponent(SellerText, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemCodeText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PriceText, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CategoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DateCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(QtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LocationText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addComponent(WarrantyPeriodText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(24, 24, 24)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(AddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N

        infoTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        infoTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoTable3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(infoTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1018, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTextActionPerformed

    private void SellerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerTextActionPerformed

    private void ItemCodeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemCodeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemCodeTextActionPerformed

    private void PriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int respond= JOptionPane.showConfirmDialog(UpdateTool.this,"Do you want to Update this record.? If yes click Yes", "Confimation message",0,3);

        if(respond==JOptionPane.OK_OPTION){
            try {
                String itemCode=ItemCodeText.getText();
                String name=NameText.getText();
                int qty=Integer.parseInt(QtyText.getText());
                String location=LocationText.getText();
                Double price=Double.parseDouble(PriceText.getText());
                String seller=SellerText.getText();
                String date=String.valueOf(DateCombo.getSelectedItem());
                String user=UserText.getText();
                int period =Integer.parseInt(WarrantyPeriodText.getText());
                
                Tool tool=new Tool(itemCode, name, location, qty, price, user, date, seller, period);
                
                boolean res=ToolController.EditToolDetails(tool);
                
                if(res==true){
                    dtm1.setRowCount(0);
                    
                    infoTable3.setModel(ToolController.getAllToolList_2());
                    
                    JOptionPane.showMessageDialog(UpdateTool.this,"Selected Record updated", "Information", 1);
                    
                }else{
                    JOptionPane.showMessageDialog(UpdateTool.this,"Updating Process unsuccessful", "Information", 1);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UpdateTool.class.getName()).log(Level.SEVERE, null, ex);
            } catch (HibernateException ex) {
                Logger.getLogger(UpdateTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }else{
                JOptionPane.showMessageDialog(UpdateTool.this,"User cancel the process", "Information", 1);
        }


            ItemCodeText.setText("");
            NameText.setText("");
            QtyText.setText("");
            LocationText.setText("");
            PriceText.setText(" ");
            SellerText.setText("");
            UserText.setText("");
            WarrantyPeriodText.setText("");


    }//GEN-LAST:event_deleteButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void CategoryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryTextActionPerformed

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextActionPerformed

    private void LocationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationTextActionPerformed

    private void UserTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserTextActionPerformed

    private void infoTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoTable3MouseClicked
        try {
            dtm1=ToolController.getAllToolList_2();
           DateCombo.setEditable(true);
            
            ItemCodeText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 0)));
            NameText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 1)));
            LocationText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 2)));
            QtyText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 3)));
            PriceText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 4)));
            UserText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 5)));
            DateCombo.setSelectedItem(dtm1.getValueAt(infoTable3.getSelectedRow(), 6));
            SellerText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 7)));
            WarrantyPeriodText.setText(String.valueOf(dtm1.getValueAt(infoTable3.getSelectedRow(), 8)));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateTool.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HibernateException ex) {
            Logger.getLogger(UpdateTool.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_infoTable3MouseClicked

    private void NameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameTextKeyTyped
        Validations.validateString(NameText);
    }//GEN-LAST:event_NameTextKeyTyped

    private void PriceTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceTextKeyTyped
        Validations.validateString(PriceText);
    }//GEN-LAST:event_PriceTextKeyTyped

    private void QtyTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QtyTextKeyTyped
        Validations.validateInt(QtyText);
    }//GEN-LAST:event_QtyTextKeyTyped

    private void WarrantyPeriodTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WarrantyPeriodTextKeyTyped
        Validations.validateInt(WarrantyPeriodText,2);
    }//GEN-LAST:event_WarrantyPeriodTextKeyTyped

    private void LocationTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LocationTextKeyTyped
       Validations.validateString(LocationText);
    }//GEN-LAST:event_LocationTextKeyTyped

    private void SellerTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellerTextKeyTyped
        Validations.validateString(SellerText);
    }//GEN-LAST:event_SellerTextKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPanel;
    private javax.swing.JTextField CategoryText;
    private org.freixas.jcalendar.JCalendarCombo DateCombo;
    private javax.swing.JTextField ItemCodeText;
    private javax.swing.JTextField LocationText;
    private javax.swing.JTextField NameText;
    private javax.swing.JTextField PriceText;
    private javax.swing.JTextField QtyText;
    private javax.swing.JTextField SellerText;
    private javax.swing.JTextField UserText;
    private javax.swing.JTextField WarrantyPeriodText;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTable infoTable3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
