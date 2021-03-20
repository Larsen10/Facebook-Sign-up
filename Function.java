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
   
   