package angel.millionaire;

import java.util.Scanner;
/**
 * @param
 * @return
 * @throws  
 * @version 2.3v
 * @author ANGEL
 *
 */


public class Millionaire {
	
	//Variables generals
	private static String nom= new String();
	private static int  nquestion;
	private static int block;
	private static int [] cantidad={600,1200,2000,3000,6000,10000,13000,20000,40000,800000,120000,250000,400000,60000,900000,1500000,2000000,5000000};
	private static int montant=0;		
	
	
	/**
	 * méthode qui appelle à la méthode tour et lui passe comme paramètre
 	 *  un tableau avec les questions, les réponses et les solutions,
 	 *  par rapport à le nombre entier,  qui reçoit comme paramètre 
	 * 
	 *
	 *
	 * 
	 * @throws  si reentre un nombre different de les cas considerés, le default reinitialise la methode.
	 * @author ANGEL
	 * @version 2.3v
	 * @param block
	 * @return void
	 */
 	static void preguntas(int block){
 		

 		
		switch (block){
		
		case 1:   String [][][] preg1= {	// String qui stocke les questoins, reponses et verifications.
				    {
					
	 				
	 				{   "Au Moyen-Âge, comment appelait-on les villages fortifiés ?",
	 					"Dans quel film un couple en croisière va-t-il recueillir un naufragé qui va les terrifier ?",
	 					"Quel acteur français avait le premier rôle dans le film de Luchino Visconti \"Le Guépard\" ?",
	 					"Quel film à succès a réuni sur les écrans Sean Connery et Christophe Lambert ?",
	 					"Comment appelle-t-on le fruit du plaqueminier ?",
	 					"Qui était le compagnon de saint Paul ?",
	 					"Dans quel film John Travolta incarne-t-il un ange tombé du ciel ?",
	 					"Quel titre de noblesse est immédiatement inférieur à celui de comte ?",
	 					"De quelle série de six films un champion de boxe est-il la vedette ?",
	 					"Quelle est la capitale de la Nouvelle-Zélande ?",
	 					"À quel réalisateur français doit-on le film \"Banzaï\" ?",
	 					"Quel film a réuni sur les écrans Isabelle Adjani et Sharon Stone ?",
	 					"Qui a inventé les transports en communs modernes ?",
	 					"Qui était le premier président de la république ?",
	 					"Quelle est l'unité de mesure de la force d'un piment ?",
	 					"Quelle est la bonne écriture pour l'abréviation du mot \"Baronne\" ?",
	 					"Le \"Vosne-Romanée\" est un vin de quelle région viticole ?",
	 					"Quel est la valeur du pH du Coca-Cola ?"},
	 					
					{		"a- Tour\nb- Bastide\nc- Château fort\nd- Rempart",
	 						"a- Calme blanc\nb- Tempête en mer\nc- Le naufragé\nd- Les disparus",
	 						"a- Jean-Paul Belmondo\nb- Claude Brasseur\nc- Jean Gabin\nd- Alain Delon",
	 						"a- Highlander\nb- Greystoke\nc- Subway\nd- Mad Max\ne- Quitter",
	 						"a- Kakou\nb- Kacha\nc- Kaki\nd- Kali\ne- Quitter",
	 						"a- Saint-Matthieu\nb- Saint-Jean\nc- Saint-Luc\nd- Saint-Marc\ne- Quitter",
	 						"a- Michael\nb- Johnny\nc- Jerry\nd- Sam\ne- Quitter",
	 						"a- Archiduc\nb- Marquis\nc- Vicomte\nd- Duc\ne- Quitter",
	 						"a- Ritchie\nb- Rocky\nc- Rambo\nd- Randy\ne- Quitter",
	 						"a- Dublin\nb- Auckland\nc- Wellington\nd- Sydney\ne- Quitter",
	 						"a- Claude Lelouch\nb- Claude Zidi\nc- Claude Chabrol\nd- Claude Sautet\ne- Quitter",
	 						"a- Diabolique\nb- Ange et Démon\nc- Les sorcières\nd- Les ensorceleuses\ne- Quitter",
	 						"a- Séraphin Lampion\nb- Blaise Pascal\nc- René Descartes\nd- Eugène Poubelle\ne- Quitter",
	 						"a- Adolphe Thiers\nb- Charles de Gaulle\nc- Raymond Poincaré\nd- Louis-Napoléon Bonaparte\ne- Quitter",
	 						"a- L'unité thermoptim\nb- L'unité scoville\nc- L'unité cherit\nd- L'unité hauy\ne- Quitter",
	 						"a- Bonne\nb- Bne\nc- Bone\nd- Bnne\ne- Quitter",
	 						"a- Les vins du Languedoc\nb- Les vins du Bordelais\nc- Les vins du Beaujolais\nd- Les vins de Bourgogne\ne- Quitter",
	 						"a- 2,3\nb- 4,5\nc- 5,3\nd- 7\ne- Quitter"}
	 					    },
	 						{
	 						{"b","a","d","a","c","c","a","c","b","c","b","a","b","d","b","a","d","a"}
	 				
						}
					    };
			
					tour(preg1);
					break;
					
		case 2:   String [][][] preg2={		// String qui stocke les questoins, reponses et verifications.
				{
		
			
				
				{   "Comment est également appelée la \" Transat Jacques Vabre \" ?",
					"Quel nom porte le logiciel de traitement de texte mis au point par Microsoft ?",
					"Quel pays a pour capitale Katmandou ?",
					"À quel réalisateur français doit-on \"Le Corniaud\" ou \"La Grande Vadrouille\" ?",
					"À quel groupe musical international doit-on la bande originale du film \"Flash Gordon\" ?",
					"À quelle classe animale le scorpion appartient-il ?",
					"Quel oiseau palmipède a pour particularité de construire un nid flottant ?",
					"Quelle est la race du chien de Columbo ?",
					"Dans le langage familier, comment appelle-t-on la dent du petit enfant ?",
					"Quel peintre, né en 1844, est également appelé \" le Douanier \"?",
					"Dans les années 1980, quel groupe musical a chanté le titre \"Shout\" ?",
					"Comment appelle-t-on le versant de la montagne non situé au soleil ?",
					"Quelle est la seule valeur à la roulette à porter la couleur verte ?",
					"Qui est le Saint Patron des informaticiens et des internautes ?",
					"Quel laboratoire a inventé sans le vouloir le viagra ?",
					"Comment se nommait la première machine à calculer portable ?",
					"Depuis quelle année le 1er mai est-il férié en France ?",
					"A quelle étendue d'eau le morceau \"Smoke on the water\" de Deep Purple fait-il allusion ?"},
			     {      "a- Route du rhum\nb- Vendée Globe\nc- Route du café\nd- Trophée du rhum",
						"a- Access\nb- Word\nc- Excel\nd- PowerPoint",
						"a- Le Népal\n b- Le Tibet\n c- La Corée du Sud\n d- Le Pakistan",
						"a- Patrice Lefebvre\nb- Claude Zidi\nc- Patrice Leconte\nd-  Gérard Oury\ne- Quitter",
						"a- Queen\nb- Yes\nc- Led Zeppelin\nd- The Doors\ne- Quitter",
						"a- Aux mammifères\nb- Aux reptiles\nc- Aux arachnides\nd- Aux insectes\ne- Quitter",
						"a- La grèle\nb- La grève\nc- La grèbe\nd- La grène\ne- Quitter",
						"a- Basset\nb- Beagle\nc- Barbet\nd- Bichon\ne- Quitter",
						"a- Marmotte\nb- Menotte\nc- Quenotte\nd- Bouillotte\ne- Quitter",
						"a- Pablo Picasso\nb- Henri Rousseau\nc- Edgar Degas\nd- Salvador Dali\ne- Quitter",
						"a- Queen\nb- U2\nc- Tears For Fears\nd- Simple Minds\ne- Quitter",
						"a- Adret\nb- Ubac\nc- Étant\nd- Ressac\ne- Quitter",
						"a- Le zéro\nb- Le cinquante\nc- Le quarante\nd- Le treize\ne- Quitter",
						"a- Saint Hilaire de Poitiers\nb- Saint Serge de Radonège\nc- Saint Joseph de Copertino\nd- Saint Isidore de Séville\ne- Quitter",
						"a- Novartis\nb- Merck\nc- Pfizer\nd- Sanofi-Aventis\ne- Quitter",
						"a- La edita\nb- La curta\nc- La venta\nd- La lista\ne- Quitter",
						"a- 1918\nb- 1936\nc- 1941\nd- 1957\ne- Quitter",
						"a- Le lac Léman\nb- Le lac Titicaca\nc- Le lac Victoria\nd- Le loch ness\ne- Quitter"} 
					    },
						{
			            {"c","b","a","d","a","c","c","a","c","b","c","b","a","d","c","b","c","a"}
				
				}
			}; 
		
					tour(preg2);		 
					break;
					
		case 3: String [][][]  preg3={		// String qui stocke les questoins, reponses et verifications.
				{
					
				{"Quelle est la plus petite unité de mémoire utilisable sur un ordinateur ?",
			     "Quel insecte appelle-t-on aussi \" la bête à bon dieu \" ?",
			     "Qui fut le premier européen à arriver aux Philippines ?",
			     "Qui joua le rôle de Donna Martin dans la série télévisée \"Beverly Hills 90210\"?",
			     "Combien de temps dure le mandat du président des États-Unis ?",
			     "Dans quel pays se trouve le circuit automobile de Zandvoort ?",
			     "Quel roman George Orwell a-t-il écrit en 1948 ?",
			     "Dans quelle ville se trouve la fontaine de Trevi ?",
			     "En quoi un nihiliste croit-il ?",
			     "Avec quel autre animal vit généralement une oie ?",
			     "Quelle est la plus grande tortue marine connue à ce jour ?",
			     "De quelle comédie musicale font partie les Pink Ladies ?",
			     "Dans quoi vit le rat des moissons ?",
				 "Un ouvrage permettant à un véhicule de surmonter une étendue infranchissable est ?",
				 "Le tournesol \"suit\" le soleil grâce à un phénomène nommé ?",
				 "La clémentine est un croisement entre quelle variétés ?",
				 "Une abeille danse en rond pour prévenir ses congénères qu'elle a trouvé de la nourriture à quelle distance de la ruche ?",
				 "Le didgeridoo est un instrument qui fait partie de quelle famille ?"},
			{	 "a- Le byte\nb- Le mega\nc- Le bit\nd- Le giga",
				 "a- La luciole\nb- La coccinelle\nc- Le scarabée\nd- La libellule",
				 "a- Magellan\nb- Christophe Colomb\nc- Vasco de Gama\nd- Mauperthuis",
				 "a- Carol Potter\nb- Jenny Garth\nc- Tiffany Amber Thiessen\nd-  Tori Spelling\ne- Quitter",
				 "a- 4 ans\nb- 7 ans\nc- 5 ans\nd- 6 ans\ne- Quitter",
				 "a- La Belgique\nb- La Suisse\nc- Les Pays-Bas\nd- La France\ne- Quitter",
				 "a- 2001\nb- 2010\nc- 1984\nd- 1948\ne- Quitter",
				 "a- Rome\nb- Venise\nc- Barcelone\nd- Seville\ne- Quitter",
				 "a- En la chance\nb- En tout\nc- En rien\nd- En lui-même\ne- Quitter",
				 "a- Le canard\nb- Le jars\nc- Le cygne\nd- La poule\ne- Quitter",
				 "a- La tortue franche\nb- La tortue ninja\nc- La tortue luth\nd- La tortue argneuse\ne- Quitter",
				 "a- Save the Last Dance\nb- Grease\nc- West Side Story\nd- Moulin Rouge\ne- Quitter",
				 "a- Dans un nid\nb- Dans une tannière\nc- Dans un antre\nd- Dans un tronc creux\ne- Quitter",
				 "a- Un aqueduc\nb- Une passerelle\nc- Une buse\nd- Un viaduc\ne- Quitter",
				 "a- Le phototactisme\nb- Le photochromisme\nc- Le photopériodisme\nd- Le phototropisme\ne- Quitter",
				 "a- Un citron et une orange\nb-  Une mandarine et un citron\nc- Une mandarine et une orange\nd- Un citron et Une mandarine\ne- Quitter",
				 "a- 15 mètres\nb- 50 mètres\nc- 100 mètres\nd- 250 mètres\ne- Quitter",
				 "a- des percussions\nb- des vents\nc- des cuivres\nd- des bois\ne- Quitter"}
			
				},			
				
				{
				 {"c","c","a","d","a","c","c","a","c","b","c","b","a","d","d","c","a","c"}
				
				}
				};
		
					tour(preg3);	
				
			
		default:    System.out.println("Erreur on va recommencer");
							
						comenzar();								
				}
		
				
	 			
		
 				}
 	/**
 	 * méthode qui permettre choisir le mode de jeu
 	 * 
 	 * @throws  si reentre un nombre different de les cas considerés, le default reinitialise la methode.
 	 * @author ANGEL
 	 * @version 2.3v
 	 * @param void
 	 * @return void
 	 */
 		static void menu(){
 			
 			int opt;  // pour choisir le mode de jeu
 			System.out.print("Bonjour, entrez votre nom pour jouer: ");
 			Scanner sc = new Scanner(System.in);
 			nom=sc.nextLine();
 			
 			System.out.println("Voulez vous jouer avec nos questions  ou vous voulez ecrire les vos? ");
 			System.out.println("1- Vos questions.\n2- Nos questions.");
 			Scanner sco = new Scanner(System.in);
 			opt=sco.nextInt();
 			
 			switch (opt) {
 			
			case 1:		test();
				
				break;
				
			case 2: 	comenzar();
						

			default: 	System.out.println("Erreur repetez");
						menu();
				break;
			}
 			
 			
 		}
 		
