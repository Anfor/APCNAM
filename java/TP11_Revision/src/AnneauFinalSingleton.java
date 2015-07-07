
public class AnneauFinalSingleton {
	private String description = "";
	private final static AnneauFinalSingleton anneauUnique = new AnneauFinalSingleton("pour les gouverner tous, Un Anneau pour les trouver, Un Anneau pour les amener tous, Et dans les ténèbres les lier");
	
	private AnneauFinalSingleton (String type){
		this.description = type;
		System.out.println("Un anneau "+type);
	}
	
	public static AnneauFinalSingleton getAnneau() {
		return anneauUnique;
	}
}
