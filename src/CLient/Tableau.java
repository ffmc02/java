/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLient;

/**
 *
 * @author gaeta
 */
public class Tableau {

    public static void main(String args[]) {

        client[] liste = {new client("Paul", "Weller", "Baker Street", "Londre"),
            new client("White", "Jack", null, "Detroit"),
            new client("Claypool", "Les", null, "San Francisco"),
            new client("Thunders", "Johnny", null, "New York")
        };
        for (client fo : liste) {
            System.out.println("Prénom");
            System.out.println(fo.Prenom);
            System.out.println("Nom ");
            System.out.println(fo.Nom);
            System.out.println("Adress");
            System.out.println(fo.Adresse);
            System.out.println("Ville");
            System.out.println(fo.Ville);
            System.out.println();
        }

    }
}
