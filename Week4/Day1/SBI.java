package week4.day1;

public class SBI implements RBI {

	public void regulateKyc() {
		System.out.println("PAN is mandatory");
		
	}

	public void setDepositLimit() {
		System.out.println("10 Lakhs");
		
	}
	public static void main(String[] args) {
		SBI sbiOptions=new SBI();
		sbiOptions.regulateKyc();
		sbiOptions.setDepositLimit();
	}

}
