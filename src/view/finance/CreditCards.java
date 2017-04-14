
package view.finance;

import controller.finance.CreditCardExpensesController;
import controller.finance.CreditCardPaymentsController;
import controller.finance.CreditCardsController;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import model.finance.Creditcardexpenses;
import model.finance.Creditcardpayments;
import model.finance.Creditcards;



public class CreditCards extends javax.swing.JInternalFrame {

    /**
     * Creates new form CreditCards
     */
    public CreditCards() {
        initComponents();
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
      
        loadcombo();
        displaytable();
         
    }
    
     /**
     * Load combo box
     */
    public static void loadcombo(){
    	List l = CreditCardsController.LoadcomboList();
               
        for(Object o : l) {
            jComboBoxNewCreditCardSearch.addItem(o);
        }        
    }  
    
        
     /**
     * Load table data
     */
    public static void displaytable(){
  
    	jTableNewCreditCards.setModel(CreditCardsController.LoadCreditCardTable());
        HideColumns();
    }
    
     /**
     * Load search result
     */
    public static void displaySearch(){
          
          String searchCreditCard = jComboBoxNewCreditCardSearch.getSelectedItem().toString();
        
          //If user didn't select a group from the group combo box.
          if(searchCreditCard.equals("Select Credit Card No")){    
              
              displaytable();      
          }
             
          //If user selects a group from the group combo box.
          else{
              
              jTableNewCreditCards.setModel(CreditCardsController.displaySearchedCreditCardsTable(searchCreditCard)); 
              HideColumns();
          }
      }
    
