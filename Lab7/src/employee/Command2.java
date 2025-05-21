package employee;
import java.util.Scanner;
public class Command2  {

	 
	 
	public static void main(String[] args) {
		Employee employee;
		int num=0;
		double sa,saup;
		 
		 Scanner input = new Scanner(System.in);

		 System.out.print("Enter your id:  ");
		 num = input.nextInt();
		 System.out.print("Enter your salary: ");
		 sa = input.nextDouble();
		
		 
		 
		 
		 if (num >= 0 && num <= 500) {
			 employee = new Manager();
		 System.out.println("You are Manager");
	}else if (num > 500) {
		employee = new Worker(); 
        System.out.println("You are Worker");
	}else {
		System.out.printf("Invalid ID %s ", num);
		return;// จบโปรแกรมหาก ID ไม่ถูกต้อง
	}
		
		 employee.setID(num);
	        employee.setSalary(sa);
	        
	        saup = employee.calSalary();
	        System.out.printf("Your new salary is %.2f Baht.\n", saup);
	        
		 input.close();
	}
}
