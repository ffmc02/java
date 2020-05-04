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
    private String titre;
    private String nom;
    private String prenom;
    private String categorie;
    private String codeISBN;
    private String codeEnregistrement;

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

    public void calculerCode() {
        String nom = String.valueOf(this.nom.charAt(0));
        String prenom = String.valueOf(this.prenom.charAt(0));
        String categorie = this.categorie;
        int isbnLength = this.codeISBN.length();
        String isbn = String.valueOf(this.codeISBN.charAt(isbnLength-2))+String.valueOf(this.codeISBN.charAt(isbnLength-1));
        this.codeEnregistrement = nom+prenom+categorie+isbn;
    }

    public void afficheUnLivre() {
        System.out.println("Titre : "+this.titre);
        System.out.println("Auteur : "+this.nom+" "+this.prenom);
        System.out.println("CatÃ©gorie : "+this.categorie);
        System.out.println("Code ISBN : "+this.codeISBN);
        System.out.println("Code enregistrement : "+this.codeEnregistrement);
    }
}
