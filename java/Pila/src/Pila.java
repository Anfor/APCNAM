





public class Pila {
/**
 * @author ANGEL
 * 
 * creamos una clase nodo que sirve para construir cada elemento de lq lista.
 * 
 * 	
 * @Param args 
 * 
 *  se le pasa un entreo, o una cadena de caracteres.
 * 
 * enviando variable.sig se crea el punto siguiente de la lista.
 *
 */
	
class  Nodo{
	
	int valor;
	String elemento;
	Nodo sig;
	
}



private Nodo primero;

/**
 * 
 * 
 * para crear cada elemento y colocarlo el primero.
 * 
 * @param args le pasamos un valor entero o un String.
 *  
 */

 public Pila() {
	

	
	primero=null;
	
	
}

/**
 * 
 * metodo para insertar elementos a la lista;
 * 
 * 
 * @param args argumento entero
 */

public void  insertarint (int x) {
	
	Nodo nuevo = new Nodo();//creamos el nuevo nodo de la lista.
	
	nuevo.valor=x;// asignamos el parametro que entra como el campo valor de la clase nodo.
	
	if (primero==null){
		
		nuevo.sig=null;//hacemos que el siguiente sea un elemento nulo asi es el nuevo elemento no es el ultimo.
		primero=nuevo;//asignamos el nuevo nodo como primero
		
	}
	else {
		nuevo.sig=primero; //pasamos el valor del primero al siguiente.
		primero=nuevo;//asignamos el nuevo nodo como primero
		
	}
	
}

/**
 * 
 * metodo para insertar elementos a la lista;
 * 
 * 
 * @param s pasamos cadena de caracteres
 */


public void  insertarstr  (String s) {
	
	Nodo nuevo = new Nodo();//creamos el nuevo nodo de la lista.
	
	nuevo.elemento=s;// asignamos el parametro que entra como el campo valor de la clase nodo.
	
	if (primero==null){
		
		nuevo.sig=null;//hacemos que el siguiente sea un elemento nulo asi es el nuevo elemento no es el ultimo.
		primero=nuevo;//asignamos el nuevo nodo como primero
		
	}
	else {
		nuevo.sig=primero; //pasamos el valor del primero al siguiente.
		primero=nuevo;//asignamos el nuevo nodo como primero
		
	}
	
}

/**
 * Para eliminar el primer elemento
 * 
 * 
 * @param args no necesita argumetos, se le llama nombrelista.eliminar()
 */

public void eliminar() {
	
	if(primero!=null)//gestionamos si ya es el ultimo
	{
		primero=primero.sig;
		
		
	}
	
	
}

/**
 * 
 * comprobamos que la lista esta vacia
 * 
 * 
 */
public boolean vacia() {
	
	if (primero == null) {
		
		return true;
		
	}
	return false;
	
}


/**
 * metodo para vaciar la lista
 * al completo
 * 
 * 
 */


public void eliminartodo() {
	
	while(primero!=null)//gestionamos si ya es el ultimo
	{
		primero=primero.sig;
		
		
		
	}
	
	
}


/**
 * metodo para visualizar la lista.
 * 
 * 
 * @param args se le llama nombrelista.visualizar.
 */

public void visualizar() {
Nodo aux=primero;//guardamos en un auxiliar el primero para ir mostrando.
while (aux!=null) {
	if(aux.valor==0){
	
	System.out.println("elemento "+aux.elemento);
	
	aux=aux.sig;}
	if(aux.elemento==null){
		
		System.out.println("valor "+aux.valor);
		
		aux=aux.sig;
	}

}
System.out.println();
	
	
	
}

/**
 * mostrar indice 
 * 
 * 
 * 
 * @param args un entero.
 */

public void indice (){
	
	
}
	public static void main(String[] args) {
		Pila test = new Pila();
		
		test.insertarint(200);
		
		test.insertarstr("mama");
		
		test.insertarint(150);
		
		test.insertarstr("papa");
		System.out.println(test.vacia());
		test.visualizar();
		
		
		test.eliminartodo();
		
		test.visualizar();
		System.out.println(test.vacia());
		

	}

}
