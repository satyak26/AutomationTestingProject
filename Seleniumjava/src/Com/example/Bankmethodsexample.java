package Com.example;

public class Bankmethodsexample {
		static int currentBalance = 75900;
	public static void greetcustomer() {
	System.out.println("hello, Welcome to the bank application");
	}
	public void deposit(int amount) {
		currentBalance = currentBalance+amount;
		System.out.println("Amount deposited successfully");	
		}
	public static void withdrawal(int amount) {
		currentBalance = currentBalance-amount;
		System.out.println("Amount have been withdrawal");		
		}
	public int getCurrentBalance() {
		return currentBalance;
		
		}
	public static void main(String[] args) {
Bankmethodsexample bank = new Bankmethodsexample();
	greetcustomer();
	System.out.println("currentBalance is $"+bank.getCurrentBalance());	
	bank.deposit(5000);
	System.out.println("currentBalance after desposit amount is $"+bank.getCurrentBalance());		
	withdrawal(900);
	System.out.println("currentBalance after withdrawal amount is $"+bank.getCurrentBalance());	
	bank.getCurrentBalance();
	}
}

