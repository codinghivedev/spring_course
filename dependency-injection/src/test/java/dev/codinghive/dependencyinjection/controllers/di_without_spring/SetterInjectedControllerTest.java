package dev.codinghive.dependencyinjection.controllers.di_without_spring;

import dev.codinghive.dependencyinjection.services.di_without_spring.ConstructorGreetingServiceImpl;
import dev.codinghive.dependencyinjection.services.di_without_spring.SetterGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController=new SetterInjectedController();
        setterInjectedController.setGreetingService(new SetterGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(setterInjectedController.getGreeting());
    }
}