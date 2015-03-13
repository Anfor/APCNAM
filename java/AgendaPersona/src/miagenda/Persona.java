package miagenda;



public class Persona //clase
{
	
	public int id;//atributos del constructor.
	public String nom;
	public String prenom;
	
	
	public Persona()
	{		
			
	}
	/**
	 * 
	 * 
	 * 
	 * @param id
	 * @param nom
	 * @param Prenom
	 */
	public void ajouterpersonne(int number,String apellido,String nombre)
	{
		this.id=number;
		this.nom=apellido;
		this.prenom=nombre;
		
		
	}

}