    /**
     * Hide ID column in table 
     */
    public static void HideColumns(){
        
            int i = 0;
            jTableNewCreditCards.getColumnModel().getColumn(i).setWidth(0);
            jTableNewCreditCards.getColumnModel().getColumn(i).setMinWidth(0);
            jTableNewCreditCards.getColumnModel().getColumn(i).setMaxWidth(0);
    }
    


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jButtonNewCreditCardAdd = new javax.swing.JButton();
        jButtonNewCreditCardClear = new javax.swing.JButton();
        JTextBoxNewCreditCardNo = new javax.swing.JTextField();
        JTextBoxNewCreditCardHolderName = new javax.swing.JTextField();
        jComboBoxNewCreditCardType = new javax.swing.JComboBox();
        jTextBoxNewCreditCardHoldingBank = new javax.swing.JTextField();
        jDateChooserNewCreditCardIssuedDate = new com.toedter.calendar.JDateChooser();
        jDateChooserNewCreditCardExpiryDate = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNewCreditCards = new javax.swing.JTable();
        jButtonNewCreditCardDelete = new javax.swing.JButton();
        jButtonNewCreditCardUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxNewCreditCardSearch = new javax.swing.JComboBox();
        jButtonNewCreditCardSearch = new javax.swing.JButton();
        jButtonNewCreditCardRefresh = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1245, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setBackground(new java.awt.Color(204, 204, 204));
        jLabel57.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(102, 0, 102));
        jLabel57.setText("                         Add Credit Card Details");
        jLabel57.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        jPanel13.setBackground(new java.awt.Color(156, 190, 234));
        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel13.setMinimumSize(new java.awt.Dimension(486, 374));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel64.setText("Credit Card No");

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel65.setText("Card Holder's Name");

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel66.setText("Card Type");

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel67.setText("Issued Date");

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel68.setText("Expiry Date");

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel69.setText("Card Holding Bank");

        jButtonNewCreditCardAdd.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewCreditCardAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewCreditCardAdd.setForeground(new java.awt.Color(0, 0, 204));
        jButtonNewCreditCardAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/addBlue.png"))); // NOI18N
        jButtonNewCreditCardAdd.setText("ADD");
        jButtonNewCreditCardAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCreditCardAddActionPerformed(evt);
            }
        });

        jButtonNewCreditCardClear.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewCreditCardClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewCreditCardClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Broom-48.png"))); // NOI18N
        jButtonNewCreditCardClear.setText("CLEAR");
        jButtonNewCreditCardClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCreditCardClearActionPerformed(evt);
            }
        });

        JTextBoxNewCreditCardNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        JTextBoxNewCreditCardHolderName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jComboBoxNewCreditCardType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Card Type", "Classic (<=100000)", "Gold (>=100000)" }));
        jComboBoxNewCreditCardType.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jTextBoxNewCreditCardHoldingBank.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 1, true));

        jDateChooserNewCreditCardIssuedDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooserNewCreditCardIssuedDate.setDateFormatString("yyyy-MM-dd");

        jDateChooserNewCreditCardExpiryDate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jDateChooserNewCreditCardExpiryDate.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooserNewCreditCardExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel68)
                            .addComponent(jDateChooserNewCreditCardIssuedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jButtonNewCreditCardClear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonNewCreditCardAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel64)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextBoxNewCreditCardHoldingBank, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBoxNewCreditCardType, javax.swing.GroupLayout.Alignment.LEADING, 0, 224, Short.MAX_VALUE)
                                .addComponent(JTextBoxNewCreditCardHolderName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTextBoxNewCreditCardNo, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextBoxNewCreditCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextBoxNewCreditCardHolderName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxNewCreditCardType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel67)
                .addGap(4, 4, 4)
                .addComponent(jDateChooserNewCreditCardIssuedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooserNewCreditCardExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextBoxNewCreditCardHoldingBank, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewCreditCardClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewCreditCardAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(156, 190, 234));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setPreferredSize(new java.awt.Dimension(619, 374));

        jTableNewCreditCards.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableNewCreditCards.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableNewCreditCardsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableNewCreditCards);

        jButtonNewCreditCardDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewCreditCardDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewCreditCardDelete.setForeground(new java.awt.Color(255, 0, 0));
        jButtonNewCreditCardDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/deleteRed.png"))); // NOI18N
        jButtonNewCreditCardDelete.setText("REMOVE");
        jButtonNewCreditCardDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCreditCardDeleteActionPerformed(evt);
            }
        });

        jButtonNewCreditCardUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewCreditCardUpdate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewCreditCardUpdate.setForeground(new java.awt.Color(255, 204, 0));
        jButtonNewCreditCardUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/updateYelllow.png"))); // NOI18N
        jButtonNewCreditCardUpdate.setText("UPDATE");
        jButtonNewCreditCardUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCreditCardUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Credit Card No");

        jComboBoxNewCreditCardSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Credit Card No" }));

        jButtonNewCreditCardSearch.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewCreditCardSearch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewCreditCardSearch.setForeground(new java.awt.Color(255, 153, 0));
        jButtonNewCreditCardSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Search-48 (1).png"))); // NOI18N
        jButtonNewCreditCardSearch.setText("SEARCH");
        jButtonNewCreditCardSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCreditCardSearchActionPerformed(evt);
            }
        });

        jButtonNewCreditCardRefresh.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNewCreditCardRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonNewCreditCardRefresh.setForeground(new java.awt.Color(0, 153, 0));
        jButtonNewCreditCardRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finance/Refresh-48 (1).png"))); // NOI18N
        jButtonNewCreditCardRefresh.setText("REFRESH");
        jButtonNewCreditCardRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCreditCardRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxNewCreditCardSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonNewCreditCardSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButtonNewCreditCardRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonNewCreditCardUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButtonNewCreditCardDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewCreditCardRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewCreditCardSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNewCreditCardSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNewCreditCardUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNewCreditCardDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("                                                                   Credit Card Details");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 0, 153), new java.awt.Color(102, 0, 102)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNewCreditCardAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCreditCardAddActionPerformed

         //add values to database
        try{
            String cardNo;            //credit card number
            String cardHolderName;    //credit card holder's name
            String cardType;          //card type
            Date issuedDate;          //card issued date
            Date expiryDate;          //card expiry date
            String cardHoldingBank;   //card holding bank's name

            cardNo = JTextBoxNewCreditCardNo.getText();
            cardHolderName = JTextBoxNewCreditCardHolderName.getText();
            cardType = jComboBoxNewCreditCardType.getSelectedItem().toString();
            issuedDate = jDateChooserNewCreditCardIssuedDate.getDate();
            expiryDate = jDateChooserNewCreditCardExpiryDate.getDate();
            cardHoldingBank = jTextBoxNewCreditCardHoldingBank.getText();

            Creditcards newCard = new Creditcards();
            newCard.setCardNo(cardNo);
            newCard.setCardHolderName(cardHolderName);
            newCard.setCardType(cardType);
            newCard.setIssuedDate(issuedDate);
            newCard.setExpiryDate(expiryDate);
            newCard.setCardHoldingBank(cardHoldingBank);
            
            CreditCardsController.addCreditCards(newCard);
            
            Creditcardpayments pp = new Creditcardpayments();
            pp.setCardNo(cardNo);
            
            if(cardType.equals("Classic (<=100000)"))
            {
                int i = 100000;
                String bal = String.valueOf(i);
                pp.setRemainingBalance(bal);
            }
            
            if(cardType.equals("Gold (>=100000)"))
            {
                int j = 400000;
                String bal = String.valueOf(j);
                pp.setRemainingBalance(bal);
            }
            
                   
            pp.setRemainingPayments("0");
            pp.setSettledPayments("0");
            pp.setStatus("Settled");
            
            CreditCardPaymentsController.addCreditCardPayment(pp);
            
            Creditcardexpenses cce = new Creditcardexpenses();
            cce.setCardNo(cardNo);
            cce.setAmount("0");
            
            CreditCardExpensesController.addCreditCardExpense(cce);
        }

        catch(Exception e){

            JOptionPane.showMessageDialog(null, e);
        }
             
        displaytable();
        displaySearch();
        
        JTextBoxNewCreditCardNo.setText("");
        JTextBoxNewCreditCardHolderName.setText("");
        jComboBoxNewCreditCardType.setSelectedItem("Select Card Type");
        ((JTextField)jDateChooserNewCreditCardIssuedDate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)jDateChooserNewCreditCardExpiryDate.getDateEditor().getUiComponent()).setText("");
        jTextBoxNewCreditCardHoldingBank.setText("");
      
    }//GEN-LAST:event_jButtonNewCreditCardAddActionPerformed

    private void jButtonNewCreditCardClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCreditCardClearActionPerformed
        //clear textboxes
        JTextBoxNewCreditCardNo.setText("");
        JTextBoxNewCreditCardHolderName.setText("");
        jComboBoxNewCreditCardType.setSelectedItem("Select Card Type");
        ((JTextField)jDateChooserNewCreditCardIssuedDate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)jDateChooserNewCreditCardExpiryDate.getDateEditor().getUiComponent()).setText("");
        jTextBoxNewCreditCardHoldingBank.setText("");
    }//GEN-LAST:event_jButtonNewCreditCardClearActionPerformed

    private void jButtonNewCreditCardUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCreditCardUpdateActionPerformed

       //update credit card data        
       int response = JOptionPane.showConfirmDialog(null, "Do you really want to update?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

      if (response == JOptionPane.YES_OPTION) {
            
       
        int i = jTableNewCreditCards.getSelectedRow();
        String ID = jTableNewCreditCards.getValueAt(i, 0).toString();

            String cardNo;            //credit card number
            String cardHolderName;    //credit card holder's name
            String cardType;          //card type
            Date issuedDate;          //card issued date
            Date expiryDate;          //card expiry date
            String cardHoldingBank;   //card holding bank's name

            cardNo = JTextBoxNewCreditCardNo.getText();
            cardHolderName = JTextBoxNewCreditCardHolderName.getText();
            cardType = jComboBoxNewCreditCardType.getSelectedItem().toString();
            issuedDate = jDateChooserNewCreditCardIssuedDate.getDate();
            expiryDate = jDateChooserNewCreditCardExpiryDate.getDate();
            cardHoldingBank = jTextBoxNewCreditCardHoldingBank.getText();
        
        
        if(cardNo.equals(jTableNewCreditCards.getValueAt(i, 1).toString()))
        {       
            Creditcards crdtcard = new Creditcards();
            crdtcard.setCardId(Integer.parseInt(ID));
            crdtcard.setCardNo(cardNo);
            crdtcard.setCardHolderName(cardHolderName);
            crdtcard.setCardType(cardType);
            crdtcard.setIssuedDate(issuedDate);
            crdtcard.setExpiryDate(expiryDate);
            crdtcard.setCardHoldingBank(cardHoldingBank);

            CreditCardsController.updateCreditCards(crdtcard);
        
            displaytable();
        }
        
        else 
        {
            JOptionPane.showMessageDialog(null, "Credit Card Number cannot be edited!! Please try to edit other details without card number!");
        }
        
      } 
    }//GEN-LAST:event_jButtonNewCreditCardUpdateActionPerformed

    private void jButtonNewCreditCardSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCreditCardSearchActionPerformed
      displaySearch();
    }//GEN-LAST:event_jButtonNewCreditCardSearchActionPerformed

    private void jButtonNewCreditCardRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCreditCardRefreshActionPerformed
         displaytable();
    }//GEN-LAST:event_jButtonNewCreditCardRefreshActionPerformed

    private void jButtonNewCreditCardDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCreditCardDeleteActionPerformed
     
         //delete credit card details
        int response = JOptionPane.showConfirmDialog(null, "Do you really want to delete?", "Confirm",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {

            int i = jTableNewCreditCards.getSelectedRow();
            CreditCardsController.DeleteCreditCards(jTableNewCreditCards.getValueAt(i, 1).toString());
            CreditCardExpensesController.DeleteCreditCardExpense(jTableNewCreditCards.getValueAt(i, 1).toString());
            CreditCardPaymentsController.DeleteCreditCardPayment(jTableNewCreditCards.getValueAt(i, 1).toString());
            displaytable();

        }
    }//GEN-LAST:event_jButtonNewCreditCardDeleteActionPerformed

    private void jTableNewCreditCardsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNewCreditCardsMouseClicked
      
        int i = jTableNewCreditCards.getSelectedRow();

        JTextBoxNewCreditCardNo.setText(jTableNewCreditCards.getValueAt(i, 1).toString());
        JTextBoxNewCreditCardHolderName.setText(jTableNewCreditCards.getValueAt(i, 2).toString());
        jComboBoxNewCreditCardType.setSelectedItem(jTableNewCreditCards.getValueAt(i, 3).toString());
        ((JTextField)jDateChooserNewCreditCardIssuedDate.getDateEditor().getUiComponent()).setText(jTableNewCreditCards.getValueAt(i, 4).toString());
        ((JTextField)jDateChooserNewCreditCardExpiryDate.getDateEditor().getUiComponent()).setText(jTableNewCreditCards.getValueAt(i, 5).toString());
        jTextBoxNewCreditCardHoldingBank.setText(jTableNewCreditCards.getValueAt(i, 6).toString());
    }//GEN-LAST:event_jTableNewCreditCardsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTextBoxNewCreditCardHolderName;
    private javax.swing.JTextField JTextBoxNewCreditCardNo;
    private javax.swing.JButton jButtonNewCreditCardAdd;
    private javax.swing.JButton jButtonNewCreditCardClear;
    private javax.swing.JButton jButtonNewCreditCardDelete;
    private javax.swing.JButton jButtonNewCreditCardRefresh;
    private javax.swing.JButton jButtonNewCreditCardSearch;
    private javax.swing.JButton jButtonNewCreditCardUpdate;
    private static javax.swing.JComboBox jComboBoxNewCreditCardSearch;
    private javax.swing.JComboBox jComboBoxNewCreditCardType;
    private com.toedter.calendar.JDateChooser jDateChooserNewCreditCardExpiryDate;
    private com.toedter.calendar.JDateChooser jDateChooserNewCreditCardIssuedDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTableNewCreditCards;
    private javax.swing.JTextField jTextBoxNewCreditCardHoldingBank;
    // End of variables declaration//GEN-END:variables
}
