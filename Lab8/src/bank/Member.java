package bank;

public class Member {
	private String memberName;
	private String memberMobileNo;
	
	public void setName(String name) {
		   memberName = name ;
		return;
		
	}
	public String getName() {
		
		return memberName;
				
	}
	public void setMobileNo(String mobileno) {
		memberMobileNo = mobileno;
		return;
	}
	public String getMobileNo() {
		return memberMobileNo;
	}
}
