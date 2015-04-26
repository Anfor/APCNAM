package entreprises.exceptions;

public class Entreprises extends Entreprise {
	
	
	

	

	Entreprises(int nb_employes, int capital, String nom, String mission) {
		super(nb_employes, capital, nom, mission);
		// TODO Auto-generated constructor stub
	}

	public Entreprises() {
		// TODO Auto-generated constructor stub
	}

	public void TousLesEntreprises(Entreprise [] entreprises) {
		
		
		for(int i=0;i<entreprises.length;i++){
			
			try {
				System.out.println(entreprises[i].mission());
			} catch (SecretMissionException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				System.out.println(entreprises[i].capital());
			} catch (NonProfitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
				
	}

}
