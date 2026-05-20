package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        Valuable account2 = new BankAccount("Gary", "456", 1500);


        account1.deposit(100);


        System.out.println("Account 1 balance after deposit: " + account1.getValue());
    }
}
