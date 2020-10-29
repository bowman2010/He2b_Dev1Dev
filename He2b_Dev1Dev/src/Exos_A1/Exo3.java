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
public class Exo3 {
    
    public static void main(String[] args) {
        Utils.println("Surface d'un triangle");
        double base  = Utils.askForDouble("Base = ");
        double hauteur = Utils.askForDouble("Hauteur = ");
        Utils.println("Surface = "+(base*hauteur/2));
    }
            
    
}
