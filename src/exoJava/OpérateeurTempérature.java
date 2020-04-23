/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exoJava;
//on importe la classe scanner

import java.util.Scanner;
/**
 *
 * @author gaeta
 */
public class OpérateeurTempérature {
     public static void main(String args[]) {
        System.out.println("Temperature(V1.0, 23/04/2020)");
        // on indique que la classe scanner seras appeller par la variable lectureclavier
        Scanner lectureclavier = new Scanner(System.in);
        //on indique le type de chaque variable utilisé dans la formule 
        double TpsF;
        double result;
        System.out.println("Veuillez rentre une températur Fahrenheit  de type 1.0 ou 25.6  ");
        TpsF = lectureclavier.nextInt();
//        la formul (5d/9d)s'apelle  la  promotion numérique
        result = (5d/9d)*(TpsF-32);
        System.out.println("la  temperature " + TpsF + "  degrés  fahrenhiet donne " + result + " degrés Celcus");
        
        
     }
    
}
