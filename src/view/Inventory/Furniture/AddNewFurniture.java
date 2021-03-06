/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Inventory.Furniture;

import controller.Inventory.FurnitureController;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import model.Inventory.Furniture;
import org.hibernate.HibernateException;
import utility.IDAutoGenerate;
import utility.Validations;


/**
 *
 * @author Nipuni
 */
public class AddNewFurniture extends javax.swing.JInternalFrame {

     
     private JDesktopPane jdp;

    /**
     * Creates new form AddNewElectricGoods
     */
         public AddNewFurniture(JDesktopPane jdp) {
         
         try {
             initComponents();
             // setSize(Toolkit.getDefaultToolkit().getScreenSize());
             
             IDAutoGenerate.getNextItemCode(ItemCodeText,"FR","Furniture");
             
             SimpleDateFormat date=new SimpleDateFormat("yyyy-MM-dd");
             java.util.Date today=Calendar.getInstance().getTime();
             PurDateText.setText(date.format(today));
             
             infoTable1.setModel(FurnitureController.getAllFurnitureList_2());
         } catch (HibernateException ex) {
             Logger.getLogger(AddNewFurniture.class.getName()).log(Level.SEVERE, null, ex);
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
        NameComboBox = new javax.swing.JComboBox();
        QtyText = new javax.swing.JTextField();
        LocationComboBox = new javax.swing.JComboBox();
        UserComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        WarrantyPeriodText = new javax.swing.JTextField();
        SellerNameText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        CategoryText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PurDateText = new javax.swing.JTextField();
        PaymentPeriodText = new javax.swing.JTextField();
        PaymentMethodComboBox = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PriceText = new javax.swing.JTextField();
        ItemCodeText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoTable1 = new javax.swing.JTable();

        setBackground(java.awt.Color.white);
        setIconifiable(true);
        setTitle("Add New Furniture");
        setPreferredSize(new java.awt.Dimension(1286, 600));

        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 580));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Furniture Details", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N

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

        NameComboBox.setEditable(true);
        NameComboBox.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        NameComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chair", "Sofa", "Double Bed", "Single Bed", "Arm Chair", "Dinning Table", "Book Rack", "Almira", "Wooden Cupboard" }));

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

        LocationComboBox.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        LocationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Living Room", "Own Bed Room", "Master Bed Room", "Kitchen", "Dining Room", "Library", "TV Room", "Wash Room" }));

        UserComboBox.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        UserComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "Nipuni", "Nimanthika", "Isuru", "Saumya" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel8.setText("Item Code :-");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel9.setText("Name Of The Seller :-");

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel10.setText("Warranty Period :-");

