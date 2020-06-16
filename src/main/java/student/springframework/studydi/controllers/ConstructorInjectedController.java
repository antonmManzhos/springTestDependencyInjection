package student.springframework.studydi.controllers;

import org.springframework.stereotype.Controller;
import student.springframework.studydi.services.GreetingService;
@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
