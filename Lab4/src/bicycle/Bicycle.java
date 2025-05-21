package bicycle;

public class Bicycle {
	private String ownerName;//เป็นตัวแปรเก็บชื่อเจ้าของจักรยาน (ownerName) 
	//ถูกกำหนดเป็น private เพื่อไม่ให้เข้าถึงได้โดยตรงจากภายนอกคลาส

	 public Bicycle() {
	 ownerName = "Unknown";//เป็นคอนสตรักเตอร์เปล่าที่ถูกเรียกเมื่อสร้างอ็อบเจกต์ Bicycle 
	 //โดยไม่ส่งพารามิเตอร์ใดๆ คอนสตรักเตอร์นี้จะตั้งค่า ownerName ให้เป็น "Unknown" โดยอัตโนมัติ
	 }

	 public Bicycle(String name) {//เป็นคอนสตรักเตอร์ที่มีพารามิเตอร์ String name ซึ่งถูกเรียกเมื่อสร้างอ็อบเจกต์ Bicycle 
		 //โดยมีการส่งชื่อเจ้าของเข้ามา คอนสตรักเตอร์นี้จะตั้งค่า ownerName ตามค่าที่ส่งเข้ามา
	 ownerName = name;
	 }
	 public String getOwnerName() {
	 return ownerName;
	 }

	 public void setOwnerName(String name) {//เมื่อการทำงานของเมท็อด setOwnerName (บรรทัดที่ 12-14) เสร็จสิ้น ระบบจะกลับไปทำงานต่อในบรรทัดที่เรียกใช้เมท็อดนี้ในไฟล์ Command1.java

	 ownerName = name;
	 }

}
