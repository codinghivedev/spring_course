package dev.codinghive.dependencyinjection.controllers.di_without_spring;

import dev.codinghive.dependencyinjection.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
