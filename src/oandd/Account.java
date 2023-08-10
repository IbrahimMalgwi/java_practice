package oandd;

public class Account {
    private String name;
    private int balance;
    private int deposit;
    private int withdraw;

    public Account(int balance){
        this.balance = balance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        this.balance -= amount;
    }



    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

}
