package entreprises.exceptions;

public class EntrepriseSecrete extends Entreprise{
	
	 EntrepriseSecrete(int nb_employes, int capital, String nom, String mission) {
		super(nb_employes, capital, nom, mission);
		
	}

	public String mission() throws SecretMissionException {
		 throw new SecretMissionException();
		
	}

}
