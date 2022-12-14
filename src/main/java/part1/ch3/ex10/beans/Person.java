package part1.ch3.ex10.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Alice";
    private final Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
