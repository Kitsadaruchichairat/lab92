package employee;

public class Worker extends Employee{

	public double calSalary() {
		if (salary > 6000) { salary = salary + 500;
	}
	else {
		salary = salary + 1000;
	}	
		return salary;	
	}
	
}
