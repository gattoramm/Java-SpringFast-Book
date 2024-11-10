package part1.ch6.ex6.services;

import org.springframework.stereotype.Service;
import part1.ch6.ex6.aspects.ToLog;
import part1.ch6.ex6.model.Comment;

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
