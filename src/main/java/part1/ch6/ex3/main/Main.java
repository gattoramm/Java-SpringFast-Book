package part1.ch6.ex3.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch6.ex3.config.ProjectConfig;
import part1.ch6.ex3.model.Comment;
import part1.ch6.ex3.services.CommentService;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var service = context.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        String returnedValue = service.publishComment(comment);

        logger.info(returnedValue);
    }
}
