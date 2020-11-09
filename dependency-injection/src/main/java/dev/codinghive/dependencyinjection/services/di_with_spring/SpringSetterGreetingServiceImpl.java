package dev.codinghive.dependencyinjection.services.di_with_spring;

import dev.codinghive.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SpringSetterGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Setter Spring";
    }
}
