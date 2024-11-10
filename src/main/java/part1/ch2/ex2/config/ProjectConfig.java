package part1.ch2.ex2.config;

import part1.ch2.ex2.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    // При инициализации контекста нужно вызвать данный метод и добавить в контекст возвращаемое им значение
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        // Spring добавляет в контекст экземпляр класса Parrot, возвращаемый методом
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
