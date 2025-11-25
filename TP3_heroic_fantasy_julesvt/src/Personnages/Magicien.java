/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author jules
 */


import Armes.Arme;
import Armes.Baton;

public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        compteurMagiciens++;
    }

    @Override
    public void attaquer(Personnage cible) {
        Arme arme = getArmeEnMain();
        int degats = 0;

        if (arme != null) {
            degats = arme.getNiveauAttaque();
            if (arme instanceof Baton) {
                degats *= ((Baton) arme).getAge();
                seFatiguer();
            }
        }

        if (confirme) degats /= 2;

        System.out.println(getNom() + " attaque " + cible.getNom() + " pour " + degats);
        cible.estAttaque(degats);
    }
}

