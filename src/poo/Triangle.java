/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author gaeta
 */
public class Triangle extends Forme{
    float base;
    float hauteur;
     public Triangle (float B , float H){
         this.base=B;
         this.hauteur=H;
         
     }
     public float Aire(){
         return (base * hauteur)/2;
     }
//Votre classe Triangle doit posséder :
//
//    une propriété base, représentant la base du triangle
//    une propriété hauteur représentant sa hauteur
//    une méthode Aire pour calculer la surface du triangle. la surface se calcule à partir de (base*hauteur)/2

    
}
