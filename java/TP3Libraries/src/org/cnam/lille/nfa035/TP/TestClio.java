package org.cnam.lille.nfa035.TP;


import javafx.application.*;
import com.simula3000.Simulation.Script;
import com.simula3000.Simulation.SimulationFX;

public class TestClio {

	public static void main(String[] args) {
		
		ClioDiesel clio=new ClioDiesel();
		
		
		
		ClioGordini2020 cg20=new ClioGordini2020();
		
		for(Roue r:cg20.roues)
			r.gonflerPneu();
		/*
		
		cg20.roues[0].gonflerPneu();		
		*/
		cg20.demarrer();
		
		SimulationFX.addSim(clio, Script.DEFAULT_LEFT_RIGHT1);
		SimulationFX.addSim(clio, Script.DEFAULT_LEFT_RIGHT2);
		Application.launch(SimulationFX.class);
		
	}

}
