package entreprises.exceptions;

public class EntrepriseSansProfit extends Entreprise{
	
	EntrepriseSansProfit(int nb_employes, int capital, String nom,
			String mission) {
		super(nb_employes, capital, nom, mission);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int capital() throws NonProfitException {
		throw new NonProfitException();
	}

}
