/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Conversion secondes en heures
 * Étant donné un temps écoulé depuis minuit. Si on devait exprimer ce temps sous la
 * forme habituelle (heure, minute et seconde), que vaudrait la partie "heure".
 * Ex : 10000 secondes donnera 2 heures.
 * @author bowman
 */
public class Exo14 {
   
    public static void main(String[] args) {
        int secondes = Utils.askForInt("Nombre de secondes : ");
        int h = (int) (secondes/3600);
        System.out.println("Nb heures = "+h);
    }
    
}
