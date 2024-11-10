package part1.ch3.ex10.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Person {
    @Setter
    private String name = "Alice";
    private final Parrot parrot;

    public Person(Parrot parrot2) {
        this.parrot = parrot2;
    }
}
