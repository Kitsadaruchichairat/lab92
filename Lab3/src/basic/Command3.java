package basic;

import java.util.Scanner;

public class Command3 {
	public static void main (String[] args) {
		float pass,num1= 0,num2= 0;
		String word="",msg="",subMsg="";
		
		Scanner input =new Scanner(System.in);
		 System.out.println("Enter your password: ");
		 msg = input.nextLine();
		 
		 
		 
		 if ( msg.contains ("v")) {//ตรวจสอบว่าใช่ตัว V ไหม
			 System.out.println("Enter the 1st floating-point number:  ");
			 pass = input.nextFloat();
			 subMsg = (pass + msg.length() + msg);
		 }else{
			 System.out.println("Enter the 1st floating-point number:  ");
			 num1 = input.nextFloat();
			 System.out.println("Enter the 2st floating-point number:  ");
			 num2 = input.nextFloat();
			 
			//เปลี่ยนรหัสผ่านเป็น (เลขทศนิยม+ความยาวข้อมูล)
			 subMsg = (num1 + num2 ) + msg;
			 
		 }
		 
		 System.out.println(subMsg);
	}

}

