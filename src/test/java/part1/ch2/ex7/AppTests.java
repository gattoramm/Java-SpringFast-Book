package part1.ch2.ex7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import part1.ch2.ex7.config.ProjectConfig;
import part1.ch2.ex7.main.Parrot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {
    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Parrot instance with the attribute name having the value \"Kiki\" has been added to the Spring context.")
    public void testParrotWasAdded() {
        var p = context.getBean(Parrot.class);

        assertNotNull(p);
        assertEquals("Kiki", p.getName());
    }
}
