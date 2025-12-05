/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author jules
 */
public class jeucadenas {

    private int[] combinaisonSecrete; // les 4 chiffres à deviner
    private boolean gagne;            // état de la partie
    private int nbTentatives;         // compteur d'essais

    // ----- CONSTRUCTEUR -----
    public jeucadenas() {
        reinitialiser();
    }

    // ----- GENERATION DE LA COMBINAISON -----
    private void genererCombinaison() {
        Random r = new Random();
        combinaisonSecrete = new int[4];

        for (int i = 0; i < 4; i++) {
            combinaisonSecrete[i] = r.nextInt(10); // chiffre 0 à 9
        }
    }

    // ----- REINITIALISATION DU JEU -----
    public void reinitialiser() {
        genererCombinaison();
        gagne = false;
        nbTentatives = 0;
    }

    // ----- VERIFICATION D'UNE TENTATIVE -----
    // Retourne un tableau de 3 valeurs :
    // [0] = nb exacts
    // [1] = nb trop hauts
    // [2] = nb trop bas
    public int[] verifier(int[] tentative) {

        int exact = 0;
        int tropHaut = 0;
        int tropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (tentative[i] == combinaisonSecrete[i]) {
                exact++;
            } else if (tentative[i] > combinaisonSecrete[i]) {
                tropHaut++;
            } else {
                tropBas++;
            }
        }

        nbTentatives++;

        if (exact == 4) {
            gagne = true;
        }

        return new int[]{exact, tropHaut, tropBas};
    }

    // ----- GETTERS -----
    public boolean isGagne() {
        return gagne;
    }

    public int getNbTentatives() {
        return nbTentatives;
    }

    public int[] getCombinaisonSecrete() {
        return Arrays.copyOf(combinaisonSecrete, combinaisonSecrete.length);
    }
}

