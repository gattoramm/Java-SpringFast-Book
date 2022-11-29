package part1.ch2.ex4.main;

import part1.ch2.ex4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Первый параметр - это имя бина, на который ссылаемся
        var p = context.getBean("Riki", Parrot.class);
        System.out.println(p.getName());
    }
}
