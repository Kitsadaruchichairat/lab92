import javax.swing.*;
public class Command3 {
	public static void main(String[] args) {

		 String name, salary, message = "";
		 float salaryscale;
		 double tax = 0;
		 JFrame myWindow = new JFrame();

		 myWindow.setSize(300, 200);
		 myWindow.setTitle("My First Java Program");
		 myWindow.setVisible(true);

		 name = JOptionPane.showInputDialog(myWindow, "What is your name?");
		 salary = JOptionPane.showInputDialog(myWindow, "What is your salary?");
		 salaryscale = Integer.parseInt(salary);
		 if (salaryscale < 10000) {
		 message = name + " has to pay " + 0.0 +" bath in income tax.";
		 }else if (salaryscale >= 10000 &&salaryscale  <= 30000 ) { 
			 tax = salaryscale * 0.01;
		 message = name + " has to pay " + tax +" bath in income tax.";}
		 else if (salaryscale >= 30000 && salaryscale <= 50000 ) { 
			 tax = salaryscale * 0.03;
		 message = name + " has to pay " + tax +" bath in income tax.";}
	else if (salaryscale >= 50000 ) { 
			 tax = salaryscale * 0.04;
		 message = name + " has to pay " + tax +" bath in income tax.";
		 }
	
		 
		 JOptionPane.showMessageDialog(myWindow, message);

		 System.exit(0);
		 	
		}
	}

