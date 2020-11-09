package dev.codinghive.dependencyinjection;

import dev.codinghive.dependencyinjection.controllers.MyController;
import dev.codinghive.dependencyinjection.controllers.di_with_spring.SpringConstructorInjectedController;
import dev.codinghive.dependencyinjection.controllers.di_with_spring.SpringConstructorInjectedController_PrimaryService;
import dev.codinghive.dependencyinjection.controllers.di_with_spring.SpringPropertyInjectedController;
import dev.codinghive.dependencyinjection.controllers.di_with_spring.SpringSetterInjectedController;
import dev.codinghive.dependencyinjection.controllers.profiles.I18nController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(DependencyInjectionApplication.class, args);

//		MyController myController=ctx.getBean(MyController.class);
		MyController myController=ctx.getBean("myController",MyController.class);
		String greeting=myController.sayHello();
		System.out.println("greeting:"+greeting);



		System.out.println("--------DI with property------");
		SpringPropertyInjectedController springPropertyInjectedController=ctx.getBean(SpringPropertyInjectedController.class);
		System.out.println(springPropertyInjectedController.getGreeting());

		System.out.println("--------DI with Setter------");
		SpringSetterInjectedController springSetterInjectedController=ctx.getBean(SpringSetterInjectedController.class);
		System.out.println(springSetterInjectedController.getGreeting());

		System.out.println("--------DI with Constructor------");
		SpringConstructorInjectedController springConstructorInjectedController=ctx.getBean(SpringConstructorInjectedController.class);
		System.out.println(springConstructorInjectedController.getGreeting());

		System.out.println("--------DI with Constructor Primary------");
		SpringConstructorInjectedController_PrimaryService springConstructorInjectedController_primaryService=ctx.getBean(SpringConstructorInjectedController_PrimaryService.class);
		System.out.println(springConstructorInjectedController_primaryService.getGreeting());


		System.out.println("--------Profile------");
		I18nController i18nController=ctx.getBean(I18nController.class);
		System.out.println(i18nController.sayHello());

	}

}
