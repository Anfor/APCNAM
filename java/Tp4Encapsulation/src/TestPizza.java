import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import sun.misc.BASE64Encoder;


public class TestPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*PizzaBean pizza=new PizzaBean();
		
		pizza.setFromage(true);
		pizza.setOlives(true);
		pizza.setPeperoni(true);
		pizza.setSaucisse(true);
		pizza.setTaille(35);
		
		System.out.println(pizza.toString());
		
		pizza.setSansGluten(false);
		
		//System.out.println(pizza.toString());*/
		
		
		
	/*	GarnitureTO g=new GarnitureTO();
		g.fromage=true;
		g.peperoni=true;
		g.saucisse=true;
		
		PizzaDS pizza2= new PizzaDS(35, g);
		
		System.out.println(pizza2);
		
		System.out.println(serialize(g));
		
		PizzaBeanEVO pizza3=new PizzaBeanEVO();
		
		pizza3.setFromage(true);
		pizza3.setPeperoni(true);
		
		System.out.println(pizza3);*/
		
		GarnitureBitset   pizzav2 = new GarnitureBitset();
		
		pizzav2.setFromage(true);
		pizzav2.setTaille(45);
		pizzav2.set(4, true);
		
		System.out.println(pizzav2);
		
	}
	
	
	static String serialize(Serializable o){
		try (ByteArrayOutputStream baos= new ByteArrayOutputStream();
				ObjectOutputStream oos= new ObjectOutputStream(baos);
				) {
			oos.writeObject(o);
			return new String(new BASE64Encoder().encode(baos.toByteArray()));
		}
		catch (Exception e) {
			return "";
		}
		
	}
}
