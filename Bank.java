package week3.assignment;

public class Bank extends SBI implements CIBIL,PNB {

	

	public void creditScore() {
       System.out.println("my credit score is  8.5");
		
	}

	public void minimumBalance() {
	
		System.out.println("My account minimum balance 10000");
	}

	public void cibilScore() {
	System.out.println("Cibil score is : 10");
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("Maximum loan amount: 100000");
			
		}
		
	

	@Override
	public void bankbalance() {
	System.out.println("Bank balance is 50000");
		
	}
	public static void main(String[] args) {
		
		Bank loan=new Bank();
		loan.bankbalance();
		loan.cibilScore();
		loan.creditScore();
		loan.maximumLoanAmount();
		loan.minimumBalance();
		loan.ITLoan();
		
		
		
		
		


	}

}
