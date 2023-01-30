package part1.ch5.ex1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch5.ex1.config.ProjectConfig;
import part1.ch5.ex1.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var commentService1 = context.getBean("commentService", CommentService.class);
        var commentService2 = context.getBean("commentService", CommentService.class);

        System.out.println((commentService1 == commentService2));
    }
}
