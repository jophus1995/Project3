/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author KinkyKat
 */
public class Login implements Serializable{
    String username;
    String password;
    Person person;
    WHManager wh;
    SalesAssociate sa;
    OfficeManager om;
    public Login(String fName, String lName, String email, String username, String password){
        this.username = username;
        this.password = password;
        this.person = person;
    }
    
    ArrayList<Login> accounts;
    
    public String getUserName(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
    
    public Person getPerson(){
        return person;
    }
    
    public void setUserName(String u){
        username = u;
    }
    
    public void setPassword(String p){
        password = p;
    }
    
    public void setPerson(Person p){
        person = p;
    }

        public void resetPassword(String username){
         for(int i = 0;i < accounts.size(); i ++){
            if(accounts.get(i).getUserName().equals(username)){
                accounts.get(i).setPassword("password");
            }
         }   
    }
}
