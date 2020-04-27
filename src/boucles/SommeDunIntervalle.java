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
public class SommeDunIntervalle {

    public static void main(String args[]) {
        System.out.println(" Somme d'un intervalle(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        //premier nombre choisie par l'utilisateur 
        int n1;
        //second nombre choisie par l'utilisateur 
        int n2;
        //somme des entiers de n1 à n2.
        int addN1N2;
        addN1N2 = 0;
        System.out.println("Saisissez un premier nombre entier");
        n1 = lectureclavier.nextInt();
        System.out.println("Saisissez un second nombre entier qui doit étre plus grand que Le PREMIER NOMBRE");
        n2 = lectureclavier.nextInt();
        //je vérifie que le nombre 1 est plus petit que le nombre 2
        if (n1 < n2) {
            /**
             * si c'est le cas je fait ma boucle for.
             *
             * i est egale a n1, si i est supérieur ou égale a n2 , j'ajoute 1 a
             * i
             */
            for (int i = n1; i <= n2; i++) {
                //je calcule la somme comprise entre N1 et N2
                addN1N2 = addN1N2 + i;
            }
            System.out.println("La somme des nombres entier compris entre les deux nombres choisi est " + addN1N2);
        } else {
            //si non je met un message d'erreur sans 
            System.out.println("Vous avez rentre le nombre N2 plus petit que le nombre N1 ");
        }
    }

}
