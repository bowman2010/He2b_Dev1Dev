/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Les intérêts
 * Calculer les intérêts reçus après 1 an pour un montant placé en banque à du 2%
 * d’intérêt.
 * 
 * @author bowman
 */
public class Exo7 {
   
    public static void main(String[] args) {
        double montant = Utils.askForDouble("Entrez un montant : ");
        double interets = montant * 2/100;
        System.out.println("Interets a un an a 2% = "+interets);
    }
}
