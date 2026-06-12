package com.academy.payment;
public class Maya implements PaymentMethod {
    public void pay(double amount) { System.out.println("Maya paid " + amount); }
}