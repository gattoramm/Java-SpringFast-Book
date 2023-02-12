package part1.ch3.ex8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import part1.ch3.ex8.beans.Parrot;
import part1.ch3.ex8.beans.Person;
import part1.ch3.ex8.config.ProjectConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTest {
    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Parrot instance has been added to the Spring context")
    public void testKokoIsInSpringContext() {
        var p = context.getBean("parrot1", Parrot.class);
        assertEquals("Koko", p.getName());
    }

    @Test
    @DisplayName("Test that a Person instance has been added to the Spring context")
    public void testEllaIsInSpringContext() {
        var p = context.getBean(Person.class);
        assertEquals("Ella", p.getName());
    }

    @Test
    @DisplayName("Test that the Person instance in the Spring context owns the Parrot instance named \"Miki\" from the Spring context")
    public void testEllaOwnsKoko() {
        var p = context.getBean(Person.class);
        assertNotNull(p.getParrot());
        assertEquals("Miki", p.getParrot().getName());
    }
}
