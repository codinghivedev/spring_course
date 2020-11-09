package dev.codinghive.dependencyinjection.controllers.di_with_spring;

import dev.codinghive.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SpringConstructorInjectedController {

    private final GreetingService greetingService;

    @Autowired //@Autowired is Optional in case of Constructor DI
    public SpringConstructorInjectedController(@Qualifier("springConstructorGreetingServiceImpl")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }

}
