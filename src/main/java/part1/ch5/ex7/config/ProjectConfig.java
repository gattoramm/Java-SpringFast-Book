package part1.ch5.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ch5.ex7.service", "ch5.ex7.repository", "ch5.ex7.processor"})
public class ProjectConfig {
}
