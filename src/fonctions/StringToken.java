/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fonctions;

/**
 *
 * @author gaeta
 */
public class StringToken {
     
    //je créer la fonction STRTOL avec 3 parametre 2 string(str1 et 2  et un int x
    static String strtok(String str1, String str2, int x){
        
        String resultat = str1.split(str2)[x-1];
       return resultat;
    }
           public static void main(String args[])
    {
        System.out.println("strtok 2(V1.0, 29/04/2020)");
        String str1, resultat;
        //j'incrément la variable str1
        str1 = "robert;dupont;amiens;80000";
        //je demande d'afficjer le 3 parametre contenu dans la variabble str1
        resultat = strtok (str1, ";", 3);
        //j'affoche le resultat 
        System.out.println(resultat);
    }
}