	/**
	 * méthode qui permettre reentrer les valeurs sur un tableau est continuer le jeu avec.
	 * @throws  Il faut suivre les instructions et n'oubliers pas reentrer
	 * la letre des reponses correctes
	 * @author ANGEL
	 * @version 2.3v
	 * @param void
	 * @return void
	 */
		static void test(){
		
		
	
		System.out.println("Combien de questions voulez vous rajouter?");
		Scanner sctam = new Scanner(System.in);
		String tam1=sctam.nextLine();
		int tam=Integer.parseInt(tam1);
		String [][][] preg4= new String[2][2][tam]; // array pour stocker les questions,reponses et verifications
		
		int indice=0;	//pour placer a chaque indice
			while(indice<tam){
				
				System.out.println("Entrez la question: ");
				Scanner sctp = new Scanner(System.in);
				preg4[0][0][indice]=sctp.nextLine();//on garde la question
				
				System.out.println("Entrez les reponses selon modele svp: ");
				System.out.println("a- Tour b- Bastide c- Château fort d- Rempart");
				System.out.println("à partir de la troisieme question rajouter e- Quitter");
				Scanner sctr = new Scanner(System.in);
				preg4[0][1][indice]=sctr.nextLine();//on garde les reponses
				
				System.out.println("Entrez la reponses correcte selon modele svp: ");
				System.out.println("a ou b ou c ou d ou e");
				Scanner sctv = new Scanner(System.in);
				preg4[1][0][indice]=sctv.nextLine();//on garde la reponse correcte
				
				indice++;
				
				
			}
			
			
			tour (preg4);// on commence le jeu
		}
	
