/**
 * Remarquer que l'impl�mentation chin�e d'une pile est une version tr�s r�duite de la liste chain�e
 * Similitude entre ajouterEnTete et empiler , supprimerTete et depiler, tete() et sommet()
 * @author elhadi
 *
 */
public class Pile {
	
	
	

	/**
	 */
	private Noeud noeud;

	/**
	 * Primitive ajouter un nouvel �l�ment au d�but de la liste
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
