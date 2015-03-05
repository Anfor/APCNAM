/**
 * Remarquer que l'implémentation chinée d'une pile est une version très réduite de la liste chainée
 * Similitude entre ajouterEnTete et empiler , supprimerTete et depiler, tete() et sommet()
 * @author elhadi
 *
 */
public class Pile {
	
	
	

	/**
	 */
	private Noeud noeud;

	/**
	 * Primitive ajouter un nouvel élément au début de la liste
	 * 
	 * @param element
	 */
	public void empiler(int element) {

		Noeud nouveau = new Noeud();
		nouveau.valeur = element;
		nouveau.suivant = noeud;
		this.noeud = nouveau;

	}


	public boolean estVide() {
		return noeud == null;
	}

	public void depiler() {
		this.noeud = this.noeud.suivant;
	}

	/**
	 * @return
	 */
	public Integer sommet() {
		return noeud.valeur;
	}

}
