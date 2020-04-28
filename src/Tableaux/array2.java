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
public class array2 {

    public static void main(String args[]) {
        System.out.println("array 2(V1.0, 28/04/2020)");
        //definition du boolean avec passage a false
        boolean isArrayElement = false;
        int pos = 0;
        Scanner lectureclavier = new Scanner(System.in);
        //création du tableau comportant 20 prénoms
        String tab[] = {"albert", "maurice", "gaëtan", "hayley", "mia",
            "myléne", "jean pierre", "wilfried", "olivier", "arthure",
            "nicole", "arnaud", "audrey", "fanny", "marie",
            "emilie", "doria", "etienne", "antoine", "roger"};
        //définition de la variable nom (saisie par l'utilisateur
        String nom;
        System.out.println("Entré le nom a supprimé");
        nom = lectureclavier.nextLine();
        System.out.println(nom);
        // debut de la boucle for
        for (int i = 0; i < tab.length; i++) {
            //recher l'existance du nom dans le tableau
            if (tab[i].equals(nom)) {
                //si c'est trouvé alors je passe isArrayElement a true
                isArrayElement = true;
                //je dertermine la position du nom avec la variable pos
                pos = i;
                //j'arrette la 
                break;
            }
        }
        //si isArrayElement est true
        if (isArrayElement) {
            for (int x = pos; x < tab.length; x++) {
            //je remplace le non par une case vide
                if (x == tab.length - 1) {
                    tab[x] = "";
                } else {
                    tab[x] = tab[x + 1];
                }
            }
        } else {
            System.out.println("le prénom n'est pas dans la liste");
        }
        for (int z = 0; z < tab.length; z++) {
            System.out.println(tab[z]);
        }
    }

}
