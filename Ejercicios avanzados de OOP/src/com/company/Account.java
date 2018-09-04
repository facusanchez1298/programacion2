package com.company;

public class Account {


    String id;
    String name;
    int balance = 0;

    Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        if (amount < 0) {
            throw new RuntimeException("el valor introducido debe ser positivo");
        }
        else {
            this.balance += amount;
            return balance;
        }
    }

    public int debit(int amount){
    if (amount <= balance){
        balance -= amount;
    }
    else System.out.print("amount exceede balance");
    return balance;
    }



    public int transferTo(Account another, int amount){
        if (amount <= balance){
            this.balance -= amount;
            another.balance += amount;
        }
        else System.out.print("amount exceede balance");
        return balance;
    }


    public String verAccount(){
        return "account[id = " + this.id + ", name = " + this.name +
                ", balance = " + this.balance + "]";
    }

}
