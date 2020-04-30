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

    public class Carre extends Forme
    {
        private float cote;

        public Carre(float c)
        {
            cote = c;
        }

        public float Aire()
        {
            return (float)Math.pow(cote, 2);
        }
       
    }

