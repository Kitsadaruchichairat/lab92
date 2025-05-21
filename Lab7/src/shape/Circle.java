package shape;

public class Circle extends Shape {
	  public Circle(double x) {
	        super(x);
	    }

	    @Override
	    public double area() {
	        return (Math.PI / 4) * x * x; // ใช้สูตร: (π/4) * x^2
	    }

	    @Override
	    public double perimeter() {
	        return Math.PI * x; // ใช้สูตร: π * x
	    }
}
