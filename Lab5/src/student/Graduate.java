package student;

public class Graduate extends Student {
	private char grade;
	 public void computerGrade() {
	 if (score >= 80) grade = 'A';
	 else grade = 'B';
	 }

	 public char getGrade() {
	 return grade;
	 }


}
