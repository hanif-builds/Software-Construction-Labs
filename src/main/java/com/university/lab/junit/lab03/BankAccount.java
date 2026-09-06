/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.university.lab.junit.lab03;

/**
 *
 * @author hanif
 */
public class BankAccount {

    private double balance;

    public void deposit(double amt) {
        if (amt < 0) {
            throw new IllegalArgumentException();
        }

        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt > balance) {
            
                throw new IllegalStateException();
        }
        balance -= amt;
    }

    public double getBalance() {
        return balance;
    }
}
