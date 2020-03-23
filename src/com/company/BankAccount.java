package com.company;

public class BankAccount {

    public static final String ANSI_GREEN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount = amount + sum;
            System.out.println(ANSI_YELLOW + "Деньги на счете: " + ANSI_GREEN + amount);
            System.out.println(ANSI_YELLOW + "Максимальный лимит снятия денег: " + ANSI_GREEN + "6000");
        }
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException(ANSI_RED + "Недостаточно средств ", amount);
        }
        amount = amount - sum;
        System.out.println(getAmount());

    }

}




