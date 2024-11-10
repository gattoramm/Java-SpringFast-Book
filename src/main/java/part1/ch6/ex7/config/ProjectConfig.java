package part1.ch6.ex7.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import part1.ch6.ex7.aspects.LoggingAspect;
import part1.ch6.ex7.aspects.SecurityAspect;

@Configuration
@ComponentScan(basePackages = "part1.ch6.ex7.services")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public LoggingAspect aspect() {
        return new LoggingAspect();
    }

    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }
}