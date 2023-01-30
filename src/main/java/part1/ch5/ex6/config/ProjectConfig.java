package part1.ch5.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.ch5.ex6.service", "part1.ch5.ex6.repository"})
public class ProjectConfig {
}
