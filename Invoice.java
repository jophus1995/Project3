/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author KinkyKat
 */
// Gonna have a sales associate and few other fields i think
public class Invoice implements Serializable {
    String customer;
    Date d;
    String empRecieved;
    BikePart b;
    int totCost;
    String salesAssociate;
    
    
    public Invoice(String customer,Date d,String emRecieved,BikePart b, int totCost, String salesAssociate){
        this.customer = customer;
        this.d = d;
        this.empRecieved = empRecieved;
        this.b = b;
        this.totCost = totCost;
        this.salesAssociate = salesAssociate;
    }
    
    public String getCustomer(){
    return customer;
    }
    
    public Date getDate(){
        return d;
    }
    
    public String getEmpRecieved(){
        return empRecieved;
    }
    
    public BikePart getPart(){
        return b;
    }
    
    public int getTotCost(){
        return totCost;
    }
    
    public String getSalesAssociate(){
        return salesAssociate;
    }
    
    
    
}
