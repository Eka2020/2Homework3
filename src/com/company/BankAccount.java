package com.company;

public class BankAccount {

    public static final String GREEN = "\u001B[36m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            amount = amount + sum;
            System.out.println(YELLOW + "Деньги на счете: " + GREEN + amount);
            System.out.println(YELLOW + "Максимальный лимит снятия денег: " + GREEN + "6000");
        }
    }

    public void withDraw(double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException(RED + "Недостаточно средств для снятия максимального лимита ", amount);
        }
        amount = amount - sum;
        System.out.println(YELLOW +"Снимаем "+ GREEN + sum);
        System.out.println(YELLOW +"Остаток ");
        System.out.println(GREEN + getAmount());

    }

}




