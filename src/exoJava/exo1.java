/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoJava;
import java.util.Scanner;
/**
 *
 * @author gaeta
 */
public class exo1 {
    final static double PI=3.1416;
    public static void main( String args[] ){
        double rayon;
        double perimetre; 
        
        System.out.println("Périmétre et surface du cercle(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
                System.out.println("Entre le rayon");
                rayon = lectureclavier.nextInt() ;
                perimetre = 2 * PI * rayon;
                System.out.println("Le préimétre vaut : " + perimetre);
                
                 System.out.println("c'est finit. Taper <ret>");
                 lectureclavier.next();
    }
    
}
