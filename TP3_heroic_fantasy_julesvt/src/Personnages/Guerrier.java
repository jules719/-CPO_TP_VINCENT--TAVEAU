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
import Armes.Epee;

public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        compteurGuerriers++;
    }

    @Override
    public void attaquer(Personnage cible) {
        Arme arme = getArmeEnMain();
        int degats = 0;

        if (arme != null) {
            degats = arme.getNiveauAttaque();
            if (arme instanceof Epee) {
                degats *= ((Epee) arme).getFinesse();
                seFatiguer();
            }
        }

        if (aCheval) degats /= 2;

        System.out.println(getNom() + " attaque " + cible.getNom() + " pour " + degats);
        cible.estAttaque(degats);
    }
}
