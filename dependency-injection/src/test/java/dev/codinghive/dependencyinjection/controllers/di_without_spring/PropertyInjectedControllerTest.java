package dev.codinghive.dependencyinjection.controllers.di_without_spring;

import dev.codinghive.dependencyinjection.services.di_without_spring.ConstructorGreetingServiceImpl;
import dev.codinghive.dependencyinjection.services.di_without_spring.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController=new PropertyInjectedController();
        propertyInjectedController.greetingService=new PropertyGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}