	/**
	 *  méthode qui commence le jeu en appelant la méthode preguntas
	 *	et le envoi un entier qui génère aléatoirement. 
	 *	
	 *
	 *
	 * @throws c'est un methode automatique, il ne doit pas posser des problemes
	 * @author ANGEL
	 * @version 2.3v
	 * @param void
	 * @return void
	 */
	static void  comenzar() {
		
		
		int blokant=block;/*pour garder la valeur si l'utilisateur il veu recomencer,
		ne repeter pas le block de questions*/ 
		
	
		
		do {
			block=(int)(Math.random()*3 + 1);//genere le nombre aleatoire pour choisir le block de questions
				
		} while (blokant==block);
			
		preguntas(block);//comence a faires les questions
		
		
	}
	
	/**
	 *  méthode qui retourne le caractère de la réponse et qui reçoit comme
     *  paramètre deux chaines de caractères avec la question et la réponse choisi
     *  
	 * @throws si le utilisateur rentre une option differente a les exposes, 
	 * on gere dans la methode tour.
	 * 
	 * @author ANGEL
	 * @version 2.3v
	 * @param pregunta
	 * @param respuesta
	 * @return
	 */
	
     static char preguntar(String pregunta, String respuesta){
    	
    	 char opcion; //stocke l'option choisi
    	 
		
		System.out.printf("On va avec la question numero %d\n\n",nquestion);
		
		
		System.out.println(pregunta);
		System.out.println(respuesta);
		Scanner sca = new Scanner(System.in);
		
		opcion=sca.next().charAt(0);
		
		
		return opcion;
		
		
     	}
     
