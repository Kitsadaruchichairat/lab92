package shop;

public class Customer {
 
	private String name;
	private double discount;
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	public String getName() {
		return name;
	}
	public void setDiscount(double  discount){//ส่วนลด
		this.discount = discount;
		return ;
	}
	public double getDiscount() {
		return discount;
	}
}
