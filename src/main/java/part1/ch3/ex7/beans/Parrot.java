package part1.ch3.ex7.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Parrot {
    @Setter
    private String name = "Koko";

    private final Person person;

    @Autowired
    public Parrot(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
