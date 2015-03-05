import java.util.Scanner;



public class Triangulo {
	
	public static void main (String[] args) {
		 Scanner s=new Scanner(System.in);
	
		 int n;
		 String triangulo = "*";

		 Scanner lector = new Scanner(System.in);

		 System.out.print("Ingrese un número de lineas: ");
		 n = lector.nextInt();
		int m=n;
		 for (int i = 0; i <= n; i++){
			 for (int j=m;j>0;j--)
			 { System.out.print(" ");
			 }
			 
		 System.out.println(triangulo);
		  triangulo = triangulo + "**";
		  m--;
		 }
		 } 
	}


