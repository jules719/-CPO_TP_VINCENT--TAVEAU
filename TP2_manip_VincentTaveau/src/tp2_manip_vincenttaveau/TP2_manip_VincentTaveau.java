/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_vincenttaveau;

/**
 *
 * @author jules
 */
public class TP2_manip_VincentTaveau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);

        
        
        Tartiflette assiette3 = assiette2;

        System.out.println("== Avant modification ==");
        System.out.println("nb de calories de assiette2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de assiette3 : " + assiette3.nbCalories);

        
        assiette2.nbCalories += 100;

        System.out.println("\n== Après modification ==");
        System.out.println("nb de calories de assiette2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de assiette3 : " + assiette3.nbCalories);

        System.out.println("\nObservation : assiette2 et assiette3 pointent vers le même objet !");

        
        System.out.println("\n== Avant inversion ==");
        System.out.println("assiette1 : " + assiette1.nbCalories + " calories");
        System.out.println("assiette2 : " + assiette2.nbCalories + " calories");

        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("\n== Après inversion ==");
        System.out.println("assiette1 : " + assiette1.nbCalories + " calories");
        System.out.println("assiette2 : " + assiette2.nbCalories + " calories");

        
        System.out.println("\n== Références incorrectes ==");
        System.out.println("Moussaka assiette666 = assiette1;   // Erreur de type");
        System.out.println("Moussaka assiette667 = new Tartiflette(700); //  Erreur de type");
        System.out.println("→ Une référence de type Moussaka ne peut pas référencer une Tartiflette.");

       
        System.out.println("\n== Tableau de Moussaka ==");
        Moussaka[] tabMoussaka = new Moussaka[10];

        for (int i = 0; i < tabMoussaka.length; i++) {
            tabMoussaka[i] = new Moussaka(400 + i * 10);
        }

        for (int i = 0; i < tabMoussaka.length; i++) {
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }
    }
}