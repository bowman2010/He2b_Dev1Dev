/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 *
 * @author bowman
 */
public class Exo_6 {
    
    
    public static void main(String[] args) {
        double htva  = Utils.askForDouble("Prix HTVA : ");
        double tva = htva*21/100;
        double ttc = htva + tva;
        System.out.println ("Prix     = "+htva);
        System.out.println ("TVA      = "+tva);
        System.out.println ("Prix TTC = "+ttc);
        
    }
    
}
