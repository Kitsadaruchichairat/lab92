package calculator;

public class Calculator {

	public double diff (double a, double b) {
		if (a>b )return a-b;
		else return b-a;
	}
	public double times(double a, double b ) {
		if(a>b) return a/b;
		else return b/a;
	}
}
