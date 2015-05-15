import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;



public class ProgrammeTP6 {
	
	
	public static void main(String args[]) {
		
	
		
		ArrayList recetteListe =new ArrayList();
		
		recetteListe.add("1- Pour reussir une mayonnaise il faut");
		recetteListe.add("2- mettre les ingredients a temperature ambiante");
		recetteListe.add("3- mettre un jeune d'oeuf dans un bol");
		recetteListe.add("4- ajouter un pince de sel, de poivre");
		recetteListe.add("5- verser un peu d'huile");
		recetteListe.add("6- battre avec une fourchette");
		recetteListe.add("7- verser un peu d'huile");
		recetteListe.add("8- battre avec une fourchette");
		
		
		Iterator itr= recetteListe.iterator();
		while (itr.hasNext()) {
			String element = (String)itr.next();
			System.out.println(element);
		}
		
		
		
		System.out.println("\n\n");
		recetteListe.add(4, "4a- une cuillere à café de moutarde");
		
		Iterator itr2= recetteListe.iterator();
		while (itr2.hasNext()) {
			String element2 = (String)itr2.next();
			System.out.println(element2);
		}
		
		System.out.println("\n\n");
		recetteListe.set(4,"4a- une cuillere à café de moutarde"); //Set remove the input at place indicated.
		
		Iterator itr3= recetteListe.iterator();
		while (itr3.hasNext()) {
			String element3 = (String)itr3.next();
			System.out.println(element3);
		}
		
		HashSet recetteSet = new HashSet ();//HashSet don't take the order
		
		
		recetteSet.add("Pour reussir une mayonnaise il faut");
		recetteSet.add("mettre les ingredients a temperature ambiante");
		recetteSet.add("mettre un jeune d'oeuf dans un bol");
		recetteSet.add("ajouter un pince de sel, de poivre");
		recetteSet.add("verser un peu d'huile");
		recetteSet.add("battre avec une fourchette");
		recetteSet.add("verser un peu d'huile");// these string don't be repeated, they are the same string
		recetteSet.add("battre avec une fourchette");
		
		System.out.println("\n\n");
	
		
		Iterator itr4= recetteSet.iterator();
		while (itr4.hasNext()) {
			String element4 = (String)itr4.next();
			System.out.println(element4);
		}
	

		System.out.println("\n\n");
		
		HashMap<String, Integer> ingredients= new HashMap<String, Integer>();
		
		ingredients.put("Jaune d'oeuf", 1);
		ingredients.put("cl de huile", 20);
		ingredients.put("cuillere de moutarde",1);
		ingredients.put("pincée de sel", 1);
		ingredients.put("pincée de poivre", 1);
		
		Iterator itt=ingredients.keySet().iterator();
		while (itt.hasNext()) {
		
			Object cle =itt.next();
			Object k = ingredients.get(cle);
			
			System.out.println(k+"  "+cle);
			
		}
		
		
	}
	
	

}
