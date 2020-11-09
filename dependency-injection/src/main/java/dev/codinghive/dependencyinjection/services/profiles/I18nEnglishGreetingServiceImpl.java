package dev.codinghive.dependencyinjection.services.profiles;

import dev.codinghive.dependencyinjection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"En","default"})
@Service("i18nGreetingService")
public class I18nEnglishGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World English";
    }
}
