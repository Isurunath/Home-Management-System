/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Inventory.Medicine;

import controller.Inventory.MedicineController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import org.hibernate.HibernateException;

/**
 *
 * @author Nipuni
 */
public class SearchMedicine extends javax.swing.JInternalFrame {

    /**
     * Creates new form SearchElectricGoods
     */
    public SearchMedicine(JDesktopPane jdp) {
        initComponents();
           NameLocationPanel.setVisible(false);
           NameSellerPanel.setVisible(false);
           StatusPanel.setVisible(false);
           
         List name=MedicineController.getMedicineName();
           
           NameComboBox.removeAllItems();
           
           for(Object o:name){
               NameComboBox.addItem(o);
           }
           
          NameComboBox1.removeAllItems();
           
           for(Object o:name){
               NameComboBox1.addItem(o);
           }
           
           List location=MedicineController.getMedicineLocation();
           
           LocationComboBox.removeAllItems();
           
           for(Object o:location){
               LocationComboBox.addItem(o);
           }
           
           List description=MedicineController.getMedicineDecription();
           
           DescriptionComboBox.removeAllItems();
           
           for(Object o:description){
               DescriptionComboBox.addItem(o);
           }
           
           List sellers=MedicineController.getMedicineSellers();
           
           SellerComboBox.removeAllItems();
           
           for(Object o:sellers){
               SellerComboBox.addItem(o);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTable3 = new javax.swing.JTable();
        AddPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        ResponseComboBox = new javax.swing.JComboBox();
        NameLocationPanel = new javax.swing.JPanel();
        NameLabel = new javax.swing.JLabel();
        NameComboBox = new javax.swing.JComboBox();
        LocationLabel = new javax.swing.JLabel();
        LocationComboBox = new javax.swing.JComboBox();
        NameSellerPanel = new javax.swing.JPanel();
        SellerLabel = new javax.swing.JLabel();
        SellerComboBox = new javax.swing.JComboBox();
        NameLabel1 = new javax.swing.JLabel();
        NameComboBox1 = new javax.swing.JComboBox();
        StatusPanel = new javax.swing.JPanel();
        StatusLabel = new javax.swing.JLabel();
        DescriptionComboBox = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(1286, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 570));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N

        infoTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

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
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        AddPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Semilight", 0, 16))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel8.setText("Search Option :-");

        SearchButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        SearchButton.setForeground(new java.awt.Color(0, 51, 102));
        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search_24x24.png"))); // NOI18N
        SearchButton.setText("Search");
        SearchButton.setIconTextGap(8);
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
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

        ResponseComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Select Option--", "Name", "Name & Location", "Name of Seller", "Name & Name of Seller", "Description", " " }));
        ResponseComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResponseComboBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResponseComboBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResponseComboBoxMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ResponseComboBoxMousePressed(evt);
            }
        });
        ResponseComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                ResponseComboBoxPropertyChange(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        NameLabel.setText(" Name :-");

        LocationLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        LocationLabel.setText("Location :-");

        javax.swing.GroupLayout NameLocationPanelLayout = new javax.swing.GroupLayout(NameLocationPanel);
        NameLocationPanel.setLayout(NameLocationPanelLayout);
        NameLocationPanelLayout.setHorizontalGroup(
            NameLocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameLocationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NameLocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(NameLocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        NameLocationPanelLayout.setVerticalGroup(
            NameLocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameLocationPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(NameLocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NameLocationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LocationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        SellerLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        SellerLabel.setText("Name Of The Seller :-");

        NameLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        NameLabel1.setText(" Name :-");

        javax.swing.GroupLayout NameSellerPanelLayout = new javax.swing.GroupLayout(NameSellerPanel);
        NameSellerPanel.setLayout(NameSellerPanelLayout);
        NameSellerPanelLayout.setHorizontalGroup(
            NameSellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameSellerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NameSellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SellerLabel)
                    .addComponent(NameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NameSellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameComboBox1, 0, 140, Short.MAX_VALUE)
                    .addComponent(SellerComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NameSellerPanelLayout.setVerticalGroup(
            NameSellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NameSellerPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(NameSellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(NameSellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SellerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SellerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        StatusLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        StatusLabel.setText("Description :-");

        javax.swing.GroupLayout StatusPanelLayout = new javax.swing.GroupLayout(StatusPanel);
        StatusPanel.setLayout(StatusPanelLayout);
        StatusPanelLayout.setHorizontalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(DescriptionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        StatusPanelLayout.setVerticalGroup(
            StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StatusPanelLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(StatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescriptionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addComponent(ResponseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NameSellerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(StatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameLocationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(140, 140, 140)
                        .addComponent(SearchButton)
                        .addGap(29, 29, 29)
                        .addComponent(cancelButton)
                        .addGap(0, 227, Short.MAX_VALUE))))
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResponseComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(NameLocationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(NameSellerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(StatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AddPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void infoTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoTable3MouseClicked
       
    }//GEN-LAST:event_infoTable3MouseClicked

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
       String clientResponse=String.valueOf(ResponseComboBox.getSelectedItem());
        
        if("Name".equals(clientResponse)){
           try {
               String name=String.valueOf(NameComboBox.getSelectedItem());
               
               infoTable3.setModel(MedicineController.searchMedicineByName(name));
           } catch (HibernateException ex) {
               Logger.getLogger(SearchMedicine.class.getName()).log(Level.SEVERE, null, ex);
           }
           
        }else if("Name & Location".equals(clientResponse)){
           try {
               String name=String.valueOf(NameComboBox.getSelectedItem());
               String location=String.valueOf(LocationComboBox.getSelectedItem());
               
               infoTable3.setModel(MedicineController.searchMedicineByNameAndLocation(name, location));
           } catch (HibernateException ex) {
               Logger.getLogger(SearchMedicine.class.getName()).log(Level.SEVERE, null, ex);
           }      
        }else if("Name of Seller".equals(clientResponse)){
           try {
               String seller=String.valueOf(SellerComboBox.getSelectedItem());
               
               infoTable3.setModel(MedicineController.searchMedicineByNameOfSeller(seller));
           } catch (HibernateException ex) {
               Logger.getLogger(SearchMedicine.class.getName()).log(Level.SEVERE, null, ex);
           }      
        }else if("Name & Name of Seller".equals(clientResponse)){
           try {
               String name=String.valueOf(NameComboBox1.getSelectedItem());
               String seller=String.valueOf(SellerComboBox.getSelectedItem());
               
               infoTable3.setModel(MedicineController.searchMedicineByNameAndNameOfSeller(name, seller));
           } catch (HibernateException ex) {
               Logger.getLogger(SearchMedicine.class.getName()).log(Level.SEVERE, null, ex);
           }      
        }else if("Description".equals(clientResponse)){
           try {
               String description=String.valueOf(DescriptionComboBox.getSelectedItem());
               
               infoTable3.setModel(MedicineController.searchMedicineByDescription(description));
           } catch (HibernateException ex) {
               Logger.getLogger(SearchMedicine.class.getName()).log(Level.SEVERE, null, ex);
           }      
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void ResponseComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResponseComboBoxMouseClicked

    }//GEN-LAST:event_ResponseComboBoxMouseClicked

    private void ResponseComboBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResponseComboBoxMouseExited

    }//GEN-LAST:event_ResponseComboBoxMouseExited

    private void ResponseComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResponseComboBoxMousePressed

    }//GEN-LAST:event_ResponseComboBoxMousePressed

    private void ResponseComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_ResponseComboBoxPropertyChange

    }//GEN-LAST:event_ResponseComboBoxPropertyChange

    private void ResponseComboBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResponseComboBoxMouseEntered
         String userInput=String.valueOf(ResponseComboBox.getSelectedItem());

        if("Name".equals(userInput)){
            NameLocationPanel.setVisible(true);
            LocationComboBox.setVisible(false);
            LocationLabel.setVisible(false);
            NameSellerPanel.setVisible(false);
            StatusPanel.setVisible(false);
           
        }else if("Name & Location".equals(userInput)){
            NameLocationPanel.setVisible(true);
            LocationComboBox.setVisible(true);
            NameSellerPanel.setVisible(false);
            StatusPanel.setVisible(false);

        }else if("Name of Seller".equals(userInput)){
            NameLocationPanel.setVisible(false);
            LocationComboBox.setVisible(false);
            LocationLabel.setVisible(false);
            NameSellerPanel.setVisible(true);
            NameComboBox1.setVisible(false);
            NameLabel1.setVisible(false);
            StatusPanel.setVisible(false);
        }else if("Name & Name of Seller".equals(userInput)){
            NameLocationPanel.setVisible(false);
            NameSellerPanel.setVisible(true);
            StatusPanel.setVisible(false);
        }else if("Description".equals(userInput)){
            NameLocationPanel.setVisible(false);
            NameSellerPanel.setVisible(false);
            StatusPanel.setVisible(true);
        }
    }//GEN-LAST:event_ResponseComboBoxMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPanel;
    private javax.swing.JComboBox DescriptionComboBox;
    private javax.swing.JComboBox LocationComboBox;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JComboBox NameComboBox;
    private javax.swing.JComboBox NameComboBox1;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NameLabel1;
    private javax.swing.JPanel NameLocationPanel;
    private javax.swing.JPanel NameSellerPanel;
    private javax.swing.JComboBox ResponseComboBox;
    private javax.swing.JButton SearchButton;
    private javax.swing.JComboBox SellerComboBox;
    private javax.swing.JLabel SellerLabel;
    private javax.swing.JLabel StatusLabel;
    private javax.swing.JPanel StatusPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTable infoTable3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
