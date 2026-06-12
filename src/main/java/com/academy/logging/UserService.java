package com.academy.logging;
public class UserService {
    private final Logger logger;
    public UserService(Logger logger) { this.logger = logger; }
    public void register(String user) {
        logger.log("Registering user: " + user);
    }
}