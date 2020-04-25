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
public class participation {
     public static void main(String args[]) {
         System.out.println("participation(V1.0, 25/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        //saliaire par mois
        int sal;
        // part de participation entreprise 
        double part;
        //reponse question celiba
        char repCeli;
        //reponse question marié
        char repMar;
        // combier d'enfant 
        int enfs;
        
        System.out.println("Combient gagner vous par moi  (en nombre entier -)");
        sal =lectureclavier.nextInt();
        System.out.println("Etes vous célibataire (Reponder avec Y pour oui ou  N pour non )");
          repCeli= lectureclavier.nextLine().charAt(0);
          System.out.println("Etes vous marié (Reponder avec Y pour oui ou  N pour non )");
          repMar= lectureclavier.nextLine().charAt(0);
          System.out.println("Combien avez vous d'enfant? ");
          enfs= lectureclavier.nextInt();
          
     }
    
}
