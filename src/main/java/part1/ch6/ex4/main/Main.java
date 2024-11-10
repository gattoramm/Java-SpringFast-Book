package part1.ch6.ex4.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch6.ex4.config.ProjectConfig;
import part1.ch6.ex4.model.Comment;
import part1.ch6.ex4.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);
        service.deleteComment(comment);
        service.editComment(comment);
    }
}
