package basic;
import javax.swing.*;
public class Command3 {
	public static void main(String[] args) {
		 String name;
		 String age;
		 String occupation;
		 String skill;
		 JFrame myWindow = new JFrame();
		 
		 myWindow.setSize(500,400);
		 myWindow.setVisible(true);
		 
		 name= JOptionPane.showInputDialog(myWindow, "What is your name?");
		 age= JOptionPane.showInputDialog(myWindow, "How old are you?");
		 occupation= JOptionPane.showInputDialog(myWindow, "What is your occupation?");
		 skill= JOptionPane.showInputDialog(myWindow, "What is your special skill?");
		 
		 String message = "Name: "+ name + "\n"
				 + "Age: " + age +"\n"
				 + "Occupation: " + occupation +"\n"
				 + "Special skill: " + skill ;
		 JOptionPane.showMessageDialog(myWindow,message );
	 }

}
