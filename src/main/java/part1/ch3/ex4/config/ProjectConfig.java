package part1.ch3.ex4.config;

import part1.ch3.ex4.beans.Parrot;
import part1.ch3.ex4.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "part1.ch3.ex4.beans")
public class ProjectConfig {
    @Bean
    public Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Person person() {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot());
        return p;
    }
}
