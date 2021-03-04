package oops.abstraction;

public class ICICI implements RBI{

	@Override
	public void savingAccount() {
		System.out.println("ICICI Savings Accounts");
		
	}

	@Override
	public void currentAccount() {
		System.out.println("ICICI Current Accounts");
		
	}

	@Override
	public void debitCard() {
		System.out.println("ICICI Debit Card");
		
	}

	@Override
	public void creditCard() {
		System.out.println("ICICI Credit Card");
		
	}

}
