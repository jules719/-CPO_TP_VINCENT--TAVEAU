/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_vincenttaveau;

/**
 *
 * @author jules
 */
public class BouteilleBiere {

    
     String nom;           
     double degreAlcool;    
     String brasserie;      
     boolean Ouverte;       
    
     public void lireEtiquette() { 
    System.out.println("Bouteille de " + nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; }

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        Ouverte = false;
    }
    
     public boolean Decapsuler() {
        if (Ouverte) {  // Si la bière n’est pas encore ouverte
            Ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte !");
            return false;
        }
    }
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (Ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}


    




