/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP3_heroic_fantasy_julesvt;

/**
 *
 * @author jules
 */


import Armes.*;
import Personnages.*;

public class Main {
    public static void main(String[] args) {

        Epee e1 = new Epee("Excalibur", 7, 5);
        Baton b1 = new Baton("Chêne", 4, 5);

        Magicien mag = new Magicien("Merlin", 80, false);
        Guerrier gu = new Guerrier("Arthur", 90, true);

        mag.ajouterArme(e1);
        mag.ajouterArme(b1);
        gu.ajouterArme(e1);
        gu.ajouterArme(b1);

        mag.equiper("Chêne");
        gu.equiper("Excalibur");

        mag.attaquer(gu);
        gu.attaquer(mag);

        System.out.println(mag);
        System.out.println(gu);
    }
}

