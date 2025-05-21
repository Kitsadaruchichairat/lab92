package shape;
import java.util.Scanner;
public class Command2 {
		 public static void main(String[] args) {
			 float side=0;
			 String color;
			 Scanner cr = new Scanner(System.in);
			 System.out.println("Enter the  shape color: ");
			 color = cr.next();
			 System.out.println("Enter the square’s side: ");
			 side = cr.nextFloat();

			 Square go = new Square();

			 go.setColor(color); // กำหนดสี
		        go.setSide(side);       // กำหนดความยาวด้าน

		        System.out.println("Square: Color = " + go.getColor());
		        System.out.println("Square: Area = " + go.area());
		        System.out.println("Square: Perimeter = " + go.perimeter());
		 }
		 
	
}
