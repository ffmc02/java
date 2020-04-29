package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gaeta
 */
public class Cercles {
    int rayon;
    final static double PI=3.1416;
    double calculCirconference(){

      return 2 * PI * rayon;  
    }
    double calculSurface(){
        return PI * Math.pow(rayon, 2);
    }    
}
