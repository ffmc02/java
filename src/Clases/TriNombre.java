/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class TriNombre {
//création du tableau grace a Arraylist 

    ArrayList<Integer> tableau = new ArrayList<Integer>();
    //définition de la taille 
    int taille;
    // on indique que la classe scanner seras appeller par la variable lectureclavier
    Scanner lectureclavier = new Scanner(System.in);
//definition de la fonction saisie
    void saisie() {
        System.out.println("Merci de saisir la taille du table ");
        this.taille = lectureclavier.nextInt();
        //boucle sur la taille pour mettre l'ajout des données
        for (int i = 0; i < taille; i++) {
            System.out.println("Merci de saisir les données du tableau ");
            tableau.add(lectureclavier.nextInt());
        }
    }
//definition de la variable trie 
    void trie() {
        Collections.sort(tableau);
    }
//définition de la variable affiche 
    void affiche() {
        // boucle de type For each pour permetre l'affichage des données du tableau 
        for (int aff : tableau) {
            System.out.println(aff);
        }
    }
}
