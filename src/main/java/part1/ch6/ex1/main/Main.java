package part1.ch6.ex1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch6.ex1.config.ProjectConfig;
import part1.ch6.ex1.model.Comment;
import part1.ch6.ex1.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");
        service.publishComment(comment);
    }
}
