
public class AppliMeteo {
	
	
	
	public static void main(String[] args) {
		DonnesMeteo meteo= new DonnesMeteo();
		
	meteo.traiteFichier("meteo.txt");
		
		System.out.println("datos "+meteo.datos);
	}

}
