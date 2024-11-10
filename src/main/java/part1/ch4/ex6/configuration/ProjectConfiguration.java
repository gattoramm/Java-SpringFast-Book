package part1.ch4.ex6.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ch4.ex6.proxy", "ch4.ex6.service", "ch4.ex6.repository"})
public class ProjectConfiguration {

}
