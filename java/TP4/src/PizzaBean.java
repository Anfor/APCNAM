
public class PizzaBean {
	int taille;
	boolean fromage;
	boolean saucisse;
	boolean peperoni;
	boolean olives;
	boolean sansGluten;
	
	public PizzaBean(int taille) {
		this.taille = taille;
	}
	
	public boolean isFromage() {
		return fromage;
	}
	public void setFromage(boolean fromage) {
		this.fromage = fromage;
	}
	public boolean isSaucisse() {
		return saucisse;
	}
	public void setSaucisse(boolean saucisse) {
		this.saucisse = saucisse;
	}
	public boolean isPeperoni() {
		return peperoni;
	}
	public void setPeperoni(boolean peperoni) {
		this.peperoni = peperoni;
	}
	public boolean isOlives() {
		return olives;
	}
	public void setOlives(boolean olives) {
		this.olives = olives;
	}
	public boolean isSansGluten() {
		return sansGluten;
	}
	public void setSansGluten(boolean sansGluten) {
		if (sansGluten && (isSaucisse() || isPeperoni())) {
			System.err.println("Attention, les ingredients selectionnes contiennent du gluten !");
		} else {
			this.sansGluten = sansGluten;
		}
	}

	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	@Override
	public String toString() {
		String ret =  "Pizza de " + taille + "cm avec : ";
		if (fromage) ret+="fromage ";
		if(olives) ret+="olives ";
		if(peperoni) ret+="peperoni ";
		if(saucisse) ret+="saucisse ";
		if(sansGluten) ret+="et sansGluten ";
		return ret;
	}
	
	
}
