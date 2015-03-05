package listes;
/**
 * On se propose l'implementation de liste chain�e suivante La classe
 * ListeCHain�e consiste � envelopper un noeud. Le type Noeud est d�fini dans le
 * fichier Noeud.java comme �tudi� en cours
 * 
 * La classe ListeChainee propose les primitives utiles pour manipuler
 * des listes chain��s
 * 
 * 
 * @author elhadi
 *
 */
public class ListeChainee {

	/**
	 * Le noeud d'entr�e dans la liste Ce noeud contient le pointeur vers son
	 * suivant, le suivant � son suivant etc..
	 */
	private Noeud noeud;

	/**
	 * Primitive ajouter un nouvel �l�ment au d�but de la liste
	 * 
	 * @param element
	 */
	public void ajouterEnTete(int element) {

		Noeud nouveau = new Noeud();
		nouveau.valeur = element;
		nouveau.suivant = noeud;
		this.noeud = nouveau;

	}

	/**
	 * Calcul la taille <=> le nombre d'�l�mnts pr�sents dans la liste
	 * 
	 * @return
	 */
	public int taille() {
		int i = 0;
		Noeud p = this.noeud;
		while (p != null) {
			i++;
			p = p.suivant;
		}
		return i;
	}

	public void afficher() {

		Noeud p = this.noeud;
		String res = "";

		while (p != null) {
			res = res + (p.valeur) + " -> ";
			p = p.suivant;
		}
		res = res + "NULL";

		System.out.println(res);

	}
	
	public int compte (int v) {
		
		Noeud p = this.noeud;
		int i=0;
		while(p!=null){	
			
			
			if(v==p.valeur){
				
				i++;
				
			}
			
		p = p.suivant;
		
		}
		return i;
	}

	
	public boolean estVide() {
		
		Noeud p = this.noeud;
		
		
			return p==null;
			
		
		
		// compl�ter
		
	}

	public void supprimerTete() {
		this.noeud = this.noeud.suivant;
	}

	/**
	 * Supprimer la premi�re occurence du nombre valeur dans la liste
	 * 
	 * @param valeur
	 */
	public void supprimer(int valeur) {
		Noeud p = this.noeud;
               Noeud pres = p;
		while((p !=null) && (p.valeur!=valeur) ){
                    pres=p;
                    p = p.suivant;
                    
                }
		if(valeur==p.valeur){
                    
			pres.suivant=p.suivant;
			
			
		}
		// compl�ter
	}

	

	public void supprimerALindice(int index) {
            Noeud p = this.noeud;
               Noeud pres = p;
               int i=0;
		while((p !=null) ){
                    pres=p;
                    p = p.suivant;
                    i++;
                    if(i==index){
                        if(p==null){
                        p=null;
                        
                        }
                        else{
			pres.suivant=p.suivant;
                        }
		// compl�ter
	}
                   
                }
                
		
        }

	public void ajouterALindice(int index, int valeurAAjouter) {
		
		Noeud p = this.noeud;
		Noeud prec= this.noeud;
		Noeud ins=this.noeud;
		int pos=1;
		while(pos<=index){
			pos++;
			prec=p;
			p=p.suivant;
			
		}
		
		ins.valeur=valeurAAjouter;
		prec.suivant=ins;
		ins.suivant=p;
		}
		
		// compl�ter
	}


