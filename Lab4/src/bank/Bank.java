package bank;

public class Bank {
	private double balance ; 
	
	 public void setBalance(double amount) {//amount ยอดเงินที่ถอน
		 balance = amount;// ตั้งค่าคงเหลือ (balance) ของบัญชีให้เท่ากับ amount ที่รับมาจากภายนอก
	    }
		 
	 public double getBalance() {// เมธอด getBalance ใช้สำหรับดึงยอดเงินในบัญชี
		 
		 return balance;//คืนค่าของ balance (ยอดเงินในบัญชี)
		 }
	 
	 
	 public void withdraw (double amount) {//เมธอด withdraw ใช้สำหรับการถอนเงินจากบัญชี
		if (amount <= balance) {
			balance -= amount;
		}
		}
	 
	 public void deposit (double amount) {//ใช้ฝากเงิน
		 balance += amount;//เพิ่มจํานวนเงินตามที่ฝาก
	 }
}
