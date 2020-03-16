package com.company;

import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(16000);
        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Cнимаем остаток: " + account.getAmount());
                System.out.print("Деньги на счете: ");
                System.out.print(account.getAmount() - (account.getAmount()));
                break;
            }

        }
    }
}

