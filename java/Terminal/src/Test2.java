
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANGEL
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Entre numero: ");
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
         System.out.print("Entre numero: ");
        Scanner sca = new Scanner(System.in);
        int y=sc.nextInt();
         System.out.print("Entre numero: ");
        Scanner scb = new Scanner(System.in);
        int z=sc.nextInt();

       if (x < y && x < z) { 
         System.out.println(x+"<" +y+"<"+ z);
          /*x en premier
afficher x, suivi de y et z dans le bon ordre*/
}else if (x > y && x > z) { 
    System.out.println(z+"<" +y+"<"+ x);/* x en dernier
afficher y et z dans le bon ordre, suivis par x*/
}else { System.out.println(z+"<" +x+"<"+ y);
    /* x au milieu
afficher x au milieur de y et z dans le bon ordre*/
        
         
}
    }
    
}
