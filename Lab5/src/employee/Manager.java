package employee;

public class Manager extends Employee {

	public double tax;

		public void caltax(double calTax) {
			this.tax = calTax;
			if(income > 50000) tax = (4* income)/100;
			else  tax = (3 * income)/100;
			
		}
		public double getTax() {
			return tax;
		}
		
		
}
