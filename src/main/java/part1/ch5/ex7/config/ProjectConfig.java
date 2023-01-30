package part1.ch5.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.ch5.ex7.service", "part1.ch5.ex7.repository", "part1.ch5.ex7.processor"})
public class ProjectConfig {
}
