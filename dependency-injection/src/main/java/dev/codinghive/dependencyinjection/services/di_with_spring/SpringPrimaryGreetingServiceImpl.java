package dev.codinghive.dependencyinjection.services.di_with_spring;

import dev.codinghive.dependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary//GreetingService do not have Qualifier this service become default service
@Service
public class SpringPrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Primary Spring";
    }
}
