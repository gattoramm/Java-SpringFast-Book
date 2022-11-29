package part1.ch3.ex5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import part1.ch3.ex5.beans.Parrot;
import part1.ch3.ex5.beans.Person;

@Configuration
@ComponentScan(basePackages = "part1.ch3.ex5.beans")
public class ProjectConfig {

}
