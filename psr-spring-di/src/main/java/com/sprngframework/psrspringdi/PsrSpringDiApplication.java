package com.sprngframework.psrspringdi;

import com.sprngframework.psrspringdi.controllers.ConstructorInjectedController;
import com.sprngframework.psrspringdi.controllers.MyController;
import com.sprngframework.psrspringdi.controllers.PropertyInjectedController;
import com.sprngframework.psrspringdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PsrSpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PsrSpringDiApplication.class, args);

		System.out.println("Property Injected Controller");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Setter Injected Controller");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor Injected Controller");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("Primary");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getGreeting());
	}

}
