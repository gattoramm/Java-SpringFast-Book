package part1.ch5.ex3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ch5.ex3.service"})
public class ProjectConfig {
}
