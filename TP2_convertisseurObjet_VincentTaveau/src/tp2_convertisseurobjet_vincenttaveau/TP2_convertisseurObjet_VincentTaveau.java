/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_vincenttaveau;

/**
 *
 * @author jules
 */
public class TP2_convertisseurObjet_VincentTaveau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Convertisseur convertisseur1 = new Convertisseur();

        System.out.println("485C = " + convertisseur1.CelciusVersKelvin(485) + " K");
        System.out.println("5 K = " + convertisseur1.KelvinVersCelcius(5) + " C");
        System.out.println("500F = " + convertisseur1.FahrenheitVersCelcius(500) + " C");      
        
        System.out.println (convertisseur1) ; 
    } 
     
}
