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
public class palindrome {

    public static void main(String args[]) {
        System.out.println("Palindrom(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        System.out.print("Entrez un mot  ou une phrase : ");
        String original = lectureclavier.nextLine();
        // on enleve les majuscule pour évité les problémes de casse
        String test = original.toLowerCase();
        // je ne garde que  les caractères alphabétiques
        String allowedList = "abcdefghijklmnopqrstuvwxyz";
        String temp = "";

        for (int i = 0; i < test.length(); i++) {
            char c = test.charAt(i);
            if (allowedList.indexOf(c) != -1) {
                temp += c;
            }
        }
        test = temp;

        // On teste si mot2 est un palindrôme
        int leftPos = 0;
        int rightPos = test.length() - 1;
        boolean palindrome = true;
        //on vérifiez que la lettre la plus a gauche et la plus a droite sont les memes
        while ((leftPos < rightPos) && palindrome) {
            //on teste si se n'est pas un palindrome alors
            if (test.charAt(leftPos) != test.charAt(rightPos)) {
                //on passe la variable palindrome a false
                palindrome = false;
            }
            /**
             * on continue temps que palindrome ne passe pas a false a ce
             * raproche a chaque lettre-> en avancanr d'une lettre vers la droit
             * en partant de la gauche et en reculant d'une lettre vers la
             * gauche et en partant vers la droite
             */
            leftPos++;
            rightPos--;
        }
        //si palindrome est égale a true alors on dit que c'est un palindrome 
        if (palindrome) {
            System.out.println("votre mot ou phrase est un palindrôme !!!!");
        } else {
            //si non on dit que ce n'est pas un palindrome 
            System.out.println("votre mot ou phrase n'est pas un palindrôme!!!");
        }
    }

}
