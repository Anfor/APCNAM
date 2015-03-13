package miagenda;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) 
	{	
		String evento;
		String nombre;
		String apellido;
		String fechainicio;
		String fechafin;
		int identificacion=00001;
		
		Persona p1= new Persona();
	
		
		System.out.print("Introduzca nombre persona: ");
		Scanner sc = new Scanner(System.in);
		nombre = sc.nextLine();
		
		System.out.println("");
		System.out.print("Introduzca apellido: ");
		Scanner sca = new Scanner(System.in);
		apellido=sca.nextLine();
	
		System.out.println("");
		
		p1.ajouterpersonne(identificacion, apellido, nombre);
		
		System.out.print("introducir evento: ");
		Scanner scb = new Scanner(System.in);
		evento=scb.nextLine();
		System.out.println("");
		System.out.print("introducir fecha inicio: ");
		Scanner scc = new Scanner(System.in);
		fechainicio=scc.nextLine();
		System.out.println("");
		System.out.print("introducir fecha fin: ");
		Scanner scd = new Scanner(System.in);
		fechafin=scd.nextLine();
		Agenda a1 = new Agenda(evento, fechainicio, fechafin);
		
		System.out.println("");
		System.out.println("la persona "+p1.prenom+p1.nom+" va a "+a1.evento+" desde "+a1.fechainicio+" hasta "+a1.fechafin);
		
		
		
		
		
		
		
		
		

	}

}
