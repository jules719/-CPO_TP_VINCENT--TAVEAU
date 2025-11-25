/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author jules
 */


public abstract class Arme {
    private String nom;
    private int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        this.nom = nom;
        if (niveauAttaque < 0) niveauAttaque = 0;
        if (niveauAttaque > 100) niveauAttaque = 100;
        this.niveauAttaque = niveauAttaque;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom + " (Attaque=" + niveauAttaque + ")";
    }
}

    

