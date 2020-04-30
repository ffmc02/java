/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLient;

/**
 *
 * @author gaeta
 */
public class client {
   String Nom ;
   String Prenom;
   String Adresse;
   String Ville;

    public client() {
    }

    public client(String Nom, String Prenom, String Adresse, String Ville) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Adresse = Adresse;
        this.Ville = Ville;
    }
   
}
//Suite
//
//Implémenter une classe client, possédant les éléments suivants :
//
//    Nom
//    Prenom
//    Adresse
//    Ville
//
//La classe Client doit posséder un constructeur par défaut et un constructeur permettant d’initialiser le nom, le prénom et la ville du client.
//
//Vous surchargerez la méthode toString().
//
//Dans la méthode Main de votre programme, réaliser un scénario de test permettant de créer les clients suivant :
//Prénom 	Nom 	Adresse 	Ville
//Paul 	Weller 	Baker Street 	Londre
//White 	Jack 		Detroit
//Claypool 	Les 		San Francisco
//Thunders 	Johnny 		New York
//
//Afficher sur la console la liste et le détail de chaque client.