     /**
      * 
      *   méthode qui retourne un booléen vrai si la réponse est correcte ou faux au contraire,
      *	 	Il reçoit deux caractère, un la réponse choisi autre la réponse correcte
      *
      * @throws c'est un methode automatique, il ne doit pas posser des problemes
      * @author ANGEL
      * @version 2.3v
      * @param respuesta
      * @param verificacion
      * @return void
      */
     
     static boolean verificar(char respuesta,char verificacion){
    	
    	 
    	 return (respuesta==verificacion);
     	}
    
     /**
      *  méthode qu'on appelle si on réussit la réponse
      *  
      * @throws c'est un methode automatique, il ne doit pas posser des problemes 
      * @author ANGEL 
      * @version 2.3v
      * @param respuesta
      * @return void
      */
     static void bravo(){
    	
    	 
    	 System.out.printf("BRAVO!! %s vous avez acerté, vous avez gagné %d euros por l'instance.\n\n",nom,cantidad[montant]);
    	 montant=montant+1;
    	
     	}

     /**
      *  méthode qu'on appelle si on gagne le jeu, et permettre recommencer si on veux
      * @throws si le utilisateur rentre une option differente a les exposes,
      * on recomence la methode.
      * @author ANGEL 
      * @version 2.3v
      * @param void
      * @return void
      */
     static void ganador(){
    	
    	 
    	 System.out.printf("Felicitations %s!, vous avez gagné le concour et avec lui %d euros  \n",nom,cantidad[17]);
    	 System.out.print("vous voulez recomencer?\no-Pour oui\nn-Pour non\n");
    	 Scanner scc = new Scanner(System.in);
    	 char eleccion =scc.next().charAt(0);//stocke l'election de l'utilisateur pur continuer ou pas
    	 
    	while((eleccion!='o')|(eleccion!='n')){//on recomence si la reponse n'est pas correcte
    			if (eleccion=='o'){
    		
    				menu();
    				}
    	 else if (eleccion=='n') {
    		 
    		 System.out.println("à bientôt!");
    		 try {

    			 Thread.sleep ( 5000);

    			 }

    			 catch ( InterruptedException e) {

    			 System.out.println ( " Pausa " );

    			 } 	
    		 System.exit(1);
    		}
    		
    			else {
					System.out.println("Reponse mal saisi, repetez s'il vous plait.");
				}
    	
    	}
		
    	 
     }
    
