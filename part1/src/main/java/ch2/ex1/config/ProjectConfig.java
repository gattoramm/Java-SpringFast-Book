package ch2.ex1.config;

import ch2.ex1.main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Описание конфигурации контекста
public class ProjectConfig {
    // При инициализации контекста нужно вызвать данный метод и добавить в контекст возвращаемое им значение
    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        // Spring добавляет в контекст экземпляр класса Parrot, возвращаемый методом
        return p;
    }
}
