package part1.ch5.ex1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import part1.ch5.ex1.service.CommentService;

@Configuration
public class ProjectConfig {
    @Bean
    public CommentService commentService() {
        return new CommentService();
    }
}
