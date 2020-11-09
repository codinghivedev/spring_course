package dev.codinghive.dependencyinjection.services.di_without_spring;

import dev.codinghive.dependencyinjection.services.GreetingService;

public class SetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Setter";
    }
}
