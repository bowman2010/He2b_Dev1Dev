/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Moyenne de 2 nombres
 * Calculer la moyenne de deux nombres donnés.
 * @author bowman
 */
public class Exo2 {
    
    public static void main(String[] args) {
        double a = Utils.askForDouble("Entrez nombre a : ");
        double b = Utils.askForDouble("Entrez nombre b : ");
        Utils.println("Moyenne = "+(a+b)/2);
    }
}