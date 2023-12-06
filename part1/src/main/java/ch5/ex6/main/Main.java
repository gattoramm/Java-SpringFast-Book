package ch5.ex6.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ch5.ex6.config.ProjectConfig;
import ch5.ex6.service.CommentService;
import ch5.ex6.service.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean(CommentService.class);
        var cs2 = context.getBean(UserService.class);

        System.out.println(cs1.getCommentRepository() == cs2.getCommentRepository());
    }
}
