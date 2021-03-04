package oops.abstraction;

public class RBL implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("RBL Savings Accounts");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("RBL Current Accounts");
		
	}

	@Override
	public void debitCard() {
		System.out.println("RBL Debit Card ");
		
	}

	@Override
	public void creditCard() {
		System.out.println("RBL Credit Card ");
		
	}

}
