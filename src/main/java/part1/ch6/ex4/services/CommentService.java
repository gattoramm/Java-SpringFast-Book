package part1.ch6.ex4.services;

import org.springframework.stereotype.Service;
import part1.ch6.ex4.aspects.ToLog;
import part1.ch6.ex4.model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
    }
}
