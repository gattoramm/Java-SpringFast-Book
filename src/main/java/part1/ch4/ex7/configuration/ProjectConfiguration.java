package part1.ch4.ex7.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.ch4.ex7.proxy", "part1.ch4.ex7.service", "part1.ch4.ex7.repository"})
public class ProjectConfiguration {
}
