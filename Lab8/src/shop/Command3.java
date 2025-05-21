package shop;
import java.util.Scanner;

public class Command3 {
	public static void main(String[] args) {

		 Scanner input = new Scanner(System.in);
		 String name="",product="";
		 double Price = 0,discount=0,pricesum=0,Percentage =0;
		 System.out.print("Enter your customer name: ");
		 name = input.nextLine();

		 System.out.print("Enter your discount percentage:  ");
		 discount = input.nextDouble();

		 System.out.print("Enter an ordered product: ");
		 product = input.next();
		 
		 System.out.print("Enter the product price: ");
		 Price = input.nextDouble();

		 Percentage = (Price * discount ) /100;
		 
		 pricesum =  Price - Percentage ;


		 Order  order = new Order ();
		
		 Customer cus = new Customer();
		 order.setCustomer(cus);
		 
		 cus.setName(name);
		 cus.setDiscount(discount);
		 
		 
		 Product pro = new Product();
		 order.setProduct(pro);
		 
		 pro.setName(product);
		 pro.setPrice(Price);
		 
		
		

		 System.out.printf("%s order %s with price %.2f Bath. \n",order.getCustomer().getName(),order.getProduct().getName(),pricesum);
		

		 }
}
