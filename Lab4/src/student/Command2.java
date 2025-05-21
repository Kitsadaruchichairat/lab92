package student;
import java.util.Scanner;
public class Command2 {
	public static void main(String[] args) {
		 String name="",id=""; // ไม่ได้ใส่;เติมid 
		 
		 Scanner input = new Scanner(System.in);

		 Student std1 = new Student ();// เติมStudent การประกาศตัวแปรอ็อบเจกต์ กำลังประกาศตัวแปร std1 ที่เป็นตัวแปรประเภท Student ซึ่งสามารถอ้างอิงถึงอ็อบเจกต์ของคลาส Student ได้
		 System.out.printf("Enter your name: ");
		 name = input.nextLine();
		 
		
		 System.out.print("Enter your ID number : ");//ใส่ "" ครอบใน()
		 id = input.nextLine();

		 std1.setStdName(name);
		 System.out.println("Login: " + std1.getLogin(id));
		
		 System.out.println("Password: " + std1.getPassword());
		 }

}
