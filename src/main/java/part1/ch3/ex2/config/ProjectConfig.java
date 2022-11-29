package part1.ch3.ex2.config;

import part1.ch3.ex2.beans.Parrot;
import part1.ch3.ex2.beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
