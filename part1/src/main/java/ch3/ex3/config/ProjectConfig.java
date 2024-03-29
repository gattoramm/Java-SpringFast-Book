package ch3.ex3.config;

import ch3.ex3.beans.Parrot;
import ch3.ex3.beans.Person;
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
    public Person person(Parrot parrot) {
        var p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
