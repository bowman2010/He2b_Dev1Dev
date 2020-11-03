/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Conversion secondes en secondes
 * Étant donné un temps écoulé depuis minuit. Si on devait exprimer ce temps sous la
 * forme habituelle (heure, minute et seconde), que vaudrait la partie "seconde".
 * Ex : 10000 secondes donnera 40 secondes.
 * @author bowman
 */
public class Exo16 {
    
    public static void main(String[] args) {    
        int secondes = Utils.askForInt("Nombre de secondes : ");
        int h = secondes/3600;
        secondes = secondes - h*3600;
        int m = secondes/60;
        int s = secondes - m*60;
        System.out.println("secondes = "+s);
    }
}
