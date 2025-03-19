package org.dc.exception.advanced;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankAccount() {}

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidTransactionException{
        if (amount <= 0) {
            throw new InvalidTransactionException("The amount needs to positive.");
        }
        balance+=amount;
        System.out.println(amount + " deposited successfully.");
    }

    public void withdraw(double amount) throws InvalidTransactionException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidTransactionException("The amount needs to positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
        balance-=amount;
        System.out.println("Successfully withdrew: " + amount);
    }

    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}
