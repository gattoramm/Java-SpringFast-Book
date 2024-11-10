package part1.ch3.ex3.beans;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("Parrot created");
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
