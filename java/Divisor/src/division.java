
import java.util.Scanner;


public class division {

	public static void main(String[] args) {
		int did,div;
		
System.out.print("entre dividendo: ");
Scanner sc = new Scanner(System.in);
did=sc.nextInt();

System.out.println();
System.out.print("entre divisor: ");
Scanner sca = new Scanner(System.in);
div= sca.nextInt();



System.out.println("");
System.out.println("resultado es: "+dividir(did,div));

		
sc.close();	
		
sca.close();
try {

Thread.sleep ( 5000);

}

catch ( InterruptedException e) {

System.out.println ( " Pausa " );

} 	
}
	
	
static int dividir (int did,int div)
{		
		boolean signodid=true;
		boolean signodiv=true;
		int res=0;
	
	
	if (did==0||div==0) {
		
		System.out.println("error.");
	
		
	}


	if(did<0){
		signodid=false;
		did=-did;
		
		
	}

	if (div<0) {
		signodiv=false;
		div=-div;
		
	}
	
	while (did>=div){
		did = did - div;
		res = res+1;
		}

	if (signodid!=signodiv) {
		
		res=-res;
		
	
	}
	
return res;	
}

}