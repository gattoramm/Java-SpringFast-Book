package ch5.ex7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ch4.ex7.model.Comment;
import ch5.ex7.processor.CommentProcessor;

@Service
public class CommentService {
    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment comment) {
        CommentProcessor commentProcessor = context.getBean(CommentProcessor.class);

        commentProcessor.setComment(comment);
        commentProcessor.processComment(comment);
        commentProcessor.validateComment(comment);

        comment = commentProcessor.getComment();
    }
}
