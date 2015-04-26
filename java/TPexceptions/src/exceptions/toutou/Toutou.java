package exceptions.toutou;

public class Toutou {
	
	
	private  String nom;
	private int nombredePuces;
	
	public Toutou(String n, int np)throws IllegalArgumentException{
		
		this.nom=n;
		this.nombredePuces=np;
		
		if (n==null) {
			throw new IllegalArgumentException("Argument est null");
		}
		
		if(np<0){
			
			throw new IllegalArgumentException("Nombre negatif");
		}
		
		
		
	}

}
