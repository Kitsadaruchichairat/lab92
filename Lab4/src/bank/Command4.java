package bank;
import java.util.Scanner;

public class Command4 {
	public static void main(String[] args) {
		 double firstBalance;
		 Scanner input = new Scanner(System.in);
		 Bank acc1 = new Bank();
		 System.out.println("How much do you want to open your account?");
		 firstBalance = input.nextDouble();// รับค่าจำนวนเงินจากผู้ใช้และเก็บไว้ในตัวแปร firstBalance
		 acc1.setBalance(firstBalance);//setเงินในบัญชี (ตัวแปร balance) ของ acc1 ให้เป็น firstBalance
		 System.out.printf("1:Balance = %.2f\n", acc1.getBalance());//ใช้เมธอด getBalance() ของคลาส Bank เพื่อดึงยอดเงินจากบัญชี acc1 และแสดงผลลัพธ์ในรูปแบบที่มีทศนิยม 2 ตำแหน่ง (%.2f).
		 //%.2f\n คือทศนิยม2ตําแหน่ง
		 acc1.withdraw(500.50); //Less than firstBalance  เรียกใช้เมธอด withdraw() ของคลาส Bank เพื่อถอนเงิน 500.50 จากบัญชี acc1.
		 System.out.printf("2:Balance = %.2f\n", acc1.getBalance());
		 acc1.deposit(1000.00);//เรียกใช้เมธอด deposit() ของคลาส Bank เพื่อฝากเงิน 1000.00 เข้าไปในบัญชี acc1.
		 System.out.printf("3:Balance = %.2f\n", acc1.getBalance());
		 }
}
