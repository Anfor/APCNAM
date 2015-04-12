package myFirstServlet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class TestHttp {
	
	public TestHttp(){
		
	}

	public static void main(String[] args)throws Exception {
		
		URL pcProf = new URL("http://192.168.78.85:8080/myFirstServlet");
		URLConnection connexion=pcProf.openConnection();
		BufferedReader in= new BufferedReader(new InputStreamReader(connexion.getInputStream()));
		String inputLine;
		while ((inputLine=in.readLine())!=null)
			System.out.println(inputLine);
		in.close();

	}

}
