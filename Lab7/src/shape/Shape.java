package shape;
import java.util.Scanner;
abstract public class Shape {
	  protected double x; // ความยาวด้านหรือรัศมี

	    public Shape(double x) {
	        this.x = x;
	    }

	    // เมธอด abstract สำหรับพื้นที่
	    public abstract double area();

	    // เมธอด abstract สำหรับเส้นรอบรูป
	    public abstract double perimeter();

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter the x value: ");
	        double x = input.nextDouble();

	        // สร้างออบเจ็กต์ของแต่ละรูปทรง
	        Shape square = new Square(x);
	        Shape circle = new Circle(x);
	        Shape triangle = new Triangle(x);

	        // แสดงผลลัพธ์
	        System.out.printf("Square: area = %.2f, perimeter = %.2f\n", square.area(), square.perimeter());
	        System.out.printf("Circle: area = %.2f, perimeter = %.2f\n", circle.area(), circle.perimeter());
	        System.out.printf("Triangle: area = %.2f, perimeter = %.2f\n", triangle.area(), triangle.perimeter());

	        input.close();
	    }
}
