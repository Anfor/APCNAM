
public class PokemonSportifs extends PokemonsTerre {
	
	 private int  frequenceCardiaque;
		
	


		public int getFrequenceCardiaque() {
			
			return frequenceCardiaque;
		}

		public void setFrequenceCardiaque(int frequenceCardiaque) {
			this.frequenceCardiaque = frequenceCardiaque;
		}
		
	@Override
	public double vitesse() {
		System.out.println("velocidad del pokemon deportista "+getNbPattes()*getTaille()*3);
		return getNbPattes()*getTaille()*3;
		
		
	}

	@Override
	public String toString() {
		   
		return "Je suis le Pokémon "+getNom()+" mon poids est de "+getPoids()+" Kg, ma vitesse est de "+vitesse()+" km/h j’ai  "+getNbPattes()+
				" pattes, ma taille est de "+getTaille()+"m ma fréquence cardiaque est de  "+getFrequenceCardiaque()+" pulsations par minute ";
	}
	
	
	

}
