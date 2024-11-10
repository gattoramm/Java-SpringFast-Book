package part1.ch6.ex5.services;

import org.springframework.stereotype.Service;
import part1.ch6.ex5.aspects.ToLog;
import part1.ch6.ex5.model.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publish comment: " + comment.getText());
        return "SUCCESS";
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
