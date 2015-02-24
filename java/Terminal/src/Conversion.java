/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGEL
 */
public class Conversion {
    
    
public static void main (String[] args) {
    
    
double euro;
double dollar;
double taux;
Terminal.ecrireStringln("Taux du jour: ");
taux = Terminal.lireDouble();
Terminal.ecrireStringln("Quantite en euros: ");
euro = Terminal.lireDouble();
dollar = euro * taux;
Terminal.ecrireString("La conversion en dollars : "+ dollar);

}
}