import java.util.Scanner;






public class Jeu {
	
	private static boolean gagne(De de1, De de2, De de3)
	{
	int bon = 0;
	int i;
	// quatre
	if ((de1.getValeur() == 4) || (de2.getValeur() == 4) || (de3.getValeur() == 4))
	bon++;
	// deux
	if ((de1.getValeur() == 2) || (de2.getValeur() == 2) || (de3.getValeur() == 2))
	bon++;
	// un
	if ((de1.getValeur() == 1) || (de2.getValeur() == 1) || (de3.getValeur() == 1))
	bon++;
	return (bon == 3);
	}
	
	private static void Jeu421(De de1, De de2, De de3){
		
		int nb_essais = 1;
		int n;
		int tipo;
		
		de1.lancer();
		de2.lancer();
		de3.lancer();
		
		System.out.println("Voulez vous jouer avec quelle tipe des dés?");
		System.out.println("1- Normal");
		System.out.println("2- Pipé");
		Scanner scb = new Scanner(System.in);
		tipo=scb.nextInt();
		
		
		if (tipo==1){
			
			while(!gagne(de1,de2,de3)) {
				
				nb_essais++;
				System.out.println(" dé 1 : " + de1.getValeur());
				System.out.println(" dé 2 : " + de2.getValeur());
				System.out.println(" dé 3 : " + de3.getValeur());
				System.out.println("Quel dé relancer ?");
				Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
				switch(n) {
				case 1: de1.lancer(); break;
				case 2: de2.lancer(); break;
				case 3: de3.lancer(); break;
				}
				}
				System.out.println(" dé 1 : " + de1.getValeur());
				System.out.println(" dé 2 : " + de2.getValeur());
				System.out.println(" dé 3 : " + de3.getValeur());
				System.out.println("Gagné en "+ nb_essais+" coups");
			
		}
		
		else {
			
			    de1.piper();
				de2.piper();
				de3.piper();
				
			while(!gagne(de1,de2,de3)) {
				
				
				nb_essais++;
				System.out.println(" dé 1 : " + de1.getValeur());
				System.out.println(" dé 2 : " + de2.getValeur());
				System.out.println(" dé 3 : " + de3.getValeur());
				System.out.println("Quel dé relancer ?");
				Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
				switch(n) {
				case 1: de1.piper(); break;
				case 2: de2.piper(); break;
				case 3: de3.piper(); break;
				}
				}
				System.out.println(" dé 1 : " + de1.getValeur());
				System.out.println(" dé 2 : " + de2.getValeur());
				System.out.println(" dé 3 : " + de3.getValeur());
				System.out.println("Gagné en "+ nb_essais+" coups");
			
			
		}
		
		
		
		System.out.println("\n");
		main(null);
		
	}
	
	private static void jeu(De de1, De de2){
		
		int somme;
		int choose;
		boolean cont=true;
		
		do {
			
			int dado1=de1.lancer();
			int dado2=de2.lancer();
			
			System.out.println("Dé 1: "+dado1);
			System.out.println("Dé 2: "+dado2);
			
			somme=dado1+dado2;
			
			System.out.println("Somme= "+somme);
			
			System.out.println("voulez vous continuer?");
			System.out.println("1- oui");
			System.out.println("2- non");
			Scanner sca = new Scanner(System.in);
			choose=sca.nextInt();
			
			if (choose==2){
				
				cont=false;
			}
			
		} while (cont);
		
		main(null);
		
		
	}
	
	public static  void mystere() {
		
		
		int compteur=1;
		
		De100 de1001=new De100();
		
		System.out.println("valor= "+de1001.getValeur());
		
		
		System.out.println("Bienvenue au jeu de mystere");
        System.out.println("Reentre votre choix entre 1 entre 100");
        Scanner scc = new Scanner(System.in);
        int choix= scc.nextInt();

		do {
			System.out.println("compteur= "+compteur);
			
			 if (de1001.tropgrand(choix)) {
				
				compteur++;
				System.out.println("Chiffre trop grande, reentre un'autre choix");
				Scanner scf = new Scanner(System.in);
				  choix= scf.nextInt();
				
				
				
			}
			
			else if (de1001.troppetit(choix)){
				compteur++;
				System.out.println("Chiffre trop petit, reentre un'autre choix");
				Scanner scg = new Scanner(System.in);
				  choix= scg.nextInt();
				
				
			}
			
		} while (!de1001.exact(choix));
		
		
		if (de1001.exact(choix)) {
			
			System.out.printf("Bravo!! vous avez gagne dans %d fois\n\n\n",compteur);
			main(null);
			
		}
		
		
	}
	
	
	public static void main(String [] args)
	{	
		De de1 = new De();
		De de2 = new De();
		De de3 = new De();
		
		
		
		
		int eleccion;
		
		System.out.println("Voulez-vous choisir: ");
		System.out.println("1- Jouer");
		System.out.println("2- Jouer à 421");
		System.out.println("3- Jeu de mystére");
		System.out.println("4- Sortir");
		
		Scanner sc = new Scanner(System.in);
		eleccion=sc.nextInt();
		switch (eleccion) {
		
		case 1:	   jeu(de1, de2);
			
			break;
			
		case 2: 	Jeu421(de1, de2, de3);
			
			break;
			
			
		case 3:			  mystere();
						
			
						  break;
			
		case 4:   	 System.out.println("à bientôt!");
				
			try {

			 Thread.sleep ( 5000);

			 }

			 catch ( InterruptedException e) {

			 System.out.println ( " Pausa " );

			 } 	
		 System.exit(1);

		default:   System.out.println("Erreur repetez");
			
			        main(null);
			break;
		}
	
	
	}
}
