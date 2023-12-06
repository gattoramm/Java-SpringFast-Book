package part1.ch6.ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ch6.ex2.aspects.LoggingAspect;
import ch6.ex2.config.ProjectConfig;
import ch6.ex2.model.Comment;
import ch6.ex2.services.CommentService;

import java.util.logging.Logger;

import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ProjectConfig.class})
public class AppTests {
    private Logger serviceLogger;
    private Logger aspectLogger;

    @Autowired
    private LoggingAspect loggingAspect;

    @Autowired
    private CommentService commentService;

    @BeforeEach
    public void before() {
        this.aspectLogger = mock(Logger.class);
        loggingAspect.setLogger(aspectLogger);

        this.serviceLogger = mock(Logger.class);
        commentService.setLogger(serviceLogger);
    }

    @Test
    @DisplayName("Test that the aspect intercepts and alters the execution" +
            " of the publishComment() method.")
    public void testAspectInterceptsPublishCommentMethod() {
        Comment comment = new Comment();
        comment.setText("Test comment text");
        comment.setAuthor("Test comment author");

        commentService.publishComment(comment);

        verify(serviceLogger).info("Publishing comment:" + comment.getText());
        verify(aspectLogger, atLeastOnce()).info("Method publishComment with parameters [Comment{text='Test comment text', author='Test comment author'}] will execute");
        verify(aspectLogger, atLeastOnce()).info("Method executed and returned SUCCESS");
    }
}
