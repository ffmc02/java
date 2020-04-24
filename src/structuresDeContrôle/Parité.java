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
public class Parité {

    public static void main(String args[]) {
        System.out.println("Parié(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        int result;
        int nbr1;
        System.out.println("Mettez un nombre entier pour savoir si il est paire ou impaire");
        nbr1 = lectureclavier.nextInt();
        result = nbr1 % 2;
        if (result == 0) {
            System.out.println("le nombre " + nbr1 + " est un nombre paire");
        }
        else{
            System.out.println("le nombre " + nbr1 + " est impaire");
        }
    }

}
