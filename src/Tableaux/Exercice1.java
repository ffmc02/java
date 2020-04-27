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
public class Exercice1 {
    public static void main(String args[]) {
        System.out.println("Exercice 1(V1.0, 26/04/2020)");
        System.out.println("Ecrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.");
        Scanner lectureclavier = new Scanner(System.in);
        int taille;
        int table []; 
        int val;
        System.out.println("Mettre la taille de votre tabelau");
        taille =lectureclavier.nextInt();
        table = new int[taille];
        System.out.println("Ensuite l'utilisateur doit rentrer les différentes valeurs du tableau.");
        int i;
       
            System.out.println("Rentré les valeurs de votre tableau");
        val=lectureclavier.nextInt();
        

    }
    
}