     /**
      * méthode qui permettre dire au revoir
      *   et savoir la quantité gagnée avant quitter volontairement le jeu.
      *   
      * @throws c'est un methode automatique, il ne doit pas posser des problemes
      * @author ANGEL 
      * @version 2.3v
      * @param void
      * @return void 
      */
     static void abandonar() {
    	 
    	 
    	 System.out.printf("Merci d'avoir joué, vous avez gagné %d euros",cantidad[montant-1]);
    	 System.exit(1);
    	 
     }
     /**
      *  méthode qui permettre dire au revoir et savoir la quantité gagnée
      *    avant quitter, par rapport au palier si on a échoué le jeu 
      *
      * @throws c'est un methode automatique, il ne doit pas posser des problemes. 
      * @author ANGEL 
      * @version 2.3v
      * @param void
      * @return void 
      */
     static void eliminado(){
    	
    	 
    	 if (nquestion<6){
    		 System.out.println("Desolé, reponse incorrecte,\nvous avez perdu tout, à la prochaine. ");
        	
    		 try {

    			 Thread.sleep ( 5000);

    			 }

    			 catch ( InterruptedException e) {

    			 System.out.println ( " Pausa " );

    			 } 	
    		 
    		 System.exit(1);
    	 }
    	 else if (nquestion<=12) {
    		 System.out.printf("Desolé, reponse incorrecte,\nvous avez gagné %d, à la prochaine. ",cantidad[5]);
    		 
    		 try {

    			 Thread.sleep ( 5000);

    			 }

    			 catch ( InterruptedException e) {

    			 System.out.println ( " Pausa " );

    			 } 	
    		 
    		 System.exit(1);
		}
    	 else if (nquestion<=18) {
    		 System.out.printf("Desolé, reponse incorrecte,\nvous avez gagné %d, à la prochaine. ",cantidad[11]);
        	
    		 try {

    			 Thread.sleep ( 5000);

    			 }

    			 catch ( InterruptedException e) {

    			 System.out.println ( " Pausa " );

    			 } 	
    		 
    		 
    		 System.exit(1);
		}
    	 
     }
   
