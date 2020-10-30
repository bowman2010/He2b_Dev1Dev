
package Exos_A1;

import FvpLib.Utils;

/**
 *
 * @author bowman
 */
public class Exo_6 {
    
    
    public static void main(String[] args) {
        Utils.horizLn(60, '=');
        Utils.println("Calcul de TVA");
        Utils.horizLn(60, '=');
        

        double htva  = Utils.askForDouble("Prix HTVA : ");
        double tva   = Utils.askForDouble("      TVA ; ");

        
        String htvastr =  Utils.dotAligned( 7, 2, htva);
        String tvastr  =  Utils.dotAligned( 7, 2, tva);
        Utils.horizLn(60, '-');
        String ttcstr  =  Utils.dotAligned( 7, 2, htva+tva);
        Utils.horizLn(60, '-');
        System.out.println ("Prix HTVA = "+ htvastr);
        System.out.println ("TVA       = "+ tvastr);
        System.out.println ("Prix TTC  = "+ ttcstr);                                 
        Utils.horizLn(60, '=');

    }
    
}
