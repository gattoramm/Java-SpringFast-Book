package part1.ch6.ex3.services;

import lombok.Setter;
import org.springframework.stereotype.Service;
import part1.ch6.ex3.model.Comment;

import java.util.logging.Logger;

@Setter
@Service
public class CommentService {
    private Logger logger = Logger.getLogger(part1.ch6.ex2.services.CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment:" + comment.getText());
        return "SUCCESS";
    }
}
