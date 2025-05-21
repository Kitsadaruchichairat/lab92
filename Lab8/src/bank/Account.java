package bank;

public class Account {
	
	private Member user;
	private String account;
	private double acountBalance;
	
	public void setAccountID(String account) {
		this.account = account; 
		return;
	}
	public String getAccountID() {
		return account;
	}
	public void setBalance(double Balance) {
		acountBalance = Balance; 
		return;
	}
	public double getBalance() {
		return acountBalance;
	}
	
	public void setMember(Member user) {
		this.user = user;
		return;
	}
	public Member getMember() {
		return user;
	}
	
}
