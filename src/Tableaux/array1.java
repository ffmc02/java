/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tableaux;

import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class array1 {

    public static void main(String args[]) {
        System.out.println("array 1(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        int n;
        String tab[];
        //Valeur d'un élément du tableau
        String val;
        System.out.println("Ecrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.");
        System.out.println("Entrez le nombre total d'éléments du tableau à remplir");
        // Initialisation de n
        n = lectureclavier.nextInt();
        //Initialisation du tableau vide avec n nombre total d'éléments
        tab = new String[n];
        /*incorporation des données par l'utilisateur
        *création d'une boucle for : si i est inférieur a n (nombre d'éléments 
        *dans le tableau alors je continue de demander a l'utilisateur
        *d'incrémenter le tableau
         */
        for (int i = 0; i < n; i++) {
            System.out.println("Entrez l'élément d'indice " + i + " du tableau");
            //je recupére la valeur grace a Val 
            val = lectureclavier.next();
            //j'indique a quel valeur du tableau sa correspond grace au i dans la fonction de tab
            tab[i] = val;
        }
        //j'affiche le tableau
        for (String i : tab) {
            System.out.println("les données de votre tableau sont: "+ i);
        }
    }
}
