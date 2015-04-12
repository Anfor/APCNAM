
public class TestClio {

	public static void main(String[] args) {
		
		ClioGordini2020 cg20=new ClioGordini2020();
		
		for(Roue r:cg20.roues)
			r.gonflerPneu();
		/*
		
		cg20.roues[0].gonflerPneu();		
		*/
		cg20.demarrer();
		
		
		
	}

}
