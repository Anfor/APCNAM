import java.util.Scanner;


public class Tableu {

	public static void main(String[] args) {
	int tab[]={2,55,98,1,56,355,3,5,567,83,38,0,54,1,226};
	int m=0;
	System.out.print("Entre un numero: ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i=0;i<tab.length;i++)
	{
		
		if (n==tab[i]){
			
			m=m+1;
			
		}
			
	}
	
	if (m>0){
	System.out.println("si");
	}
	
	else {
		System.out.println("no");
	}
	}

	}


