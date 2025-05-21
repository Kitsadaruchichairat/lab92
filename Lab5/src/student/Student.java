package student;

public class Student {
	private String course;
	 protected float score;//protected เป็นระดับการเข้าถึงที่ช่วยให้คลาสย่อยสามารถใช้งานตัวแปรหรือเมธอดได้
	 //และยังช่วยให้คลาสอื่นในแพ็กเกจเดียวกันสามารถเข้าถึงได้ด้วย แต่จะไม่สามารถเข้าถึงจากคลาสที่อยู่นอกแพ็กเกจและไม่ได้สืบทอด.

	 public String getCourse() {
	 return course;
	 }
	 public void setScore(String stdCourse, float stdScore) {
	 course = stdCourse;
	 score = stdScore;
	 }
}
