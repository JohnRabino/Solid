package com.academy;

import com.academy.report.*;
import com.academy.payment.*;
import com.academy.shape.*;
import com.academy.vehicle.*;
import com.academy.logging.*;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("=== SRP ===");
        ReportGenerator gen = new ReportGenerator();
        String report = gen.generate();
        new ReportExporter().exportPDF(report);
        new EmailSender().sendEmail(report);

        System.out.println("\n=== OCP ===");
        List<PaymentMethod> methods = Arrays.asList(new GCash(), new Maya(), new CreditCard());
        new PaymentProcessor().process(methods, 100.0);

        System.out.println("\n=== LSP ===");
        Shape rect = new Rect(4, 5);
        Shape square = new Square(4);
        System.out.println("Rect area: " + rect.area());
        System.out.println("Square area: " + square.area());

        System.out.println("\n=== ISP ===");
        new Car().drive();
        new Plane().fly();
        new Boat().sail();

        System.out.println("\n=== DIP ===");
        UserService fileService = new UserService(new FileLogger());
        fileService.register("Juan");
        UserService consoleService = new UserService(new ConsoleLogger());
        consoleService.register("Maria");
        UserService dbService = new UserService(new DatabaseLogger());
        dbService.register("Pedro");
    }
}
