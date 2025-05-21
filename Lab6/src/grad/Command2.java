package grad;
import java.io.*;
import java.util.Scanner;
public class Command2 {
	public static void main(String[] args) {
		String grad="",output="";
		int score =0;
		 
		try {
			
			FileReader infile = new FileReader("C:/java/Grade.txt");
			Scanner input = new Scanner(infile);
			
			 Scanner userInput = new Scanner(System.in);//อ่านข้อมูลที่รับเข้ามาจากคอนโวล
			System.out.print("Enter a Grade ");
			 String inGrade = userInput.nextLine();  // รับเกรดจากผู้ใช้
			 
			 
			
			while(input.hasNext()) {
				String name = input.next(); 
				grad = input.next();  // อ่านเกรด เช่น A, B, C
				 score = input.nextInt();  // อ่านคะแนนที่สัมพันธ์กับเกรด
                    
				 if (grad.equalsIgnoreCase(inGrade)) {//รตรวจสอบว่าเกรดที่อ่านมาจากไฟล์ตรงกับเกรดที่ผู้ใช้ป้อนหรือไม่ จากนั้นแสดงชื่อนักศึกษาและคะแนนที่ตรงกับเกรดดังกล่าว
	                   //equalsIgnoreCase()เป็นเมธอดใน Java สำหรับเปรียบเทียบ String โดยไม่คำนึงถึงตัวพิมพ์เล็กหรือพิมพ์ใหญ่.
					 System.out.printf(" %s  %d%n", name, score);
					 //%s: ใช้แทน String (ในที่นี้คือ name ซึ่งเป็นชื่อนักศึกษา)
					 //%d: ใช้แทน int (ในที่นี้คือ score ซึ่งเป็นคะแนนของนักศึกษา)
					 //%n: ใช้เพื่อขึ้นบรรทัดใหม่ (เทียบเท่ากับ \n)
	                    
	                }
	            }

	           
			input.close();
			infile.close();
				
          
			
			} catch (IOException error) {
			error.printStackTrace();
			 }
			 }//end of main()
	}


