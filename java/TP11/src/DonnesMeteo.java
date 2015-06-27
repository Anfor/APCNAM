import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;




public class DonnesMeteo {

	
		private String aerodrome;
		private String dateHeure;
		private int temperature;
		private int pression;
		static ArrayList<DonnesMeteo> datos;
		
		
		
		
		
		public static String[] decoupeLigne(String ligne){
			String[]champs=ligne.replace("=","").split("");
			if(champs.length !=10 ||!champs[1].equals("METAR")||!champs[9].startsWith("Q"))
				return new String[]{};
			champs[8]=champs[8].substring(0, 2);
			champs[9]=champs[9].substring(1);
			champs[0]=champs[0].substring(0, 8);
			return champs;
		}
		
		public static void traiteFichier(String nomfichier){
			datos= new ArrayList<DonnesMeteo>();
			BufferedReader reader = null;
			String line;
			
		   
			try {
				
			
				 reader =new BufferedReader(new FileReader("src/"+nomfichier));
				 
				 while ((line = reader.readLine()) != null){
					 System.out.println("linea "+line);
						DonnesMeteo donnes = new DonnesMeteo();
						String[] champs=decoupeLigne(line);
						if (champs.length>0) {
							donnes.aerodrome=champs[2];
							donnes.dateHeure=champs[0];
							donnes.pression=Integer.parseInt(champs[9]);
							donnes.temperature=Integer.parseInt(champs[8]);
							datos.add(donnes);
						}
					}
			
				 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		public String getAerodrome() {
			return aerodrome;
		}
		public void setAerodrome(String aerodrome) {
			this.aerodrome = aerodrome;
		}
		public String getDateHeure() {
			return dateHeure;
		}
		public void setDateHeure(String dateHeure) {
			this.dateHeure = dateHeure;
		}
		public int getTemperature() {
			return temperature;
		}
		public void setTemperature(int temperature) {
			this.temperature = temperature;
		}
		public int getPression() {
			return pression;
		}
		public void setPression(int pression) {
			this.pression = pression;
		}
		@Override
		public String toString() {
			return "DonnesMeteo [aerodrome=" + aerodrome + ", dateHeure="
					+ dateHeure + ", temperature=" + temperature
					+ ", pression=" + pression + "]";
		}
		
}
