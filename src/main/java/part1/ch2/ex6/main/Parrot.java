package part1.ch2.ex6.main;

import org.springframework.stereotype.Component;

// Даем Spring инструкцию добавить экземпляр этого класса в контекст
@Component
public class Parrot {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
