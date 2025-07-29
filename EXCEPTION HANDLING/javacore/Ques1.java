package oops.test;
import java.util.*;

class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id, String name, char gender) {
//        super();
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Customer [id=" + id + "]";
    }
}

class Account {
    Customer c;
    private int Id;
    private double balance;

    public Account(Customer c, int Id, double balance) {
//        super();
        this.c = c;
        this.Id = Id;
        this.balance = balance;
    }

    public Customer getC() {
        return c;
    }

    public void setC(Customer c) {
        this.c = c;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "Account [Id=" + Id + ", balance=" + balance + "]";
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("After deposit: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance is: " + balance);
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }
}

public class Ques1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer(1, "jeev", 'F');
        Account a = new Account(customer, 1001, 10000.0);

        System.out.println("PLEASE SELECT ONE OPTION FROM BELOW\n1. WITHDRAW\n2. DEPOSIT\n3. CHECK BALANCE\n4. EXIT ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("OPTION: 1");
                System.out.println("ENTER AMOUNT TO WITHDRAW:");
                a.withdraw(sc.nextDouble());
                break;

            case 2:
                System.out.println("OPTION: 2");
                System.out.println("ENTER AMOUNT TO DEPOSIT:");
                a.deposit(sc.nextDouble());
                break;

            case 3:
                System.out.println("OPTION: 3");
                System.out.println("CHECK BALANCE: " + a.getBalance());
                break;

            case 4:
                System.out.println("EXIT");
                break;

            default:
                System.out.println("INVALID OPTION");
        }
        sc.close();
    }
}





/*
package com.Comparable;
import java.util.*;
import java.lang.*;
class Mobile implements Comparable <Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name, int ram, int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	String getName() {
		return name;
	}
	void setName() {
	   this.name=name;
	}
	 int getRam() {
		return ram;
	}
	 void setRam(int ram) {
		this.ram = ram;
	}
	 int getPrice() {
		return price;
	}
    void setPrice(int price) {
		this.price = price;
	}
    public int compareTo(Mobile o) {
    	if(this.ram > o.getRam()) {
    		return 1;
    	}
    	else
    		return -1;
    }
	
}
public class ComparableDemo {

	public static void main(String[] args) {
	List<Mobile>mobileList=new ArrayList<>();
	mobileList.add(new Mobile("redme",16,800));
	mobileList.add(new Mobile("apple",18,10000));
	mobileList.add(new Mobile("samsung",13,100));
	
	Collections.sort(mobileList);
	System.out.println("mobile after sorting:");
	System.out.println("name"+"\t"+"Ram"+"\t"+"Price");
	for(Mobile mb:mobileList) {
		System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
	}
	}

}
/*


/*
package com.collections;
import java.util.*;
class Mobiles{
	private String name;
	private int ram;
	private int price;
	Mobiles(String name,int ram,int price){
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	String getName() {
		return this.name;
	}
	int getRam() {
		return this.ram;
	}
	int getPrice() {
		return price;
	}
	void setName(String name) {
		this.name=name;
	}
	void setRam(int ram) {
		this.ram=ram;
	}
	void setPrice(int price) {
		this.price=price;
	}
}
class PriceCompare implements Comparator<Mobiles>{
	public int compare(Mobiles m1,Mobiles m2) {
		if(m1.getPrice()<m2.getPrice()) {
				return -1;
		}
		else {
				return 1;
		}
	}
}
class NameCompare implements Comparator<Mobiles>{
	public int compare(Mobiles m1,Mobiles m2) {
		return m1.getName().compareTo(m2.getName());
	}
}

public class Comparatorr{
public static void main(String args[]) {
List<Mobiles> ml=new ArrayList();
ml.add(new Mobiles("Samsung",12,50000));
ml.add(new Mobiles("Vivo",8,40000));
ml.add(new Mobiles("Poco",4,20000));
PriceCompare p=new PriceCompare();
Collections.sort(ml,p);
System.out.println("Sort based on Price");
System.out.println("MobileName\tRam\tPrice");
for(Mobiles mb:ml) {
	System.out.println(mb.getName()+"     \t"+mb.getRam()+"     \t"+mb.getPrice());
}
System.out.println("Sort based on Name");
NameCompare n=new NameCompare();
Collections.sort(ml,n);
System.out.println("MobileName\tRam\tPrice");
for(Mobiles mb:ml) {
	System.out.println(mb.getName()+"     \t"+mb.getRam()+"     \t"+mb.getPrice());
}
}
}
*/




/*
package com.exception;

import java.util.*;
//import java.lang.*;
class NoMatchException extends Exception {
    NoMatchException(String s) {
        super(s);
    }
}

class ExceptionDemoo {
    static void validate(String country) throws NoMatchException {
        if (!(country.equals("India"))) {
            throw new NoMatchException("Country name is not India");
        } else {
            System.out.println("Country name is India");
        }
    }
}

public class Easy01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Aadhar No:");
        int aadharNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name:");
        String name = sc.nextLine();

        System.out.println("Enter the city:");
        String city = sc.nextLine();

        System.out.println("Enter the state:");
        String state = sc.nextLine();

        System.out.println("Enter the country:");
        String country = sc.nextLine();

        try {
            ExceptionDemoo.validate(country);
        } catch (NoMatchException m) {
            System.out.println("Exception occurred: " + m);
        }

        System.out.println("Rest of the code");
    }
}
*/