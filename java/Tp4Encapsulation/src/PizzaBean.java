
public class PizzaBean {
	
	private int taille;
	private boolean fromage,saucisse,peperoni,olives,sansGluten;
	
	
	@Override
	public String toString() {
		
		
		String pizza=" Pizza de "+taille+"cm avec : ";
		
		if (isFromage())pizza+=" fromage "; 
		if (isOlives())pizza+=" olives ";
		if (isPeperoni())pizza+=" peperoni ";
		if(isSansGluten())pizza+=" sansGluten ";
		if(isSaucisse())pizza+=" saucisse ";
		
	
		return pizza;
	}
	
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
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
		
		this.sansGluten = sansGluten;
		if (sansGluten && (peperoni||saucisse)) {
			System.out.println("Attention pizza avec gluten");
		}
		
		
	}
	
	

}
