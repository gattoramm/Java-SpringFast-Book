package part1.ch6.ex2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch6.ex2.config.ProjectConfig;
import part1.ch6.ex2.model.Comment;
import part1.ch6.ex2.services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        var value = service.publishComment(comment);
        logger.info(value);
    }
}
