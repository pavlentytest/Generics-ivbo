package com.company;

public class Account<T, B> {
    private T id;
    private B balance;
    Account(T i, B balance) {
        this.balance = balance;
        this.id = i;
    }
    public T getId() {
        return id;
    }
    public B getBalance() {
        return balance;
    }
}
