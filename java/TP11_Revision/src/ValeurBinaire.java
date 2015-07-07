
public class ValeurBinaire {
	private static final ValeurBinaire VRAI = new ValeurBinaire(true);
	private static final ValeurBinaire FAUX = new ValeurBinaire(false);
	
	private boolean value;
			
	ValeurBinaire(boolean val) {
		value = val;
	}
			
	/**
	 * @param args
	 */
	public static ValeurBinaire getValeurBinaire(String chaine) {
		if (chaine.equalsIgnoreCase("VRAI")) {
			return VRAI;
		} else if (chaine.equalsIgnoreCase("FAUX")) {
			return FAUX;
		} 
		return null;
	}

}
