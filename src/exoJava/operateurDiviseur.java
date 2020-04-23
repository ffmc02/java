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
public class operateurDiviseur {
     public static void main(String args[]) {
        System.out.println("Diviseur(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
         int nb1;
        int nb2;
        float result;
        float result2;
        System.out.println("rentre un premeier nombre");
        nb1 = lectureclavier.nextInt();
        System.out.println("Rentrez un second nombre");
        nb2 = lectureclavier.nextInt();
        result = nb1 / nb2;
        result2 = nb1 % nb2;
        System.out.println("le resultat de la division de  " + nb1 + " / " + nb2 + " est égale à  " + result +" il reste " + result2);
        System.out.println("c'est finit. Taper <ret>");
        lectureclavier.next();
     }
}
