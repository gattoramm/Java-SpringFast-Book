package part1.ch4.ex2.service;

import org.springframework.stereotype.Component;
import part1.ch4.ex2.model.Comment;
import part1.ch4.ex2.repository.CommentRepository;
import part1.ch4.ex2.proxy.CommentNotificationProxy;

@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
