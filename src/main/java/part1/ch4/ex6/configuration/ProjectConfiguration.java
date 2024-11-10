package part1.ch4.ex6.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.ch4.ex6.proxy", "part1.ch4.ex6.service", "part1.ch4.ex6.repository"})
public class ProjectConfiguration {
}
