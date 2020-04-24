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
        System.out.println("Remise(V1.0, 24/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        int PU1;
        int PU2;
        PU2 = 25;
        PU1 = 12;
        int QTE1;
        int QTE2;
        int TOT;
        int result;
        int result2;
        double PAP;
        double SRE;
        double port;
        double remise;

        System.out.println("Mettre la quantité de l'article 1");
        QTE1 = lectureclavier.nextInt();
        result = QTE1 * PU1;
        System.out.println("Mettre la quantité de l'article 2");
        QTE2 = lectureclavier.nextInt();
        result2 = QTE2 * PU2;
        TOT = result + result2;
        if (TOT > 500) {
            port = 0;
        } else {
            port = (result * 1.02);
        }
        if (port > 6) {
            port = 6;
        }
        SRE = port + result + result2;
        if(100<SRE && 200> SRE){
            PAP = SRE *0.95;
            remise = PAP - SRE;
        }
        else {
            PAP = SRE *0.90 ;
            remise = PAP - SRE;
        }
        System.out.println("prix total " + PAP + 
                " prix 1 article " + result+  " pour " + QTE1 + " Quentités " +
                " prix second article " + result2 +  " pour " + QTE1 + " Quentités " +
                " prix du port " +  port +
                "montant de la remise " + remise +
                " prix total sans le port " + TOT);
    }

}
