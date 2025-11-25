/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author jules
 */


import java.util.ArrayList;
import Armes.Arme;
import TP3_heroic_fantasy_julesvt.EtreVivant;

public abstract class Personnage implements EtreVivant {
    private String nom;
    private int niveauVie;
    private ArrayList<Arme> armes = new ArrayList<>();
    private Arme armeEnMain = null;

    public static int compteurPersonnages = 0;
    public static int compteurGuerriers = 0;
    public static int compteurMagiciens = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        compteurPersonnages++;
    }

    public String getNom() { return nom; }
    public int getNiveauVie() { return niveauVie; }
    protected void setNiveauVie(int nv) { niveauVie = nv; }

    public boolean ajouterArme(Arme a) {
        if (armes.size() >= 5) return false;
        armes.add(a);
        return true;
    }

    public void equiper(String nomArme) {
        for (Arme a : armes) {
            if (a.getNom().equalsIgnoreCase(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " a équipé " + a.getNom());
                return;
            }
        }
        System.out.println(nom + " n'a pas trouvé l'arme : " + nomArme);
    }

    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    public void seFatiguer() {
        niveauVie -= 10;
    }

    public boolean estVivant() {
        return niveauVie > 0;
    }

    public void estAttaque(int points) {
        niveauVie -= points;
    }

    public abstract void attaquer(Personnage cible);

    @Override
    public String toString() {
        String s = nom + " (Vie=" + niveauVie + ")";
        s += "\n  Arme en main : " + (armeEnMain == null ? "Aucune" : armeEnMain);
        return s;
    }
}

    

