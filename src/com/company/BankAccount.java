package com.company;

public class BankAccount {
    public static double amount;

    public double getAmount(){
        return amount;
    }
    public void deposit(double sum) {
     amount=amount+sum;
    }

    public  void withDraw(double sum) throws LimitException {
        if (sum>getAmount()) {
            throw new LimitException("Не достаточно средств для снятия этой суммы ",
                    LimitException.getRemainingAmount());
        }
            amount=amount-sum;
        System.out.println("Снимаем "+sum);
    }
}






