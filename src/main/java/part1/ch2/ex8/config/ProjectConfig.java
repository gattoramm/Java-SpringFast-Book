package part1.ch2.ex8.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "part1.ch2.ex8.main")
public class ProjectConfig {
}
