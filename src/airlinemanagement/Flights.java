/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlinemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Flights extends javax.swing.JFrame {

    public Flights() {
        initComponents();
        setBounds(250,20,900,700);
        DisplayFlights();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendarBeanInfo1 = new com.toedter.calendar.JCalendarBeanInfo();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FSourceCb = new javax.swing.JComboBox<>();
        FDestinationCb = new javax.swing.JComboBox<>();
        FDate = new com.toedter.calendar.JDateChooser();
        FCodeTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightsTable = new javax.swing.JTable();
        FSaveBtn = new javax.swing.JButton();
        FEditBtn = new javax.swing.JButton();
        FDeleteBtn = new javax.swing.JButton();
        FBackBtn = new javax.swing.JButton();
        SeatsTb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jPanel2.setBackground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText(" Manage Flights");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("                                      Air Blue Airlines");
        jLabel2.setOpaque(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Flight code");

        jLabel4.setText("Source");

        jLabel6.setText("Destination");

        jLabel7.setText("Takeof Date");

        jLabel8.setText("No of seats");

        FSourceCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PIA,Pakistan", "Incheon,Southkorea", "Toronto,Canada", "SIA,Sydney", " " }));

        FDestinationCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Incheon,SouthKorea", "PIA,Pakistan", "SIA,Sydney", "Toronto,Canada", " " }));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("List of Flights");

        FlightsTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FlightsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        FlightsTable.setRowHeight(25);
        FlightsTable.setSelectionBackground(new java.awt.Color(0, 102, 255));
        FlightsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        FlightsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightsTable);

        FSaveBtn.setText("Save");
        FSaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FSaveBtnMouseClicked(evt);
            }
        });

        FEditBtn.setText("Edit");
        FEditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FEditBtnMouseClicked(evt);
            }
        });
        FEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEditBtnActionPerformed(evt);
            }
        });

        FDeleteBtn.setText("Delete");
        FDeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FDeleteBtnMouseClicked(evt);
            }
        });

        FBackBtn.setText("Back");
        FBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FBackBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FSaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FEditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FDestinationCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SeatsTb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(132, 132, 132)))))
                .addGap(58, 58, 58))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(FCodeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FSourceCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FDestinationCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SeatsTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FSaveBtn)
                    .addComponent(FEditBtn)
                    .addComponent(FDeleteBtn)
                    .addComponent(FBackBtn))
                .addGap(31, 31, 31)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEditBtnActionPerformed

    private void FBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FBackBtnMouseClicked
       new Management().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_FBackBtnMouseClicked
      Connection con=null;
    PreparedStatement pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    
    
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       
    private void DisplayFlights(){
    try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St=con.createStatement();
        Rs = St.executeQuery("Select * from flighttable");
       FlightsTable.setModel(DbUtils.resultSetToTableModel(Rs));
       
    }catch(Exception e){
   JOptionPane.showMessageDialog(this,e); 
    }
    }
public void clear(){
FCodeTb.setText("");
SeatsTb.setText("");


}

    private void FSaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FSaveBtnMouseClicked
         if(FCodeTb.getText().isEmpty() || SeatsTb.getText().isEmpty() ||  FSourceCb.getSelectedIndex()== -1 ||FDestinationCb.getSelectedIndex()== -1){
          JOptionPane.showMessageDialog(this,"Complete the details");
      }else{
      try{
         
          con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          PreparedStatement Add =con.prepareStatement("insert into flighttable values(?,?,?,?,?)");
          Add.setString(1, FCodeTb.getText());
          Add.setString(2, FSourceCb.getSelectedItem().toString());
          Add.setString(3, FDestinationCb.getSelectedItem().toString());
          Add.setString(4,FDate.getDate().toString() );
          Add.setInt(5, Integer.valueOf(SeatsTb.getText()));
          int row=Add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Flight Added");
          con.close();
         DisplayFlights();
         clear();
      }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
    }                                    
      }
    }//GEN-LAST:event_FSaveBtnMouseClicked

    private void FDeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FDeleteBtnMouseClicked
           if(key == ""){
          JOptionPane.showMessageDialog(null,"Select Flight");
          }else{
              try{
                  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                  String Query="Delete from flighttable where FlCode='"+key+"'";
                  Statement Del=con.createStatement();
                  Del.executeUpdate(Query);
                  DisplayFlights();
                  JOptionPane.showMessageDialog(null,"Flight Deleted");
                  }catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
              }
          }
    }//GEN-LAST:event_FDeleteBtnMouseClicked
String key="";
    private void FlightsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsTableMouseClicked
        DefaultTableModel model = ( DefaultTableModel)FlightsTable.getModel();
    int MyIndex=FlightsTable.getSelectedRow();
    key = model.getValueAt(MyIndex, 0).toString();
    FSourceCb.setSelectedItem(model.getValueAt(MyIndex, 1).toString());
    FDestinationCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
    SeatsTb.setText(model.getValueAt(MyIndex, 4).toString());
    
    }//GEN-LAST:event_FlightsTableMouseClicked

    private void FEditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FEditBtnMouseClicked
       if(key==""){
          JOptionPane.showMessageDialog(this,"Select a pessenger");
      }else{
      try{
        //  CountPassengers();
          con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          String Query="Update flighttable set FlSource=?,FlDestination=?,FlDate=?,FlSeats=? where FlCode=?";
          PreparedStatement Add =con.prepareStatement(Query);
          Add.setString(5, key);
          Add.setString(1, FSourceCb.getSelectedItem().toString());
          Add.setString(2, FDestinationCb.getSelectedItem().toString());
          Add.setString(3,FDate.getDate().toString() );
          Add.setString(4, SeatsTb.getText());
          
          int row=Add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Flight Updated");
          con.close();
          DisplayFlights();
          clear();
      }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
    }                                    
      }
    }//GEN-LAST:event_FEditBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FBackBtn;
    private javax.swing.JTextField FCodeTb;
    private com.toedter.calendar.JDateChooser FDate;
    private javax.swing.JButton FDeleteBtn;
    private javax.swing.JComboBox<String> FDestinationCb;
    private javax.swing.JButton FEditBtn;
    private javax.swing.JButton FSaveBtn;
    private javax.swing.JComboBox<String> FSourceCb;
    private javax.swing.JTable FlightsTable;
    private javax.swing.JTextField SeatsTb;
    private com.toedter.calendar.JCalendarBeanInfo jCalendarBeanInfo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
