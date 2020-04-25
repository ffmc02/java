/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structuresDeContrôle;

import java.util.Scanner;

/**
 *
 * @author gaeta
 */
public class Remise {

    public static void main(String args[]) {
        System.out.println("Remise(V1.2, 25/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        //prix unitaire de l'article de l'article
        int PU;
        //quantité indiqué par l'utilisateur
        int QTE;
        //prix pour la quantité choisi sans frais de port sans remise 
        int CMD;
        // prix a payer sans remise aveec frais de port
        double PAP;
        //Frais de port 
        double PORT;
        //Remise effectuer si le PAP>100 et <200 alors 5% si >200 alors 10%
        double remise;
        //prix total avec remise et frais de port 
        double TOT;
        //resulta de la remise 
        double Rtot;
        //Frais de port appliqué pour la commande 
        double FPort;
        PU = 20;
        //demande a l'utilisateur d'indidiqué au clavier une quantité
        System.out.println("entré la quantité de l'article ");
        //recupération des données utilisateur
        QTE = lectureclavier.nextInt();
        //calcul du prix sans remise et sans frais de port
        CMD = PU * QTE;
        System.out.println("Vous avez une commande de " + QTE + " pour un prix unitaire de " + PU + "  soit un montant de " + CMD);
        //Si les commande est inferieur a 500 euros alors j'applique 2 % de frais de port 
        if (CMD >= 500) {
            PORT = 0;
            System.out.println("Vous n'avez pas de frais de port");
        } else {
            PORT = CMD * 1.02;
            FPort = PORT - CMD;
            if (FPort < 6) {
                FPort = 6;
                System.out.println("Vos frais de port s'éléve a " + FPort);
            }
        }
        if (PORT > 100 && PORT < 200) {
            TOT = PORT * 0.95;
            remise= PORT -TOT;
             System.out.println("Le prix total de la commande pour "+ QTE + " article(s), s'éleve à " + TOT + " € Dont " + remise +" de remise.");
        } 
        else if (PORT > 200) {
            TOT = PORT*0.9 ; 
            remise= PORT -TOT;
            System.out.println("Le prix total de la commande pour "+ QTE + " article(s), s'éleve à " + TOT + " € Dont " + remise +" de remise.");
        }else {
            TOT =PORT;
            remise = 0;
            System.out.println("Le prix total de la commande pour "+ QTE + " article(s), s'éleve à " + TOT + " € Vous n'avez pas eu de remise." );
        }
        

            
    }
}
