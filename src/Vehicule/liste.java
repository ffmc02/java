/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicule;

/**
 *
 * @author gaeta
 */
public class liste {

    public static void main(String args[]) {
        Vehicule[] liste = {new Avion(), new Velo(), new Bateau()};
        for (Vehicule fo : liste) {
            fo.broum();
        }
    }
}
