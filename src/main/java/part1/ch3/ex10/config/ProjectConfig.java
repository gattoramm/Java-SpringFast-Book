package part1.ch3.ex10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import part1.ch3.ex10.beans.Parrot;

@Configuration
@ComponentScan(basePackages = "part1.ch3.ex10.beans")
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        var p = new Parrot();
        p.setName("Kuku");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
}
