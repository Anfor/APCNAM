package org.cnam.lille.nfa035.TP;

public class ClioDiesel extends Voiture {
	
	ColorisRenault coloris=ColorisRenault.ROUGE_VIF;
	
	public ClioDiesel(){
		super();
		mtr=new MoteurDiesel();
	
		this.vitesseMax=160;
		this.consoType=5.5;
		this.nbPlaces=4;
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

	@Override
	public int getTauxCO2() {
		// TODO Auto-generated method stub
		return 0;
	}

}
