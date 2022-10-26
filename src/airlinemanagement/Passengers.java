/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package airlinemanagement;

//import com.sun.jdi.connect.spi.Connection;
//import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Passengers extends javax.swing.JFrame {


    public Passengers() {
        
       initComponents();
       setBounds(250,20,900,700);
     DisplayPassengers();
    }

    @SuppressWarnings("unchecked")
    Connection con=null;
    
    PreparedStatement pst=null;//Dynamic statement-parametrized-values are passed later
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null; 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        EditBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PnameTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PAddressTb = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        PPhoneTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PassNumTb = new javax.swing.JTextField();
        DeleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PassengersTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        NationalityCb = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        SaveBtn = new javax.swing.JButton();
        GenderCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        Duplicate = new javax.swing.JButton();

        jLabel10.setText("Address");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText(" Manage Pessengers");
        jLabel1.setOpaque(true);

        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 102, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("    Air Blue Airlines");
        jLabel2.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText(" List of Pessengers");

        jlabel.setText("Pessenger Name");

        jLabel4.setText("Nationality");

        jLabel11.setText("Phone");

        jLabel6.setText("Gender");

        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        PassengersTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PassengersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        PassengersTable.setRowHeight(25);
        PassengersTable.setSelectionBackground(new java.awt.Color(0, 51, 255));
        PassengersTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        PassengersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PassengersTable);

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

        NationalityCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "SouthKorea", "India", "China ", "USA", "Netherlands" }));

        jLabel7.setText("Passport No");

        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        SaveBtn.setText("Save");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });

        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel8.setText("Address");

        Duplicate.setText("Duplicate PhoneNo");
        Duplicate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DuplicateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(537, Short.MAX_VALUE)
                .addComponent(Duplicate)
                .addGap(120, 120, 120))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(PnameTb, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(SaveBtn)))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(NationalityCb, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(EditBtn)))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(GenderCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(9, 9, 9)
                                                    .addComponent(DeleteBtn)))
                                            .addGap(45, 45, 45)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(PAddressTb)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(PPhoneTb)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(BackBtn)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(247, 247, 247)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 22, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(Duplicate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(242, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(12, 12, 12)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(NationalityCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(GenderCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PnameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PAddressTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PassNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PPhoneTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(29, 29, 29)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SaveBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditBtn)
                            .addComponent(DeleteBtn)
                            .addComponent(BackBtn)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed
private void DisplayPassengers(){
    try{
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
        St=con.createStatement();
        Rs = St.executeQuery("Select * from passengertable");
       PassengersTable.setModel(DbUtils.resultSetToTableModel(Rs));//to display data in the table
       
    }catch(Exception e){
   JOptionPane.showMessageDialog(this,e); 
    }
    }
int PassengerId=0;
private void CountPassengers(){
    try{
        St1=con.createStatement();
        Rs1=St1.executeQuery("select Max(PId) from passengertable"); //5
        Rs1.next();
        PassengerId=Rs1.getInt(1)+1;
    }catch(Exception e){
    }
}

public void clear(){
PnameTb.setText("");
PassNumTb.setText("");
PAddressTb.setText("");
PPhoneTb.setText("");



}
    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
         
           if(PnameTb.getText().isEmpty() || PassNumTb.getText().isEmpty() || PPhoneTb.getText().isEmpty() ||PAddressTb.getText().isEmpty()){
          JOptionPane.showMessageDialog(this,"Complete the details");
           
           }else{
      try{
          CountPassengers();
       
           PreparedStatement Add =con.prepareStatement("insert ignore into passengertable values(?,?,?,?,?,?,?)");
          Add.setInt(1, PassengerId);
          Add.setString(2, PnameTb.getText());
          Add.setString(3, NationalityCb.getSelectedItem().toString());
          Add.setString(4,GenderCb.getSelectedItem().toString() );
          Add.setString(5, PassNumTb.getText());
          Add.setString(6, PAddressTb.getText());
          Add.setString(7, PPhoneTb.getText());
          Add.executeUpdate(); 
          JOptionPane.showMessageDialog(this,"Passenger Added");
         
          con.close();
         DisplayPassengers();
         clear();
      }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
          }
         
        
           }
    }//GEN-LAST:event_SaveBtnMouseClicked
   
    
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
      //key in the table properties  
        if(key==0){
          JOptionPane.showMessageDialog(null,"Select a Passenger");
          }else{
              try{
                  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
                  String Query="Delete from passengertable where PId="+key;
                  Statement Del=con.createStatement();
                  Del.executeUpdate(Query);
                  DisplayPassengers();
                  JOptionPane.showMessageDialog(null,"Passenger Deleted");
                  }catch(Exception e){
              JOptionPane.showMessageDialog(null,e);
              }
          }
    }//GEN-LAST:event_DeleteBtnMouseClicked
  
    private void PassengersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengersTableMouseClicked
    DefaultTableModel model = ( DefaultTableModel)PassengersTable.getModel();
    int MyIndex=PassengersTable.getSelectedRow();
    key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
    PnameTb.setText(model.getValueAt(MyIndex, 1).toString());
    NationalityCb.setSelectedItem(model.getValueAt(MyIndex, 2).toString());
    GenderCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
    PassNumTb.setText(model.getValueAt(MyIndex, 4).toString());
    PAddressTb.setText(model.getValueAt(MyIndex, 5).toString());
    PPhoneTb.setText(model.getValueAt(MyIndex, 6).toString());
    
    }//GEN-LAST:event_PassengersTableMouseClicked
 int key=0;  
    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new Management().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
    if(key==0){
          JOptionPane.showMessageDialog(this,"Select a pessenger");
      }else{
      try{
        //  CountPassengers();
          con= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
          String Query="Update passengertable set PName=?,PNationality=?,PGender=?,PPassport=?,PAddress=?,PPhone=? where PId=?";
          PreparedStatement Add =con.prepareStatement(Query);
          Add.setInt(7, key);
          Add.setString(1, PnameTb.getText());
          Add.setString(2, NationalityCb.getSelectedItem().toString());
          Add.setString(3,GenderCb.getSelectedItem().toString() );
          Add.setString(4, PassNumTb.getText());
          Add.setString(5, PAddressTb.getText());
          Add.setString(6, PPhoneTb.getText());
          int row=Add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Passenger Updated");
          con.close();
          DisplayPassengers();
          clear();
      }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
    }                                    
      }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void DuplicateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DuplicateMouseClicked
        Connection con2;
        try{
         
        con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinedb","root","");
         
          Statement st2=con2.createStatement();
          String selectquery="SELECT PPhone as PPhone_count from passengertable GROUP BY  PPhone HAVING(COUNT(PPhone)>1)";
          ResultSet Rst2= st2.executeQuery(selectquery); 
          while(Rst2.next()){
              /*
              Rst2.next()
              This method returns a boolean value specifying whether the ResultSet object contains more rows. 
              If there are no rows next to its current position this method returns false, else it returns true.
              */
              
              
                    String phone =Rst2.getString("PPhone_count");
                    JOptionPane.showMessageDialog(this,"Duplicate phone num"+" "+"'"+phone+"'");
            
           }  con2.close();  
           }catch(Exception e){
          JOptionPane.showMessageDialog(this,e);
           
           } 
    }//GEN-LAST:event_DuplicateMouseClicked
      
    

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passengers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton Duplicate;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JComboBox<String> NationalityCb;
    private javax.swing.JTextField PAddressTb;
    private javax.swing.JTextField PPhoneTb;
    private javax.swing.JTextField PassNumTb;
    private javax.swing.JTable PassengersTable;
    private javax.swing.JTextField PnameTb;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jlabel;
    // End of variables declaration//GEN-END:variables
}
