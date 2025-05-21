package shape;

public class Square extends Shape {
	 public Square(double x) {
	        super(x); //ส่งค่าความยาวด้าน x ไปยังคลาสแม่ Shape
	    }

	   
	    public double area() {
	        return x * x; // พื้นที่ = ด้าน^2
	    }

	  
	    public double perimeter() {
	        return 4 * x; // เส้นรอบรูป = 4 * ด้าน
	    }
}
