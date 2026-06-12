package com.academy.payment;
public class GCash implements PaymentMethod {
    public void pay(double amount) { System.out.println("GCash paid " + amount); }
}