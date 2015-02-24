/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGEL
 */
public class JeuTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c,max=0;
        Terminal.ecrireStringln("Entrez nombre: ");
        a=Terminal.lireInt();
         Terminal.ecrireStringln("Entrez nombre: ");
        b=Terminal.lireInt();
         Terminal.ecrireStringln("Entrez nombre: ");
        c=Terminal.lireInt();
     if ((a>b) && (a>c))
             {
             max = a;}
if ((b>a) && (b>c))
{
max = b;}
if ((c>a) && (c>b))
{
max = c;
}
Terminal.ecrireStringln("Le plus grand est "+ max);
    }
    
}
