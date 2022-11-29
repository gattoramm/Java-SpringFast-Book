package part1.ch2.ex2.main;

import part1.ch2.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // При создании экземпляра контекста нужно передать класс конфигурации как параметр
        // и тогда Spring будет его использовать
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Получаем ссылку на бин типа Parrot из контекста
        var p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        var s = context.getBean(String.class);
        System.out.println(s);

        var n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
