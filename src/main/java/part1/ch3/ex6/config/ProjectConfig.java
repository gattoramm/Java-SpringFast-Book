package part1.ch3.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ch3.ex6.beans")
public class ProjectConfig {

}
