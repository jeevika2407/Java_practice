package oops.practice;

public class Balance {
    private String id;
    private String name;
    private int balance;

    public Balance(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Balance another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

    public static void main(String args[]) {
        Balance acc1 = new Balance("A101", "John Doe", 500);
        Balance acc2 = new Balance("A102", "Jane Doe", 1000);

        System.out.println(acc1);
        System.out.println(acc2);

        acc1.credit(200);
        System.out.println("After crediting 200: " + acc1);

        acc1.debit(100);
        System.out.println("After debiting 100: " + acc1);

        acc1.transferTo(acc2, 300);
        System.out.println("After transferring 300 from acc1 to acc2:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
