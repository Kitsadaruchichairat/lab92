package shop;

public class Order {

	private Customer customer;
	private Product product;
	
	public void setCustomer(Customer Customer) {
		this.customer = Customer;
		return;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setProduct(Product Product) {
		this.product = Product;
		return ;
	}
	public Product getProduct () {
		return product;
	}
	
	
}
