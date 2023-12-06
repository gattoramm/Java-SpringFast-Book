package ch2.ex3.main;

import ch2.ex3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Первый параметр - это имя экземпляра, на который ссылаемся
        var p = context.getBean("parrot2", Parrot.class);
        System.out.println(p.getName());
    }
}
