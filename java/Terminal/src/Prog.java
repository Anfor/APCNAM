/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGEL
 */
import java.math.*;
        
public class Prog {
public static void main (String[] args) {
int x;
boolean b;
String a="HOLA COMO VAS";
x = 3 + Math.min(200,30) - 1;
Terminal.ecrireIntln(Math.min(2,3));
Terminal.ecrireIntln(x);

Terminal.ecrireCharln(Character.toLowerCase('Q'));
Terminal.ecrireString("Un entier? ");
x = Terminal.lireInt();
Terminal.ecrireIntln(x);

}
}