package application;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.Event;

public class MostrarBd {
	
	
	
	 static Connection conn=null;
	 static Statement stat=null;
	 static Principal princi=new Principal();
	 private static String apellidoBuscado;
	 static PreparedStatement prep=null;
	 static ResultSet rs = null;
	
	 static ArrayList<Persona> listapersona=new ArrayList<Persona>();


	public void setApellidoBuscado(String apellidoBuscado) {
		this.apellidoBuscado = apellidoBuscado;
	}
	 public static String getApellidoBuscado() {
		return apellidoBuscado;
	}

	public static void main(String[] args) throws Exception {
		
		
		
		try {
			Class.forName("org.sqlite.JDBC");
		       conn = DriverManager.getConnection("jdbc:sqlite:Agenda.db");
		   stat = conn.createStatement();
		   
		  prep = conn.prepareStatement("select * from people where apellido like ? ;");
		  prep.setString(1, apellidoBuscado + "%");
		        
		     rs = prep.executeQuery();
		    
		 
		  
		
		     listapersona.clear();
		     
		   while  (rs.next()) {
			   
			   Persona person=new Persona();
			  
			
			   
			   person.resultadoApellido=rs.getString(1);
			   person.resultadoNombre=rs.getString(2);
			   person.resultadoTelefono=rs.getString(3);
			   person.resultadoEmail=rs.getString(4);
			   person.resultadoDireccion=rs.getString(5);
			  
			   listapersona.add(person);
		  
			
		   }
		   
		   if (listapersona.isEmpty()) {
			   princi.controller.setTextArea("Aucun résultat\n"+princi.controller.getAreaTexto());
			  
		}
		  
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			rs.close();
			prep.close();
			stat.close();
			conn.close();
			
			
		}


	}

}
