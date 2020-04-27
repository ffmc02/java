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
        System.out.print("Entrez un original ou une phrase : ");
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
        while ((leftPos < rightPos) && palindrome) {
            if (test.charAt(leftPos) != test.charAt(rightPos)) {
                palindrome = false;
            }
            leftPos++;
            rightPos--;
        }

        if (palindrome) {
            System.out.println("C'est un palindrôme !");
        } else {
            System.out.println("Non, ce n'est pas un palindrôme.");
        }
    }

}
