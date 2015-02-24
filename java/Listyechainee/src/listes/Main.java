package listes;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		ListeChainee l = new ListeChainee();
		
		l.ajouterEnTete(3);
		
		l.afficher();
		
		l.ajouterEnTete(5);
		
		l.ajouterEnTete(8);
		l.ajouterEnTete(12);
		l.ajouterEnTete(66);
		l.ajouterEnTete(87);
                l.ajouterEnTete(47);
                l.ajouterEnTete(81);
                l.ajouterEnTete(39);
		l.afficher();
		
		System.out.println("la taille est : " + l.taille());
		l.afficher();
		l.supprimerALindice(8);
		l.afficher();
		
	
	}

}
