package part1.ch3.ex6.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Person {
    @Setter
    private String name = "Ella";

    private Parrot parrot;

    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    @Autowired
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
