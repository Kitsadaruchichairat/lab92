package employee;
import java.util.*;
public class Command3 {
	public static void main(String [] args) {
		 int id;
		 double income,bonus;
		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter your id: ");
		 id = input.nextInt();
		 System.out.print("Enter your income: ");
		 income = input.nextDouble();
		 if (id >= 10) {
		 Worker emp = new Worker();
		 emp.setID(id);
		 emp.setIncome(income);
		 emp.calBonus(id);
		 System.out.printf("You are Worker, ID %d.\n", emp.getID());
		 System.out.printf("If your income is %.2f, ", emp.getIncome());
		 System.out.printf("you'll get %.2f Baht for Bonus!!\n",emp.getBonus());
		 } else if(id > 0) {
			 Manager emp = new Manager();
			 emp.setID(id);
			 emp.setIncome(income);
			 emp.caltax(income);
			 System.out.printf("You are Worker, ID %d.\n", emp.getID());
			 System.out.printf("If your income is %.2f, ", emp.getIncome());
			 System.out.printf("you'll get %.2f Baht for Bonus!!\n",emp.getTax());
			 // Add Statement!!
		 } else {
			 System.out.printf("Invalid ID %d !!\n", id);
		 // Add Statement!!
		 }
	 } // End of main()
	} // End of class()
