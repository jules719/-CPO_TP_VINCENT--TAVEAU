/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombre_julesvt;

import java.util.Scanner;

/**
 *
 * @author jules
 */
public class TP1_manipNombre_julesvt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Entrez le premier entier : ");
        int a = scanner.nextInt();
        System.out.print("Entrez le deuxième entier : ");
        int b = scanner.nextInt();
        System.out.println("\nVous avez saisi : a = " + a + " et b = " + b);

        int somme = a + b;
        int difference = a - b;
        int produit = a * b;

        System.out.println("\nRésultats des opérations :");
        System.out.println("Somme : " + somme);
        System.out.println("Différence : " + difference);
        System.out.println("Produit : " + produit);

        
        if (b != 0) {
            int quotient = a / b;
            int reste = a % b;
            System.out.println("Quotient entier (a / b) : " + quotient);
            System.out.println("Reste de la division euclidienne (a % b) : " + reste);
        } else {
            System.out.println("Division par zéro impossible !");
        }

       
        scanner.close();
    }
}    
