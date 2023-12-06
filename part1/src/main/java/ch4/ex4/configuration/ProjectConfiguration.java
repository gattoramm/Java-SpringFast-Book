package ch4.ex4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ch4.ex4.proxy.CommentNotificationProxy;
import ch4.ex4.proxy.EmailCommentNotificationProxy;
import ch4.ex4.repository.CommentRepository;
import ch4.ex4.repository.DBConnectRepository;
import ch4.ex4.service.CommentService;

@Configuration
public class ProjectConfiguration {
    @Bean
    public CommentRepository commentRepository() {
        return new DBConnectRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
