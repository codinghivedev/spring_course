package dev.codinghive.dependencyinjection.services.profiles;

import dev.codinghive.dependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Es")
@Service("i18nGreetingService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Spanish";
    }
}
