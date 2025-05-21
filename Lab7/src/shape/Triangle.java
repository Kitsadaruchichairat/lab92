package shape;

public class Triangle extends Shape {
	  public Triangle(double x) {
	        super(x);
	    }

	    @Override
	    public double area() {
	    	   double constant = 0.433 * 1.155; // คำนวณค่าคงที่ใหม่เมื่อคูณ 0.433 กับ 1.155 จะได้ค่าคงที่ใหม่ที่สามารถใช้แทน 
	    
	    	    return constant * x * x; // คำนวณพื้นที่
	    }

	    @Override
	    public double perimeter() {
	     
	    	return 3 * x * 1.079; // คำนวณเส้นรอบรูป
	    }
	}