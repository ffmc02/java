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
public class operateurHms {
    public static void main(String args[]) {
          System.out.println("Conversion d'un nombre de secondes en HH:MM:SS(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        int nbr1;
        int heure;
        int minutes;
        int secondes;    
        System.out.println("donné un chiffre pour le convertir en Heur, minutes, secondes.");
        nbr1 = lectureclavier.nextInt();
        heure = nbr1 /60 /60 % 24;
        minutes = nbr1 /60 %60;
        secondes =nbr1 %60 ; 
        System.out.println("Le nombre " + nbr1 + " convertie en heures minutes et seconnde donne " + heure + " heure(s) " + minutes + " minutes et " + secondes + " secondes.");
    }
    
}
