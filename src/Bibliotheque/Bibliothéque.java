/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;
import java.util.Scanner;
/**
 *
 * @author gaeta
 */
public class Bibliothéque {
   
 public static void main(String[] args) {
	    Livre livrePoche = new Livre();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer titre");
        livrePoche.setTitre(sc.nextLine());
        System.out.println("Nom auteur");
        livrePoche.setNom(sc.nextLine());
        System.out.println("prÃ©nom auteur");
        livrePoche.setPrenom(sc.nextLine());
        System.out.println("CatÃ©gorie");
        livrePoche.setCategorie(sc.nextLine());
        System.out.println("ISBN");
        livrePoche.setCodeISBN(sc.nextLine());
        livrePoche.calculerCode();
        livrePoche.afficheUnLivre();
    }

 
}
