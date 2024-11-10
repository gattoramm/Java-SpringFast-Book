package part1.ch4.ex2.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"part1.ch4.ex2.proxy", "part1.ch4.ex2.service", "part1.ch4.ex2.repository"})
public class ProjectConfiguration {

}
