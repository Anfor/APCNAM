import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class Tp5Fichier2 {

	public static void main(String[] args) {
		
		FileInputStream entrada =null;
		DataInputStream entrada2=null;
		 FileWriter salida =null;
		try {
			 entrada = new FileInputStream("F:\\windows\\usuario\\ANGEL\\workspace\\TP5Fichiers\\src\\stats.dat");
			 entrada2= new DataInputStream(entrada);
			 salida = new FileWriter("F:\\windows\\usuario\\ANGEL\\workspace\\TP5Fichiers\\src\\stats.csv");
			 
			 int vide;
			 
			 while ( (vide=entrada2.read()) !=-1) {
			
			salida.write(""+vide+" ;");
			
		}
			 
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			
			try {
				entrada.close();
				
				entrada2.close();
				salida.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
