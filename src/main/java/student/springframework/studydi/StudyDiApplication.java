package student.springframework.studydi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import student.springframework.studydi.controllers.ConstructorInjectedController;
import student.springframework.studydi.controllers.MyController;
import student.springframework.studydi.controllers.PropertyInjectedController;
import student.springframework.studydi.controllers.SetterInjectedController;

@SpringBootApplication
public class StudyDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(StudyDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);


		System.out.println("------------ PropertyInjectedController");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("------------ setterInjectedController");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("------------ constructorInjectedController");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}
}
