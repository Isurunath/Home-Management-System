/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import View.Inventory.Repair.RepairNotification1;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.Inventory.Repair;
import model.event.EventPlan;
import model.user.Userdoctorapp;
import service.event.EventService;
import service.user.DoctorAppointmentService;
import services.Inventory.RepairService;
import view.user.UserLogin;

/**
 *
 * @author Nipuni
 */
public class MainWindow extends javax.swing.JFrame {

    String username; 
    /**
     * Creates new form NewJFrame
     */
    public MainWindow() {
        initComponents();
        
        jPanel3.setBackground(new Color(92,126,150,165));
        jPanel5.setBackground(new Color(92,126,150,165));
        
        clock();
        username = jLabel3.getText();
//        getNotification();
    }

    public MainWindow(String Username) {
        
        initComponents();
        
        jPanel3.setBackground(new Color(92,126,150,165));
        jPanel5.setBackground(new Color(92,126,150,165));
        
        clock();
        username = jLabel3.getText();
        jLabel3.setText(Username);
        username = jLabel3.getText();
        getNotification();
        getDocAppNotification();
    }
    
    public final void clock(){
        new Thread(){
            public void run(){
                
                while(true){
                    try {
                        
                        GregorianCalendar cal = new GregorianCalendar();
                        int year = cal.get(Calendar.YEAR);
                        int days = cal.get(Calendar.DATE);
                        int month = cal.get(Calendar.MONTH);
                        
                        
                        int hour = cal.get(Calendar.HOUR);
                        int min = cal.get(Calendar.MINUTE);
                        int sec = cal.get(Calendar.SECOND);
                        int Ap = cal.get(Calendar.AM_PM);
                        
                        String day ="";
                        
                        if(Ap ==1){
                            day = "PM";
                        }
                        else{
                            day = "AM";
                        }
                        
                        //clock.setText(hour+":"+min+":"+sec+" "+day);
                        clock.setText(hour+":"+min+":"+sec);
                        //date.setText(days+"|"+month+"|"+year);
                      
                    } catch (Exception e) {
                    }
                    
                    
                }
                
            }
        }.start();
        
    }
    
    
    public static void getDocAppNotification(){
        
        List l = DoctorAppointmentService.GetAppNotifications();
        
        //DocAppPanel.setLayout(null);
        JLabel noti[] = {noti4,noti5};
        
        for(int i=0;i<noti.length;i++){
            
            noti[i].setVisible(false);    
        }
        
        int count = 0;
        
        if(!l.isEmpty()){
            
            head2.setText("Today's Doctor Appointments");
            
            for(Object o : l){
                
                Userdoctorapp app = (Userdoctorapp)o;
                noti[count].setText("* "+app.getMemberName()+" have an appointment at "+app.getTime()+" today.");
                noti[count].setVisible(true);
                count++;
            }
        }
        
        else{
        
            head2.setText("No Doctor Appointments for today");
        }
        
        
    }

    
    public static void getNotification(){
        
        List l = EventService.loadEventNotification();
        String I = RepairService.getMonthlyRepairCount();
        
        jPanel3.setLayout(null);
        JLabel noti[] = {noti1,noti2};
        noti3.setVisible(false);
        jButton2.setVisible(false);
        
        for(int i=0;i<noti.length;i++){
            
            noti[i].setVisible(false);
            
        }
        
        int count = 0;
        
        if(!l.isEmpty()){
            head.setText("Todays Events");
            for(Object o : l){
                EventPlan items = (EventPlan)o;
                noti[count].setText(items.getName()+" at "+items.getStartTime()+" to "+items.getEndTime());
                noti[count].setVisible(true);
                count++;

    //            JLabel lblNewLabel = new JLabel(items.getName());
    //            lblNewLabel.setLocation(20,20);
    //            lblNewLabel.setSize(50, 50);
    //            jPanel3.add(lblNewLabel);
            }
        }
        else{
            head.setText("- No Events -");
        }
        
        if(!I.isEmpty()){
            head1.setText("Repair Count");
            noti3.setText(I);
            noti3.setVisible(true);
            jButton2.setVisible(true);
        }
        else{
            head1.setText("No Repairs");
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

        jPanel2 = new javax.swing.JPanel();
        exitButton7 = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        exitButton8 = new javax.swing.JButton();
        exitButton2 = new javax.swing.JButton();
        exitButton6 = new javax.swing.JButton();
        Contacts = new javax.swing.JButton();
        exitButton4 = new javax.swing.JButton();
        livingRoomButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        head = new javax.swing.JLabel();
        noti1 = new javax.swing.JLabel();
        noti2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        head1 = new javax.swing.JLabel();
        noti3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        head2 = new javax.swing.JLabel();
        noti4 = new javax.swing.JLabel();
        noti5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        clock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton7.setBackground(new java.awt.Color(132, 17, 132));
        exitButton7.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        exitButton7.setForeground(java.awt.Color.white);
        exitButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/plate-fork-and-knife - Copy.png"))); // NOI18N
        exitButton7.setText("Food");
        exitButton7.setToolTipText("");
        exitButton7.setAlignmentX(0.5F);
        exitButton7.setBorder(null);
        exitButton7.setBorderPainted(false);
        exitButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton7.setIconTextGap(1);
        exitButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 180, 120));

