/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoJava;
//on importe la classe scanner

import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class operateurMoyenne {

    public static void main(String args[]) {
        System.out.println("Calcul de la moyenne(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        // j'initialise les types de variable 
        double ds;
        double de;
        double tp;
        double result;
        //je demande a l'utilisateur de rentre les 3 notes 
        System.out.println("Rentez votre note du devoir surveiller sur 20 ");
        //je recupere la note du devoir surveiller
        ds = lectureclavier.nextInt();
        System.out.println("Rentrez votre note de l'interogation écrite sur 20 ");
        de = lectureclavier.nextInt();
        System.out.println("Rentrez votre note obtenue en travaux pratique sur 20");
        tp= lectureclavier.nextInt();
        result =((ds*3)+(de*2)+tp)/6;
        System.out.println("votre moyenne  est de " + result + " /20 ");
    }

}
