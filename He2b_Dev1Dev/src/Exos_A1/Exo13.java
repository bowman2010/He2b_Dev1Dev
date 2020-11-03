/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Conversion HMS en secondes
 * Étant donné un moment dans la journée donné par trois nombres, à savoir, heure,
 * minute et seconde, calculer le nombre de secondes écoulées depuis minuit.
 * @author bowman
 */
public class Exo13 {
    
    public static void main(String[] args) {
        System.out.println("Conversion HMS -> secondes\n");
        int h = Utils.askForInt("Heures : ");
        int m = Utils.askForInt("Minutes : ");
        int s = Utils.askForInt("Secondes : ");
        
        int secondes  = h*3600 + m*60 + s;
        System.out.println("Nb de secondes = "+secondes);
    }
    
}
