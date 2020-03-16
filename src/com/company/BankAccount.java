package com.company;

public class BankAccount {
        private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum) {
        if (sum > 0) {
            amount = amount + sum;
            System.out.println("Деньги на счете: " + amount);
        }
    }
    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Недостаточно средств ", amount);
        }
        amount = amount - sum;
               System.out.println(getAmount());

    }

}




