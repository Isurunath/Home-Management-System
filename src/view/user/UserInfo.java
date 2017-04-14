/*
 * Copyright (c) 2016 SLIIT, All Rights Reserved.
 * HOME MANAGEMENT SYSTEM
 * SEP GROUP PROJECT - 3rd YEAR
 *
 */
package view.user;

import controllers.user.UserInfoController;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.user.Userinfo;

/**
 *
 * UserInfo -- Interface for manage user information
 * @author Nimanthika
 * 
 */
public class UserInfo extends javax.swing.JInternalFrame {

    /**
     * Creates new form UserInfo
     */
    public UserInfo() {
        initComponents();
        
        //hide menu bar
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        //Fill form if user already entered his details.
        FillUserInfo();
        
        //Hide label
        userIDLabel.setVisible(false);
    }

    UserInfo(String userName) { 
        initComponents();
        
        //hide menu bar
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);

        username = userName;
        
        FillUserInfo();
        userIDLabel.setVisible(false);
    }


    /**
     * Method to add user info
     */
    public void addUserInfo(){
        
        //Save the user inserted values, inside variables.
        String initials = initialsBox.getText();
        String firstName = firstNameBox.getText();
        String middleName = middleNameBox.getText();
        String lastName = lastNameBox.getText();
        String NIC = nicBox.getText();
        Date DOB = DOBDateChooser.getDate();
        
        String telephone1 = telephone1Box.getText();
        String telephone2 = telephone2Box.getText();
        String mobile1 = mobile1Box.getText();
        String mobile2 = mobile2Box.getText();
        String email1 = email1Box.getText();
        String email2 = email2Box.getText();
        
        String companyName = companyNameBox.getText();
        String companyAddress = companyAddressBox.getText();
        String companyTelephone = companyTelephoneBox.getText();
        String companyFax = companyFaxBox.getText();
        String companyEmail = companyEmailBox.getText();
        String companyWebsite = companyWebsiteBox.getText();
        
        String vehicleNo1 = vehicleNo1Box.getText();
        String vehicleNo2 = vehicleNo2Box.getText();
        String LicenceNo = drivingLicenceBox.getText();
        String passportNo = passportNoBox.getText();
        Date passportIssuedDate = passportIssuedDateChooser.getDate();
        Date passportToBeDate = passportToBeDateChooser.getDate();
        
        
        if(DOB == null){  
            JOptionPane.showMessageDialog(null, "Please select the DOB!");
        }
        
        else{
            
            Userinfo user = new Userinfo();
            
            user.setUsername(username);
            user.setInitials(initials);
            user.setFirstName(firstName);
            user.setMiddleName(middleName);
            user.setLastName(lastName);
            user.setNic(NIC);
            user.setDob(DOB);
            
            user.setTelephone1(telephone1);
            user.setTelephone2(telephone2);
            user.setMobile1(mobile1);
            user.setMobile2(mobile2);
            user.setEmail1(email1);
            user.setEmail2(email2);
            
            user.setCompanyName(companyName);
            user.setCompanyAddress(companyAddress);
            user.setCompanyTelephone(companyTelephone);
            user.setCompanyFax(companyFax);
            user.setCompanyEmail(companyEmail);
            user.setCompanyWebsite(companyWebsite);
            
            user.setVehicleNo1(vehicleNo1);
            user.setVehicleNo2(vehicleNo2);
            user.setLicenceNo(LicenceNo);
            user.setPassportNo(passportNo);
            user.setPassportIssuedOn(passportIssuedDate);
            user.setPassportRenewedOn(passportToBeDate);

            String status;

            status = UserInfoController.addUserInfo(user);

            if(status.equals("true")){

                clearPersonalInfoForm();
                clearContactInfoForm();
                clearWorkInfoForm();
                clearDrivingInfoForm();
                FillUserInfo();
            }
        
        }

    }
    
    
    /**
     * Method to update user info
     */
    public void UpdateUserInfo(){
        
        int userInput = JOptionPane.showConfirmDialog(null, "Do you really want to update?");

        if(userInput==0)
        { 
            int UserId = Integer.parseInt(userIDLabel.getText());
            
            //Save the user inserted values, inside variables.
            String initials = initialsBox.getText();
            String firstName = firstNameBox.getText();
            String middleName = middleNameBox.getText();
            String lastName = lastNameBox.getText();
            String NIC = nicBox.getText();
            Date DOB = DOBDateChooser.getDate();

            String telephone1 = telephone1Box.getText();
            String telephone2 = telephone2Box.getText();
            String mobile1 = mobile1Box.getText();
            String mobile2 = mobile2Box.getText();
            String email1 = email1Box.getText();
            String email2 = email2Box.getText();

            String companyName = companyNameBox.getText();
            String companyAddress = companyAddressBox.getText();
            String companyTelephone = companyTelephoneBox.getText();
            String companyFax = companyFaxBox.getText();
            String companyEmail = companyEmailBox.getText();
            String companyWebsite = companyWebsiteBox.getText();

            String vehicleNo1 = vehicleNo1Box.getText();
            String vehicleNo2 = vehicleNo2Box.getText();
            String LicenceNo = drivingLicenceBox.getText();
            String passportNo = passportNoBox.getText();
            Date passportIssuedDate = passportIssuedDateChooser.getDate();
            Date passportToBeDate = passportToBeDateChooser.getDate();

            if(DOB == null){  
                JOptionPane.showMessageDialog(null, "Please select the DOB!");
            }

            else{

                Userinfo user = new Userinfo();

                user.setUserId(UserId);
                user.setUsername(username);
                user.setInitials(initials);
                user.setFirstName(firstName);
                user.setMiddleName(middleName);
                user.setLastName(lastName);
                user.setNic(NIC);
                user.setDob(DOB);

                user.setTelephone1(telephone1);
                user.setTelephone2(telephone2);
                user.setMobile1(mobile1);
                user.setMobile2(mobile2);
                user.setEmail1(email1);
                user.setEmail2(email2);

                user.setCompanyName(companyName);
                user.setCompanyAddress(companyAddress);
                user.setCompanyTelephone(companyTelephone);
                user.setCompanyFax(companyFax);
                user.setCompanyEmail(companyEmail);
                user.setCompanyWebsite(companyWebsite);

                user.setVehicleNo1(vehicleNo1);
                user.setVehicleNo2(vehicleNo2);
                user.setLicenceNo(LicenceNo);
                user.setPassportNo(passportNo);
                user.setPassportIssuedOn(passportIssuedDate);
                user.setPassportRenewedOn(passportToBeDate);

                String status;

                status = UserInfoController.updateUserInfo(user);

                if(status.equals("true")){
                    
                    clearPersonalInfoForm();
                    clearContactInfoForm();
                    clearWorkInfoForm();
                    clearDrivingInfoForm();
                    FillUserInfo();

                }
            }
        }
    }
    
    
    
    /**
     * Method to fill user info if already added
     */
    public void FillUserInfo(){
        
        Long count = UserInfoController.countUsername(username);
 
        if(count>0){
        
            //hide add button
            AddButton.setVisible(false);
            
            List l = UserInfoController.LoadUserInfo(username);

            for(Object o : l){

                model.user.Userinfo userInfo = (model.user.Userinfo)o;

                userIDLabel.setText(userInfo.getUserId().toString());
                initialsBox.setText(userInfo.getInitials());
                firstNameBox.setText(userInfo.getFirstName());
                middleNameBox.setText(userInfo.getMiddleName());
                lastNameBox.setText(userInfo.getLastName());
                nicBox.setText(userInfo.getNic());
                DOBDateChooser.setDate(userInfo.getDob());

                telephone1Box.setText(userInfo.getTelephone1());
                telephone2Box.setText(userInfo.getTelephone2());
                mobile1Box.setText(userInfo.getMobile1());
                mobile2Box.setText(userInfo.getMobile2());
                email1Box.setText(userInfo.getEmail1());
                email2Box.setText(userInfo.getEmail2());

                companyNameBox.setText(userInfo.getCompanyName());
                companyAddressBox.setText(userInfo.getCompanyAddress());
                companyTelephoneBox.setText(userInfo.getCompanyTelephone());
                companyFaxBox.setText(userInfo.getCompanyFax());
                companyEmailBox.setText(userInfo.getCompanyEmail());
                companyWebsiteBox.setText(userInfo.getCompanyWebsite());

                vehicleNo1Box.setText(userInfo.getVehicleNo1());
                vehicleNo2Box.setText(userInfo.getVehicleNo2());
                drivingLicenceBox.setText(userInfo.getLicenceNo());
                passportNoBox.setText(userInfo.getPassportNo());
                passportIssuedDateChooser.setDate(userInfo.getPassportIssuedOn());
                passportToBeDateChooser.setDate(userInfo.getPassportRenewedOn());

            }
        }
        
    }
    
    
    /**
     * Method to clear the form
     */
    public static void clearPersonalInfoForm(){
 
        initialsBox.setText(null);
        firstNameBox.setText(null);
        middleNameBox.setText(null);
        lastNameBox.setText(null);
        nicBox.setText(null);
        DOBDateChooser.setDate(null); 
    }
    
    /**
     * Method to clear the form
     */
    public static void clearContactInfoForm(){
 
        telephone1Box.setText(null);
        telephone2Box.setText(null);
        mobile1Box.setText(null);
        mobile2Box.setText(null);
        email1Box.setText(null);
        email2Box.setText(null);
    }
    
    /**
     * Method to clear the form
     */
    public static void clearWorkInfoForm(){
 
        companyNameBox.setText(null);
        companyAddressBox.setText(null);
        companyTelephoneBox.setText(null);
        companyFaxBox.setText(null);
        companyEmailBox.setText(null);
        companyWebsiteBox.setText(null);
    }    
    
    /**
     * Method to clear the form
     */
    public static void clearDrivingInfoForm(){
 
        vehicleNo1Box.setText(null);
        vehicleNo2Box.setText(null);
        drivingLicenceBox.setText(null);
        passportNoBox.setText(null);
        passportIssuedDateChooser.setDate(null);
        passportToBeDateChooser.setDate(null);
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
        DOBDateChooser = new com.toedter.calendar.JDateChooser();
        nicBox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ClearButtonPersonalInfo = new javax.swing.JButton();
        firstNameBox = new javax.swing.JTextField();
        middleNameBox = new javax.swing.JTextField();
        lastNameBox = new javax.swing.JTextField();
        initialsBox = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ClearButtonContactInfo = new javax.swing.JButton();
        email2Box = new javax.swing.JTextField();
        telephone2Box = new javax.swing.JTextField();
        mobile1Box = new javax.swing.JTextField();
        mobile2Box = new javax.swing.JTextField();
        email1Box = new javax.swing.JTextField();
        telephone1Box = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        companyAddressBox = new javax.swing.JTextArea();
        ClearButtonWorkInfo = new javax.swing.JButton();
        companyWebsiteBox = new javax.swing.JTextField();
        companyNameBox = new javax.swing.JTextField();
        companyTelephoneBox = new javax.swing.JTextField();
        companyFaxBox = new javax.swing.JTextField();
        companyEmailBox = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        passportIssuedDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        passportToBeDateChooser = new com.toedter.calendar.JDateChooser();
        ClearButtonDrivingInfo = new javax.swing.JButton();
        passportNoBox = new javax.swing.JTextField();
        vehicleNo1Box = new javax.swing.JTextField();
        vehicleNo2Box = new javax.swing.JTextField();
        drivingLicenceBox = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        userIDLabel = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1370, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(156, 190, 234));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel6.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DOBDateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        DOBDateChooser.setDateFormatString("yyyy-MM-dd");
        DOBDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel6.add(DOBDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 30));

        nicBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nicBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel6.add(nicBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Initials");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("First Name");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Middle Name");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Last Name");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("NIC No.");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 60, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Date Of Birth");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 90, 20));

        ClearButtonPersonalInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearButtonPersonalInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        ClearButtonPersonalInfo.setText("Clear");
        ClearButtonPersonalInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ClearButtonPersonalInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonPersonalInfoActionPerformed(evt);
            }
        });
        jPanel6.add(ClearButtonPersonalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, 50));

        firstNameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel6.add(firstNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 30));

        middleNameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        middleNameBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel6.add(middleNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, 30));

        lastNameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel6.add(lastNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 30));

        initialsBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        initialsBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel6.add(initialsBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 300, 470));

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Email 2");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 60, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Telephone No.1");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Telephone No.2");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Mobile No.1");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Mobile No.2");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 90, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("Email 1");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 90, 20));

        ClearButtonContactInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearButtonContactInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        ClearButtonContactInfo.setText("Clear");
        ClearButtonContactInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ClearButtonContactInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonContactInfoActionPerformed(evt);
            }
        });
        jPanel8.add(ClearButtonContactInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, 50));

        email2Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email2Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel8.add(email2Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 30));

        telephone2Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telephone2Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel8.add(telephone2Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 30));

        mobile1Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobile1Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel8.add(mobile1Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, 30));

        mobile2Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mobile2Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel8.add(mobile2Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 30));

        email1Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        email1Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel8.add(email1Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 30));

        telephone1Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telephone1Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel8.add(telephone1Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 300, 470));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Work Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Company Website");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Company Name");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 120, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Address");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Telephone No.");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 110, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("Fax No.");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 60, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Company Email ");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 20));

        companyAddressBox.setColumns(20);
        companyAddressBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyAddressBox.setRows(5);
        companyAddressBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jScrollPane1.setViewportView(companyAddressBox);

        jPanel7.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 50));

        ClearButtonWorkInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearButtonWorkInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        ClearButtonWorkInfo.setText("Clear");
        ClearButtonWorkInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ClearButtonWorkInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonWorkInfoActionPerformed(evt);
            }
        });
        jPanel7.add(ClearButtonWorkInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 130, 50));

        companyWebsiteBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyWebsiteBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(companyWebsiteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 210, 30));

        companyNameBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyNameBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(companyNameBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, 30));

        companyTelephoneBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyTelephoneBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(companyTelephoneBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 210, 30));

        companyFaxBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyFaxBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(companyFaxBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 210, 30));

        companyEmailBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        companyEmailBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel7.add(companyEmailBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 210, 30));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 300, 470));

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102), 3), "Driving & Passport Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        jPanel9.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Vehicle No.1");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Vehicle No.2");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("Driving Licence No.");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Passport  No.");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Passport issued on");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 130, 20));

        passportIssuedDateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        passportIssuedDateChooser.setDateFormatString("yyyy-MM-dd");
        passportIssuedDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel9.add(passportIssuedDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 210, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("Passport to be renewed on");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 190, 20));

        passportToBeDateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        passportToBeDateChooser.setDateFormatString("yyyy-MM-dd");
        passportToBeDateChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel9.add(passportToBeDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 210, 30));

        ClearButtonDrivingInfo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClearButtonDrivingInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Clear.png"))); // NOI18N
        ClearButtonDrivingInfo.setText("Clear");
        ClearButtonDrivingInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        ClearButtonDrivingInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonDrivingInfoActionPerformed(evt);
            }
        });
        jPanel9.add(ClearButtonDrivingInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 130, 50));

        passportNoBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passportNoBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel9.add(passportNoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 210, 30));

        vehicleNo1Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vehicleNo1Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel9.add(vehicleNo1Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 210, 30));

        vehicleNo2Box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vehicleNo2Box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel9.add(vehicleNo2Box, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 210, 30));

        drivingLicenceBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        drivingLicenceBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(156, 190, 234), 2));
        jPanel9.add(drivingLicenceBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, 30));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 30, 300, 470));

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(51, 51, 255));
        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/addBlue.png"))); // NOI18N
        AddButton.setText("Add ");
        AddButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 520, 150, 50));

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateButton.setForeground(new java.awt.Color(255, 204, 0));
        UpdateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/updateYelllow.png"))); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 2));
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 520, 150, 50));
        jPanel1.add(userIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 90, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        
        UpdateUserInfo();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        
        addUserInfo();
    }//GEN-LAST:event_AddButtonActionPerformed

    private void ClearButtonDrivingInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonDrivingInfoActionPerformed
        
        clearDrivingInfoForm();
    }//GEN-LAST:event_ClearButtonDrivingInfoActionPerformed

    private void ClearButtonPersonalInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonPersonalInfoActionPerformed
        
        clearPersonalInfoForm();
    }//GEN-LAST:event_ClearButtonPersonalInfoActionPerformed

    private void ClearButtonContactInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonContactInfoActionPerformed
        
        clearContactInfoForm();
    }//GEN-LAST:event_ClearButtonContactInfoActionPerformed

    private void ClearButtonWorkInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonWorkInfoActionPerformed
        
        clearWorkInfoForm();
    }//GEN-LAST:event_ClearButtonWorkInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ClearButtonContactInfo;
    private javax.swing.JButton ClearButtonDrivingInfo;
    private javax.swing.JButton ClearButtonPersonalInfo;
    private javax.swing.JButton ClearButtonWorkInfo;
    private static com.toedter.calendar.JDateChooser DOBDateChooser;
    private javax.swing.JButton UpdateButton;
    private static javax.swing.JTextArea companyAddressBox;
    private static javax.swing.JTextField companyEmailBox;
    private static javax.swing.JTextField companyFaxBox;
    private static javax.swing.JTextField companyNameBox;
    private static javax.swing.JTextField companyTelephoneBox;
    private static javax.swing.JTextField companyWebsiteBox;
    private static javax.swing.JTextField drivingLicenceBox;
    private static javax.swing.JTextField email1Box;
    private static javax.swing.JTextField email2Box;
    private static javax.swing.JTextField firstNameBox;
    private static javax.swing.JTextField initialsBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextField lastNameBox;
    private static javax.swing.JTextField middleNameBox;
    private static javax.swing.JTextField mobile1Box;
    private static javax.swing.JTextField mobile2Box;
    private static javax.swing.JTextField nicBox;
    private static com.toedter.calendar.JDateChooser passportIssuedDateChooser;
    private static javax.swing.JTextField passportNoBox;
    private static com.toedter.calendar.JDateChooser passportToBeDateChooser;
    private static javax.swing.JTextField telephone1Box;
    private static javax.swing.JTextField telephone2Box;
    private static javax.swing.JLabel userIDLabel;
    private static javax.swing.JTextField vehicleNo1Box;
    private static javax.swing.JTextField vehicleNo2Box;
    // End of variables declaration//GEN-END:variables

    private String username=null;
}
