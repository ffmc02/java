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
    //Creation de la fonction main  pour pourvoir rentrer des donné a la main
    //et afficher le livre

    public static void main(String[] args) {
        // Je déclare un nouveau livre
        Livre livrePoche = new Livre();
        Scanner sc = new Scanner(System.in);
        //J'affecte le titre rentre par l'utilisateur 
        System.out.println("Entrer titre");
        // a livre de poche
        livrePoche.setTitre(sc.nextLine());
        //je recupere le noms de l'auteur rentré par l'utilisateur 
        System.out.println("Nom auteur");
        //je le met dans livre de poche
        livrePoche.setNom(sc.nextLine());
        //je recuperer le nonb de l'auteur
        System.out.println("prÃ©nom auteur");
//        je le met dans livre de poche
        livrePoche.setPrenom(sc.nextLine());
//        je demande la category
        System.out.println("CatÃ©gorie");
//        je le met dans la variable catégorie
        livrePoche.setCategorie(sc.nextLine());
        //J'affiche le code ISBN créer avec la fonction dans la classe Livre
        System.out.println("ISBN");
        livrePoche.setCodeISBN(sc.nextLine());
        //je calcule le code grace a la fonction 
        livrePoche.calculerCode();
        //je fait appel a la fonction qui me permet d'afficher le livre que je viens de créer 
        livrePoche.afficheUnLivre();
    }

}
