import java.awt.geom.AffineTransform;
import java.util.Scanner;

/**
 * @author elhadi
 *
 */
public class Main {

	public static void main(String[] args) {

		// Cette boucle permet de proposer à l'utilisateur de saisir une expression
		System.out.println("saisir une expression :");
		while (true) {
			String saisie;
			Scanner sc = new Scanner(System.in);
			 saisie = sc.nextLine();
			
			
			if(estBienParenthesee(saisie)){
				
				System.out.println("Bon parenthèsage");
			}else{
				System.out.println("Mauvais parenthèsage");	
			}

		}
		}

	/**
	 * Dans cette question vous aurez besoin de parcourir la chaine appelée
	 * expression pour y trouver les accolades ouvrantes et fermantes Pour
	 * parcourir une chaine de caractère il existe une primitive/méthode java
	 * fournie dans la classe String : charAt(int index) : renvoie le caractère
	 * à l'indice index e.g : String st = "abcd"; st.charAt(3) => d;
	 * 
	 * @param expression
	 * @return
	 */
	public static boolean estBienParenthesee(String expression) {
		// à compléter
		
		
		Pile pila=new Pile();
		
	for(int i=0;i<expression.length();i++)
	{
		if (expression.charAt(i)==')'&& (pila.estVide())) {
			return false;
			
		}
		
		else if (expression.charAt(i)=='(') {
			pila.empiler(expression.charAt(i));
		}
		
		else if (expression.charAt(i)==')'){
			pila.depiler();
			
		}
		
		
		

	}
	
		
		if (pila.estVide()) {
			return true;
			
		}
	
		
	
			
		return false;
	}

	}
