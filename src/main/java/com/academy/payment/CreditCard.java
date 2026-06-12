package com.academy.payment;
public class CreditCard implements PaymentMethod {
    public void pay(double amount) { System.out.println("Credit Card paid " + amount); }
}