/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Allure et vitesse
 * L’allure d’un coureur est le temps qu’il met pour parcourir 1 km (par exemple, 4 0 37 00 ).
 * On voudrait calculer sa vitesse (en km/h) à partir de son allure. Par exemple, la
 * vitesse d’un coureur ayant une allure de 4 0 37 00 est de 13 km/h
 * @author bowman
 */
public class Exo11 {
   
    public static void main(String[] args) {
        double allure = Utils.askForDouble("Allure (secondes) : ");
        double vitesse = 3600 / allure;
        
        System.out.println("Vitesse = "+vitesse+" Km/h");
    }
    
}
