
public class De100 {
	
	private int valeur;
	
	public De100(){
		
		setValeur((int) (100*Math.random()) + 1);
		
	}
	
	public int lance(){
		
		setValeur((int) (100*Math.random()) + 1);
		return  getValeur();
		
	}
	
	public boolean exact(int utilisateur){
		
		if (utilisateur==this.valeur) return true;
		else return false;
		
	}
	
	public boolean tropgrand(int utilisateur){
		
		if (utilisateur>this.valeur) return true;
		else return false;
		
	}
	
	public boolean troppetit(int utilisateur) {
		
		if (utilisateur<this.valeur) return true;
		else return false;
		
	}
	
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

}
