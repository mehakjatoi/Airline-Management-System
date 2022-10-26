
package airlinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class TicketBooking extends javax.swing.JFrame {

   
    public TicketBooking() {
        initComponents();
        setBounds(250,20,900,700);
        GetPassenger();
        NationalityTb.setEditable(false);
        //PassportTb.setEditable(false);
        PassNameTb.setEditable(false);
        GenderTb.setEditable(false);
        GetFlights();
        DisplayBookings();
    }
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null; 
    @SuppressWarnings("unchecked")
    //get data in passenger checkBox
    private void GetPassenger(){
       try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St=con.createStatement();
        String Query="Select * from passengertable";
        Rs = St.executeQuery(Query);
        while(Rs.next()){
        String PId=String.valueOf(Rs.getInt("PId"));
        PassIdCb.addItem(PId);
    }
       
    }catch(Exception e){
   JOptionPane.showMessageDialog(this,e); 
    }
    }
    private void GetFlights(){
       try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St=con.createStatement();
        String Query="Select * from flighttable";
        Rs = St.executeQuery(Query);
        while(Rs.next()){
        String FCode=Rs.getString("FlCode");
        FCodeCb.addItem(FCode);
    }
       
    }catch(Exception e){
   JOptionPane.showMessageDialog(this,e);
    }
    }
    
    //To get pasenger data from pessenger table to booking table
    private void GetPassengerData(){
    String Query="select * from passengertable where PId="+PassIdCb.getSelectedItem().toString();
    Statement St;
    ResultSet Rs;
    try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St=con.createStatement();
        Rs=St.executeQuery(Query);
        if(Rs.next()){
            PassNameTb.setText(Rs.getString("PName"));
            GenderTb.setText(Rs.getString("PGender"));
            PassportTb.setText(Rs.getString("PPassport"));
            NationalityTb.setText(Rs.getString("PNationality"));
            AmountTb.setText("");
        }
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    }
    } 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BookBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PassNameTb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        AmountTb = new javax.swing.JTextField();
        FCodeCb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        PassIdCb = new javax.swing.JComboBox<>();
        PassportTb = new javax.swing.JTextField();
        GenderTb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BookingTable = new javax.swing.JTable();
        ResetBtn = new javax.swing.JButton();
        NationalityTb = new javax.swing.JTextField();
        DuplictaePassport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("    Air Blue Airlines");
        jLabel2.setOpaque(true);

        jLabel7.setText("Passport No");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("        Booking List");

        jLabel11.setText("Nationality");

        BookBtn.setText("Book");
        BookBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookBtnMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("  Manage  Tickets ");
        jLabel1.setOpaque(true);

        jLabel8.setText("Amount");

        PassNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassNameTbActionPerformed(evt);
            }
        });

        jLabel5.setText("Passenger Name");

        jLabel3.setText("Passenger ID");

        jLabel10.setText("Flight Code");

        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        PassIdCb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassIdCbMouseClicked(evt);
            }
        });
        PassIdCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassIdCbActionPerformed(evt);
            }
        });

        jLabel6.setText("Gender");

        BookingTable.setModel(new javax.swing.table.DefaultTableModel(
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
        BookingTable.setRowHeight(25);
        BookingTable.setSelectionBackground(new java.awt.Color(0, 102, 255));
        BookingTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(BookingTable);

        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        DuplictaePassport.setText("Duplicate Passport");
        DuplictaePassport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DuplictaePassportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GenderTb)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(BookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DuplictaePassport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(PassportTb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BackBtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PassIdCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PassNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FCodeCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(GenderTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PassportTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AmountTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NationalityTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BackBtn)
                            .addComponent(ResetBtn)
                            .addComponent(BookBtn)
                            .addComponent(DuplictaePassport))))
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
         GetPassengerData();
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void PassIdCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassIdCbActionPerformed
        GetPassengerData();
    }//GEN-LAST:event_PassIdCbActionPerformed
private void DisplayBookings(){
    try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St=con.createStatement();
        Rs = St.executeQuery("Select * from bookingtable");
        BookingTable.setModel(DbUtils.resultSetToTableModel(Rs));
       
    }catch(Exception e){
   JOptionPane.showMessageDialog(this,e); 
    }
    }
int TId=0;
private void CountFlights(){
    try{
        St1=con.createStatement();
        Rs1=St1.executeQuery("select Max(TicketId) from bookingtable"); //5
        Rs1.next(); //cursor moves row after 5 row
        TId=Rs1.getInt(1)+1;
    }catch(Exception e){
    JOptionPane.showMessageDialog(this,e); 
    }
}

    
    private void BookBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookBtnMouseClicked
 if(PassIdCb.getSelectedIndex() == -1|| FCodeCb.getSelectedIndex() == -1 || AmountTb.getText().isEmpty()){
          JOptionPane.showMessageDialog(this,"Complete the details");
      }else{
      try{
          CountFlights();
          con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          PreparedStatement Add =con.prepareStatement("insert into bookingtable values(?,?,?,?,?,?,?)");
          Add.setInt(1, TId);  
          Add.setString(2, PassNameTb.getText());  
          Add.setString(3,FCodeCb.getSelectedItem().toString() );
          Add.setString(4, GenderTb.getText()); 
          Add.setString(5, PassportTb.getText());
          Add.setInt(6, Integer.valueOf(AmountTb.getText()));   
          Add.setString(7, NationalityTb.getText()); 
          int row=Add.executeUpdate(); 
          JOptionPane.showMessageDialog(this,"Ticket Booked");   
          con.close();
          DisplayBookings();
        
      }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
    }                                    
      }
    }//GEN-LAST:event_BookBtnMouseClicked

    private void PassIdCbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassIdCbMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PassIdCbMouseClicked

    private void PassNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassNameTbActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new Management().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
       PassIdCb.setSelectedIndex(0);
       FCodeCb.setSelectedIndex(0);
       PassNameTb.setText("");
       GenderTb.setText("");
       AmountTb.setText("");
       PassportTb.setText("");
       NationalityTb.setText("");
       
       
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void DuplictaePassportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DuplictaePassportMouseClicked
      Connection con2;
        try{
         
        con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
         
          Statement st2=con2.createStatement();
          String selectquery="SELECT PPassport as PPassport_count from Bookingtable GROUP BY  PPassport HAVING(COUNT(PPassport)>1)";
          ResultSet Rst2= st2.executeQuery(selectquery); 
          while(Rst2.next()){
              
                    String passport =Rst2.getString("PPassport_count");
                    JOptionPane.showMessageDialog(this,"Duplicate passport num"+" "+"'"+passport+"'");
            
           }  con2.close();  
           }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
           
           } 
             
    }//GEN-LAST:event_DuplictaePassportMouseClicked

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
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountTb;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BookBtn;
    private javax.swing.JTable BookingTable;
    private javax.swing.JButton DuplictaePassport;
    private javax.swing.JComboBox<String> FCodeCb;
    private javax.swing.JTextField GenderTb;
    private javax.swing.JTextField NationalityTb;
    private javax.swing.JComboBox<String> PassIdCb;
    private javax.swing.JTextField PassNameTb;
    private javax.swing.JTextField PassportTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
