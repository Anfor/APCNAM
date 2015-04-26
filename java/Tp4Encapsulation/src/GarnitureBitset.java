import java.util.BitSet;


public class GarnitureBitset extends BitSet{
private int taille;


	public GarnitureBitset(){
		super(5);
		
		
	}
	
	
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
		return this.get(0);
	}
	public void setFromage(boolean fromage) {
		this.set(0,fromage);
	}
	public boolean isSaucisse() {
		return this.get(1);
	}
	public void setSaucisse(boolean saucisse) {
		this.set(1,saucisse);
	}
	public boolean isPeperoni() {
		return this.get(2);
	}
	public void setPeperoni(boolean peperoni) {
		this.set(2,peperoni);
	}
	public boolean isOlives() {
		return this.get(3);
	}
	public void setOlives(boolean olives) {
		this.set(3,olives);
	}
	public boolean isSansGluten() {
		return this.get(4);
	}
	public void setSansGluten(boolean sansGluten) {
		
		this.set(4,sansGluten);
		if (isSansGluten() && (isPeperoni()||isSaucisse())) {
			System.out.println("Attention pizza avec gluten");
		}
		
		
	}
}
