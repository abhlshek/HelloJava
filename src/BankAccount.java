/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sp
 */
public class BankAccount {

    private int balance;
    private String name, accountno;
    static BankAccount[] accounts = {new BankAccount(1000, "Rahul", "1"), new BankAccount(1000, "Sachin", "2")};

    public BankAccount(int balance, String name, String accountno) {
        this.balance = balance;
        this.name = name;
        this.accountno = accountno;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("not found");

        } else {
            balance += amount;

        }

    }

    public void withdrow(int amount) {
        if (amount > balance) {
            System.out.println("not amount");
        } else if (amount <= 0) {
            System.out.println("not found");
        } else {
            balance -= amount;

        }
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return accountno;
    }

    public static BankAccount[] accounts() {
        return accounts;
    }

    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", name=" + name + ", accountno="
                + accountno + '}';
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(2000, "rahul", "101");
        BankAccount accounts = new BankAccount(5000, "sandeep", "102");
        System.out.println(accounts);

        System.out.println((account));

        account.deposit(100);
        System.out.println((account));

        accounts.withdrow(10);
        System.out.println(accounts);

    }

}
