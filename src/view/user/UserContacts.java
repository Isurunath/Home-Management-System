/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package view.user;

import controllers.user.UserContactController;
import model.user.Usercontact;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import static view.user.SearchContacts.HideColumns;

/**
 *
 * UserContacts -- Interface for manage user's contacts
 * @author Nimanthika
 * 
 */
public class UserContacts extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserContacts
     */
    public UserContacts() {
        initComponents();
        
        //Hide menu bar of the UserContacts jInternalFrame
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);  
        
        //Load contact table when the interface is loading
       displayContactTable();
       
       //Hide ContactID label when the interface is loading
       ContactIDLabel.setVisible(false);     
       
    }
    
    /**
     * Method to add a contact
     */
    public void AddContact(){
        
        //Save the user inserted values, inside variables.
        String groupName = ManageContactsComboBoxGroup.getSelectedItem().toString();
        String name = ManageContactsTextBoxName.getText();
        String companyName = ManageContactsTextBoxCompanyName.getText();
        Date dob = ManageContactsDateChooserDOB.getDate();
        String telephone1 = ManageContactsTextBoxTelephone1.getText();
        String telephone2 = ManageContactsTextBoxTelephone2.getText();
        String mobile1 = ManageContactsTextBoxMobile1.getText();
        String mobile2 = ManageContactsTextBoxMobile2.getText();
        String email1 = ManageContactsTextBoxEmail1.getText();
        String email2 = ManageContactsTextBoxEmail2.getText();
        String address = ManageContactsTextAreaAddress.getText();      
       
        if((telephone1.equals(""))&&(mobile1.equals(""))){
        
            JOptionPane.showMessageDialog(null, "Please enter a telephone or mobile number!");
        }
        
        else{
        
            Usercontact addContact = new Usercontact();
            addContact.setGroupName(groupName);
            addContact.setName(name);
            addContact.setCompanyName(companyName);
            addContact.setDob(dob);
            addContact.setTelephone1(telephone1);
            addContact.setTelephone2(telephone2);
            addContact.setMobile1(mobile1);
            addContact.setMobile2(mobile2);
            addContact.setEmail1(email1);
            addContact.setEmail2(email2);
            addContact.setAddress(address);

            String status;

            status = UserContactController.addContact(addContact);

            if(status.equals("true")){
                    ContactFormClear();
                }
        }
        
    }
   
    /**
     * Method to update a contact
     */
    public void UpdateContact(){
        
        int row = ContactTable.getSelectedRow();
        
        if(row < 0){
        
            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to update!");
        }
        
        else{
        
            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
            if(userInput==0)
            {  
                int ContactID = (int) ContactTable.getValueAt(row, 0);

                //Save the user inserted values, inside variables.
                String groupName = ManageContactsComboBoxGroup.getSelectedItem().toString();
                String name = ManageContactsTextBoxName.getText();
                String companyName = ManageContactsTextBoxCompanyName.getText();
                Date dob = ManageContactsDateChooserDOB.getDate();
                String telephone1 = ManageContactsTextBoxTelephone1.getText();
                String telephone2 = ManageContactsTextBoxTelephone2.getText();
                String mobile1 = ManageContactsTextBoxMobile1.getText();
                String mobile2 = ManageContactsTextBoxMobile2.getText();
                String email1 = ManageContactsTextBoxEmail1.getText();
                String email2 = ManageContactsTextBoxEmail2.getText();
                String address = ManageContactsTextAreaAddress.getText();      

                Usercontact updateContact = new Usercontact();
                updateContact.setContactId(ContactID);
                updateContact.setGroupName(groupName);
                updateContact.setName(name);
                updateContact.setCompanyName(companyName);
                updateContact.setDob(dob);
                updateContact.setTelephone1(telephone1);
                updateContact.setTelephone2(telephone2);
                updateContact.setMobile1(mobile1);
                updateContact.setMobile2(mobile2);
                updateContact.setEmail1(email1);
                updateContact.setEmail2(email2);
                updateContact.setAddress(address);

                String status;

                status = UserContactController.updateContact(updateContact);

                if(status.equals("true")){

                    //Clear the form after updating data
                    ContactFormClear();

                    //Refresh ContactTable
                    displayContactTable(); 
                }
            }
        }
    }
    
    /**
     * Method to Delete a contact
     * 
     */
    public void DeleteContact(){
        
        int row = ContactTable.getSelectedRow();
        
        if(row < 0){
        
            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to delete!");
        }
        
        else{
        
            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
            if(userInput==0)
            {
            
                String ID = ContactTable.getValueAt(row, 0).toString();

                UserContactController.deleteContact(ID);
            }
        }
    }
     
    /**
     * Method to clear the Contact form
     */
    public void ContactFormClear(){
        
        ManageContactsComboBoxGroup.setSelectedIndex(0);
        ManageContactsTextBoxName.setText(null);
        ManageContactsTextBoxCompanyName.setText(null);
        ManageContactsDateChooserDOB.setDate(null);
        ManageContactsTextBoxTelephone1.setText(null);
        ManageContactsTextBoxTelephone2.setText(null);
        ManageContactsTextBoxMobile1.setText(null);
        ManageContactsTextBoxMobile2.setText(null);
        ManageContactsTextBoxEmail1.setText(null);
        ManageContactsTextBoxEmail2.setText(null);
        ManageContactsTextAreaAddress.setText(null);       
    }
    
    /**
     * Method to load ContactTable
     */
    public static void displayContactTable(){
        
        ContactTable.setModel(UserContactController.displayContactTable());    
        HideColumns();
    }
    
    /**
     * Method to load ContactTable when user searching a contact
     */ 
    public static void displaySearchedContactTable(){
        
        String name = NameTextBox.getText();
        
        ContactTable.setModel(UserContactController.displaySearchedContactTable(name));  
        HideColumns();
    }
    
    /**
     * Method to fill the form when user clicks on a row of ContactTable
     */
      public static void FillForm(){
          
          int r = ContactTable.getSelectedRow();
        
          ContactIDLabel.setText(ContactTable.getValueAt(r, 0).toString());
          ManageContactsComboBoxGroup.setSelectedItem(ContactTable.getValueAt(r, 1).toString());
          ManageContactsTextBoxName.setText(ContactTable.getValueAt(r, 2).toString());
          ManageContactsTextBoxCompanyName.setText(ContactTable.getValueAt(r, 3).toString());
          ManageContactsDateChooserDOB.setDate((Date) ContactTable.getValueAt(r, 4));
          ManageContactsTextBoxTelephone1.setText(ContactTable.getValueAt(r, 5).toString());
          ManageContactsTextBoxTelephone2.setText(ContactTable.getValueAt(r, 6).toString());
          ManageContactsTextBoxMobile1.setText(ContactTable.getValueAt(r, 7).toString());
          ManageContactsTextBoxMobile2.setText(ContactTable.getValueAt(r, 8).toString());
          ManageContactsTextBoxEmail1.setText(ContactTable.getValueAt(r, 9).toString());
          ManageContactsTextBoxEmail2.setText(ContactTable.getValueAt(r, 10).toString());
          ManageContactsTextAreaAddress.setText(ContactTable.getValueAt(r, 11).toString());         
      }
    
      /**
     * Method to hide unwanted columns of the table
     */
    public static void HideColumns(){
        
        //Hide Contact ID column
        ContactTable.getColumnModel().getColumn(0).setWidth(0);
        ContactTable.getColumnModel().getColumn(0).setMinWidth(0);
        ContactTable.getColumnModel().getColumn(0).setMaxWidth(0);
        
         //Hide Telephone2 column
        ContactTable.getColumnModel().getColumn(6).setWidth(0);
        ContactTable.getColumnModel().getColumn(6).setMinWidth(0);
        ContactTable.getColumnModel().getColumn(6).setMaxWidth(0);
        
         //Hide Mobile2 column
        ContactTable.getColumnModel().getColumn(8).setWidth(0);
        ContactTable.getColumnModel().getColumn(8).setMinWidth(0);
        ContactTable.getColumnModel().getColumn(8).setMaxWidth(0);
        
         //Hide Email2 column
        ContactTable.getColumnModel().getColumn(10).setWidth(0);
        ContactTable.getColumnModel().getColumn(10).setMinWidth(0);
        ContactTable.getColumnModel().getColumn(10).setMaxWidth(0);
        
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
        jPanel5 = new javax.swing.JPanel();
        ManageContactsTextBoxName = new javax.swing.JTextField();
        ManageContactsDateChooserDOB = new com.toedter.calendar.JDateChooser();
        ManageContactsTextBoxCompanyName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ManageContactsComboBoxGroup = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        ManageContactsTextBoxTelephone1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ManageContactsTextBoxTelephone2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageContactsTextAreaAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ManageContactsTextBoxMobile1 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        ManageContactsTextBoxMobile2 = new javax.swing.JTextField();
        ManageContactsTextBoxEmail1 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ManageContactsTextBoxEmail2 = new javax.swing.JTextField();
        ContactIDLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ContactTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        NameTextBox = new javax.swing.JTextField();
        SearchNameBoxButton = new javax.swing.JButton();
        ClearNameBoxButton = new javax.swing.JButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1370, 750));
        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Manage Contacts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageContactsTextBoxName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 210, 30));

        ManageContactsDateChooserDOB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ManageContactsDateChooserDOB.setDateFormatString("dd-MM-yyyy");
        ManageContactsDateChooserDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(ManageContactsDateChooserDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        ManageContactsTextBoxCompanyName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxCompanyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 210, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Group");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Name");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 70, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Company Name");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 120, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Date Of Birth");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, 20));

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel5.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 140, 50));

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(51, 51, 255));
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/addBlue.png"))); // NOI18N
        AddButton.setText("Add  ");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel5.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 150, 50));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 204, 0));
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/updateYelllow.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel5.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 150, 50));

        ManageContactsComboBoxGroup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManageContactsComboBoxGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select the group", "Family", "Office", "Friends", "Emergency", "Doctors" }));
        ManageContactsComboBoxGroup.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsComboBoxGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Telephone No.1");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 120, 20));

        ManageContactsTextBoxTelephone1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxTelephone1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxTelephone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 210, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Telephone No.2");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, 20));

        ManageContactsTextBoxTelephone2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxTelephone2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxTelephone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 210, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));

        ManageContactsTextAreaAddress.setColumns(20);
        ManageContactsTextAreaAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextAreaAddress.setRows(5);
        ManageContactsTextAreaAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jScrollPane1.setViewportView(ManageContactsTextAreaAddress);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 100));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Address");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Mobile No.1");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 90, 20));

        ManageContactsTextBoxMobile1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxMobile1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxMobile1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 210, 30));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Mobile No.2");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 90, 20));

        ManageContactsTextBoxMobile2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxMobile2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxMobile2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 210, 30));

        ManageContactsTextBoxEmail1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxEmail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 210, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Email 1");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email 2");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 60, 20));

        ManageContactsTextBoxEmail2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ManageContactsTextBoxEmail2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ManageContactsTextBoxEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 210, 30));
        jPanel5.add(ContactIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 80, 20));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 530, 540));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Contacts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ContactTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ContactTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ContactTable.setRowHeight(35);
        ContactTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContactTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ContactTable);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 630, 350));

        DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteButton.setForeground(new java.awt.Color(255, 51, 51));
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/deleteRed.png"))); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel6.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 150, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Name");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 40, 30));

        NameTextBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NameTextBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel6.add(NameTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 210, 30));

        SearchNameBoxButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SearchNameBoxButton.setText("Search");
        SearchNameBoxButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        SearchNameBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchNameBoxButtonActionPerformed(evt);
            }
        });
        jPanel6.add(SearchNameBoxButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 70, 30));

        ClearNameBoxButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ClearNameBoxButton.setText("Clear");
        ClearNameBoxButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ClearNameBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearNameBoxButtonActionPerformed(evt);
            }
        });
        jPanel6.add(ClearNameBoxButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 70, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 670, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed

        //Call UpdateContact method
        UpdateContact(); 
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        
        //Call DeleteContact method
        DeleteContact();
        
        //Call the method to clear the form after delete data.
        ContactFormClear();
        
        //Refresh ContactTable
        displayContactTable();   
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        //Call AddContact method
        AddContact();

        //Refresh ContactTable
        displayContactTable(); 
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
       
        //Call the method to clear the form.
        ContactFormClear();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SearchNameBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchNameBoxButtonActionPerformed
        
        //Call the method to search a contact in the table
        displaySearchedContactTable();
    }//GEN-LAST:event_SearchNameBoxButtonActionPerformed

    private void ContactTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactTableMouseClicked
        
        //Call the FillForm method when user clicks on a row of ContactTable
        FillForm();
    }//GEN-LAST:event_ContactTableMouseClicked

    private void ClearNameBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearNameBoxButtonActionPerformed
        
        //Clear name textbox
        NameTextBox.setText(null);
        
        //Refresh table
        displayContactTable();
    }//GEN-LAST:event_ClearNameBoxButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton ClearNameBoxButton;
    private static javax.swing.JLabel ContactIDLabel;
    private static javax.swing.JTable ContactTable;
    private javax.swing.JButton DeleteButton;
    private static javax.swing.JComboBox ManageContactsComboBoxGroup;
    private static com.toedter.calendar.JDateChooser ManageContactsDateChooserDOB;
    private static javax.swing.JTextArea ManageContactsTextAreaAddress;
    private static javax.swing.JTextField ManageContactsTextBoxCompanyName;
    private static javax.swing.JTextField ManageContactsTextBoxEmail1;
    private static javax.swing.JTextField ManageContactsTextBoxEmail2;
    private static javax.swing.JTextField ManageContactsTextBoxMobile1;
    private static javax.swing.JTextField ManageContactsTextBoxMobile2;
    private static javax.swing.JTextField ManageContactsTextBoxName;
    private static javax.swing.JTextField ManageContactsTextBoxTelephone1;
    private static javax.swing.JTextField ManageContactsTextBoxTelephone2;
    private static javax.swing.JTextField NameTextBox;
    private javax.swing.JButton SearchNameBoxButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
