package part1.ch2.ex7.config;

import part1.ch2.ex7.main.Parrot;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Сообщаем Spring, где находятся классы со стереотипными аннотациями
@ComponentScan(basePackages = "part1.ch2.ex7")
public class ProjectConfig {
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
