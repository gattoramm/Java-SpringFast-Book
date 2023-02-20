package part1.ch4.ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import part1.ch4.ex1.model.Comment;
import part1.ch4.ex1.repository.CommentRepository;
import part1.ch4.ex1.service.CommentService;
import part1.ch4.ex1.proxy.CommentNotificationProxy;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AppTests {
    @Test
    @DisplayName("Verify that CommentService correctly delegates the responsibilities to the repository and proxy objects.")
    public void testCommentService() {
        var comment = mock(Comment.class);
        var commentRepository = mock(CommentRepository.class);
        var commentNotificationProxy = mock(CommentNotificationProxy.class);

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        commentService.publishComment(comment);

        verify(commentRepository).storeComment(comment);
        verify(commentNotificationProxy).sendComment(comment);
    }
}
