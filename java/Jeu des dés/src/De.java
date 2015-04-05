
public class De {
	
	private  int valeur;
	private boolean pipe=false;
	
	
	
	public De() {
		
		this.valeur=(int) (6*Math.random()) + 1;
	}
	
	
		
		public int piper(){

		pipe=true;
		
		setValeur((int) (6*Math.random()) + 1);
		
		if (this.valeur!= 1 || this.valeur!=2 || this.valeur!=4){
			
			 while (this.valeur== 3 || this.valeur==5 || this.valeur==6){
				
				this.valeur=(int) (6*Math.random()) + 1; 
				 
			 }
			 
			 return getValeur();
			}
		else return getValeur();
		
		
	}
	
	
	
	
	public  int lancer(){
		if (pipe){
			
		return	piper();
			
		}
		setValeur((int) (6*Math.random()) + 1);
		return getValeur();
		
	}
	

	
	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}
