package oops.practice;

class Customer {
 private String name;
 private String customerID;

 public Customer(String name, String customerID) {
     this.name = name;
     this.customerID = customerID;
 }

 public String getName() {
     return name;
 }

 public String getCustomerID() {
     return customerID;
 }

 @Override
 public String toString() {
     return "Customer[Name: " + name + ", ID: " + customerID + "]";
 }
}

class Account {
 private String accountNumber;
 private double balance;

 public Account(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposit"+ amount + "New Balance" + balance);
 }

 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdraw" + amount + "Remaining Balance" + balance);
     } else {
         System.out.println("Insufficient balance");
     }
 }

 @Override
 public String toString() {
     return "Account[Number: " + accountNumber + ", Balance: ₹" + balance + "]";
 }
}

class RBI {
 protected Customer customer;
 protected Account account;

 public double getInterestRate() {
     return 4.0;
 }

 public double getWithdrawalLimit() {
     return 50000; 
 }

 public RBI(Customer customer, Account account) {
     this.customer = customer;
     this.account = account;
 }


 public void displayDetails() {
     System.out.println(customer);
     System.out.println(account);
     System.out.println("Interest Rate" + getInterestRate());
     System.out.println("Withdraw" + getWithdrawalLimit());
 }
}

class SBI extends RBI {
 public SBI(Customer customer, Account account) {
     super(customer, account);
 }

 @Override
 public double getInterestRate() {
     return 5.0; 
 }

 @Override
 public double getWithdrawalLimit() {
     return 60000;
 }
}

class ICICI extends RBI {
 public ICICI(Customer customer, Account account) {
     super(customer, account);
 }

 @Override
 public double getInterestRate() {
     return 6.5; 
 }

 @Override
 public double getWithdrawalLimit() {
     return 75000; 
 }
}


class PNB extends RBI {
 public PNB(Customer customer, Account account) {
     super(customer, account);
 }

 @Override
 public double getInterestRate() {
     return 5.5;
 }

 @Override
 public double getWithdrawalLimit() {
     return 55000;
 }
}

public class Banking {
 public static void main(String[] args) {
     Customer cust1 = new Customer("jeev", "CUST101");
     Customer cust2 = new Customer("dharani", "CUST102");
     Customer cust3 = new Customer("gayathri", "CUST103");

     Account acc1 = new Account("SBIN001", 50000);
     Account acc2 = new Account("ICIC002", 75000);
     Account acc3 = new Account("PNB003", 60000);

     RBI bank1 = new SBI(cust1, acc1);
     RBI bank2 = new ICICI(cust2, acc2);
     RBI bank3 = new PNB(cust3, acc3);

     System.out.println("SBI Bank");
     bank1.displayDetails();

     System.out.println("\nICICI Bank");
     bank2.displayDetails();

     System.out.println("\nPNB Bank");
     bank3.displayDetails();
 }
}






















/*

class Customer{
	private String name;
	private int customerId;
	
	public Customer(String name, int customerId) {
		this.name=name;
		this.customerId=customerId;
	}
	
	public String getName() {
	return name;	
	}
	public int getcustomerId() {
		return customerId;
	}
	public String toString() {
		return "name: "+name+"customer Id: "+customerId;
	}
}
class Account{
	private String accountNo;
	private double balance;
	
	public Account(String accountNo, double balance) {
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public String getaccountNo(){
		return accountNo;
	}
	public double getBalance(){
		return balance;
	}
	public void deposit(double amount) {
		if(balance >= amount) {
			balance += amount;
			System.out.println("balance is "+balance);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance -= amount;
			System.out.println("after withdraw balance is "+balance);
		}
		else {
			System.out.println("insufficient balance");
		}
		
		public String toString() {
			return "Account ""balance: "+balance+""
		}
	}
	
	class Rbi{
		Customer c;
		Account a;
		public double GetInterestRate() {
			return 1.0;
		}
		public double GetWithdrawalLimit() {
			return 1000;
		}
		}
	class Sbi extends Rbi{
		public double GetInterestRate() {
			return 2.0;
		}
		public double GetWithdrawalLimit() {
			return 2000;
		}
	}
	class Icici extends Rbi{
		public double GetInterestRate() {
			return 3.0;
		}
		public double GetWithdrawalLimit() {
			return 3000;
		}
		public void toString() {
			
		}
	}
	class Banking{
		public static void main(String args[]) {
			Customer c1=new Customer("jeev",1);
			Customer c2=new Customer("anu",2);

			
			Account a1=new Account("rbi001",1000);
			Account a2=new Account("icici001",2000);
			
			Rbi sbi=new Sbi(c1,a1);
			Rbi icici=new Icici(c2,a2);
			
		}
	}
	}
*/