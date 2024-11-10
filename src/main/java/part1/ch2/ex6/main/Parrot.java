package part1.ch2.ex6.main;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

// Даем Spring инструкцию добавить экземпляр этого класса в контекст
@Setter
@Getter
@Component
public class Parrot {
    private String name;
}
