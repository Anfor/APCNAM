package exceptions.bibliotheque;



public class Etagere {
	
		 Livre[]maxlivres;
		 int nbLivres=0;
		

	public Etagere(int nbl){
		
		maxlivres=new Livre[nbl];
	}
	
	public int nblivres(){
		
		return nbLivres;
		
	}
	
	public int maxlivres(){
		
		return maxlivres.length;
	}
	
	public String toString() {
		return "Livre [Maxlivre=" +maxlivres() + ",nbLivres="
		+nbLivres+ "]";
		}
	
	public void ajouter(Livre liv) {
		
		
		if (nbLivres>=maxlivres.length) {
			System.err.println("Etagere complete");
		}
		
		if (nbLivres<maxlivres.length){
			maxlivres[nbLivres++]=liv;
			
		
		}
		
				
	}

	public int cherche(String titre, String auteur) {
		
		
		
		for (int i=0;i<maxlivres.length;i++) {
			
			
		if (maxlivres[i].getAuteur().equals(auteur) && maxlivres[i].getTitre().equals(titre))
		{		
			
			return i+1;
					}	
				
		}
		return 0;
	}
	
	
	public int[] chercher(String titre, String auteur){
		
		int [] exist = null;
		int ind=0;
		for (int i=0;i<maxlivres.length;i++) {
			
						
			if (maxlivres[i].getAuteur().equals(auteur) && maxlivres[i].getTitre().equals(titre)) {
				
				exist[ind+1]=i;
				ind++;
				
			}	
		
	}
		
		if (exist!=null) {
			return exist;
		}
		else {
			exist[0]=0;
		return exist;
		}
		
		
	}

	public Livre getLivre(int position) {
		
		int pos=position-1;
		
		return  maxlivres[pos];
		
	
		
		
	}
	

		
	
	
	
	public Livre enleverLivre(int position){
		

		
			position=position-1;
			
			
			for (int i = position; i < maxlivres.length-1; i++) {
		
				maxlivres[position]=maxlivres[position+1];
			}
			nbLivres--;
			return maxlivres[position];
			
		
		
	}


	public Livre enleverLivre(String titre, String auteur) {
		
	
		
		int pos=cherche(titre, auteur)-1;
			
		
		if (pos==0) {
			return null;
		}
		
		else {
			pos=pos-1;
			nbLivres=nbLivres-1;
			
			for (int i = pos; i < maxlivres.length-1; i++) {
				
				maxlivres[pos]=maxlivres[pos+1];
			}
			return maxlivres[pos];
			
		}
		
	}
	

}
