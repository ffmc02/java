/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoJava;

import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class opérateurUnicode {

    public static void main(String args[]) {
        System.out.println("ASCII(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        int[] nbr1 =lectureclavier.nextInt();
        System.out.println("entrez un nombre pour le convertir en UNICODE");
       
        for (int i = 0; i < nbr1.length; i++) {
            System.out.println("Caractère correspondant à l'Unicode " + nbr1[i] + " : " + (char) nbr1[i]);
        }

    }
}
