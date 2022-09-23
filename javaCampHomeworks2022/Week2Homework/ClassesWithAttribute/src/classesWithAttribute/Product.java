package classesWithAttribute;

public class Product {
	// If you give the values inside the Product method, you can use this method.
	public Product(int id, String name, String description, int stockAmount, double price, String colour) {
		System.out.println("The Constructor run.");
		this.id = id;
		this.colour = colour;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.name = name;
	}

	// Overloading
	public Product() {

	}

	// attribute | field
	// Private means that it is only valid in the block where it is defined.
	int id;
	String name;
	String description;
	double price;
	int stockAmount;
	String colour;
	String productCode;

	// getter
	// This means read-only that the id.
	public int getId() {
		return id;
	}

	// setter
	// This means the class that I am in. Best practice _
	// _ those are the field.
	public void setId(int id) {
		// this.id = id;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getProductCode() {
		return this.name.substring(0, 1) + id;
	}

}