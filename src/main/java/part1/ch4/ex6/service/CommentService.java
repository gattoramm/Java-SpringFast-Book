package part1.ch4.ex6.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import part1.ch4.ex6.model.Comment;
import part1.ch4.ex6.proxy.CommentNotificationProxy;
import part1.ch4.ex6.repository.CommentRepository;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
