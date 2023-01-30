package part1.ch5.ex5.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import part1.ch5.ex5.config.ProjectConfig;
import part1.ch5.ex5.service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = context.getBean("commentService", CommentService.class);
        var cs2 = context.getBean("commentService", CommentService.class);

        System.out.println(cs1 == cs2);
    }
}
