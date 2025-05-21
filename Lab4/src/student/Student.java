package student;

public class Student {
	private String stdName, stdID;

	 public Student() {// ผิดตรง s เล็ก
	 stdName = "Unknown";
	 stdID = "xxx";
	 }

	 public void setStdName(String name) {
	 stdName = name;
	 }

	 public String getLogin(String id) {
	 stdID = id.substring(1,id.length());//เปลี่่ยนจาก 2 เป็น1
	 return stdID;
	 }
	 public String getPassword() {
	 return stdName.substring(0,4) + stdID.substring(0,4 );
	 }//เปลี่ยน3 เป็น4

}
