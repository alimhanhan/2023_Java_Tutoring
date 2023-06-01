package week3;

public class quiz4 {
	
	String name;
	String bankName;
	int balance;
	String accountNumber;
	
	void showBalance()
	{
		System.out.println("은행명: " + bankName);
		System.out.println("예금주: " + name);
		System.out.println("계좌 번호: " + accountNumber);
		System.out.println("잔액: " + balance);
		System.out.println("======================================");
	}
	
	void withdraw(int k)
	{
		if(balance >= k)
		{
			balance = balance - k;
		}
		else
		{
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	void deposit(int i)
	{
		balance = balance + i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		quiz4 account = new quiz4();
		
		account.bankName = "안녕은행";
		account.name = "한아림";
		account.accountNumber = "012345-1234567";
		account.balance = 5000;
		
		System.out.println("[정보 확인하기]");
		account.showBalance();
		
		System.out.println("[입금하기]");
		account.deposit(1000);
		account.showBalance();
		
		System.out.println("[출금하기]");
		account.withdraw(4000);
		account.showBalance();
		
		System.out.println("[잔액 부족의 경우]");
		account.withdraw(50000);
	}
}