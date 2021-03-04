package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {

// 		RBI ref = new HDFC();
//		bankFeature (ref);
//		ref = new ICICI();
//		bankFeature (ref);
//		ref = new RBL();
//		bankFeature (ref);
		
		BankUser ref = new BankUser();
		
		ref.bankFeature(new HDFC());
		ref.bankFeature(new ICICI());
		ref.bankFeature(new RBL());

	}

	public void bankFeature(RBI ref) { // non premitive type of data is passed

		ref.savingAccount();
		ref.currentAccount();
		ref.debitCard();
		ref.creditCard();

	}
	
	
	

}
