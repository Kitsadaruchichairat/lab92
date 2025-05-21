package employee;

public class Worker extends Employee  {
	public double bonus;
	
	public void calBonus(double cabonus) {
		this.bonus = cabonus;
		if(id >100) bonus = income /3 ;
		else bonus = income /2;
	}
	public double getBonus() {
		return bonus;
	}
}
