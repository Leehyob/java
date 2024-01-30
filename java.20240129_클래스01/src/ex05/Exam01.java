package ex05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount bank = new BankAccount(001122, "이효빈", 10000);
		
		bank.displayBalance();
		bank.deposit(100000);
		bank.displayBalance();
		bank.withdraw(10000);
		bank.displayBalance();
		
		

	}

}
