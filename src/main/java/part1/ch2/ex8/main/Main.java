package part1.ch2.ex8.main;

import part1.ch2.ex8.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Создание экземпляра, добавляемого в контекст
        var x = new Parrot();
        x.setName("Koko");

        var y = new Parrot();
        y.setName("Kuku");

        // Определение Supplier, который будет возвращать этот экземпляр
        Supplier<Parrot> parrotSupplier = () -> x;
        Supplier<Parrot> parrotSupplier_copy = () -> y;

        // Вызов метода registerBean(), добавляющего экземпляр в контекст
        context.registerBean("parrot1",
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true));

        context.registerBean("parrot2",
                Parrot.class,
                parrotSupplier_copy,
                bc -> bc.setPrimary(false));

        var p1 = context.getBean("parrot1", Parrot.class);
        System.out.println(p1);
        System.out.println(p1.getName());

        var p2 = context.getBean("parrot2", Parrot.class);
        System.out.println(p2);
        System.out.println(p2.getName());
    }
}
