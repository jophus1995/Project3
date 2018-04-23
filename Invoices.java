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
public class Invoices implements Serializable {
    ArrayList<Invoice> invoices;
    
    
    // gonna be able to grab invoices
    public void findInvoice(String salesAssociate){
       Invoice invoice;
        for(int i = 0; i < invoices.size(); i ++) {
            if (invoices.get(i).getSalesAssociate().equals(salesAssociate))
              invoice = invoices.get(i);
        }
    }
}