        Search.setBackground(new java.awt.Color(132, 17, 132));
        Search.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        Search.setForeground(java.awt.Color.white);
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/magnifying-glass.png"))); // NOI18N
        Search.setText("Search");
        Search.setToolTipText("");
        Search.setAlignmentX(0.5F);
        Search.setBorder(null);
        Search.setBorderPainted(false);
        Search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Search.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Search.setIconTextGap(1);
        Search.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 180, 120));

        exitButton8.setBackground(new java.awt.Color(132, 17, 132));
        exitButton8.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        exitButton8.setForeground(java.awt.Color.white);
        exitButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/user - Copy.png"))); // NOI18N
        exitButton8.setText("User");
        exitButton8.setToolTipText("");
        exitButton8.setAlignmentX(0.5F);
        exitButton8.setBorder(null);
        exitButton8.setBorderPainted(false);
        exitButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton8.setIconTextGap(1);
        exitButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 180, 120));

        exitButton2.setBackground(new java.awt.Color(132, 17, 132));
        exitButton2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        exitButton2.setForeground(java.awt.Color.white);
        exitButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/dollar-sign-and-piles-of-coins.png"))); // NOI18N
        exitButton2.setText("Finance");
        exitButton2.setToolTipText("");
        exitButton2.setAlignmentX(0.5F);
        exitButton2.setBorder(null);
        exitButton2.setBorderPainted(false);
        exitButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton2.setIconTextGap(1);
        exitButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 170, 120));

        exitButton6.setBackground(new java.awt.Color(132, 17, 132));
        exitButton6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        exitButton6.setForeground(java.awt.Color.white);
        exitButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/drawing-house-plan.png"))); // NOI18N
        exitButton6.setText("Plan");
        exitButton6.setToolTipText("");
        exitButton6.setAlignmentX(0.5F);
        exitButton6.setBorder(null);
        exitButton6.setBorderPainted(false);
        exitButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton6.setIconTextGap(1);
        exitButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 180, 120));

        Contacts.setBackground(new java.awt.Color(132, 17, 132));
        Contacts.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        Contacts.setForeground(java.awt.Color.white);
        Contacts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/phone-contact.png"))); // NOI18N
        Contacts.setText("Contacts");
        Contacts.setToolTipText("");
        Contacts.setAlignmentX(0.5F);
        Contacts.setBorder(null);
        Contacts.setBorderPainted(false);
        Contacts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Contacts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Contacts.setIconTextGap(1);
        Contacts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Contacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactsActionPerformed(evt);
            }
        });
        jPanel2.add(Contacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 180, 120));

        exitButton4.setBackground(new java.awt.Color(132, 17, 132));
        exitButton4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        exitButton4.setForeground(new java.awt.Color(255, 255, 255));
        exitButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/event-calendar-symbol.png"))); // NOI18N
        exitButton4.setText("Events");
        exitButton4.setToolTipText("");
        exitButton4.setAlignmentX(0.5F);
        exitButton4.setBorder(null);
        exitButton4.setBorderPainted(false);
        exitButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton4.setIconTextGap(1);
        exitButton4.setInheritsPopupMenu(true);
        exitButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(exitButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, 120));

        livingRoomButton.setBackground(new java.awt.Color(102, 0, 102));
        livingRoomButton.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        livingRoomButton.setForeground(java.awt.Color.white);
        livingRoomButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/livingroom-black-double-sofa.png"))); // NOI18N
        livingRoomButton.setText("Inventory");
        livingRoomButton.setToolTipText("");
        livingRoomButton.setAlignmentX(0.5F);
        livingRoomButton.setBorder(null);
        livingRoomButton.setBorderPainted(false);
        livingRoomButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        livingRoomButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        livingRoomButton.setIconTextGap(1);
        livingRoomButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        livingRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livingRoomButtonActionPerformed(evt);
            }
        });
        jPanel2.add(livingRoomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 410, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 770, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Notifications"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        head.setText("jLabel1");
        jPanel7.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, -1));

        noti1.setBackground(new java.awt.Color(255, 153, 153));
        noti1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noti1.setText("jLabel1");
        jPanel7.add(noti1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, 30));

        noti2.setBackground(new java.awt.Color(204, 204, 255));
        noti2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noti2.setText("jLabel1");
        jPanel7.add(noti2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, 30));

        jTabbedPane1.addTab("Events", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        head1.setText("Repair Count");
        jPanel8.add(head1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 110, 30));

        noti3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noti3.setText("jLabel1");
        jPanel8.add(noti3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 40, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("View Repairs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 170, 30));

        jTabbedPane1.addTab("Inventory", jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        head2.setText("jLabel1");
        jPanel9.add(head2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 400, -1));

        noti4.setBackground(new java.awt.Color(255, 153, 153));
        noti4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noti4.setText("jLabel1");
        jPanel9.add(noti4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 410, 30));

        noti5.setBackground(new java.awt.Color(204, 204, 255));
        noti5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        noti5.setText("jLabel1");
        jPanel9.add(noti5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 410, 30));

        jTabbedPane1.addTab("Doctor", jPanel9);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 450, 280));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 252, 490, 320));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCalendar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 230, 190));

        clock.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        clock.setForeground(new java.awt.Color(255, 255, 255));
        clock.setText("hh:mm:ss ");
        jPanel5.add(clock, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 310, 60));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 500, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/mainback.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 600));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 610, 600));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/remove-button.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 0, 40, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 30));

        jPanel6.setBackground(new java.awt.Color(102, 0, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/logout.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 30, 40, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Username");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 50, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User/Logout.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 80, 120, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu/LogoNew.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1380, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void livingRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livingRoomButtonActionPerformed
        CommanFrame cm = new CommanFrame("inventory",username);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_livingRoomButtonActionPerformed

    private void exitButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton4ActionPerformed
        CommanFrame cm = new CommanFrame("event",username);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButton4ActionPerformed

    private void ContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactsActionPerformed

        CommanFrame cm = new CommanFrame("contacts",username);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ContactsActionPerformed

    private void exitButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton6ActionPerformed
        CommanFrame cm = new CommanFrame("plan",username);
        cm.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_exitButton6ActionPerformed

    private void exitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton2ActionPerformed
        CommanFrame cm = new CommanFrame("finance", username);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButton2ActionPerformed

    private void exitButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton8ActionPerformed
       
        CommanFrame cm = new CommanFrame("user", username);
        cm.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_exitButton8ActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void exitButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButton7ActionPerformed
        CommanFrame cm = new CommanFrame("food", username);
        cm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitButton7ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int input = JOptionPane.showOptionDialog(null, "Do you want to logout?", "Message",
                 JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);

            if(input == JOptionPane.OK_OPTION ){
                
                UserLogin login = new UserLogin();
                login.setVisible(true);
                this.dispose();
            } 
            else{
            
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        RepairNotification1 n = new RepairNotification1();
        n.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Contacts;
    private javax.swing.JButton Search;
    private javax.swing.JLabel clock;
    private javax.swing.JButton exitButton2;
    private javax.swing.JButton exitButton4;
    private javax.swing.JButton exitButton6;
    private javax.swing.JButton exitButton7;
    private javax.swing.JButton exitButton8;
    private static javax.swing.JLabel head;
    private static javax.swing.JLabel head1;
    private static javax.swing.JLabel head2;
    private javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton livingRoomButton;
    private static javax.swing.JLabel noti1;
    private static javax.swing.JLabel noti2;
    private static javax.swing.JLabel noti3;
    private static javax.swing.JLabel noti4;
    private static javax.swing.JLabel noti5;
    // End of variables declaration//GEN-END:variables
}
