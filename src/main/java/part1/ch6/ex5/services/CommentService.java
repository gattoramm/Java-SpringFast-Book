package part1.ch6.ex5.services;

import lombok.Setter;
import org.springframework.stereotype.Service;
import part1.ch6.ex5.aspects.ToLog;
import part1.ch6.ex5.model.Comment;

import java.util.logging.Logger;

@Setter
@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publish comment: " + comment.getText());
        return "SUCCESS";
    }
}
