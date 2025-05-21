package test;
import javax.swing.*;
public class Command2 {
	public static void main(String[] args) {
	String gpax;
	 JFrame myWindow = new JFrame();
	 
	 myWindow.setSize(500,400);
	 myWindow.setTitle("Calculation");
	 myWindow.setVisible(true);
	 
	 gpax= JOptionPane.showInputDialog(myWindow, "What is your GPAX?");
	 JOptionPane.showMessageDialog(myWindow, "Your GPAX is " + gpax);
	 JOptionPane.showMessageDialog(null, "You are excellent!!");
	}
}
