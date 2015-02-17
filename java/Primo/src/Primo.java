import java.util.Scanner;


public class Primo {

	public static void main(String[] args) {
		
		int c=0;
		System.out.print("Introduzca numero: ");
		
		Scanner sc = new Scanner(System.in);
	int	n= sc.nextInt();
		
		if (n<2)
		{ 

			System.out.println("No es primo");
		}

	
		else {
		for (int i =2;i<=n/2;i++)	{
			if (n%i==0){ c=c+1;}
				
			}
		}
		if (c>0){ System.out.println(n+" no es primo");}
		else {System.out.println(n+" es primo");}

} }
