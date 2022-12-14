package part1.ch3.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "part1.ch3.ex7.beans")
public class ProjectConfig {

}
