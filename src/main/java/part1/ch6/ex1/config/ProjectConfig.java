package part1.ch6.ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import part1.ch6.ex1.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "part1.ch6.ex1.services")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
