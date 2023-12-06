package ch4.ex6.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch4.ex6.configuration.ProjectConfiguration;
import ch4.ex6.model.Comment;
import ch4.ex6.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();

        comment.setAuthor("Ramm");
        comment.setText("Hello!");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
