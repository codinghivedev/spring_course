package dev.codinghive.dependencyinjection.services.di_with_spring;

import dev.codinghive.dependencyinjection.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class SpringConstructorGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Constructor Spring";
    }
}
