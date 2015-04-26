import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import sun.misc.BASE64Encoder;


public class PizzaDS {
	
	
	private int taille;
	private GarnitureTO garniture;
	
	
	
	
	
	public PizzaDS(int taille, GarnitureTO garniture) {
		
		this.taille = taille;
		this.garniture = garniture;
	}

	@Override
	public String toString() {
		
		
		String pizza=" Pizza de "+taille+"cm avec : ";
		
		if (garniture.fromage)pizza+=" fromage ";
		if (garniture.sansGluten)pizza+=" sansGluten ";
		if (garniture.saucisse)pizza+=" saucisse ";
		if (garniture.peperoni)pizza+=" peperoni ";
		if (garniture.olives)pizza+=" olives ";
		return pizza;
	}
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	public GarnitureTO getGarniture() {
		return garniture;
	}

	public void setGarniture(GarnitureTO garniture) {
		this.garniture = garniture;
	}

	
		
	}
	
	


