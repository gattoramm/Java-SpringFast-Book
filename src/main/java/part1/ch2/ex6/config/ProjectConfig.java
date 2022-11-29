package part1.ch2.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import part1.ch2.ex6.main.Parrot;

@Configuration
// Сообщаем Spring, где находятся классы со стереотипными аннотациями
@ComponentScan(basePackages = "part1.ch2.ex6")
public class ProjectConfig {

    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
}
