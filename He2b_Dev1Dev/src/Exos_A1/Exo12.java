/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 *
 * Somme des chiffres
 * Calculer la somme des chiffres d’un nombre entier de 3 chiffres.
 * 
 * @author bowman
 */
public class Exo12 {

    public static void main(String[] args) {
        int nb = Utils.askForInt("Entrez un nombre a 3 chiffres : ");
        if (nb<100 || nb>999) throw new IllegalArgumentException("Pas un nb a 3 chiffres");
        
        int a = (nb/100)%10;
        int b = (nb/10)%10;
        int c = (nb)%10;
        
        System.out.println("Somme des chiffres = "+(a+b+c));
        
    }
}
