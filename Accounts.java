/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author KinkyKat
 */
// will have the ablility to determine if a login is a warehouse manager, sales associate, system admin, and office manager
public class Accounts implements Serializable {
    
    ArrayList<Login> accounts;
    
    public Login validate(String userName, String password) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getUserName().equals(userName) && accounts.get(i).getPassword().equals(password)) {
             return accounts.get(i);
    }
}
        return null;
    }
    
}
