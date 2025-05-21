package employee;

public class Manager extends Employee {
	
	
	 public  double calSalary(){
		 if (id > 300) {
			 salary = salary + (salary *0.06);
		 }
		 else {
			 salary = salary + (salary *0.04);
		 }
		 return salary;	 
	 }
	
	

}
