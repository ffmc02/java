/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuresDeContrôle;

import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class participation {

    public static void main(String args[]) {
        System.out.println("participation(V1.0, 25/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
// total participation avant la majoration 
        int TOTPARTA;
        // total participation 
        int TOTPART;
//Participation si celibatiaire
        int Celi;
        Celi = 20;
// participation si marier 
        int Mar;
        Mar = 25;
// participation par enfant 
        int enf;
        enf = 10;
// max de la partticipation 
        int max;
        max = 50;
// participation si salaire inf a 1200 avec maj
        int sal;
        int salP;
        salP = 10;
//result question sur le salaire
        int Result4;
//Nombre d'enfant 
        int nbr;
// salaire (entier) 
        int slr;
//resulta question 1 (celib)
        char rep1;
        int Result1;
//resultat question 2(marier)
        int resul2;
        char rep2;
//resultat question 3 (enfant)
        int rep3;
        int result3;
        //Verification que l'avantage soit inferieur a 50%
        int Result5;

        System.out.println("Si vous étes célibataire Repondé Y si non N");
        rep1 = lectureclavier.nextLine().charAt(0);

        System.out.println("Si vous etes marier réponder Y si non reponder N");
        rep2 = lectureclavier.nextLine().charAt(0);

        System.out.println("Indiquez le nombre d'enfant que vous avez");
        rep3 = lectureclavier.nextInt();

        System.out.println("Votre salaire en chiffre sans virgule");
        slr = lectureclavier.nextInt();

        lectureclavier.nextLine();

        if (rep1 == 'Y') {
            Result1 = Celi;
            System.out.println(Result1 +"% pour votre céliba  ");
        } else if (rep1 == 'N') {
            Result1 = 0;
            System.out.println(Result1 + "% pas célibataire");
        } else {
            Result1 = 0;
            System.out.println("Merci de recommencer et de bien répondre à la question par Y ou N ");
        }
        if (rep2 == 'Y') {
            resul2 = Mar;
            System.out.println(resul2 + "% Marié");

        } else if (rep2 == 'N') {
            resul2 = 0;
            System.out.println(resul2 + "% non marier");
        } else {
            resul2 = 0;
            System.out.println("Merci de recommencer et de bien répondre à la question par Y ou N ");
        }
        if (rep3 > 0) {
            result3 = rep3 * enf;
            System.out.println(result3 + "% pour vos " + rep3 +" enfants");
        } else {
            result3 = 0;
            System.out.println(result3 + " Pas d'enfant");
        }
        TOTPARTA = Result1 + resul2 + result3;
        System.out.println( "votre par est de " + TOTPARTA + "% MAis au maximun de 50%");
        if (TOTPARTA > 50) {
            Result5 = 50;
          TOTPARTA = Result5 ;
        } else {
            Result5 = TOTPARTA;
        }
        if (slr < 1200) {
            System.out.println("Grace a votre salaire une majoration de 10% s'applique");
            TOTPART = TOTPARTA + salP;
            
        } else {
            TOTPART = TOTPARTA;
        }
        System.out.println("L'entreprise participe à hauteur de " + TOTPART + "% Pour vos repas" );
    }

}
