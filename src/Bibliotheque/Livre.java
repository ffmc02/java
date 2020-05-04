/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bibliotheque;

/**
 *
 * @author gaeta
 */
public class Livre {
    //initialisation des variable 
    private String titre;
    private String nom;
    private String prenom;
    private String categorie;
    private String codeISBN;
    private String codeEnregistrement;
//création des geter et setter pour les variables 
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getCodeISBN() {
        return codeISBN;
    }

    public void setCodeISBN(String codeISBN) {
        this.codeISBN = codeISBN;
    }

    public String getCodeEnregistrement() {
        return codeEnregistrement;
    }

    public void setCodeEnregistrement(String codeEnregistrement) {
        this.codeEnregistrement = codeEnregistrement;
    }
//Creation de la fonction pour calculer le code d'enregistrement 
    public void calculerCode() {
        //récupération de la premier lettre du nom de l'auteur 
        String nom = String.valueOf(this.nom.charAt(0));
        //recupération de la premier lettre du prénon de l'auteur
        String prenom = String.valueOf(this.prenom.charAt(0));
//       recuperation de la catégory
        String categorie = this.categorie;
        //on compte ma longueur de code ISNB
        int isbnLength = this.codeISBN.length();
        //concatenation pour la code isbn
        String isbn = String.valueOf(this.codeISBN.charAt(isbnLength-2))+String.valueOf(this.codeISBN.charAt(isbnLength-1));
        this.codeEnregistrement = nom+prenom+categorie+isbn;
    }
//fonction pour afficher le livre
    public void afficheUnLivre() {
        //affichage du titre
        System.out.println("Titre : "+this.titre);
        //affichage de l'auteur
        System.out.println("Auteur : "+ this.nom + " " + this.prenom);
        //Affichage de la catégorie
        System.out.println("CatÃ©gorie : "+ this.categorie);
        //affichage du code ISBN
        System.out.println("Code ISBN : "+ this.codeISBN);
        //Affichage du code d'enregistement 
        System.out.println("Code enregistrement : " + this.codeEnregistrement);
    }
}
