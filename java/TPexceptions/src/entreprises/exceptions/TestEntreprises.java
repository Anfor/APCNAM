package entreprises.exceptions;

import java.util.ArrayList;
import java.util.Iterator;


public class TestEntreprises {

	public static void main(String[] args) {
		
		ArrayList<Entreprise> empresa=new ArrayList<Entreprise>();
		
		
		Entreprise [] entrep=new Entreprise[6];
		
		Entreprise emp=new Entreprise(100,2500000,"Ford","Faire voitures");
		Entreprise emp2=new Entreprise(185,4250000,"CIA","Chercher information");
		Entreprise emp3=new Entreprise(300,9800000,"Spectre","je ne sai pas");
		Entreprise emp4=new Entreprise(700,66500000,"Microsoft","Faire logiciels");
		
		empresa.add(emp);
		empresa.add(emp2);
		empresa.add(emp3);
		empresa.add(emp4);
		
		entrep[0]=new Entreprise(100,2500000,"Ford","Faire voitures");
		entrep[1]=new Entreprise(185,4250000,"CIA","Chercher information");
		entrep[2]=new Entreprise(300,9800000,"Spectre","je ne sai pas");
		entrep[3]=new Entreprise(340,420000,"CroixRouge","soigner");
		entrep[4]=new Entreprise(700,66500000,"Microsoft","Faire logiciels");
		entrep[5]=new Entreprise(560,3510000,"ParisDiderot","Voir paris");
		
		Entreprises test = new Entreprises();
		
		test.TousLesEntreprises(entrep);
		
		Iterator<Entreprise> itr= empresa.iterator();
		
		while (itr.hasNext()) {
			Object pp = itr.next();
			
			System.out.println("dentro del while "+ pp);
		}
		
		
		}
		
	}


