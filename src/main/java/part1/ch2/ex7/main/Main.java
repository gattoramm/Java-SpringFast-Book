package part1.ch2.ex7.main;

import part1.ch2.ex7.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var p = context.getBean(Parrot.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
