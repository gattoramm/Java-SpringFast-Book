package part1.ch2.ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import part1.ch2.ex2.config.ProjectConfig;
import part1.ch2.ex2.main.Parrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTest {
    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Parrot instance with the attribute name having the value \"Koko\" has been added to the Spring context.")
    public void testKokoIsInTheSpringContext() {
        var p = context.getBean(Parrot.class);
        assertEquals("Koko", p.getName());
    }

    @Test
    @DisplayName("Test that the String 'hello' was added in Spring context")
    public void testHelloIsInTheSpringContext() {
        var s = context.getBean(String.class);
        assertEquals("Hello", s);
    }

    @Test
    @DisplayName("Test that the Integer '10' was added in Spring context")
    public void test10IsInTheSpringContext() {
        var i = context.getBean(Integer.class);
        assertEquals(10, i);
    }
}
