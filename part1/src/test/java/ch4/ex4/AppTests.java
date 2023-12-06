package part1.ch4.ex4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ch4.ex4.model.Comment;
import ch4.ex4.proxy.CommentNotificationProxy;
import ch4.ex4.repository.CommentRepository;
import ch4.ex4.service.CommentService;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AppTests {
    @Mock
    private CommentRepository commentRepository;

    @Mock
    private CommentNotificationProxy commentNotificationProxy;

    @InjectMocks
    private CommentService commentService;

    @Test
    @DisplayName("Verify that dependencies of the CommentService object are correctly called.")
    public void testCommentService() {
        var comment = new Comment();

        commentService.publishComment(comment);

        verify(commentRepository).storeComment(comment);
        verify(commentNotificationProxy).sendComment(comment);
    }
}
