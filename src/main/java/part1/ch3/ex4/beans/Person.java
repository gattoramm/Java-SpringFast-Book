package part1.ch3.ex4.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class Person {
    private String name;

    @Autowired
    private Parrot parrot;
}
