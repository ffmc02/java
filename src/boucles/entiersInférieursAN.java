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
public class entiersInférieursAN {

    public static void main(String args[]) {
        System.out.println(" Les entiers inférieurs à N(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        //nombre rentrer par l'utilisateur
        int nbr;
        //nombre entier inferieur à nbr
        int n;
        System.out.println("Ecrivez un nombre entier.");
        nbr = lectureclavier.nextInt();
        //boucle for; n = nbr-1, si n est supperieur a 0 alors je retire 1 a n 
        for(n= nbr-1; n>0; n--){
            // j'affiche les nombres entier inferieur à N;
            System.out.println(n);
        }
    }

}
