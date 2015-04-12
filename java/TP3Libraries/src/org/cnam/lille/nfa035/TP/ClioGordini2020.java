package org.cnam.lille.nfa035.TP;

import com.simula3000.Simulation.ISimulable;

public class ClioGordini2020 extends Voiture implements ProduitPolluant,ISimulable {
	
	 ColorisRenault coloris=ColorisRenault.BLANC_GLACIER;
	 
	 public int getTauxCO2() {
		return 155;
	}
	
	public ClioGordini2020(){
		
		MoteurEssenceRS mrs=new MoteurEssenceRS();
		this.vitesseMax=197;
		this.consoType=6.7;
		this.nbPlaces=4;
		
	}
	@Override
public void demarrer(){
	
	super.demarrer();
	effetK2000();
}

public void effetK2000(){
	
	System.out.println("xouiouio");
}

@Override
public String getDescription() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public double getX() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double getY() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void setX(double arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void setY(double arg0) {
	// TODO Auto-generated method stub
	
}
}
