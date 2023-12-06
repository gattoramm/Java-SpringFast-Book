package part1.ch5.ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ch5.ex1.config.ProjectConfig;
import ch5.ex1.service.CommentService;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    @DisplayName("Verify that CommentService every time you request an instance from the Spring context, you get the same instance")
    public void testCommentServiceIsSingleton(){
        var cs1 = applicationContext.getBean("commentService", CommentService.class);
        var cs2 = applicationContext.getBean("commentService", CommentService.class);

        assertEquals(cs1, cs2);
    }
}
