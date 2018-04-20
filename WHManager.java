/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import static gui.ProcessCommands.IDS;
import static gui.ProcessCommands.read;
import static gui.ProcessCommands.readFile;
import static gui.ProcessCommands.writeFile;
import java.util.ArrayList;

/**
 *
 * @author KinkyKat
 */
public class WHManager extends Login {
    
    public WHManager(String fName, String lName, String email, String username, String password) {
        super(fName, lName, email, username, password);
    }
    ArrayList<BikePart> total = new ArrayList<BikePart>();
    
    public String update(String welp) {
            
            ArrayList<BikePart> blank = readFile(welp);
            total = read(blank, total);
        return "warehouse updated";
    }
    
    public String examineByPartName(String name) {
        for (int i = 0; i < IDS.size(); i++) {
            if (IDS.get(i).getName().equals(name)) {
                return IDS.get(i).getName() + " " + IDS.get(i).getRightPrice();
            }
        }
        return "part not found";
    }    
    
    public String examineByPartNum(int x) {
        for (int i = 0; i < IDS.size(); i++) {
            if (IDS.get(i).getNum() == (x)) {
                return IDS.get(i).getName() + " " + IDS.get(i).getRightPrice();
            }
        }
        return "part not found";
    }

}
