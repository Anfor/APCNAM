import java.util.BitSet;


public class PizzaBeanEVO {
	int taille;
	BitSet garniture = new BitSet(5);
	
	public PizzaBeanEVO(int taille) {
		this.taille = taille;
	}
	
	public boolean isFromage() {
		return garniture.get(0);
	}
	public void setFromage(boolean fromage) {
		garniture.set(0,fromage);
	}
	public boolean isSaucisse() {
		return garniture.get(1);
	}
	public void setSaucisse(boolean saucisse) {
		garniture.set(1,saucisse);
	}
	public boolean isPeperoni() {
		return garniture.get(2);
	}
	public void setPeperoni(boolean peperoni) {
		garniture.set(2,peperoni);
	}
	public boolean isOlives() {
		return garniture.get(3);
	}
	public void setOlives(boolean olives) {
		garniture.set(3,olives);
	}
	public boolean isSansGluten() {
		return garniture.get(4);
	}
	public void setSansGluten(boolean sansGluten) {
		garniture.set(4,sansGluten);
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
		if (isFromage()) ret+="fromage ";
		if(isOlives()) ret+="olives ";
		if(isPeperoni()) ret+="peperoni ";
		if(isSaucisse()) ret+="saucisse ";
		if(isSansGluten()) ret+="et sansGluten ";
		return ret;
	}
	
	
}
