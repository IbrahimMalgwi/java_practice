package oandd;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account delighted = new Account();
        Account ope = new Account();

        System.out.println("Enter name for delighted: ");
        String theName = input.nextLine();
        delighted.setName(theName);

        System.out.println("Enter for Ope: ");
        ope.setName(input.nextLine());

        System.out.printf("Delighted's name is %s%n%n", delighted.getName());
        System.out.printf("Ope's name is %s%n%n", ope.getName());
    }
}
