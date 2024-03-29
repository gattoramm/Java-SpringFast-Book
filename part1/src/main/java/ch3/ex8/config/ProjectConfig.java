package ch3.ex8.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ch3.ex8.beans.Parrot;
import ch3.ex8.beans.Person;

@Configuration
public class ProjectConfig {
    @Bean
    public Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    public Person person(Parrot parrot2) {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2);
        return p;
    }
}
