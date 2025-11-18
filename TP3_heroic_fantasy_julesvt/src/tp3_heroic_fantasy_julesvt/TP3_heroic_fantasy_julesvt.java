/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_julesvt;
import Arme.Armes;
import Arme.Epee;
import Arme.Baton ; 
import java.util.ArrayList;
/**
 *
 * @author jules
 */
public class TP3_heroic_fantasy_julesvt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      // Création des épées
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // Création des bâtons
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Tableau dynamique
        ArrayList<Armes> inventaire = new ArrayList<>();
        inventaire.add(excalibur);
        inventaire.add(durandal);
        inventaire.add(chene);
        inventaire.add(charme);

        // Affichage
        System.out.println("Inventaire des armes :");
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println(inventaire.get(i));
        }
    }
}

    

    

