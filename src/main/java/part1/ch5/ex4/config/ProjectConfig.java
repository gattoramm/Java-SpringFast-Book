package part1.ch5.ex4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.ch5.ex4.service"})
public class ProjectConfig {
}