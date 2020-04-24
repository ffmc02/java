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
        System.out.println("entrez un nombre pour le convertir en UNICODE");
       
                int nbr1 =lectureclavier.nextInt();
        System.out.println("La trad de "+nbr1+" est "+(char)nbr1);

    }
}