
public class AnneauSingleton {
	private String description = "";
	private  static AnneauSingleton anneauUnique;
	
	private AnneauSingleton (String type){
		this.description = type;
		System.out.println("Un anneau "+type);
	}
	
	public static AnneauSingleton getAnneau() {
		if (anneauUnique == null) {
			anneauUnique = new AnneauSingleton("pour les gouverner tous, Un Anneau pour les trouver, Un Anneau pour les amener tous, Et dans les ténèbres les lier");
		}
		return anneauUnique;
	}
}
