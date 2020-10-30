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
        double tva   = Utils.askForDouble("      TVA ;  ");

        
        var htvastr =  Utils.dotAligned( 7, 2, htva);
        String tvastr  =  Utils.dotAligned( 7, 2, tva);
        String ttcstr  =  Utils.dotAligned( 7, 2, fve);
          
        System.out.println ("Prix HTVA = "+ htvastr);
        System.out.println ("TVA       = "+ tvastr);
        System.out.println ("Prix TTC  = "+ ttcstr);                                 

                
        
    }
    
}
