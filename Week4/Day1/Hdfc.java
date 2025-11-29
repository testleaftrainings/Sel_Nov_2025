package week4.day1;

public class Hdfc implements RBI {

	public void regulateKyc() {
		System.out.println("Aadhar Card");
		
	}

	public void setDepositLimit() {
		System.out.println("50 Lakhs");
		
	}
	
	public static void main(String[] args) {
		Hdfc hdfcOptions=new Hdfc();
		hdfcOptions.regulateKyc();
		hdfcOptions.setDepositLimit();
		}

}
