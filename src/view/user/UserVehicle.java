/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package view.user;

import controllers.user.UserVehicleController;
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
import model.user.Uservehicle;
/**
 * 
 * UserVehicle -- Interface for manage user's vehicle service details
 * @author Nimanthika
 * 
 */
public class UserVehicle extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserVehicle
     */
    public UserVehicle() {
        initComponents();
        
        //hide menu bar
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        //Load VehicleServiceTable when the form is loading
        displayVehicleServiceTable();
        
        //Set time spinner value to 00:00 when the form is loading
        setSpinnerToValue();
    }

    
    /**
     * Method to set spinner time to 00:00
     */
    public static void setSpinnerToValue(){
 
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);

        Date date = cal.getTime();
        ServiceTimeSpinner.setValue(date); 
    }
    
    
     /**
     * Method to hide unwanted columns of the table
     */
    public static void HideColumnsOfVehicleServiceTable(){
        
        //Hide AppID column
        VehicleServiceTable.getColumnModel().getColumn(0).setWidth(0);
        VehicleServiceTable.getColumnModel().getColumn(0).setMinWidth(0);
        VehicleServiceTable.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
    
    /**
    * Method to load AppointmentTable
    */
    public static void displayVehicleServiceTable(){

        VehicleServiceTable.setModel(UserVehicleController.displayVehicleServiceTable());       
        HideColumnsOfVehicleServiceTable();
    }
    

    /**
     * Method to fill the form when user clicks on a row of VehicleServiceTable
     */
      public static void FillForm(){
          
          int r = VehicleServiceTable.getSelectedRow();

          ServiceDateChooser.setDate((Date) VehicleServiceTable.getValueAt(r, 1));
         
          String time = (String) VehicleServiceTable.getValueAt(r, 2);
          Date timeForSpinner;
          try {
              timeForSpinner = new SimpleDateFormat("HH:mm a").parse(time);
              ServiceTimeSpinner.setValue(timeForSpinner);
          } catch (ParseException ex) {
              Logger.getLogger(UserVehicle.class.getName()).log(Level.SEVERE, null, ex);
          }
            
         VehicleNoBox.setText(VehicleServiceTable.getValueAt(r, 3).toString()); 
         StationNameBox.setText(VehicleServiceTable.getValueAt(r, 4).toString());
         StationAddressBox.setText(VehicleServiceTable.getValueAt(r, 5).toString());
         OtherBox.setText(VehicleServiceTable.getValueAt(r, 6).toString()); 
      }
    
    
    /**
     * Method to clear the form
     */
    public static void clearForm(){
 
        setSpinnerToValue();
        
        ServiceDateChooser.setDate(null);     
        VehicleNoBox.setText(null);
        StationNameBox.setText(null);
        StationAddressBox.setText(null);
        OtherBox.setText(null); 
    }
    
        /**
     * Method to add an Appointment
     */
    public void AddVehicleService(){
        
        //Save the user inserted values, inside variables.
        Date date = ServiceDateChooser.getDate();
        
        JSpinner.DateEditor de = new JSpinner.DateEditor(ServiceTimeSpinner,"HH:mm a");
        String time = (de.getFormat().format(ServiceTimeSpinner.getValue()));
        
        String vehicleNo = VehicleNoBox.getText();
        String stationName = StationNameBox.getText();
        String stationAddress = StationAddressBox.getText();
        String otherDetails = OtherBox.getText();
                
        if(time.equals("00:00 AM")){
        
            JOptionPane.showMessageDialog(null, "Please enter the time!");
        }
        
        else if(date == null){  
            JOptionPane.showMessageDialog(null, "Please select the Date!");
        }
        
        else{
            
            Uservehicle vehicleService = new Uservehicle();
            vehicleService.setDate(date);
            vehicleService.setTime(time);
            vehicleService.setVehicleNo(vehicleNo);
            vehicleService.setStationName(stationName);
            vehicleService.setStationAddress(stationAddress);
            vehicleService.setOther(otherDetails);

            String status;

            status = UserVehicleController.addVehicleService(vehicleService);

            if(status.equals("true")){
                    clearForm();
                    displayVehicleServiceTable();
                }
        
        }

    }
    
    
    /**
     * Method to update a contact
     */
    public void UpdateVehicleService(){
        
        int row = VehicleServiceTable.getSelectedRow();
        
        if(row < 0){
        
            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to update!");
        }
        
        else{
            
            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
            if(userInput==0)
            {
        
                int serviceID = (int) VehicleServiceTable.getValueAt(row, 0);

                //Save the user inserted values, inside variables.
                Date date = ServiceDateChooser.getDate();

                JSpinner.DateEditor de = new JSpinner.DateEditor(ServiceTimeSpinner,"HH:mm a");
                String time = (de.getFormat().format(ServiceTimeSpinner.getValue()));

                String vehicleNo = VehicleNoBox.getText();
                String stationName = StationNameBox.getText();
                String stationAddress = StationAddressBox.getText();
                String otherDetails = OtherBox.getText();  

                if(time.equals("00:00 AM")){

                    JOptionPane.showMessageDialog(null, "Please enter the time!");
                }

                else if(date == null){  
                    JOptionPane.showMessageDialog(null, "Please select the Date!");
                }

                else{

                    Uservehicle vehicleService = new Uservehicle();
                    vehicleService.setServiceId(serviceID);
                    vehicleService.setDate(date);
                    vehicleService.setTime(time);
                    vehicleService.setVehicleNo(vehicleNo);
                    vehicleService.setStationName(stationName);
                    vehicleService.setStationAddress(stationAddress);
                    vehicleService.setOther(otherDetails);

                    String status;

                    status = UserVehicleController.updateVehicleService(vehicleService);

                    if(status.equals("true")){

                        //Clear the form after updating data
                        clearForm();

                        //Refresh Table
                        displayVehicleServiceTable();
                
                    }
                }
            }

        }
    }
    
    
    /**
     * Method to Delete a Vehicle Service
     * 
     */
    public void DeleteVehicleService(){
        
        int row = VehicleServiceTable.getSelectedRow();
        
        if(row < 0){
        
            JOptionPane.showMessageDialog(null, "Please select the row from the table that you want to delete!");
        }
        
        else{

            int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        
            if(userInput==0)
            {
                String ID = VehicleServiceTable.getValueAt(row, 0).toString();

                UserVehicleController.deleteVehicleService(ID);
            }
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
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        VehicleServiceTable = new javax.swing.JTable();
        DeleteButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        ClearButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        ServiceDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        Date date = new Date();

        SpinnerDateModel sm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        ServiceTimeSpinner = new javax.swing.JSpinner(sm);
        jLabel8 = new javax.swing.JLabel();
        VehicleNoBox = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StationAddressBox = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OtherBox = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        StationNameBox = new javax.swing.JTextField();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1370, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Vehicle Service Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VehicleServiceTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VehicleServiceTable.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Time", "Vehicle No.", "Service Station Name", "Service Station Address", "Other Details"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VehicleServiceTable.setRowHeight(35);
        VehicleServiceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VehicleServiceTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(VehicleServiceTable);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 880, 420));

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
        jPanel6.add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 150, 50));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 920, 540));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Manage Vehicle Service Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClearButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        ClearButton.setText("Clear");
        ClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });
        jPanel5.add(ClearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 130, 50));

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(51, 51, 255));
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/addBlue.png"))); // NOI18N
        AddButton.setText("Add");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel5.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 130, 50));

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
        jPanel5.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 150, 50));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Date");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 40, 20));

        ServiceDateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ServiceDateChooser.setDateFormatString("yyyy-MM-dd");
        ServiceDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel5.add(ServiceDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 210, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Time");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 50, 20));

        JSpinner.DateEditor de = new JSpinner.DateEditor(ServiceTimeSpinner, "HH:mm");

        ServiceTimeSpinner.setEditor(de);
        ServiceTimeSpinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ServiceTimeSpinner.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(ServiceTimeSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Vehicle No.");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 110, 20));

        VehicleNoBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VehicleNoBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(VehicleNoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 210, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Service Station Address");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, 20));

        StationAddressBox.setColumns(20);
        StationAddressBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StationAddressBox.setRows(5);
        StationAddressBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jScrollPane2.setViewportView(StationAddressBox);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 210, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Other Details");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 20));

        OtherBox.setColumns(20);
        OtherBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OtherBox.setRows(5);
        OtherBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jScrollPane3.setViewportView(OtherBox);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 210, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Service Station Name ");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 160, 20));

        StationNameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StationNameBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel5.add(StationNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 210, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        
        DeleteVehicleService();
        
        clearForm();
        
        displayVehicleServiceTable();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        
        clearForm();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        AddVehicleService();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
        UpdateVehicleService();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void VehicleServiceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VehicleServiceTableMouseClicked
        
        FillForm();
    }//GEN-LAST:event_VehicleServiceTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DeleteButton;
    private static javax.swing.JTextArea OtherBox;
    private static com.toedter.calendar.JDateChooser ServiceDateChooser;
    private static javax.swing.JSpinner ServiceTimeSpinner;
    private static javax.swing.JTextArea StationAddressBox;
    private static javax.swing.JTextField StationNameBox;
    private javax.swing.JButton UpdateButton;
    private static javax.swing.JTextField VehicleNoBox;
    private static javax.swing.JTable VehicleServiceTable;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
