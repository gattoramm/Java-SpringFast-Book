package ch4.ex3.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ch4.ex3.proxy", "ch4.ex3.service", "ch4.ex3.repository"})
public class ProjectConfiguration {

}
