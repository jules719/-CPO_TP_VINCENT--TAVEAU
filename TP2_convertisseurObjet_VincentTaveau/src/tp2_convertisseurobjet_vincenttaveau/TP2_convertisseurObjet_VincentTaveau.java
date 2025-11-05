/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_vincenttaveau;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisissez une valeur : ");
        double valeur = sc.nextDouble();

        // 2. On affiche le menu
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1 - De Celsius vers Kelvin");
        System.out.println("2 - De Kelvin vers Celsius");
        System.out.println("3 - De Fahrenheit vers Celsius");
        System.out.println("4 - De Celsius vers Fahrenheit");
        System.out.println("5 - De Fahrenheit vers Kelvin");
        System.out.println("6 - De Kelvin vers Fahrenheit");

        System.out.print("Choisir : ");
        int choix = sc.nextInt();

        double resultat;
        String message;

        switch (choix) {
            case 1:
                resultat = convertisseur1.CelsiusVersKelvin(valeur);
                message = valeur + " C = " + resultat + " K";
                break;
            case 2:
                resultat = convertisseur1.KelvinVersCelsius(valeur);
                message = valeur + " K = " + resultat + " C";
                break;
            case 3:
                resultat = convertisseur1.FahrenheitVersCelsius(valeur);
                message = valeur + " °F = " + resultat + " C";
                break;
            case 4:
                resultat = convertisseur1.CelsiusVersFahrenheit(valeur);
                message = valeur + " C = " + resultat + " °F";
                break;
            case 5:
                resultat = convertisseur1.FahrenheitVersKelvin(valeur);
                message = valeur + " F = " + resultat + " K";
                break;
            case 6:
                resultat = convertisseur1.KelvinVersFahrenheit(valeur);
                message = valeur + " K = " + resultat + " F";
                break;
            default:
                message = "Choix invalide !";
                break;
        }

        // 5. Affichage du résultat
        System.out.println("\nRésultat : " + message);
        System.out.println(convertisseur1);

        sc.close();
    }
}

