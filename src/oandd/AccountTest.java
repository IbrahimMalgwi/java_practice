package oandd;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account1 = new Account(2500);
        Account account2 = new Account(2500);


        System.out.print("Enter name for account1: ");
        String name1 = input.nextLine();
        account1.setName(name1);

        System.out.print("Enter name for account2: ");
        account2.setName(input.nextLine());

        account1.deposit(500);
        account1.withdraw(2500);

        System.out.printf("%s balance: $%d%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%d%n", account2.getName(), account2.getBalance());


    }
}
