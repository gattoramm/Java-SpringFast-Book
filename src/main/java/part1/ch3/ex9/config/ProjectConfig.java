package part1.ch3.ex9.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import part1.ch3.ex9.beans.Parrot;
import part1.ch3.ex9.beans.Person;

@Configuration
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

    @Bean
    public Person person(@Qualifier("parrot1") Parrot parrot) {
        var p = new Person();
        p.setName("Kate");
        p.setParrot(parrot);
        return p;
    }
}
