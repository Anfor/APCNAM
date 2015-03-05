/**
 * 
 */
package com.chaines.alver;

import java.util.Scanner;

/**
 * @author ANGEL
 *
 */
public class Chainestoautres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String chaine= new String();
		String chainesansespace = new String();
		String ch2 = new String();
		String ch3 = new String();
		int chaine2;
		int test=23;
		int test5;
		float test2=12.36f;
		float chaine3;
		double test3=14.8879512;
		double chaine4;
		
System.out.print("Entrez une chaine de nombres: ");
Scanner sc = new Scanner(System.in);
chaine=sc.nextLine();
chainesansespace=chaine.replaceAll("\\s","");
ch3=chainesansespace.replaceAll("\\D", "");//replace tout non nombres pour rien.\\D signifie touts non nombres.
chaine2=Integer.parseInt(ch3);
System.out.println("test de chaine à entier: "+chaine2+" x "+test+" = "+chaine2*test);
chaine3=Float.parseFloat(ch3);
System.out.println("test de chaine à float: "+chaine3+" x "+test2+" = "+chaine3*test2);
chaine4=Double.parseDouble(ch3);
System.out.println("test de chaine à double: "+chaine4+" x "+test3+" = "+chaine4*test3);

test5=(int)test3;

System.out.println("to cast à entier: "+test3+" partie entier "+test5);

ch2=String.valueOf(test3);



System.out.println("de double à chaine: "+test3+" = "+ch2);
System.out.println("division pour tester: "+ch2.substring(5));



sc.close();
	}

}
