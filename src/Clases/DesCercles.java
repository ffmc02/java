/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author gaeta
 */
public class DesCercles {
        public static void main( String args[] ){
            //je créer un nouvelle objet
           Cercles cercle1= new Cercles();
           //je dertermine le rayon de ce cercle
           cercle1.rayon=10;
           //result doit me retourné le resulta de la methode calculeSurface
           double result1=cercle1.calculSurface();
           System.out.println("La surface du cercle d'un rayon de 10 cm est de  " + result1 + " cm ²");
           //result doit me retourné le resultat de la méthode calculesCirconférance 
           double result2 =cercle1.calculCirconference();
           System.out.println("La circonférance du cercle d'un rayon de 10 cm est de " + result2 +" cm  ");
           Cercles cercle2 =new Cercles();
           cercle2.rayon=45;
            double result3=cercle2.calculSurface();
           System.out.println("La surface du cercle d'un rayon de 45 cm est de  " + result3 +"cm ²");
           double result4 =cercle2.calculCirconference();
           System.out.println("La circonférance du cercle d'un rayon de 45 cm est de " + result4 + " cm  ");
           
        }
    
}
