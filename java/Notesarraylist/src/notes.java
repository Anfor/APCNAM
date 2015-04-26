import java.util.ArrayList;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class notes {

	public static void main(String[] args) {
		double note;
		int cont=0;
		ArrayList<Double> lista = new ArrayList<Double>();
		while(cont<3){
	System.out.println("introduire note: ");
	Scanner sc = new Scanner(System.in);
	note=sc.nextDouble();
	ajouternote(lista,note);
	cont++;

		}
		
		System.out.println("La moyenne est: "+moyenne(lista));
		
		System.out.println("introduire note: ");
		Scanner sca = new Scanner(System.in);
		note=sca.nextDouble();
		ajouternote(lista,note);
		
		System.out.println("La moyenne est: "+moyenne(lista));
	}
	
	
	
	
	public static  void ajouternote(ArrayList<Double> lista,double note) {
		
		lista.add(note);
		
		
	}
	
	public static double moyenne (ArrayList<Double>lista)
	{
		double moy=0;
		
		for(int i = 0;i<lista.size();i++){
			
			moy=lista.get(i)+moy;
			
		}
		
		return moy/lista.size();
		
		
	}
	
	public static void afficher(ArrayList<Double>lista)
	{
		System.out.println("les notes: ");
		
		for(int i =0;i<lista.size();i++)
		{
			System.out.println(lista.get(i));
			
			
		}		
		
		
		
	}		
	}
		
	

