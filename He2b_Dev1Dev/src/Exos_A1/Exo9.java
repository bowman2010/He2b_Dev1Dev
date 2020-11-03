/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exos_A1;

import FvpLib.Utils;

/**
 * Prix total
 * Étant donné le prix unitaire d’un produit (hors TVA), le taux de TVA (en %) et la
 * quantité de produit vendue à un client, calculer le prix total à payer par ce client.
 * @author bowman
 */
public class Exo9 {
    
    public static void main(String[] args) {
        double prixUnitaire = Utils.askForDouble("Prix unitaire : ");
        double tva = Utils.askForDouble("Tva(%) : ");
        int nbProduits = Utils.askForInt("Nombre de produits : ");
        
        double prixTotal = prixUnitaire*nbProduits*tva/100;
        System.out.println("Prix total = "+prixTotal);
    }
    
}
