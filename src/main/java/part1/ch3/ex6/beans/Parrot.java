package part1.ch3.ex6.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
public class Parrot {
    private String name = "Koko";

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
