import java.util.Random;
import java.util.Scanner;



public class Tableu {

	public static void main(String[] args) {
		int [] tab = {8,96,6,25,5,2,45,23,325,53,588,2,10,225,5,845,52,32,2,123};
		Random generator = new Random();
		int n;
		System.out.print("Entre tamano vector: ");
		Scanner sca = new Scanner(System.in);
		int l=sca.nextInt();
		System.out.println("");
		System.out.print("Entre numero a buscar: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int []tab2=new int[l];
		for(int i =0;i<n;i++)
		{           
			tab2[i]=generator.nextInt(l);
		}
		int index = vector(n,tab);
		
		if(index<0){
			System.out.println("el numero no existe");
		}
		else {
			
		System.out.println("El indice es "+index);	
		}
		
		

	}
	
	public static int vector(int n, int [] tab) {
		int i;
		int index=-1;
		for(i=0;i<tab.length;i++)
		  if (n==tab[i]){
			
		index=i;
		  }
		return index;
		
	
		
	}

}
