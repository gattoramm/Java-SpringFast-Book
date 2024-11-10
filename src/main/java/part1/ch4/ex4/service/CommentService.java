package part1.ch4.ex4.service;

import part1.ch4.ex4.model.Comment;
import part1.ch4.ex4.proxy.CommentNotificationProxy;
import part1.ch4.ex4.repository.CommentRepository;

public class CommentService {
    private CommentRepository commentRepository;
    private CommentNotificationProxy commentNotificationProxy;

    public CommentService(CommentRepository commentRepository,
                          CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
