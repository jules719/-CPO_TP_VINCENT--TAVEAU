/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_vincenttaveau;

/**
 *
 * @author jules
 */
public class TP2_Bieres_VincentTaveau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ;
    BouteilleBiere biere2 = new BouteilleBiere("Heineken", 5.0, "Brasserie Heineken");
    BouteilleBiere biere3 = new BouteilleBiere("Chimay Bleue", 9.0, "Abbaye de Scourmont");
    BouteilleBiere biere4 = new BouteilleBiere("Kronenbourg", 4.2, "Brasseries Kronenbourg");

        // Décapsuler quelques-unes
        autreBiere.Decapsuler();
        biere3.Decapsuler();

        // Afficher les bières à l’écran
        System.out.println(autreBiere);
        System.out.println(biere2);
        System.out.println(biere3);
        System.out.println(biere4);

        // Essayer de décapsuler une déjà ouverte
        autreBiere.Decapsuler();
    }
    
    
    
}
