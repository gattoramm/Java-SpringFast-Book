package part1.ch4.ex6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import part1.ch4.ex6.model.Comment;
import part1.ch4.ex6.proxy.CommentNotificationProxy;
import part1.ch4.ex6.repository.CommentRepository;
import part1.ch4.ex6.service.CommentService;

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
