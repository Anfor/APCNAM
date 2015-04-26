import java.util.BitSet;


public class GarnitureBitset extends BitSet {

	private static final long serialVersionUID = 3438626908273867449L;
	public static final GarnitureBitset PIZZA_CHEF = new GarnitureBitset(true,true,true,true,false);
	public static final GarnitureBitset PIZZA_VEGE = new GarnitureBitset(false,false,false,true,true);
	
	public GarnitureBitset() {
		super(5);
	}

	private GarnitureBitset(boolean fromage, boolean saucisse, boolean peperoni, boolean olives,	boolean sansGluten) {
		super(5);
		setFromage(fromage);
		setSaucisse(saucisse);
		setPeperoni(peperoni);
		setOlives(olives);
		setSansGluten(sansGluten);
	}
	
	public boolean isFromage() {
		return get(0);
	}
	public void setFromage(boolean fromage) {
		set(0,fromage);
	}
	public boolean isSaucisse() {
		return get(1);
	}
	public void setSaucisse(boolean saucisse) {
		set(1,saucisse);
	}
	public boolean isPeperoni() {
		return get(2);
	}
	public void setPeperoni(boolean peperoni) {
		set(2,peperoni);
	}
	public boolean isOlives() {
		return get(3);
	}
	public void setOlives(boolean olives) {
		set(3,olives);
	}
	public boolean isSansGluten() {
		return get(4);
	}
	public void setSansGluten(boolean sansGluten) {
		set(4,sansGluten);
	}

}
