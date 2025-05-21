package employee;

public class Employee {
	
	protected double income;
	protected int id;
		
	public void setID( int id) {
		this.id = id;
		
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getID() {
		return id;
	}
	public double getIncome() {
		return income;
	}
}
