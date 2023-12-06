package ch5.ex6.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ch5.ex6.service", "ch5.ex6.repository"})
public class ProjectConfig {
}
