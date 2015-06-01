import java.util.ArrayList;


	public class GringottsBanque {
	
		private ArrayList<Client> clientes;
		
		
	public void ajouterClient(String nom_du_client){
		
		Client client = new Client(nom_du_client);
		
			clientes.add(client);
	}
	
	public void bilanClient(int numero_client){
		
		clientes.get(numero_client).getSolde();
		
	}
	
	public void afficherBilan(){
		
		
	}
	
}
