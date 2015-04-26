import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class Tp5Fichier {
	
	
	
	public static void main(String args[]) {
	
	
	int []tab={10,88,35,4896,3456,17,985,1588,5736,995};
	OutputStream sortie=null;// ici c'est avec java 6 sans try catch sans resources
	DataOutputStream deco=null;
	
	try //(OutputStream sortie=new FileOutputStream("F:\\windows\\usuario\\ANGEL\\workspace\\TP5Fichiers\\src\\stats.dat");)
	{
		sortie=new FileOutputStream("F:\\windows\\usuario\\ANGEL\\workspace\\TP5Fichiers\\src\\stats.dat");	
		deco= new DataOutputStream(sortie);
		for(int i =0;i<tab.length;i++){
		//sortie.write(tab[i]);	
			deco.writeInt(tab[i]);
		}
		

		
	} catch (IOException e) {
		
		System.out.println("Fichier non trouvé");
	}
	finally{
		try {
			sortie.close();
			deco.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	
}
	
	
	

}
