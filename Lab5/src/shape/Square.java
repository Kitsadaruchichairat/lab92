package shape;

public class Square extends Shape {
	
	private float side,area,perimeter;
	
	 public void setSide(float side) {
	        this.side = side;
	    }

	    public float area() {
	        area = side * side;
	        return area;
	    }

	    public float perimeter() {
	        perimeter = 4 * side;
	        return perimeter;
	    }
	}