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
public class Age {
    public static void main(String args[]) {
         System.out.println("Age(V1.0, 23/04/2020)");
        Scanner lectureclavier = new Scanner(System.in);
        int annee;
        int result;
        System.out.println("rentrée votre date de naissance");
        annee =  lectureclavier.nextInt();
        result = 2020 - annee;
        if(result>=18 ){
            System.out.println("vous avez " + result + " ans, vous est majeur ");
        }
        else{
            System.out.println("Vous avez " + result + " ans, vous étes mineur");
        }
    }
}
