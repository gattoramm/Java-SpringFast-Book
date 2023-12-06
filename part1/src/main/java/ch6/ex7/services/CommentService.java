package ch6.ex7.services;

import org.springframework.stereotype.Service;
import ch6.ex7.aspects.ToLog;
import ch6.ex7.model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "SUCCESS";
    }
}
