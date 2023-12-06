package ch2.ex7.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Сообщаем Spring, где находятся классы со стереотипными аннотациями
@ComponentScan(basePackages = "ch2.ex7.main")
public class ProjectConfig {
}
