package dev.codinghive.dependencyinjection.controllers.di_with_spring;

import dev.codinghive.dependencyinjection.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SpringSetterInjectedController {


    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(@Qualifier("springSetterGreetingServiceImpl")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }
}
