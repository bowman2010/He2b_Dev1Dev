/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 *
 * Placement
 * Étant donné le montant d’un capital placé (en €) et le taux d’intérêt annuel (en %),
 * calculer la nouvelle valeur de ce capital après un an.
 * @author bowman
 */
public class Exo8 {

    public static void main(String[] args) {
        double capital = Utils.askForDouble("Entrez le montant du capital en euros : ");
        double taux = Utils.askForDouble("Entrez le taux en % : ");
        
        double interets = capital * taux / 100;
        capital = capital + interets;
        System.out.println("Interets : "+interets+"€");
        System.out.println("Nouveau capital : "+capital+"€");
    }
}
