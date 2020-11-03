/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Durée de trajet
 * Étant donné la vitesse moyenne en m/s d’un véhicule et la distance parcourue en
 * km par ce véhicule, calculer la durée en secondes du trajet de ce véhicule.
 * 
 * @author bowman
 */
public class Exo10 {
   
    public static void main(String[] args) {

        double vitesse = Utils.askForDouble("Vitesse moyenne (m/s) : ");
        double distance = Utils.askForDouble("Distance (Km) : ");

        double duree = distance*1000/vitesse;
        System.out.println("Durée du trajet : "+duree+" secondes");
    }
}
