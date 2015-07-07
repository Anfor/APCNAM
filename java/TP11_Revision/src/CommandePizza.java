
public class CommandePizza {
	public static void main(String[] args) {
		Pizza maPizza = new Pizza.Builder(40).fromage(false).olive(true).pepperoni(false).build();
	}
}
