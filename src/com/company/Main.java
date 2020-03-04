package com.company;


import java.util.jar.JarOutputStream;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.deposit(10000);
        System.out.println("На счет положили "+ account.getAmount());

                while (true) {
            try {
                if (account.getAmount() >= 6000) {
                    account.withDraw(6000);
                    System.out.println("Остаток на счете составляет " +LimitException.getRemainingAmount());
              } else {
                   account.withDraw(4000);
                    System.out.println("У Вас на счете остаток: "+LimitException.getRemainingAmount());
                }
            } catch (LimitException e) {
                e.printStackTrace();
                break;
            }
        }
    }

}