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
public class Calculette {

    public static void main(String args[]) {
        System.out.println("Calculette(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        double nbr1;
        double nbr2;
        double result;
        char operateurUser;
        System.out.println("Entre le un premier Nombre");
        nbr1 = lectureclavier.nextInt();
        System.out.println("Enrez un second nombre");
        nbr2 = lectureclavier.nextInt();
        lectureclavier.nextLine();
        System.out.println("Entré l'opérateur (/ ou * ou + ou - )");
        operateurUser = lectureclavier.nextLine().charAt(0);
        if (operateurUser == '+') {
            result = nbr1 + nbr2;
            System.out.println("Le resultat de l'addition " + nbr1 + " + " + nbr2 + "est égale à " + result);
        } else if (operateurUser == '-') {
            result = nbr1 - nbr2;
            System.out.println("Le resultat de la soustraction " + nbr1 + " - " + nbr2 + "est égale à " + result);
        } else if (operateurUser == '*') {
            result = nbr1 * nbr2;
            System.out.println("Le resultat de la soustraction " + nbr1 + " * " + nbr2 + "est égale à " + result);
        } else if (operateurUser == '/') {
            if (nbr2 == 0) {
                System.out.println("Vous ne pouvez pas divisé par le nombre 0");
            } else {
                result = nbr1 / nbr2;
                System.out.println("Le resultat de la soustraction " + nbr1 + " / " + nbr2 + "est égale à " + result);
            }

        }else{
            System.out.println("L'opérateur choisie n'est pas pris en compte par le systeme veuillez recommencer!!!!!");
        }
    }
}
