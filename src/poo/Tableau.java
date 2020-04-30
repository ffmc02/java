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
public class Tableau {

    public static void main(String args[]) {
        Forme[] Tableau = {new Carre(2), new Cercle(3), new Carre(5), new Triangle(2,5)};

        float s = 0;

        for (Forme fo : Tableau) {
            System.out.println(fo.Aire());
//            s += fo.Aire();
        }
//        System.out.println(s);

    }
}
