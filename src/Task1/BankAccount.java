package Task1;

public class BankAccount {
 static String accountNumber;
 static String accountName;
 static double balance=0;
	public static void main(String[] args) 
	{
		CheckingAccount s=new CheckingAccount("1234", "abcd");
		System.out.println("AccountNumber:"+accountNumber);
		System.out.println("AccountName:"+accountName);
		s.deposite(500);
		s.deposite(200);
		s.deposite(700);
		s.deductFees();
		System.out.println("transaction <=3:"+getBalance());
		s.deposite(200);
		s.deductFees();
		System.out.println("transaction >3:"+getBalance());
		}
	public BankAccount(String accNumber,String accName)
	{
		accountNumber=accNumber;
		accountName=accName;
		balance=0;
		}
	public String getAccountName()
	{
		return accountName;
		}
		
	public String getAccountNumber(){
		return accountNumber;}
	
	public static double getBalance(){
		return balance;
		
	}
	public boolean deposite(double amount){
		if(amount>0){
			balance=balance+amount;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean withdraw(double amount){
		if (amount>balance){
			return false;
		}
		else{
			balance=balance-amount;
			return true;
		}
		
	}

}
class SavingAccount extends BankAccount{
 double interestRate;
	public SavingAccount(String accNumber, String accName,double rate) {
		super(accNumber, accName);
		interestRate=rate;
		
	}
	public void addInterest(){
		double interest=getBalance()*interestRate/100;
		deposite(interest);
		
	}
	
}
 class CheckingAccount extends BankAccount{
	 int transactionCount=0;
	 double NUM_FEE;
	 double TRANS_FEE;

	public CheckingAccount(String accNumber, String accName) {
		super(accNumber, accName);
		accountNumber=accNumber;
		accountName=accName;
		}
	
		public void deductFees() {
		if(transactionCount>3){
			TRANS_FEE=balance/100*5;
			withdraw(TRANS_FEE);
		}
		}
	public boolean deposite(double amount){
		if(amount>0){
		balance=balance+amount;
		transactionCount++;}
		return true;
		}
	}
	 
 

