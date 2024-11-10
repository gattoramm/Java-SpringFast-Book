package part1.ch2.ex7.main;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

// Даем Spring инструкцию добавить экземпляр этого класса в контекст
@Setter
@Getter
@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init() {
        this.name = "Kiki";
    }
}
