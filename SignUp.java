/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebooksignup;

/**
 *
 * @author Larsen and Raffy
 */
public class SignUp {
    
    private String Name,password,email,contactNumber, results;
    
    public void setName (String FirstName, String MiddleInitial, String LastName ){
	Name=( FirstName +" "+ MiddleInitial +"."+" "+ LastName );
    }
    String getName (){
	return Name;
    }
    
    public void setpw (String pw ){
	password=pw;
    }
    String getpw (){
	return password;
    }
    
    public void setemail (String emails ){
	email=emails;
    }
    String getemail (){
	return email;
    }
    public void setnumber (String no ){
	contactNumber=no;
    }
    String getnumber(){
	return contactNumber;
    }
    
    String result() {
     return results= 
     "Full Name: " + getName()+"\n"+
     "Password: " + getpw()+"\n"+ 
     "Email: " + getemail()+"\n"+
     "Contact Number: " + getnumber()+"\n"+
     "-----------------------------------";
    }
    
}
