package part1.ch5.ex7.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch4.ex7.model.Comment;
import part1.ch5.ex7.config.ProjectConfig;
import part1.ch5.ex7.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);

        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}
