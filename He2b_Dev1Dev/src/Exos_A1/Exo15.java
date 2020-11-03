/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Conversion
 * secondes en minutes
 * Étant donné un temps écoulé depuis minuit. Si on devait exprimer ce temps sous la
 * forme habituelle (heure, minute et seconde), que vaudrait la partie "minute".
 * Ex : 10000 secondes donnera 46 minutes.
 * 
 * @author bowman
 */
public class Exo15 {
   
    public static void main(String[] args) {
        int secondes = Utils.askForInt("Nombre de secondes : ");
        int h = (int) Math.floor(secondes/3600);
        secondes = secondes - h*3600;
        int m = (int) Math.floor(secondes/60);
        
        System.out.println("nb de minutes = "+m);
    }
}
