    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Somme de deux nombres;
 * @author bowman
 */
public class Exo1 {
    
    public static void main(String[] args) {
        double a = Utils.askForDouble("Entrez nombre a : ");
        double b = Utils.askForDouble("Entrez nombre b : ");
        Utils.println(""+a+"+"+b+"="+(a+b));
    }
    
}
