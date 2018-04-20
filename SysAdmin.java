/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.ProcessCommands.read;
import static gui.ProcessCommands.readFile;
import static gui.ProcessCommands.total;
import static gui.ProcessCommands.writeFile;
import java.util.ArrayList;

/**
 *
 * @author KinkyKat
 */
public class SysAdmin extends Login {
    ArrayList<Login> accounts;
    public SysAdmin(String fName, String lName, String email, String username, String password) {
        super(fName, lName, email, username, password);
    }
    SysAdmin admin = new SysAdmin("", "", "", "admin","minda");
    
    public void addOfficeManager(String fName, String lName, String email, String username, String password){
        OfficeManager o = new OfficeManager(fName,lName,email,username,password);
        accounts.add(o);
    }
    
    public void addWHManager(String fName, String lName, String email,String username, String password){
        WHManager w = new WHManager(fName,lName,email,username,password);
        accounts.add(w);
    }
    
    public void addSalesAssociate(String fName, String lName, String email,String username, String password){
        SalesAssociate a = new SalesAssociate(fName,lName,email,username,password);
        accounts.add(a);
    }
    
    public void deleteAccount(String username){
        for(int i = 0;i < accounts.size(); i ++){
            if(accounts.get(i).getUsername().equals(username)){
                accounts.remove(i);
            }
        }
    }
    
    public void resetPassword(String username){
         for(int i = 0;i < accounts.size(); i ++){
            if(accounts.get(i).getUsername().equals(username)){
                accounts.get(i).setPassword("password");
            }
         }   
    }
    
        public String addSalesVan(String filename) {
            ArrayList<BikePart> blank = new ArrayList<>();
            total = read(blank, total);
            writeFile(filename, blank);
            blank = readFile(filename);
            total = read(blank, total);
            return "warehouse add";
            
        }
    }
