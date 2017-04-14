/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package view.user;

import controllers.user.DoctorAppointmentController;
import controllers.user.HealthInfoController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.user.Userdoctorapp;
import model.user.Userhealthinfo;

/**
 *
 * UserHealth -- Interface for manage home members health details
 * @author Nimanthika
 * 
 */
public class UserHealth extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserHealth
     */
    public UserHealth() {
        initComponents();
        
        //Hide menu bar of the UserHealth jInternalFrame
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        //Load Appointment table when the interface is loading
        displayAppointmentTable();

        //set time spinner's value to 00:00 when the interface is loading
        setSpinnerToValue();

        //Load HealthInfo table when the interface is loading
        displayHealthInfoTable();
       
    }

    /**
     * Method to add an Appointment
     */
    public void AddAppointment(){
        
        //Save the user inserted values, inside variables.
        String memberName = DocApp_MemberNameTextField.getText();
        Date date = DocApp_DateChooser.getDate();
        
        JSpinner.DateEditor de = new JSpinner.DateEditor(DocApp_TimeSpinner,"HH:mm a");
        String time = (de.getFormat().format(DocApp_TimeSpinner.getValue()));
          
        String docName = DocApp_DocNameTextField.getText();
        String venue = DocApp_VenueTextArea.getText();
        String otherDetails = DocApp_OtherTextArea.getText();
                
        if(time.equals("00:00 AM")){
        
            JOptionPane.showMessageDialog(null, "Please enter the time!");
        }
        
        else if(date == null){  
            JOptionPane.showMessageDialog(null, "Please select the Date!");
        }
        
        else{
            
            Userdoctorapp app = new Userdoctorapp();
            app.setMemberName(memberName);
            app.setDate(date);
            app.setTime(time);
            app.setDocName(docName);
            app.setVenue(venue);
            app.setOtherDetails(otherDetails);

            String status;

            status = DoctorAppointmentController.addAppointment(app);

            if(status.equals("true")){
                    clearAppointmentForm();
                    displayAppointmentTable();
                }
        
        }

    }
    
    
     /**
     * Method to update an appointment
     */
    public void UpdateAppointment(){
        
        int row = DocApp_Table.getSelectedRow();
        
        if(row < 0){
        
            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to update!");
        }
        
        else{
            
            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
            if(userInput==0)
            {
        
                int appID = (int) DocApp_Table.getValueAt(row, 0);

                //Save the user inserted values, inside variables.
                String memberName = DocApp_MemberNameTextField.getText();
                Date date = DocApp_DateChooser.getDate();

                JSpinner.DateEditor de = new JSpinner.DateEditor(DocApp_TimeSpinner,"HH:mm a");
                String time = (de.getFormat().format(DocApp_TimeSpinner.getValue()));

                String docName = DocApp_DocNameTextField.getText();
                String venue = DocApp_VenueTextArea.getText();
                String otherDetails = DocApp_OtherTextArea.getText();     

                if(time.equals("00:00 AM")){

                    JOptionPane.showMessageDialog(null, "Please enter the time!");
                }

                else if(date == null){  
                    JOptionPane.showMessageDialog(null, "Please select the Date!");
                }

                else{

                    Userdoctorapp updateAppointment = new Userdoctorapp();
                    updateAppointment.setAppId(appID);
                    updateAppointment.setMemberName(memberName);
                    updateAppointment.setDate(date);
                    updateAppointment.setTime(time);
                    updateAppointment.setDocName(docName);
                    updateAppointment.setVenue(venue);
                    updateAppointment.setOtherDetails(otherDetails);

                    String status;

                    status = DoctorAppointmentController.updateAppointment(updateAppointment);

                    if(status.equals("true")){

                        //Clear the form after updating data
                        clearAppointmentForm();

                        //Refresh Table
                        displayAppointmentTable(); 
                
                    }
                }
            }

        }
    }
    
    
    /**
     * Method to Delete an appointment
     * 
     */
    public void DeleteAppointment(){
        
        int row = DocApp_Table.getSelectedRow();
        
        if(row < 0){
        
            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to delete!");
        }
        
        else{

            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
            if(userInput==0)
            {
                String ID = DocApp_Table.getValueAt(row, 0).toString();

                DoctorAppointmentController.deleteAppointment(ID);
            }
        }
    }
    
    
    /**
     * Method to load AppointmentTable
     */
    public static void displayAppointmentTable(){
        
        DocApp_Table.setModel(DoctorAppointmentController.displayAppointmentTable());       
        HideColumnsOfAppointmentTable();
    }
    
    /**
     * Method to set spinner time to 00:00
     */
    public static void setSpinnerToValue(){
 
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);

        Date date = cal.getTime();
        DocApp_TimeSpinner.setValue(date);
       
    }
    
    /**
     * Method to clear the appointment form
     */
    public static void clearAppointmentForm(){
 
        setSpinnerToValue();
        
        DocApp_MemberNameTextField.setText(null);
        DocApp_DateChooser.setDate(null);
        DocApp_DocNameTextField.setText(null);
        DocApp_VenueTextArea.setText(null);
        DocApp_OtherTextArea.setText(null); 
    }
    
    /**
     * Method to fill the form when user clicks on a row of AppointmentTable
     */
      public static void FillAppointmentForm(){
          
         int r = DocApp_Table.getSelectedRow();

         DocApp_MemberNameTextField.setText(DocApp_Table.getValueAt(r, 1).toString());
         DocApp_DateChooser.setDate((Date) DocApp_Table.getValueAt(r, 2));
         
         String time = (String) DocApp_Table.getValueAt(r, 3);
         Date timeForSpinner;
         try {
             timeForSpinner = new SimpleDateFormat("HH:mm a").parse(time);
             DocApp_TimeSpinner.setValue(timeForSpinner);
         } catch (ParseException ex) {
             Logger.getLogger(UserHealth.class.getName()).log(Level.SEVERE, null, ex);
         }
               
         DocApp_DocNameTextField.setText(DocApp_Table.getValueAt(r, 4).toString());
         DocApp_VenueTextArea.setText(DocApp_Table.getValueAt(r, 5).toString());
         DocApp_OtherTextArea.setText(DocApp_Table.getValueAt(r, 6).toString()); 
      }
      
      /**
     * Method to hide unwanted columns of the Appointment table
     */
    public static void HideColumnsOfAppointmentTable(){
        
        //Hide AppID column
        DocApp_Table.getColumnModel().getColumn(0).setWidth(0);
        DocApp_Table.getColumnModel().getColumn(0).setMinWidth(0);
        DocApp_Table.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
    
    
    /**
     * Method to add a health info
     */
    public void AddHealthInfo(){
        
        //Save the user inserted values, inside variables.
        String memberName = HealthInfo_NameTextField.getText();
        String bloodGroup = HealthInfo_BloodComboBox.getSelectedItem().toString();
        String weight = HealthInfo_WeightBox.getText();
        String height = HealthInfo_HeightBox.getText();
        String allergies = HealthInfo_AllergiesBox.getText();
        
        
        Long count = HealthInfoController.countMemberName(memberName);

        if(count>0){
        
            JOptionPane.showMessageDialog(null, "This member already added! Check member name again");
        }
        
        else{
        
            Userhealthinfo info = new Userhealthinfo();
            info.setMemberName(memberName);
            info.setBloodGroup(bloodGroup);
            info.setWeight(weight);
            info.setHeight(height);
            info.setAllergies(allergies);

            String status;

            status = HealthInfoController.addHealthInfo(info);

            if(status.equals("true")){
                    clearHealthInfoForm();
                    displayHealthInfoTable();
            }

        }
        
    }
    
    
    /**
     * Method to update a health info
     */
    public void UpdateHealthInfo(){
        
        int row = HealthInfo_Table.getSelectedRow();

        if(row < 0){

            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to update!");
        }

        else{

            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
            if(userInput==0)
            {
            
                int memID = (int) HealthInfo_Table.getValueAt(row, 0);

                //Save the user inserted values, inside variables.
                String memberName = HealthInfo_NameTextField.getText();
                String bloodGroup = HealthInfo_BloodComboBox.getSelectedItem().toString();
                String weight = HealthInfo_WeightBox.getText();
                String height = HealthInfo_HeightBox.getText();
                String allergies = HealthInfo_AllergiesBox.getText();     


                Userhealthinfo info = new Userhealthinfo();
                info.setMemberId(memID);
                info.setMemberName(memberName);
                info.setBloodGroup(bloodGroup);
                info.setWeight(weight);
                info.setHeight(height);
                info.setAllergies(allergies);

                String status;

                status = HealthInfoController.updateHealthInfo(info);

                if(status.equals("true")){

                //Clear the form after updating data
                clearHealthInfoForm();

                //Refresh Table
                displayHealthInfoTable();
                
                }
            }
        }
    }
    
    
    /**
     * Method to Delete a health info
     * 
     */
    public void DeleteHealthInfo(){
        
        int row = HealthInfo_Table.getSelectedRow();
        
        if(row < 0){
        
            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to delete!");
        }
        
        else{
            
            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
            if(userInput==0)
            { 
                String ID = HealthInfo_Table.getValueAt(row, 0).toString();

                HealthInfoController.deleteHealthInfo(ID);
            }
            
        }
    }
    
    
    /**
     * Method to hide unwanted columns of the health info table
     */
    public static void HideColumnsOfHealthInfoTable(){
        
        //Hide AppID column
        HealthInfo_Table.getColumnModel().getColumn(0).setWidth(0);
        HealthInfo_Table.getColumnModel().getColumn(0).setMinWidth(0);
        HealthInfo_Table.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
    
    /**
     * Method to load HealthInfo Table
     */
    public static void displayHealthInfoTable(){
        
        HealthInfo_Table.setModel(HealthInfoController.displayHealthInfoTable());       
        HideColumnsOfHealthInfoTable();
    }
    
    
    /**
     * Method to fill the form when user clicks on a row of health info Table
     */
      public static void FillHealthInfoForm(){
          
         int r = HealthInfo_Table.getSelectedRow();

         HealthInfo_NameTextField.setText(HealthInfo_Table.getValueAt(r, 1).toString());
         HealthInfo_BloodComboBox.setSelectedItem(HealthInfo_Table.getValueAt(r, 2).toString());
         HealthInfo_WeightBox.setText(HealthInfo_Table.getValueAt(r, 3).toString());
         HealthInfo_HeightBox.setText(HealthInfo_Table.getValueAt(r, 4).toString());
         HealthInfo_AllergiesBox.setText(HealthInfo_Table.getValueAt(r, 5).toString()); 
      }
    
    
    /**
     * Method to clear the health info form
     */
    public static void clearHealthInfoForm(){

        HealthInfo_NameTextField.setText(null);
        HealthInfo_BloodComboBox.setSelectedIndex(0);
        HealthInfo_WeightBox.setText(null);
        HealthInfo_HeightBox.setText(null);
        HealthInfo_AllergiesBox.setText(null); 
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        DocApp_Table = new javax.swing.JTable();
        DocApp_DeleteButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DocApp_OtherTextArea = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DocApp_VenueTextArea = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        DocApp_DocNameTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Date date = new Date();

        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        DocApp_TimeSpinner = new javax.swing.JSpinner(sm);
        jLabel16 = new javax.swing.JLabel();
        DocApp_DateChooser = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        DocApp_ClearButton = new javax.swing.JButton();
        DocApp_AddButton = new javax.swing.JButton();
        DocApp_UpdateButton = new javax.swing.JButton();
        DocApp_MemberNameTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        HealthInfo_Table = new javax.swing.JTable();
        HealthInfo_DeleteButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        HealthInfo_ClearButton = new javax.swing.JButton();
        HealthInfo_AddButton = new javax.swing.JButton();
        HealthInfo_UpdateButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        HealthInfo_NameTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        HealthInfo_BloodComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        HealthInfo_WeightBox = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        HealthInfo_HeightBox = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HealthInfo_AllergiesBox = new javax.swing.JTextArea();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1370, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocApp_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocApp_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Member Name", "Date", "Time", "Doctor's Name", "Venue", "Other Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DocApp_Table.setRowHeight(35);
        DocApp_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DocApp_TableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(DocApp_Table);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 830, 390));

        DocApp_DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DocApp_DeleteButton.setForeground(new java.awt.Color(255, 51, 51));
        DocApp_DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/deleteRed.png"))); // NOI18N
        DocApp_DeleteButton.setText("Delete");
        DocApp_DeleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        DocApp_DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocApp_DeleteButtonActionPerformed(evt);
            }
        });
        jPanel6.add(DocApp_DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 150, 50));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 860, 490));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DocApp_OtherTextArea.setColumns(20);
        DocApp_OtherTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocApp_OtherTextArea.setRows(5);
        DocApp_OtherTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jScrollPane3.setViewportView(DocApp_OtherTextArea);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 260, 50));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Other Details");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, 20));

        DocApp_VenueTextArea.setColumns(20);
        DocApp_VenueTextArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocApp_VenueTextArea.setRows(5);
        DocApp_VenueTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jScrollPane2.setViewportView(DocApp_VenueTextArea);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 260, 50));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Venue");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 80, 20));

        DocApp_DocNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocApp_DocNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel4.add(DocApp_DocNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 260, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Doctor's Name");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 110, 20));

        JSpinner.DateEditor de = new JSpinner.DateEditor(DocApp_TimeSpinner, "HH:mm");

        DocApp_TimeSpinner.setEditor(de);
        DocApp_TimeSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocApp_TimeSpinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel4.add(DocApp_TimeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 260, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Time");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 50, 20));

        DocApp_DateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        DocApp_DateChooser.setDateFormatString("yyyy-MM-dd");
        DocApp_DateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(DocApp_DateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 260, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Date");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 40, 20));

        DocApp_ClearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DocApp_ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        DocApp_ClearButton.setText("Clear");
        DocApp_ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        DocApp_ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocApp_ClearButtonActionPerformed(evt);
            }
        });
        jPanel4.add(DocApp_ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 50));

        DocApp_AddButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DocApp_AddButton.setForeground(new java.awt.Color(51, 51, 255));
        DocApp_AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/addBlue.png"))); // NOI18N
        DocApp_AddButton.setText("Add  ");
        DocApp_AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        DocApp_AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocApp_AddButtonActionPerformed(evt);
            }
        });
        jPanel4.add(DocApp_AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 150, 50));

        DocApp_UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DocApp_UpdateButton.setForeground(new java.awt.Color(255, 204, 0));
        DocApp_UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/updateYelllow.png"))); // NOI18N
        DocApp_UpdateButton.setText("Update");
        DocApp_UpdateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        DocApp_UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocApp_UpdateButtonActionPerformed(evt);
            }
        });
        jPanel4.add(DocApp_UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 150, 50));

        DocApp_MemberNameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DocApp_MemberNameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel4.add(DocApp_MemberNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Family Member Name");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 20));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 490));

        jTabbedPane1.addTab("Doctor's Appointments", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Serif", 1, 18))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HealthInfo_Table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HealthInfo_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Blood Group", "Weight (kg)", "Height (cm)", "Allergies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HealthInfo_Table.setRowHeight(35);
        HealthInfo_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HealthInfo_TableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(HealthInfo_Table);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 830, 390));

        HealthInfo_DeleteButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HealthInfo_DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/deleteRed.png"))); // NOI18N
        HealthInfo_DeleteButton.setText("Delete");
        HealthInfo_DeleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        HealthInfo_DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthInfo_DeleteButtonActionPerformed(evt);
            }
        });
        jPanel5.add(HealthInfo_DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 150, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 860, 490));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HealthInfo_ClearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HealthInfo_ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        HealthInfo_ClearButton.setText("Clear");
        HealthInfo_ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        HealthInfo_ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthInfo_ClearButtonActionPerformed(evt);
            }
        });
        jPanel7.add(HealthInfo_ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 140, 50));

        HealthInfo_AddButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HealthInfo_AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/addBlue.png"))); // NOI18N
        HealthInfo_AddButton.setText("Add   ");
        HealthInfo_AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        HealthInfo_AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthInfo_AddButtonActionPerformed(evt);
            }
        });
        jPanel7.add(HealthInfo_AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 150, 50));

        HealthInfo_UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HealthInfo_UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/updateYelllow.png"))); // NOI18N
        HealthInfo_UpdateButton.setText("Update");
        HealthInfo_UpdateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        HealthInfo_UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HealthInfo_UpdateButtonActionPerformed(evt);
            }
        });
        jPanel7.add(HealthInfo_UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 150, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Family Member Name");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 20));

        HealthInfo_NameTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HealthInfo_NameTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(HealthInfo_NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 260, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Blood Group");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 110, 20));

        HealthInfo_BloodComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        HealthInfo_BloodComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please select the blood group", "A-", "A+", "B-", "B+", "AB-", "AB+", "O-", "O+" }));
        HealthInfo_BloodComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(HealthInfo_BloodComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 260, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Weight (kg)");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 100, 20));

        HealthInfo_WeightBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HealthInfo_WeightBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(HealthInfo_WeightBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 260, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Height (cm)");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 100, 20));

        HealthInfo_HeightBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HealthInfo_HeightBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(HealthInfo_HeightBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 260, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Allergies");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 70, 20));

        HealthInfo_AllergiesBox.setColumns(20);
        HealthInfo_AllergiesBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HealthInfo_AllergiesBox.setRows(5);
        HealthInfo_AllergiesBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jScrollPane1.setViewportView(HealthInfo_AllergiesBox);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 80));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 330, 490));

        jTabbedPane1.addTab("Family Members' Health Infomation", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1230, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DocApp_UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocApp_UpdateButtonActionPerformed
        
        UpdateAppointment();
    }//GEN-LAST:event_DocApp_UpdateButtonActionPerformed

    private void DocApp_DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocApp_DeleteButtonActionPerformed
       
         //Call DeleteContact method
        DeleteAppointment();
        
        //Call the method to clear the form after delete data.
        clearAppointmentForm();
        
        //Refresh ContactTable
        displayAppointmentTable();  
    }//GEN-LAST:event_DocApp_DeleteButtonActionPerformed

    private void DocApp_AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocApp_AddButtonActionPerformed
        
        //Call the method to add an appointment
        AddAppointment();
        
    }//GEN-LAST:event_DocApp_AddButtonActionPerformed

    private void DocApp_ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocApp_ClearButtonActionPerformed
       
        //Call the method to clear the appointment form
        clearAppointmentForm();
    }//GEN-LAST:event_DocApp_ClearButtonActionPerformed

    private void HealthInfo_DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthInfo_DeleteButtonActionPerformed
        
        //Call the method to delete a health info from the table
        DeleteHealthInfo();
        
        //Clear the form after updating data
        clearHealthInfoForm();

        //Refresh Table
        displayHealthInfoTable();
    }//GEN-LAST:event_HealthInfo_DeleteButtonActionPerformed

    private void HealthInfo_ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthInfo_ClearButtonActionPerformed
        
        //Call the method to clear the health info table
        clearHealthInfoForm();
    }//GEN-LAST:event_HealthInfo_ClearButtonActionPerformed

    private void HealthInfo_AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthInfo_AddButtonActionPerformed
        
        //Call the method to add a new health info
        AddHealthInfo();
    }//GEN-LAST:event_HealthInfo_AddButtonActionPerformed

    private void HealthInfo_UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HealthInfo_UpdateButtonActionPerformed
        
        //Call the method to update a health info
        UpdateHealthInfo();
    }//GEN-LAST:event_HealthInfo_UpdateButtonActionPerformed

    private void DocApp_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DocApp_TableMouseClicked

        //Call the method to fill the form when user clicks on a row of the appintment table
        FillAppointmentForm();
    }//GEN-LAST:event_DocApp_TableMouseClicked

    private void HealthInfo_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HealthInfo_TableMouseClicked
       
        //Call the method to fill the form when user clicks on a row of the health info table
        FillHealthInfoForm();
    }//GEN-LAST:event_HealthInfo_TableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DocApp_AddButton;
    private javax.swing.JButton DocApp_ClearButton;
    private static com.toedter.calendar.JDateChooser DocApp_DateChooser;
    private javax.swing.JButton DocApp_DeleteButton;
    private static javax.swing.JTextField DocApp_DocNameTextField;
    private static javax.swing.JTextField DocApp_MemberNameTextField;
    private static javax.swing.JTextArea DocApp_OtherTextArea;
    private static javax.swing.JTable DocApp_Table;
    private static javax.swing.JSpinner DocApp_TimeSpinner;
    private javax.swing.JButton DocApp_UpdateButton;
    private static javax.swing.JTextArea DocApp_VenueTextArea;
    private javax.swing.JButton HealthInfo_AddButton;
    private static javax.swing.JTextArea HealthInfo_AllergiesBox;
    private static javax.swing.JComboBox HealthInfo_BloodComboBox;
    private javax.swing.JButton HealthInfo_ClearButton;
    private javax.swing.JButton HealthInfo_DeleteButton;
    private static javax.swing.JTextField HealthInfo_HeightBox;
    private static javax.swing.JTextField HealthInfo_NameTextField;
    private static javax.swing.JTable HealthInfo_Table;
    private javax.swing.JButton HealthInfo_UpdateButton;
    private static javax.swing.JTextField HealthInfo_WeightBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
