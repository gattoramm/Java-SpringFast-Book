package part1.ch4.ex5.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ch4.ex5.proxy", "ch4.ex5.service", "ch4.ex5.repository"})
public class ProjectConfiguration {

}
