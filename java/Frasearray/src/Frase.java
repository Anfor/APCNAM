import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class Frase {

	public static void main(String[] args) {
		
		
		String depo=new String();
		int cont=0;
		ArrayList<String> frase=new ArrayList<String>();
		ArrayList<String> palabras=new ArrayList<>();
		ArrayList<String> impresos=new ArrayList<>();
		Iterator<String> iteratorp=palabras.iterator();
		
		Iterator<String> iteratorimp=impresos.iterator();
		
		
		
		
	//for(int i =0;i<3;i++){	
		System.out.println("introducir texto");
		Scanner sc = new Scanner(System.in);
		frase.add(sc.nextLine());
		

	//}
		
		Iterator<String> iterator=frase.iterator();
	
	while(iterator.hasNext()){
		StringTokenizer token= new StringTokenizer(iterator.next()," ,\t");
		String [] article= new String[palabras.size()];
		
		while(token.hasMoreTokens()){
			
			// depo=token.nextToken();
			if ((token.nextToken().equalsIgnoreCase("ceci"))||((token.nextToken().equalsIgnoreCase("cela")))||(token.nextToken().equalsIgnoreCase("donc"))||((token.nextToken().equalsIgnoreCase("cependant"))))
			{ article[cont]=token.nextToken();
			cont++;
			}
			palabras.add(depo);	
			
			
			
			
		}
		
		
	}
	String [] article= new String[palabras.size()];
	
		for (String e:palabras) {
			
			impresos.add(e);
			
			System.out.println(e+" 888 ");
			
			if ((e.equalsIgnoreCase("ceci"))||((e.equalsIgnoreCase("cela")))||(e.equalsIgnoreCase("donc"))||((e.equalsIgnoreCase("cependant"))))
			{	
				System.out.println(cont);
				 article[cont]=e;
				System.out.println(article[cont]);
				cont++;
			}
			
			else {
				
				
				 
				 
				 for(String d:impresos)
				 {
					 e.equalsIgnoreCase(d);
					 
				 }
				 
			}
		
		
		
	}
		

	}

}
