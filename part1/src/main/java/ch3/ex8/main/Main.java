package ch3.ex8.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch3.ex8.beans.Person;
import ch3.ex8.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}
