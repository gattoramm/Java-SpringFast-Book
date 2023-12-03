package part1.ch6.ex1;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import part1.ch6.ex1.config.ProjectConfig;

import java.util.logging.Logger;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {
    private Logger serviceLogger;
    private Logger aspectLogger;
}
