package com.academy.logging;
public class FileLogger implements Logger {
    public void log(String msg) { System.out.println("File log: " + msg); }
}