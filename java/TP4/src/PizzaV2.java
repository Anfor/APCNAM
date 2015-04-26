
public class PizzaV2 {
	GarnitureBitset g = new GarnitureBitset();
	int taille;
	
	public PizzaV2(GarnitureBitset g, int taille) {
		this.g = g;
		this.taille = taille;
	}
	

	public boolean isPizzaChef() {
		return this.g.equals(GarnitureBitset.PIZZA_CHEF);
	}
	
	@Override
	public String toString() {
		String ret =  "Pizza de " + taille + "cm avec : ";
		if (g.isFromage()) ret+="fromage ";
		if(g.isOlives()) ret+="olives ";
		if(g.isPeperoni()) ret+="peperoni ";
		if(g.isSaucisse()) ret+="saucisse ";
		if(g.isSansGluten()) ret+="et sansGluten ";
		return ret;
	}
}
