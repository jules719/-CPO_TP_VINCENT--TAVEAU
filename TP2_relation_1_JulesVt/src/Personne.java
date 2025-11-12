/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_julesvt;

/**
 *
 * @author jules
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    // Constructeur
    public Personne(String prenom, String nom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // max 3 voitures
    }

    // Méthode pour ajouter une voiture à la personne
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println(voiture_a_ajouter.modele + " a déjà un propriétaire !");
            return false;
        }

        // Si la personne a déjà 3 voitures
        if (nbVoitures >= 3) {
            System.out.println(prenom + " " + nom + " possède déjà 3 voitures !");
            return false;
        }

        // Ajout de la voiture
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this;
        return true;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}


