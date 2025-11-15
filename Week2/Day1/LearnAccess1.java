package week2.day1;

public class LearnAccess1 {
	
	//withDrawMoney from bank - Account Holder
	//depositAmount           -Anyone
	
	public void depositAmount() {
		System.out.println("Deposit amount");
	}
	
	private void withdrawMoney() {
		System.out.println("Withdraw Money");
	}
	public static void main(String[] args) {
		LearnAccess1 accessOptions=new LearnAccess1();
		accessOptions.depositAmount();
		accessOptions.withdrawMoney();
	}
	
	

}
