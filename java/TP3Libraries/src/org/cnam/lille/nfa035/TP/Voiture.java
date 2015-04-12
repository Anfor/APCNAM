package org.cnam.lille.nfa035.TP;

import com.simula3000.Simulation.ISimulable;



public abstract class Voiture implements ISimulable {
	
	 int vitesseMax;
	 double consoType;
	 int nbPlaces;
	 
	 Moteur mtr=new Moteur();
	 
	Roue roues[]=new Roue[4];
	
	
	public Voiture(){// constructor para inicializar el contenido del vector
		
		
		for(int i=0;i<roues.length;i++){// inicializar cada elemento del vector, cada objeto.
			roues[i]=new Roue();
		}
		
	}
	 
	
	public void demarrer() {
		
		System.out.println("vroum");
		
	}
	
	public void arreter() {
		
	}
	
	public void afficherInfos() {
		
	}
	
	

}
