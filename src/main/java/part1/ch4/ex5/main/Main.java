package part1.ch4.ex5.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch4.ex5.configuration.ProjectConfiguration;
import part1.ch4.ex5.model.Comment;
import part1.ch4.ex5.service.CommentService;

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
