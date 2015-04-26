import java.util.BitSet;


public class PizzaBeanEVO {
	private int taille;
	private BitSet gar=new BitSet(5);
	
	
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
		return gar.get(0);
	}
	public void setFromage(boolean fromage) {
		gar.set(0,fromage);
	}
	public boolean isSaucisse() {
		return gar.get(1);
	}
	public void setSaucisse(boolean saucisse) {
		gar.set(1,saucisse);
	}
	public boolean isPeperoni() {
		return gar.get(2);
	}
	public void setPeperoni(boolean peperoni) {
		gar.set(2,peperoni);
	}
	public boolean isOlives() {
		return gar.get(3);
	}
	public void setOlives(boolean olives) {
		gar.set(3,olives);
	}
	public boolean isSansGluten() {
		return gar.get(4);
	}
	public void setSansGluten(boolean sansGluten) {
		
		gar.set(4,sansGluten);
		if (isSansGluten() && (isPeperoni()||isSaucisse())) {
			System.out.println("Attention pizza avec gluten");
		}
		
		
	}
	
}
