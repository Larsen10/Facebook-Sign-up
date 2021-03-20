/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebooksignup;
import java.util.Scanner;
/**
 *
 * @author Larsen and Raffy
 */
public class Function extends SignUp {
   
   private String Welcome,Welcome1,results;
   
   Scanner scan = new Scanner(System.in);
   
   public  String signup() {
   return Welcome ="-----------------------------------\n"+ 
                   "|            FACEBOOK             |\n" +
                   "|            SIGN-UP              |\n" +
                   "-----------------------------------";    
}
   public  String welcome() {
   return Welcome1 ="-------------PROCESSING-----------\n"+
                    "\n"+"-----------------------------------\n"+ 
                    "|            FACEBOOK             |\n" +        
                    "|            SIGN-UP              |\n" +
                    "|            COMPLTED             |\n" +   
                    "|          VIEW PROFILE           |\n" +          
                    "-----------------------------------"; 
   }
   
   public void functionName(){
    String Fname,Mname,Lname;
    
    System.out.print("First Name: ");
    Fname= scan.next();
    System.out.print("Middle Initial: ");
    Mname= scan.next();
    System.out.print("Last Name: ");
    Lname= scan.next();
    setName(Fname,Mname,Lname);
 
}
   public void functionPEC(){
    String pw,email,contactNumber; 
   
    System.out.print("Create Password: ");
    pw= scan.next();
    setpw(pw);
    
    System.out.print("Email: ");
    email= scan.next();
    setemail(email);
    
    System.out.print("Contact Number: ");
    contactNumber= scan.next();
    setnumber(contactNumber);
   }
}
