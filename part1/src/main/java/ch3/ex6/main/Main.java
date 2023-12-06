package ch3.ex6.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch3.ex6.beans.Parrot;
import ch3.ex6.beans.Person;
import ch3.ex6.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = context.getBean(Person.class);

        var parrot = context.getBean(Parrot.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}
