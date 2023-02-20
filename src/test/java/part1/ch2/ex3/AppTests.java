package part1.ch2.ex3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import part1.ch2.ex3.config.ProjectConfig;
import part1.ch2.ex3.main.Parrot;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {
    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("Test that Parrot instance named parrot1 has the name \"Koko\".")
    public void testParrot1HasTheNameKoko() {
        var p = context.getBean("parrot1", Parrot.class);
        assertEquals("Koko", p.getName());
    }

    @Test
    @DisplayName("Test that Parrot instance named parrot2 has the name \"Miki\".")
    public void testParrot2HasTheNameMiki() {
        var p = context.getBean("parrot2", Parrot.class);
        assertEquals("Miki", p.getName());
    }

    @Test
    @DisplayName("Test that Parrot instance named parrot2 has the name \"Riki\".")
    public void testParrot2HasTheNameRiki() {
        var p = context.getBean("parrot3", Parrot.class);
        assertEquals("Riki", p.getName());
    }
}
