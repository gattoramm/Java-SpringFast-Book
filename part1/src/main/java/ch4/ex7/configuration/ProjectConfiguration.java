package ch4.ex7.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ch4.ex7.proxy", "ch4.ex7.service", "ch4.ex7.repository"})
public class ProjectConfiguration {
}
