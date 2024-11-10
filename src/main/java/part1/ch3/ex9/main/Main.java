package part1.ch3.ex9.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch3.ex9.beans.Person;
import part1.ch3.ex9.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var person = context.getBean(Person.class);

        System.out.println("Person's name: " + person.getName());

        System.out.println("Person's parrot: " + person.getParrot());
    }
}
