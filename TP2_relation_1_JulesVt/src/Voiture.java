/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_julesvt;

/**
 *
 * @author jules
 */
public class Voiture {
    
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire; // référence vers le propriétaire

    // Constructeur
    public Voiture(String modele, String marque, int puissanceCV) {
        this.modele = modele;
        this.marque = marque;
        this.puissanceCV = puissanceCV;
        this.proprietaire = null;
    }

    @Override
    public String toString() {
        String nomProprio = (proprietaire != null)
                ? proprietaire.prenom + " " + proprietaire.nom
                : "aucun propriétaire";
        return modele + " (" + marque + ", " + puissanceCV + " CV) - " + nomProprio;
    }
}



