import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;


public class division {

	public static void main(String[] args) {
		int did,div,res;
		boolean signodid=true;
		boolean signodiv=true;
System.out.print("entre dividendo: ");
Scanner sc = new Scanner(System.in);
did=sc.nextInt();
System.out.println();
System.out.print("entre divisor: ");
Scanner sca = new Scanner(System.in);
div= sca.nextInt();

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

res=did/div;

if (signodid!=signodiv) {
	
	res=-res;
}

System.out.println("");
System.out.println("resultado es: "+res);

		
		
		

	}

}
