package classesWithAttribute;

public class ProductManager {
	public void Add(Product product) {
		// JDBC
		System.out.println("The product added " + product.name);
	}

	public void Add2(int id, String name, String description, int stockAmount, double price, String colour) {

	}

}
