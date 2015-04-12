
public class ClioGordini2020 extends Voiture implements ProduitPolluant {
	
	 
	 
	 public int getTauxCO2() {
		return 155;
	}
	
	public ClioGordini2020(){
		
		this.vitesseMax=197;
		this.consoType=6.7;
		this.nbPlaces=4;
		
	}
	@Override
public void demarrer(){
	
	super.demarrer();
	effetK2000();
}

public void effetK2000(){
	
	System.out.println("xouiouio");
}
}
