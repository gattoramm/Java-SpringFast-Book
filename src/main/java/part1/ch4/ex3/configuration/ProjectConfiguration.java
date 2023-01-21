package part1.ch4.ex3.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.ch4.ex3.proxy", "part1.ch4.ex3.service", "part1.ch4.ex3.repository"})
public class ProjectConfiguration {

}
