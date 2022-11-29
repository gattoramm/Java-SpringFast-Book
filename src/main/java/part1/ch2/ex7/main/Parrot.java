package part1.ch2.ex7.main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// Даем Spring инструкцию добавить экземпляр этого класса в контекст
@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
