/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_julesvt;

import java.util.Scanner;

/**
 *
 * @author jules
 */
public class TP1_convertisseur_Julesvt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        Scanner sc = new Scanner(System.in);

        // 1. On demande la valeur à convertir
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

        // 3. Lecture du choix
        System.out.print("Choisir :  ");
        int choix = sc.nextInt();

        double resultat;
        String message;

        // 4. On utilise if / else pour choisir la conversion
        if (choix == 1) {
            resultat = CelsiusVersKelvin(valeur);
            message = valeur + " °C = " + resultat + " K";
        } 
        else if (choix == 2) {
            resultat = KelvinVersCelsius(valeur);
            message = valeur + " K = " + resultat + " C";
        } 
        else if (choix == 3) {
            resultat = FahrenheitVersCelsius(valeur);
            message = valeur + " F = " + resultat + " C";
        } 
        else if (choix == 4) {
            resultat = CelsiusVersFahrenheit(valeur);
            message = valeur + " C = " + resultat + " F";
        } 
        else if (choix == 5) {
            resultat = FahrenheitVersKelvin(valeur);
            message = valeur + " F = " + resultat + " K";
        } 
        else if (choix == 6) {
            resultat = KelvinVersFahrenheit(valeur);
            message = valeur + " K = " + resultat + " F";
        } 
        else {
            message = "Choix invalide !";
        }

        // 5. Affichage du résultat
        System.out.println("\nResultat : " + message);

        sc.close();
    }

    // --- Méthodes de conversion ---
    public static double CelsiusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }

    public static double KelvinVersCelsius(double tKelvin) {
        return tKelvin - 273.15;
    }

    public static double FahrenheitVersCelsius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    public static double FahrenheitVersKelvin(double tFahrenheit) {
        return CelsiusVersKelvin(FahrenheitVersCelsius(tFahrenheit));
    }

    public static double KelvinVersFahrenheit(double tKelvin) {
        return CelsiusVersFahrenheit(KelvinVersCelsius(tKelvin));
    }
}
