package de.openknowledge.greeting.service;

public class Greeting {

    private final String greeting;

    public Greeting(final User user) {
        this.greeting = String.format("Hello %s", user.getUsername());
    }

    public String getGreeting() {
        return greeting;
    }
}
