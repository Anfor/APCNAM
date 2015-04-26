package exceptions.bibliotheque;

public class Librairie {
	
	public static void main(String[] args) {
		
		Livre l1 = new Livre("a1", "t1");
		l1.setNbPages(200);
		l1.setPrix(239.50);
		
		Livre l2 = new Livre("a2", "t2");
		l2.setNbPages(250);
		l2.setPrix(140);
		
		Livre l3 = new Livre("a3", "t3");
		l1.setNbPages(300);
		l1.setPrix(159.50);
		
		Livre l4 = new Livre("a1", "t4");
		Livre l5 = new Livre("a1", "t1");
		Livre l6 = new Livre("a2", "t5");
		Livre l7 = new Livre("Prueba", "La prueba");
		
		Etagere etagere1 = new Etagere(3);
		Etagere etagere2 = new Etagere(3);
		
		etagere1.ajouter(l1);
		etagere1.ajouter(l2);
		etagere1.ajouter(l3);
		etagere2.ajouter(l6);
		etagere2.ajouter(l4);
		etagere2.ajouter(l5);
		etagere1.ajouter(l7);
		
	
	
		// Recherche et suppression
		String auteur, titre;
		if (args.length == 2) {
		auteur = args[0];
		titre = args[1];
		}
		else {
		auteur = "a2";
		titre = "t2";
		}
		
		
		int position = etagere1.cherche(titre, auteur);
		
		if (position != 0) {
		System.out.println("Livre d'auteur " + auteur+ " et de titre " + titre + " trouvé"+ " en position " + position + " sur l'étagère");
		System.out.println("Vérification ; le livre est : " + "\n"+ etagere1.getLivre(position));
		System.out.println("L'étagère avant d'avoir enlevé ce livre : \n"+ etagere1.nbLivres);
		
		Livre livreEnleve = etagere1.enleverLivre(titre, auteur);
		System.out.println("L'étagère après avoir enlevé ce livre : \n"	+ etagere1.nbLivres);
		System.out.println("Pour vérification :\n"+ "Le livre enlevé est :\n"+ livreEnleve.getAuteur()+" "+livreEnleve.getTitre());
		}
		else {
		System.out.println("Livre d'auteur " + auteur+ " et de titre " + titre + " pas trouvé");
		}
		}
}
