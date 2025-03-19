package org.dc.exception.advanced;

public class PremiumBankAccount extends BankAccount {
    public PremiumBankAccount(String accountNumber, double balance) {
        super();
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, InvalidTransactionException {
        if (amount > getBalance() + 1000) {
            throw new InsufficientBalanceException("Withdrawal limit exceeded for premium accounts with overdraft protection.");
        }
        super. withdraw(amount);
    }
}
