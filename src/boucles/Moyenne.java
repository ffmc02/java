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
public class Moyenne {

    public static void main(String args[]) {
        System.out.println("Moyenne(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        System.out.println("Entrez votre nombre de matières : ");
        // nombre de note 
        int nbNote = 0;
        nbNote = lectureclavier.nextInt();
        double moyenneNote = 0;
        //somme des notes *
        double addNote = 0.0;

        // si i est inferieur au nombre de note total, alors je continue ma boucle
        for (int i = 0; i < nbNote; i++) {
            System.out.println("Donnez votre note : ");
            //je recupere les notes rentré par l'utilisateur.
            double note = lectureclavier.nextDouble();
            //somme de l'ensemble des notes 
            addNote = addNote += note;
//            Calcule de la moyenne 
            moyenneNote = addNote / nbNote;

        }
        //j'indique la moyenne
        System.out.println("Votre moyene est de " + moyenneNote);
//j'indique la somme de toutes les notes 
        System.out.println("La somme des notes est de " + addNote);
    }

}
