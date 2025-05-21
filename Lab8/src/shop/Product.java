package shop;

public class Product {

	private String name;
	private double price;
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double  price){//ส่วนลด
		this.price = price;
		return ;
	}
	public double getPrice() {
		return price;
	}
}
