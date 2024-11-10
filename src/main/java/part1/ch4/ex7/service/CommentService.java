package part1.ch4.ex7.service;

import org.springframework.stereotype.Service;
import part1.ch4.ex7.model.Comment;
import part1.ch4.ex7.proxy.CommentNotificationProxy;
import part1.ch4.ex7.repository.CommentRepository;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
