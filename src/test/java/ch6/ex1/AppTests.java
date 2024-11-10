package ch6.ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import part1.ch6.ex1.model.Comment;
import part1.ch6.ex1.aspects.LoggingAspect;
import part1.ch6.ex1.config.ProjectConfig;
import part1.ch6.ex1.services.CommentService;

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
        verify(aspectLogger, atLeastOnce()).info("Method will execute");
        verify(aspectLogger, atLeastOnce()).info("Method executed");
    }
}