     /**
    *   méthode qui reçoit le tableau des questions et réponses et appelle 
    *	  le méthode preguntar pour faire des questions, 
    *	  et avec la réponse appelle le méthode verificar pour vérifier la réponse
    *	  Il fait la gestion des méthodes abandonar, pour quitter et eliminado si on a échoue,
    *	  ou bravo ou ganador si on réussit la question
    *
    *@throws c'est un methode qui gere les questions et les reponses, si elles sont mal saisies
    *on recomence.
    * @author ANGEL 
    * @version 2.3v
    * @param bloque
    * @return void 
    * 
    * 
    */
     static void tour(String bloque[][][]){
    	
    	 
    	 	nquestion=1;//on commence pour la question 1.
    	 	System.out.printf("\n\n%s, On va commencer !!",nom);
    		System.out.println("\n\n");
    		
    		while (nquestion<=bloque[0][1].length)//on parcoiur jusqu'a la fin du tableau
    		{	
    			String pregunta=bloque[0][0][nquestion-1];
    			String respuesta=bloque[0][1][nquestion-1];
    			char verificacion=bloque[1][0][nquestion-1].charAt(0);
    			
    			char opcion=preguntar(pregunta,respuesta);
    			
    			
    			
    			if((nquestion >=3) & (opcion=='e')){ // si la question est correcte y la option aussi, on quit le jeu
    				
    				abandonar();
    		//methode abandonar
    		}
    				
    				
    			if ((opcion=='a')|(opcion=='b')|(opcion=='c')|(opcion=='d')){
    				
    				if(verificar(opcion,verificacion)){
    					if (nquestion==bloque[0][1].length){  // si est la derniere question on appelle la methode ganador
        					
        					
        					ganador();
        					break;
        				}
    					
    					bravo();// si n'est pas la derniere question on appelle la methode bravo
    					nquestion++;
    							}
    					else {	// si l'option n'est pas correcte on appelle eliminado pour finir.
							eliminado();
						}
    				
    				
    			}
    						
    			else if ((opcion!='a')|(opcion!='b')|(opcion!='c')|(opcion!='d')) {// si la reponse est mal saisi, on refait la question.
    				
    				System.out.println("Reponse mal saisi, repetez");
    				preguntar(pregunta,respuesta);
    			}
    	
    		}
    
    	}
    	 
     
     
     /**
      * on utilise la méthode principal pour commencer le jeu
      * 
      * @param args
      */
     
	public static void main(String[] args) {
		
		
		menu();
	
	}
}
		
		
	
	
	
	


