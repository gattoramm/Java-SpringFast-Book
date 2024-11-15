package part1.ch4.ex5.service;

import org.springframework.stereotype.Component;
import part1.ch4.ex5.model.Comment;
import part1.ch4.ex5.proxy.CommentNotificationProxy;
import part1.ch4.ex5.repository.CommentRepository;

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
