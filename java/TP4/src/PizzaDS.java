import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import sun.misc.BASE64Encoder;


public class PizzaDS {
	GarnitureTO g = new GarnitureTO();
	int taille;
	
	public PizzaDS(GarnitureTO g, int taille) {
		this.g = g;
		this.taille = taille;
	}
	
	@Override
	public String toString() {
		String ret =  "Pizza de " + taille + "cm avec : ";
		if (g.fromage) ret+="fromage ";
		if(g.olives) ret+="olives ";
		if(g.peperoni) ret+="peperoni ";
		if(g.saucisse) ret+="saucisse ";
		if(g.sansGluten) ret+="et sansGluten ";
		return ret;
	}
	

}
