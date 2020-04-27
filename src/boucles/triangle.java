/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucles;

import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class triangle {

    public static void main(String args[]) {

        System.out.println("triangle(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);

        int nbrLigne;
        System.out.println("Combien de ligne voulez vous que le triangle comporte");
        nbrLigne = lectureclavier.nextInt();
//        boucle for pour les sauts de ligne(le programe contient une boucle for avec a l'interieur deux autres 
        for (int k = 0; k <= nbrLigne; k++) {
            //boucle fort pour les especes ; si j est infirieur au nombre de ligne je continue a mettre les espaces
            for (int j = 0; j < nbrLigne - k; j++) {
                //j'affiche les espece avant les étoiles 
                System.out.print(" ");
            }
            //boucle fort pour les * je prend le nombre d'espace que je multiplie par deux et rajoute 1
            for (int i = 0; i < (k * 2 + 1); i++) {
                //j'affiche les * en fonction de la ligne et du resultat de la multiplication de k*2+1
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
