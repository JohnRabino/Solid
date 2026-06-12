package com.academy.logging;
public class ConsoleLogger implements Logger {
    public void log(String msg) { System.out.println("Console log: " + msg); }
}