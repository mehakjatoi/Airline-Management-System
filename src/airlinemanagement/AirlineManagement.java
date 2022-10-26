/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airlinemanagement;
import javax.swing.JOptionPane;
//import java.awt.Color;

import java.awt.Color;
 class Thread1 extends Thread{
public void run(){
try{
Thread.sleep(100);
}catch(Exception e){
JOptionPane.showMessageDialog(null, e);
}
}
}
public class AirlineManagement {

    Splash S1=new Splash();
   
    public static void main(String[] args) {
    Splash S1=new Splash();
    S1.setVisible(true);
    Login log =new Login();
    try{
         S1.setVisible(true); 
    for(int i=0;i<=100;i++){
      Thread1.sleep(100);
        S1.Loading.setValue(i);
    }
   }catch(Exception e){
       e.getStackTrace(); 
   }
   S1.setVisible(false); 
   log.setVisible(true); 
}
}
