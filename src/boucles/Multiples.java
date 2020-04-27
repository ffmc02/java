/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boucles;
import java.util.Scanner; 
/**
 *
 * @author gaeta
 */
public class Multiples {
    public static void main(String args[]) {
        System.out.println("Multiples(V1.0, 27/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        int n;
        int x;
        int result;
        System.out.println("Entré un premier nombre entier");
        n= lectureclavier.nextInt();
        System.out.println("Entré un second nombre entier");
        x=  lectureclavier.nextInt();
        for(int i=1 ; n>=i ; i++){
            result = i*x;
            System.out.println(x + " * " + i + "=" +result);
        }
    }
}
