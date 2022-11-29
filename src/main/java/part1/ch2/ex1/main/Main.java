package part1.ch2.ex1.main;

import part1.ch2.ex1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // При создании экземпляра контекста нужно передать класс конфигурации как параметр
        // и тогда Spring будет его использовать
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Получаем ссылку на бин типа Parrot из контекста
        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
    }
}
