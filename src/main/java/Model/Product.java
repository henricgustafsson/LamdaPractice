package Model;

public class Product {

	private String productName;
	private double price;
	private int stock;
	
	public Product(String name, double price, int stock) {
		setProductName(name);
		setPrice(price);
		setStock(stock);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}


