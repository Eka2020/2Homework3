package com.company;

import java.util.jar.JarOutputStream;

public class Main {

    public static final String ANSI_GREEN = "\u001B[36m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(40000);
        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println(ANSI_YELLOW + "Cнимаем остаток: " + ANSI_GREEN + account.getAmount());
                System.out.print(ANSI_RED + "Деньги на счете: ");
                System.out.print(account.getAmount() - (account.getAmount()));
                break;
            }

        }
    }
}

