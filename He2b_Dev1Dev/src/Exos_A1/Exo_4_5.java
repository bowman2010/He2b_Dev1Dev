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
public class Exo_4_5 {
    
    public static void main(String[] args) {
        Utils.println("Surface et perimetre d'un cercle");
        double rayon = Utils.askForDouble("Rayon :");
        
        double surface = Math.PI*Math.pow(rayon, 2);
        double perimetre = 2*Math.PI*rayon;
        
        Utils.println("Surface = " + surface);
        Utils.println("Perimetre = "+ perimetre);
    }
    
}
