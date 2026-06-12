package com.academy.logging;
public class DatabaseLogger implements Logger {
    public void log(String msg) { System.out.println("DB log: " + msg); }
}