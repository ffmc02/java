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
public class sommeDesEntiersInférieursàN {
    public static void main(String args[]) {
        System.out.println(" La somme des entiers inférieurs à N(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
         //nombre rentrer par l'utilisateur
        int nbr;
        //nombre entier inferieur à nbr
        int n;
        //variable des resultats de l'addition des entiers 
        int addN;
        addN=0;
        System.out.println("Ecrivez un nombre entier.");
        nbr = lectureclavier.nextInt();
        //boucle for; n = nbr-1, si n est supperieur a 0 alors je retire 1 a n 
        System.out.println("Vous avez choisie le nombre" + nbr );
        for(n= nbr-1; n>0; n--){
            // j'additionne l'ensemble des nombres entier inférieur au nombre choisie
          addN = addN+n;
        }
        System.out.println("La somme des nombres entier inférieur au nombre choisie est " + addN);
    }
}
