import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import sun.misc.BASE64Encoder;


public class TestPizza {

	public static void main(String[] args) {
		
		// Premiere possibilite : utilisation d'un JavaBean
		PizzaBean p = new PizzaBean(30);
		p.setFromage(true);
		p.setOlives(true);
//		p.setPeperoni(true);		// a decommenter pour tester le message d'erreur concernant le gluten
		p.setSansGluten(true);
		System.out.println(p);
		
		// Cette fois, on utilise une simple structure de donnees, ou plutot un Transfer Object
		GarnitureTO g = new GarnitureTO();
		g.fromage = true;
		g.saucisse = true;
		g.peperoni = true;
		PizzaDS p2 = new PizzaDS(g, 30);
		System.out.println(p2);
		// puisque le TO implemente Serializable, on peut le serialiser. Dans cet exemple on l'encode en Base64
		System.out.println(serialize(g));

		// On fait evoluer notre Bean pour un modele plus objet pur. l'API reste identique au javabean mais on change la representation interne de l'objet
		PizzaBeanEVO p4 = new PizzaBeanEVO(30);
		p4.setSaucisse(true);
		p4.setOlives(true);
		System.out.println(p4);
		
		// On peut aussi "ameliorer" par heritage une classe java existante, comme dans ce cas un BitSet
		GarnitureBitset gBS = new GarnitureBitset();
		gBS.setPeperoni(true);
		gBS.setOlives(true);
		gBS.setFromage(true);
		gBS.setPeperoni(true);
		gBS.setSaucisse(true);
		PizzaV2 p3 = new PizzaV2(gBS, 30);
		System.out.println(p3);
		// La classe Bitset a une methode equals() bien pratique qui nous permet de comparer plusieurs garnitures
		if (p3.isPizzaChef()) System.out.println("Les ingredients selectionnes correspondent ˆ la pizza du chef");
	}
	
    static String serialize( Serializable o )  {
    	try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	        ObjectOutputStream oos = new ObjectOutputStream( baos );
    	        
    			) {
    		oos.writeObject( o );
        	return new String( new BASE64Encoder().encode( baos.toByteArray() ) );
    	}
    	catch (Exception e) {
			return "";
		}
    }
}
