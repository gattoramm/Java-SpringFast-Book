package part1.ch6.ex4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import part1.ch6.ex4.aspects.LoggingAspect;

@Configuration
@ComponentScan(basePackages = "part1.ch6.ex4.services")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }
}
