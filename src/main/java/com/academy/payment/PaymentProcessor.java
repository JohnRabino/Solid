package com.academy.payment;
import java.util.List;
public class PaymentProcessor {
    public void process(List<PaymentMethod> methods, double amount) {
        for (PaymentMethod m : methods) m.pay(amount);
    }
}