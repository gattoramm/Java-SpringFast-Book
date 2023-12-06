package ch5.ex2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch5.ex2.config.ProjectConfig;
import ch5.ex2.service.CommentService;
import ch5.ex2.service.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService = context.getBean(CommentService.class);
        var userService = context.getBean(UserService.class);

        System.out.println(commentService.getCommentRepository() == userService.getCommentRepository());
    }
}
