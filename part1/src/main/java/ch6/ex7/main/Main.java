package ch6.ex7.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch6.ex7.config.ProjectConfig;
import ch6.ex7.model.Comment;
import ch6.ex7.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
    }
}
