package ex05;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private int displayBalance;
	private int sum =0;
	BankAccount(){
		
	}

	BankAccount(int d, String e, int f){
		int accountnumber = d;
		String accountHolder = e;
		int displayBalance =f;
	}
	
	void deposit(int a) {
		System.out.println("입금액 : " + displayBalance);
		displayBalance += a;
	}
	void withdraw(int a) {
		System.out.println("출금액 : " + displayBalance);
		displayBalance -= a;
	}
	void displayBalance() {
		System.out.println("잔액 : " + displayBalance);
		
	}

	
}

