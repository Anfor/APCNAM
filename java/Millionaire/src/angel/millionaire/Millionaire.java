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
	 * mÈthode qui appelle ‡ la mÈthode tour et lui passe comme paramËtre
 	 *  un tableau avec les questions, les rÈponses et les solutions,
 	 *  par rapport ‡ le nombre entier,  qui reÁoit comme paramËtre 
	 * 
	 *
	 *
	 * 
	 * @throws  si reentre un nombre different de les cas considerÈs, le default reinitialise la methode.
	 * @author ANGEL
	 * @version 2.3v
	 * @param block
	 * @return void
	 */
 	static void preguntas(int block){
<<<<<<< HEAD
 		
=======
 		/*m√©thode qui appelle √† la m√©thode tour et lui passe comme param√®tre
 		 *  un tableau avec les questions, les r√©ponses et les solutions,
 		 *   par rapport √† le nombre entier,  qui re√ßoit comme param√®tre */
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a

 		
		switch (block){
		
		case 1:   String [][][] preg1= {	// String qui stocke les questoins, reponses et verifications.
				    {
					
	 				
<<<<<<< HEAD
	 				{   "Au Moyen-¬ge, comment appelait-on les villages fortifiÈs ?",
	 					"Dans quel film un couple en croisiËre va-t-il recueillir un naufragÈ qui va les terrifier ?",
	 					"Quel acteur franÁais avait le premier rÙle dans le film de Luchino Visconti \"Le GuÈpard\" ?",
	 					"Quel film ‡ succËs a rÈuni sur les Ècrans Sean Connery et Christophe Lambert ?",
=======
	 				{"Au Moyen-√Çge, comment appelait-on les villages fortifi√©s ?",
	 					"Dans quel film un couple en croisi√®re va-t-il recueillir un naufrag√© qui va les terrifier ?",
	 					"Quel acteur fran√ßais avait le premier r√¥le dans le film de Luchino Visconti \"Le Gu√©pard\" ?",
	 					"Quel film √† succ√®s a r√©uni sur les √©crans Sean Connery et Christophe Lambert ?",
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
	 					"Comment appelle-t-on le fruit du plaqueminier ?",
	 					"Qui √©tait le compagnon de saint Paul ?",
	 					"Dans quel film John Travolta incarne-t-il un ange tomb√© du ciel ?",
	 					"Quel titre de noblesse est imm√©diatement inf√©rieur √† celui de comte ?",
	 					"De quelle s√©rie de six films un champion de boxe est-il la vedette ?",
	 					"Quelle est la capitale de la Nouvelle-Z√©lande ?",
	 					"√Ä quel r√©alisateur fran√ßais doit-on le film \"Banza√Ø\" ?",
	 					"Quel film a r√©uni sur les √©crans Isabelle Adjani et Sharon Stone ?",
	 					"Qui a invent√© les transports en communs modernes ?",
	 					"Qui √©tait le premier pr√©sident de la r√©publique ?",
	 					"Quelle est l'unit√© de mesure de la force d'un piment ?",
	 					"Quelle est la bonne √©criture pour l'abr√©viation du mot \"Baronne\" ?",
	 					"Le \"Vosne-Roman√©e\" est un vin de quelle r√©gion viticole ?",
	 					"Quel est la valeur du pH du Coca-Cola ?"},
	 					
					{		"a- Tour\nb- Bastide\nc- Ch√¢teau fort\nd- Rempart",
	 						"a- Calme blanc\nb- Temp√™te en mer\nc- Le naufrag√©\nd- Les disparus",
	 						"a- Jean-Paul Belmondo\nb- Claude Brasseur\nc- Jean Gabin\nd- Alain Delon",
	 						"a- Highlander\nb- Greystoke\nc- Subway\nd- Mad Max\ne- Quitter",
	 						"a- Kakou\nb- Kacha\nc- Kaki\nd- Kali\ne- Quitter",
	 						"a- Saint-Matthieu\nb- Saint-Jean\nc- Saint-Luc\nd- Saint-Marc\ne- Quitter",
	 						"a- Michael\nb- Johnny\nc- Jerry\nd- Sam\ne- Quitter",
	 						"a- Archiduc\nb- Marquis\nc- Vicomte\nd- Duc\ne- Quitter",
	 						"a- Ritchie\nb- Rocky\nc- Rambo\nd- Randy\ne- Quitter",
	 						"a- Dublin\nb- Auckland\nc- Wellington\nd- Sydney\ne- Quitter",
	 						"a- Claude Lelouch\nb- Claude Zidi\nc- Claude Chabrol\nd- Claude Sautet\ne- Quitter",
	 						"a- Diabolique\nb- Ange et D√©mon\nc- Les sorci√®res\nd- Les ensorceleuses\ne- Quitter",
	 						"a- S√©raphin Lampion\nb- Blaise Pascal\nc- Ren√© Descartes\nd- Eug√®ne Poubelle\ne- Quitter",
	 						"a- Adolphe Thiers\nb- Charles de Gaulle\nc- Raymond Poincar√©\nd- Louis-Napol√©on Bonaparte\ne- Quitter",
	 						"a- L'unit√© thermoptim\nb- L'unit√© scoville\nc- L'unit√© cherit\nd- L'unit√© hauy\ne- Quitter",
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
		
			
				
<<<<<<< HEAD
				{   "Comment est Ègalement appelÈe la \" Transat Jacques Vabre \" ?",
=======
				{"Comment est √©galement appel√©e la \" Transat Jacques Vabre \" ?",
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
					"Quel nom porte le logiciel de traitement de texte mis au point par Microsoft ?",
					"Quel pays a pour capitale Katmandou ?",
					"√Ä quel r√©alisateur fran√ßais doit-on \"Le Corniaud\" ou \"La Grande Vadrouille\" ?",
					"√Ä quel groupe musical international doit-on la bande originale du film \"Flash Gordon\" ?",
					"√Ä quelle classe animale le scorpion appartient-il ?",
					"Quel oiseau palmip√®de a pour particularit√© de construire un nid flottant ?",
					"Quelle est la race du chien de Columbo ?",
					"Dans le langage familier, comment appelle-t-on la dent du petit enfant ?",
					"Quel peintre, n√© en 1844, est √©galement appel√© \" le Douanier \"?",
					"Dans les ann√©es 1980, quel groupe musical a chant√© le titre \"Shout\" ?",
					"Comment appelle-t-on le versant de la montagne non situ√© au soleil ?",
					"Quelle est la seule valeur √† la roulette √† porter la couleur verte ?",
					"Qui est le Saint Patron des informaticiens et des internautes ?",
<<<<<<< HEAD
					"Quel laboratoire a inventÈ sans le vouloir le viagra ?",
					"Comment se nommait la premiËre machine ‡ calculer portable ?",
					"Depuis quelle annÈe le 1er mai est-il fÈriÈ en France ?",
					"A quelle Ètendue d'eau le morceau \"Smoke on the water\" de Deep Purple fait-il allusion ?"},
			     {      "a- Route du rhum\nb- VendÈe Globe\nc- Route du cafÈ\nd- TrophÈe du rhum",
=======
					"Quel laboratoire a invent√© sans le vouloir le viagra ?",
					"Comment se nommait la premi√®re machine √† calculer portable ?",
					"Depuis quelle ann√©e le 1er mai est-il f√©ri√© en France ?",
					"A quelle √©tendue d'eau le morceau \"Smoke on the water\" de Deep Purple fait-il allusion ?"},
			{"a- Route du rhum\nb- Vend√©e Globe\nc- Route du caf√©\nd- Troph√©e du rhum",
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
						"a- Access\nb- Word\nc- Excel\nd- PowerPoint",
						"a- Le N√©pal\n b- Le Tibet\n c- La Cor√©e du Sud\n d- Le Pakistan",
						"a- Patrice Lefebvre\nb- Claude Zidi\nc- Patrice Leconte\nd-  G√©rard Oury\ne- Quitter",
						"a- Queen\nb- Yes\nc- Led Zeppelin\nd- The Doors\ne- Quitter",
						"a- Aux mammif√®res\nb- Aux reptiles\nc- Aux arachnides\nd- Aux insectes\ne- Quitter",
						"a- La gr√®le\nb- La gr√®ve\nc- La gr√®be\nd- La gr√®ne\ne- Quitter",
						"a- Basset\nb- Beagle\nc- Barbet\nd- Bichon\ne- Quitter",
						"a- Marmotte\nb- Menotte\nc- Quenotte\nd- Bouillotte\ne- Quitter",
						"a- Pablo Picasso\nb- Henri Rousseau\nc- Edgar Degas\nd- Salvador Dali\ne- Quitter",
						"a- Queen\nb- U2\nc- Tears For Fears\nd- Simple Minds\ne- Quitter",
						"a- Adret\nb- Ubac\nc- √âtant\nd- Ressac\ne- Quitter",
						"a- Le z√©ro\nb- Le cinquante\nc- Le quarante\nd- Le treize\ne- Quitter",
						"a- Saint Hilaire de Poitiers\nb- Saint Serge de Radon√®ge\nc- Saint Joseph de Copertino\nd- Saint Isidore de S√©ville\ne- Quitter",
						"a- Novartis\nb- Merck\nc- Pfizer\nd- Sanofi-Aventis\ne- Quitter",
						"a- La edita\nb- La curta\nc- La venta\nd- La lista\ne- Quitter",
						"a- 1918\nb- 1936\nc- 1941\nd- 1957\ne- Quitter",
<<<<<<< HEAD
						"a- Le lac LÈman\nb- Le lac Titicaca\nc- Le lac Victoria\nd- Le loch ness\ne- Quitter"} 
					    },
						{
			            {"c","b","a","d","a","c","c","a","c","b","c","b","a","d","c","b","c","a"}
=======
						"a- Le lac L√©man\nb- Le lac Titicaca\nc- Le lac Victoria\nd- Le loch ness\ne- Quitter"}},{
			{"c","b","a","d","a","c","c","a","c","b","c","b","a","d","c","b","c","a"}
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
				
				}
			}; 
		
					tour(preg2);		 
					break;
					
		case 3: String [][][]  preg3={		// String qui stocke les questoins, reponses et verifications.
				{
<<<<<<< HEAD
					
				{"Quelle est la plus petite unitÈ de mÈmoire utilisable sur un ordinateur ?",
			     "Quel insecte appelle-t-on aussi \" la bÍte ‡ bon dieu \" ?",
			     "Qui fut le premier europÈen ‡ arriver aux Philippines ?",
			     "Qui joua le rÙle de Donna Martin dans la sÈrie tÈlÈvisÈe \"Beverly Hills 90210\"?",
			     "Combien de temps dure le mandat du prÈsident des …tats-Unis ?",
			     "Dans quel pays se trouve le circuit automobile de Zandvoort ?",
			     "Quel roman George Orwell a-t-il Ècrit en 1948 ?",
			     "Dans quelle ville se trouve la fontaine de Trevi ?",
			     "En quoi un nihiliste croit-il ?",
			     "Avec quel autre animal vit gÈnÈralement une oie ?",
			     "Quelle est la plus grande tortue marine connue ‡ ce jour ?",
			     "De quelle comÈdie musicale font partie les Pink Ladies ?",
			     "Dans quoi vit le rat des moissons ?",
				 "Un ouvrage permettant ‡ un vÈhicule de surmonter une Ètendue infranchissable est ?",
				 "Le tournesol \"suit\" le soleil gr‚ce ‡ un phÈnomËne nommÈ ?",
				 "La clÈmentine est un croisement entre quelle variÈtÈs ?",
				 "Une abeille danse en rond pour prÈvenir ses congÈnËres qu'elle a trouvÈ de la nourriture ‡ quelle distance de la ruche ?",
				 "Le didgeridoo est un instrument qui fait partie de quelle famille ?"},
			{	 "a- Le byte\nb- Le mega\nc- Le bit\nd- Le giga",
				 "a- La luciole\nb- La coccinelle\nc- Le scarabÈe\nd- La libellule",
				 "a- Magellan\nb- Christophe Colomb\nc- Vasco de Gama\nd- Mauperthuis",
				 "a- Carol Potter\nb- Jenny Garth\nc- Tiffany Amber Thiessen\nd-  Tori Spelling\ne- Quitter",
				 "a- 4 ans\nb- 7 ans\nc- 5 ans\nd- 6 ans\ne- Quitter",
				 "a- La Belgique\nb- La Suisse\nc- Les Pays-Bas\nd- La France\ne- Quitter",
				 "a- 2001\nb- 2010\nc- 1984\nd- 1948\ne- Quitter",
				 "a- Rome\nb- Venise\nc- Barcelone\nd- Seville\ne- Quitter",
				 "a- En la chance\nb- En tout\nc- En rien\nd- En lui-mÍme\ne- Quitter",
				 "a- Le canard\nb- Le jars\nc- Le cygne\nd- La poule\ne- Quitter",
				 "a- La tortue franche\nb- La tortue ninja\nc- La tortue luth\nd- La tortue argneuse\ne- Quitter",
				 "a- Save the Last Dance\nb- Grease\nc- West Side Story\nd- Moulin Rouge\ne- Quitter",
				 "a- Dans un nid\nb- Dans une tanniËre\nc- Dans un antre\nd- Dans un tronc creux\ne- Quitter",
				 "a- Un aqueduc\nb- Une passerelle\nc- Une buse\nd- Un viaduc\ne- Quitter",
				 "a- Le phototactisme\nb- Le photochromisme\nc- Le photopÈriodisme\nd- Le phototropisme\ne- Quitter",
				 "a- Un citron et une orange\nb-  Une mandarine et un citron\nc- Une mandarine et une orange\nd- Un citron et Une mandarine\ne- Quitter",
				 "a- 15 mËtres\nb- 50 mËtres\nc- 100 mËtres\nd- 250 mËtres\ne- Quitter",
				 "a- des percussions\nb- des vents\nc- des cuivres\nd- des bois\ne- Quitter"}
=======
					{"Quelle est la plus petite unit√© de m√©moire utilisable sur un ordinateur ?",
			"Quel insecte appelle-t-on aussi \" la b√™te √† bon dieu \" ?",
			"Qui fut le premier europ√©en √† arriver aux Philippines ?",
			"Qui joua le r√¥le de Donna Martin dans la s√©rie t√©l√©vis√©e \"Beverly Hills 90210\"?",
			"Combien de temps dure le mandat du pr√©sident des √âtats-Unis ?",
			"Dans quel pays se trouve le circuit automobile de Zandvoort ?",
			"Quel roman George Orwell a-t-il √©crit en 1948 ?",
			"Dans quelle ville se trouve la fontaine de Trevi ?",
			"En quoi un nihiliste croit-il ?",
			"Avec quel autre animal vit g√©n√©ralement une oie ?",
			"Quelle est la plus grande tortue marine connue √† ce jour ?",
			"De quelle com√©die musicale font partie les Pink Ladies ?",
			"Dans quoi vit le rat des moissons ?",
			"Un ouvrage permettant √† un v√©hicule de surmonter une √©tendue infranchissable est ?",
			"Le tournesol \"suit\" le soleil gr√¢ce √† un ph√©nom√®ne nomm√© ?",
			"La cl√©mentine est un croisement entre quelle vari√©t√©s ?",
			"Une abeille danse en rond pour pr√©venir ses cong√©n√®res qu'elle a trouv√© de la nourriture √† quelle distance de la ruche ?",
			"Le didgeridoo est un instrument qui fait partie de quelle famille ?"},
			{"a- Le byte\nb- Le mega\nc- Le bit\nd- Le giga",
			"a- La luciole\nb- La coccinelle\nc- Le scarab√©e\nd- La libellule",
			"a- Magellan\nb- Christophe Colomb\nc- Vasco de Gama\nd- Mauperthuis",
			"a- Carol Potter\nb- Jenny Garth\nc- Tiffany Amber Thiessen\nd-  Tori Spelling\ne- Quitter",
			"a- 4 ans\nb- 7 ans\nc- 5 ans\nd- 6 ans\ne- Quitter",
			"a- La Belgique\nb- La Suisse\nc- Les Pays-Bas\nd- La France\ne- Quitter",
			"a- 2001\nb- 2010\nc- 1984\nd- 1948\ne- Quitter",
			"a- Rome\nb- Venise\nc- Barcelone\nd- Seville\ne- Quitter",
			"a- En la chance\nb- En tout\nc- En rien\nd- En lui-m√™me\ne- Quitter",
			"a- Le canard\nb- Le jars\nc- Le cygne\nd- La poule\ne- Quitter",
			"a- La tortue franche\nb- La tortue ninja\nc- La tortue luth\nd- La tortue argneuse\ne- Quitter",
			"a- Save the Last Dance\nb- Grease\nc- West Side Story\nd- Moulin Rouge\ne- Quitter",
			"a- Dans un nid\nb- Dans une tanni√®re\nc- Dans un antre\nd- Dans un tronc creux\ne- Quitter",
			"a- Un aqueduc\nb- Une passerelle\nc- Une buse\nd- Un viaduc\ne- Quitter",
			"a- Le phototactisme\nb- Le photochromisme\nc- Le photop√©riodisme\nd- Le phototropisme\ne- Quitter",
			"a- Un citron et une orange\nb-  Une mandarine et un citron\nc- Une mandarine et une orange\nd- Un citron et Une mandarine\ne- Quitter",
			"a- 15 m√®tres\nb- 50 m√®tres\nc- 100 m√®tres\nd- 250 m√®tres\ne- Quitter",
			"a- des percussions\nb- des vents\nc- des cuivres\nd- des bois\ne- Quitter"}
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
			
				},			
				
				{
				 {"c","c","a","d","a","c","c","a","c","b","c","b","a","d","d","c","a","c"}
				
				}
				};
		
					tour(preg3);	
				
			
<<<<<<< HEAD
		default:    System.out.println("Erreur on va recommencer");
=======
		default:    System.out.println("erreur on va recommencer");
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
							
						comenzar();								
				}
		
				
	 			
		
 				}
 	/**
 	 * mÈthode qui permettre choisir le mode de jeu
 	 * 
 	 * @throws  si reentre un nombre different de les cas considerÈs, le default reinitialise la methode.
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
	 * mÈthode qui permettre reentrer les valeurs sur un tableau est continuer le jeu avec.
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
				System.out.println("a- Tour b- Bastide c- Ch‚teau fort d- Rempart");
				System.out.println("‡ partir de la troisieme question rajouter e- Quitter");
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
	 *  mÈthode qui commence le jeu en appelant la mÈthode preguntas
	 *	et le envoi un entier qui gÈnËre alÈatoirement. 
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
<<<<<<< HEAD
=======
		/*  m√©thode qui commence le jeu en appelant la m√©thode preguntas
		 *  et le envoi un entier qui g√©n√®re al√©atoirement, 
		 *  il assigne aussi  le nom de l'utilisateur*/
		
		int blokant=block;
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
		
		
		int blokant=block;/*pour garder la valeur si l'utilisateur il veu recomencer,
		ne repeter pas le block de questions*/ 
		
	
		
		do {
			block=(int)(Math.random()*3 + 1);//genere le nombre aleatoire pour choisir le block de questions
				
		} while (blokant==block);
			
		preguntas(block);//comence a faires les questions
		
		
	}
	
	/**
	 *  mÈthode qui retourne le caractËre de la rÈponse et qui reÁoit comme
     *  paramËtre deux chaines de caractËres avec la question et la rÈponse choisi
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
<<<<<<< HEAD
    	
    	 char opcion; //stocke l'option choisi
    	 
=======
    	 /* m√©thode qui retourne le caract√®re de la r√©ponse et qui re√ßoit comme
    	  *  param√®tre deux chaines de caract√®res avec la question et la r√©ponse choisi*/
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
		
		System.out.printf("On va avec la question numero %d\n\n",nquestion);
		
		
		System.out.println(pregunta);
		System.out.println(respuesta);
		Scanner sca = new Scanner(System.in);
		
		opcion=sca.next().charAt(0);
		
		
		return opcion;
		
		
     	}
     
     /**
      * 
      *   mÈthode qui retourne un boolÈen vrai si la rÈponse est correcte ou faux au contraire,
      *	 	Il reÁoit deux caractËre, un la rÈponse choisi autre la rÈponse correcte
      *
      * @throws c'est un methode automatique, il ne doit pas posser des problemes
      * @author ANGEL
      * @version 2.3v
      * @param respuesta
      * @param verificacion
      * @return void
      */
     
     static boolean verificar(char respuesta,char verificacion){
<<<<<<< HEAD
    	
=======
    	 /* m√©thode qui retourne un bool√©en vrai si la r√©ponse est correcte ou faux au contraire,
    	 *	Il re√ßoit deux caract√®re, un la r√©ponse choisi autre la r√©ponse correcte*/

    	 
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
    	 
    	 return (respuesta==verificacion);
     	}
    
     /**
      *  mÈthode qu'on appelle si on rÈussit la rÈponse
      *  
      * @throws c'est un methode automatique, il ne doit pas posser des problemes 
      * @author ANGEL 
      * @version 2.3v
      * @param respuesta
      * @return void
      */
     static void bravo(){
<<<<<<< HEAD
    	
=======
    	 /*m√©thode qu'on appelle si on r√©ussit la r√©ponse*/ 
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
    	 
    	 System.out.printf("BRAVO!! %s vous avez acert√©, vous avez gagn√© %d euros por l'instance.\n\n",nom,cantidad[montant]);
    	 montant=montant+1;
    	
     	}

     /**
      *  mÈthode qu'on appelle si on gagne le jeu, et permettre recommencer si on veux
      * @throws si le utilisateur rentre une option differente a les exposes,
      * on recomence la methode.
      * @author ANGEL 
      * @version 2.3v
      * @param void
      * @return void
      */
     static void ganador(){
<<<<<<< HEAD
    	
=======
    	 /*m√©thode qu'on appelle si on gagne le jeu, et permettre recommencer si on veux*/
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
    	 
    	 System.out.printf("Felicitations %s!, vous avez gagn√© le concour et avec lui %d euros  \n",nom,cantidad[17]);
    	 System.out.print("vous voulez recomencer?\no-Pour oui\nn-Pour non\n");
    	 Scanner scc = new Scanner(System.in);
    	 char eleccion =scc.next().charAt(0);//stocke l'election de l'utilisateur pur continuer ou pas
    	 
    	while((eleccion!='o')|(eleccion!='n')){//on recomence si la reponse n'est pas correcte
    			if (eleccion=='o'){
    		
    				menu();
    				}
    	 else if (eleccion=='n') {
    		 
    		 System.out.println("√† bient√¥t!");
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
      * mÈthode qui permettre dire au revoir
      *   et savoir la quantitÈ gagnÈe avant quitter volontairement le jeu.
      *   
      * @throws c'est un methode automatique, il ne doit pas posser des problemes
      * @author ANGEL 
      * @version 2.3v
      * @param void
      * @return void 
      */
     static void abandonar() {
<<<<<<< HEAD
    	 
=======
    	 /*m√©thode qui permettre dire au revoir
    	  *  et savoir la quantit√© gagn√©e avant quitter volontairement le jeu */
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
    	 
    	 System.out.printf("Merci d'avoir jou√©, vous avez gagn√© %d euros",cantidad[montant-1]);
    	 System.exit(1);
    	 
     }
     /**
      *  mÈthode qui permettre dire au revoir et savoir la quantitÈ gagnÈe
      *    avant quitter, par rapport au palier si on a ÈchouÈ le jeu 
      *
      * @throws c'est un methode automatique, il ne doit pas posser des problemes. 
      * @author ANGEL 
      * @version 2.3v
      * @param void
      * @return void 
      */
     static void eliminado(){
<<<<<<< HEAD
    	
=======
    	 /*m√©thode qui permettre dire au revoir et savoir la quantit√© gagn√©e
    	  *  avant quitter, par rapport au palier si on a √©chou√© le jeu */
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
    	 
    	 if (nquestion<6){
    		 System.out.println("Desol√©, reponse incorrecte,\nvous avez perdu tout, √† la prochaine. ");
        	
    		 try {

    			 Thread.sleep ( 5000);

    			 }

    			 catch ( InterruptedException e) {

    			 System.out.println ( " Pausa " );

    			 } 	
    		 
    		 System.exit(1);
    	 }
    	 else if (nquestion<=12) {
    		 System.out.printf("Desol√©, reponse incorrecte,\nvous avez gagn√© %d, √† la prochaine. ",cantidad[5]);
    		 
    		 try {

    			 Thread.sleep ( 5000);

    			 }

    			 catch ( InterruptedException e) {

    			 System.out.println ( " Pausa " );

    			 } 	
    		 
    		 System.exit(1);
		}
    	 else if (nquestion<=18) {
    		 System.out.printf("Desol√©, reponse incorrecte,\nvous avez gagn√© %d, √† la prochaine. ",cantidad[11]);
        	
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
    *   mÈthode qui reÁoit le tableau des questions et rÈponses et appelle 
    *	  le mÈthode preguntar pour faire des questions, 
    *	  et avec la rÈponse appelle le mÈthode verificar pour vÈrifier la rÈponse
    *	  Il fait la gestion des mÈthodes abandonar, pour quitter et eliminado si on a Èchoue,
    *	  ou bravo ou ganador si on rÈussit la question
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
<<<<<<< HEAD
    	
=======
    	 /* m√©thode qui re√ßoit le tableau des questions et r√©ponses et appelle 
    	  * le m√©thode preguntar pour faire des questions, 
    	  * et avec la r√©ponse appelle le m√©thode verificar pour v√©rifier la r√©ponse
    	  * Il fait la gestion des m√©thodes abandonar, pour quitter et eliminado si on a √©choue,
    	  *  ou bravo ou ganador si on r√©ussit la question*/
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
    	 
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
      * on utilise la mÈthode principal pour commencer le jeu
      * 
      * @param args
      */
     
	public static void main(String[] args) {
<<<<<<< HEAD
=======
		/* on utilise la m√©thode principal pour commencer le jeu*/
>>>>>>> bba4315d527ba3e85f61d5d57277ccad91dee26a
		
		
		menu();
	
	}
}
		
		
	
	
	
	


