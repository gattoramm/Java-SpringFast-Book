package part1.ch2.ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ch2.ex1.main.Parrot;
import ch2.ex1.config.ProjectConfig;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {
    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Parrot instance with the attribute name having the value \"Koko\" has been added to the Spring context.")
    public void testKokoIsInTheSpringContext() {
        var p = context.getBean(Parrot.class);
        assertEquals("Koko", p.getName());
    }
}