        WarrantyPeriodText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WarrantyPeriodTextActionPerformed(evt);
            }
        });
        WarrantyPeriodText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                WarrantyPeriodTextKeyTyped(evt);
            }
        });

        SellerNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerNameTextActionPerformed(evt);
            }
        });
        SellerNameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SellerNameTextKeyTyped(evt);
            }
        });

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(50, 153, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Check_24x24.png"))); // NOI18N
        jButton1.setText("OK");
        jButton1.setIconTextGap(13);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel_24x24.png"))); // NOI18N
        jButton2.setText("Cancel");
        jButton2.setIconTextGap(10);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CategoryText.setEditable(false);
        CategoryText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        CategoryText.setText("Furniture");
        CategoryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryTextActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel7.setText("Date :-");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel12.setText("Payment Method :-");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel13.setText("Payment Period :-");

        PurDateText.setEditable(false);
        PurDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurDateTextActionPerformed(evt);
            }
        });

        PaymentPeriodText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaymentPeriodTextActionPerformed(evt);
            }
        });
        PaymentPeriodText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PaymentPeriodTextKeyTyped(evt);
            }
        });

        PaymentMethodComboBox.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        PaymentMethodComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In Cash", "In Installments" }));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel14.setText("(Metion no of months)");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 12)); // NOI18N
        jLabel15.setText("Price :-");

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

        javax.swing.GroupLayout AddPanelLayout = new javax.swing.GroupLayout(AddPanel);
        AddPanel.setLayout(AddPanelLayout);
        AddPanelLayout.setHorizontalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CategoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SellerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(WarrantyPeriodText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(80, 80, 80)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PurDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddPanelLayout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(AddPanelLayout.createSequentialGroup()
                                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PaymentPeriodText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PaymentMethodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(75, 75, 75)))
                .addContainerGap())
        );
        AddPanelLayout.setVerticalGroup(
            AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CategoryText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ItemCodeText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LocationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PurDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QtyText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WarrantyPeriodText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaymentMethodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SellerNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PaymentPeriodText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PriceText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(AddPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(AddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(AddPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Status", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Semilight", 0, 14))); // NOI18N

        infoTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane1.setViewportView(infoTable1);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void WarrantyPeriodTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WarrantyPeriodTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WarrantyPeriodTextActionPerformed

    private void SellerNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerNameTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
             String itemCode=ItemCodeText.getText();
             String name=String.valueOf(NameComboBox.getSelectedItem());
             String location=String.valueOf( LocationComboBox.getSelectedItem());
             int qty=Integer.parseInt(QtyText.getText());
             String user=String.valueOf(UserComboBox.getSelectedItem());
             String category=CategoryText.getText();
             
             int warrantyPeriod=Integer.parseInt(WarrantyPeriodText.getText());
             String purDate=PurDateText.getText();
             double price=Integer.parseInt(PriceText.getText());
             String paymentMethod=String.valueOf(PaymentMethodComboBox.getSelectedItem());
             int paymentPeriod=Integer.parseInt(PaymentPeriodText.getText());
             String nameOfTheSeller=SellerNameText.getText();
             
             Furniture furniture=new Furniture(itemCode, name, location, qty, price, user, purDate, paymentMethod, warrantyPeriod, nameOfTheSeller, paymentPeriod);
             boolean res=FurnitureController.addFurniture(furniture);
             
             if(res==true){
                 JOptionPane.showMessageDialog(AddNewFurniture.this,"One record added", "Information", 1);
                 
                 infoTable1.setModel(FurnitureController.getAllFurnitureList_2());
                 
             }else{
                 JOptionPane.showMessageDialog(AddNewFurniture.this,"Unsuccessful", "Information", 1);
             }
             
             ItemCodeText.setText("");
             QtyText.setText("");
             WarrantyPeriodText.setText("");
             SellerNameText.setText("");
             PriceText.setText("");
             PaymentPeriodText.setText("");
             
         } catch (HibernateException ex) {
             Logger.getLogger(AddNewFurniture.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CategoryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryTextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PaymentPeriodTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaymentPeriodTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PaymentPeriodTextActionPerformed

    private void PriceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTextActionPerformed

    private void QtyTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QtyTextKeyTyped
        Validations.validateInt(QtyText);
    }//GEN-LAST:event_QtyTextKeyTyped

    private void PriceTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PriceTextKeyTyped
//        Validations.validateDouble(PriceText);
    }//GEN-LAST:event_PriceTextKeyTyped

    private void WarrantyPeriodTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WarrantyPeriodTextKeyTyped
        Validations.validateInt(WarrantyPeriodText);
    }//GEN-LAST:event_WarrantyPeriodTextKeyTyped

    private void SellerNameTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SellerNameTextKeyTyped
       Validations.validateString(SellerNameText);
    }//GEN-LAST:event_SellerNameTextKeyTyped

    private void PaymentPeriodTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaymentPeriodTextKeyTyped
        Validations.validateInt(PaymentPeriodText);
    }//GEN-LAST:event_PaymentPeriodTextKeyTyped

    private void PurDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurDateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PurDateTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPanel;
    private javax.swing.JTextField CategoryText;
    private javax.swing.JLabel ItemCodeText;
    private javax.swing.JComboBox LocationComboBox;
    private javax.swing.JComboBox NameComboBox;
    private javax.swing.JComboBox PaymentMethodComboBox;
    private javax.swing.JTextField PaymentPeriodText;
    private javax.swing.JTextField PriceText;
    private javax.swing.JTextField PurDateText;
    private javax.swing.JTextField QtyText;
    private javax.swing.JTextField SellerNameText;
    private javax.swing.JComboBox UserComboBox;
    private javax.swing.JTextField WarrantyPeriodText;
    private javax.swing.JTable infoTable1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

