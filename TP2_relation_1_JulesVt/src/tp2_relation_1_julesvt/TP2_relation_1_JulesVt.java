/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_julesvt;

/**
 *
 * @author jules
 */
public class TP2_relation_1_JulesVt {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        // Création de voitures
        Voiture uneBMW = new Voiture("M3", "BMW", 10);
        Voiture uneAudi = new Voiture("A4", "Audi", 7);
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        // Création de personnes
        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        // Attribution des voitures
        bob.ajouter_voiture(uneClio);
        reno.ajouter_voiture(uneAudi);
        reno.ajouter_voiture(uneBMW);
        reno.ajouter_voiture(uneMicra);

        // Tests d’affichage
        System.out.println("La première voiture de Bob est : " + bob.liste_voitures[0]);
        System.out.println();

        System.out.println("Liste des voitures de Reno :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println("- " + reno.liste_voitures[i]);
        }
    }
}


    
    

