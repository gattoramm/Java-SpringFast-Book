package part1.ch2.ex6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import part1.ch2.ex6.config.ProjectConfig;
import part1.ch2.ex6.main.Parrot;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTest {
    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that a Parrot instance without a name has been added to the Spring context.")
    public void testParrotWasAdded() {
        var p = context.getBean(Parrot.class);

        assertNotNull(p);
        assertNull(p.getName());
    }
}
