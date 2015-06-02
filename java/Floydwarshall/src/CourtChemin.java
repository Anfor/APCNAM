import java.util.Scanner;

public class CourtChemin {
 
 
    private static final int x = Integer.MAX_VALUE;//valeur maximum pour l'infini
 /**
  * 
  * 
  * methode pour calculer la matrice d'adjacence à partir de la matrice originale
  * 
  * @param d
  */
    private static void algorithmeFloydWarshall(int[][] d) {
    	
        for (int i = 0; i < d.length; ++i) {				// On multiplie la matrice pour soit même n fois
            for (int j = 0; j < d.length; ++j) {
                for (int k = 0; k < d.length; ++k) {
                    if (d[j][i] == x || d[i][k] == x) continue;
                    if (d[j][k] > d[j][i] + d[i][k]) {
                        d[j][k] = d[j][i] + d[i][k];
                        
                        
                    }
                }
            }
        }
        
    }
 /**
  * 
  * Methode pour dessiner les matrices
  * 
  * 
  * @param am
  */
    private static void dessinerMatrice(int[][] am) {
        for (int[] a : am) {
            for (int v : a) {
                if (v==Integer.MAX_VALUE) System.out.print(" X ");
                else System.out.format("%2d ", v);
            }
            System.out.println();
        }
    }
    
    /**
     * 
     * 
     * methode pour rentrer la matrice originale
     * 
     */
    private static void  grapho (){
    	
    	String valeur;
    	Scanner sc = new Scanner(System.in);
    	
    do {
		  System.out.println("Entrer Le Nombre de Sommets\n");

        valeur  = sc.nextLine();
        
        if (!valeur.matches("[0-9]+")) {  // pour eviter non chifres pour le sommets
        	System.out.println("Reponse mal saisi, repetez s'il vous plait.");
        	
		}
	} while (!valeur.matches("[0-9]+"));// on répéte tant que valeur n'est pas un nombre
       
           int V = Integer.parseInt(valeur);    
           
        System.out.println("\nEntrer Matrice\n");

         int[][] m = new int[V][V];

         for (int i = 0; i < V; i++)

             for (int j = 0; j < V; j++){
            	 
            	 
            	
            	 if(i==j){		//la diagonal est toujours 0
            		 System.out.println("C'est neccesaire d'ecrire 0 en cette case, pour eviter de soucis \n "
            		 		+ "on fera automatiquement ["+i+"] ["+j+"]"+" ");
            		
            		 m[i][j]=0;
            		 System.out.println("");
            	 }
            	 else 	{  
            		 
            		 String valor;
            		 
            		 
            		 do {
						
            		 System.out.println("On introduit  ["+i+"] ["+j+"]"+" si on veux ecrire de l'infini, "
            		  		+ "il faut ecrire une lettre:");
            		 
            			    System.out.println("");
            			    Scanner sca = new Scanner(System.in);
            			    	valor = sca.nextLine();
            			   
					} while (!valor.matches("[a-zA-Z]+") & !valor.matches("[0-9]+"));//pour eviter characteres speciaux
            		 			
            			  if(valor.matches("[0-9]+")){
                			  
                			  m[i][j] = Integer.parseInt(valor);
                		  }
                		  
                		  else{
                			  // si on introduit une lettre on reentre de l'infini
                			  m[i][j]=x;
                		  } 
            			  } 
            	 }
    
        System.out.println("Matrice original");
     
        dessinerMatrice(m);
 
        algorithmeFloydWarshall(m);
 
        System.out.println("\nMatrice d'adjacence");
    
        dessinerMatrice(m);
       // camino(m);
    	
    	menu();
    }
    
 
    /**
     * 
     * 
     * methode pour le menu 
     * 
     */
    private static void menu(){
    	
    	
    		System.out.println("1- Pour donner la matrice du graph ");
    		
    		System.out.println("2- pour sortir");
    	Scanner scc = new Scanner(System.in);
       
    String ch = scc.nextLine();
    
    if (ch.matches("[0-9]+")){//si on reentre pas une nombre on répéte
    	
     int choix= Integer.parseInt(ch);	
    	
    	switch (choix) {
		case 1:
			
    		grapho();
			
			break;
			
		
			
		case 2:			
    		 		System.out.println("à bientôt!");
    		 			try {

    		 				Thread.sleep ( 5000);

    		 			}

    			 catch ( InterruptedException e) {

    			 System.out.println ( " Pausa " );

    			 	} 	
    		 			System.exit(1);
						break;

		default:
			
			System.out.println("Reponse mal saisi, repetez s'il vous plait.");
			menu();
			
			break;
		
    }
   
    }
    
   else {		//si le nombre n'est pas corrécte on répéte
			System.out.println("Reponse mal saisi, repetez s'il vous plait.");
			menu();
		}
    
    }
   /**
    * 
    * 
    * 
    * @param args
    */
    public static void main(String[] args) {
    	
    	menu();
    	 
		}
		
     }
    
