/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airlinemanagement;

//import java.awt.Color;

import java.awt.Color;
public class AirlineManagement {
public static void main(String[] args) {
   Splash S1=new Splash();
   S1.setBounds(250,20,800,700);
   Login login=new Login(); 
   login.getContentPane().setBackground(Color.white);
   login.setBounds(250,20,900,700);
   //Management M1=new Management();
    S1.setVisible(true);
    try{
    for(int i=0;i<=100;i++){
        Thread.sleep(60);
        S1.Loading.setValue(i);
    }
   }catch(Exception e){
       e.getStackTrace();
   }
   S1.setVisible(false);
   login.setVisible(true);
     S1.dispose();
  // M1.setVisible(true);
   
    }
    
}
